/* ----------------------------------------------------------------
 * Original File Name:     GenModelGenerateDoctrineActionDelegate.java
 * Creation Date:          2012-10-08
 * Description:            GenModelGenerateDoctrineActionDelegate
 * ----------------------------------------------------------------

 * ----------------------------------------------------------------
 * Copyright (c) 2010 BestSolution.at EDV Systemhaus GmbH
 * All Rights Reserved.
 *
 * BestSolution.at MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE
 * SUITABILITY OF THE SOFTWARE , EITHER EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT.
 * BestSolution.at SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
 * LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS
 * SOFTWARE OR ITS DERIVATIVES.
 *
 * This software must not be used, redistributed or based from in
 * any other than the designated way without prior explicit written
 * permission by BestSolution.at.
 * -----------------------------------------------------------------

 * -----------------------------------------------------------------
 * $HeadURL: $
 * $Revision: $
 * Creator: martin.bluehweis@bestsolution.at
 * Creation Date: 2012-10-08
 *
 * $LastChangedDate: $
 * $LastChangedBy: $
 * ----------------------------------------------------------------
 */
package at.bestsolution.persistence.emap.ecoregenerator;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.eclipse.ui.internal.EditorPluginAction;

import at.bestsolution.persistence.emap.ecoregenerator.generator.EClassMetaInfo;
import at.bestsolution.persistence.emap.ecoregenerator.generator.EMAPGenerator;
import at.bestsolution.persistence.emap.ecoregenerator.generator.TypeDefinition;
import at.bestsolution.persistence.emap.ecoregenerator.i18n.Messages;
import at.bestsolution.persistence.emap.ecoregenerator.preferences.PreferenceHelper;

/**
 * GenModelGenerateDoctrineActionDelegate.
 */
@SuppressWarnings( "restriction" )
public class GenModelGenerateDoctrineActionDelegate extends ActionDelegate implements IEditorActionDelegate {
	/**
	 * type mapping.
	 */
	public static final HashMap<String, TypeDefinition> TYPE_MAPPING = new HashMap<String, TypeDefinition>();
	static {
		TYPE_MAPPING.put( "EInt", new TypeDefinition( "int", "integer" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		TYPE_MAPPING.put( "EInteger", new TypeDefinition( "int", "integer" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		TYPE_MAPPING.put( "EString", new TypeDefinition( "string", "string" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		TYPE_MAPPING.put( "ELong", new TypeDefinition( "long", "bigint" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		TYPE_MAPPING.put( "EBoolean", new TypeDefinition( "boolean", "boolean" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		TYPE_MAPPING.put( "EDate", new TypeDefinition( "date", "datetime" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		TYPE_MAPPING.put( "EDouble", new TypeDefinition( "double", "decimal" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		TYPE_MAPPING.put( "EBigDecimal", new TypeDefinition( "double", "decimal" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		TYPE_MAPPING.put( "EByteArray", new TypeDefinition( "blob", "blob" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public final void runWithEvent( final IAction action, final Event event ) {
		if ( action instanceof EditorPluginAction ) {

			ISelection s = ( (EditorPluginAction) action ).getSelection();
			if ( s instanceof IStructuredSelection && !s.isEmpty() && ( (IStructuredSelection) s ).getFirstElement() instanceof GenModel ) {
				try {
					GenModel genModel = (GenModel) ( (IStructuredSelection) s ).getFirstElement();

					IProject[] allProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
					List<IProject> emapProjects = new ArrayList<IProject>();
					for ( IProject p : allProjects ) {
						if ( p.isOpen() && p.getNature( Messages.GenModelGenerateDoctrineActionDelegate_5 ) != null && p.getNature( "org.eclipse.xtext.ui.shared.xtextNature" ) != null ) {
							emapProjects.add( p );
						}
					}
					if ( emapProjects.isEmpty() ) {
						MessageDialog.openError( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), Messages.GenModelGenerateDoctrineActionDelegate_6, Messages.GenModelGenerateDoctrineActionDelegate_7 );
					}
					else {
						GeneratorOptionsDialog dlg = new GeneratorOptionsDialog( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), emapProjects );
						if ( dlg.open() == IDialogConstants.OK_ID ) {
							final IProject project = dlg.getSelectedProject();
							if ( !project.exists() ) {
								project.create( new NullProgressMonitor() );
							}
							if ( !project.isOpen() ) {
								project.open( new NullProgressMonitor() );
							}

							final HashMap<EClass, EClassMetaInfo> metaInfo = new HashMap<EClass, EClassMetaInfo>();
							try {
								IFolder srcFolder = dlg.getSelectedFolder();
								for ( GenPackage pack : genModel.getGenPackages() ) {
									collectMetaPackageCode( metaInfo, project, srcFolder, srcFolder, pack );
								}
								for ( GenPackage pack : genModel.getGenPackages() ) {
									generatePackageCode( metaInfo, project, srcFolder, pack );
								}
							}
							finally {
								metaInfo.clear();
							}
						}
					}
				}
				catch ( CoreException e ) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				MessageDialog.openError( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), Messages.GenModelGenerateDoctrineActionDelegate_8, Messages.GenModelGenerateDoctrineActionDelegate_9 );
			}
		}
		else {
			MessageDialog.openError( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), Messages.GenModelGenerateDoctrineActionDelegate_10, Messages.GenModelGenerateDoctrineActionDelegate_11 );
		}
	}

	/**
	 * collectMetaPackageCode.
	 * 
	 * @param metaInfo
	 *            metaInfo
	 * @param project
	 *            project
	 * @param srcRootFolder
	 *            srcParentFolder
	 * @param genParentFolder
	 *            genParentFolder
	 * @param pack
	 *            package
	 * @throws CoreException
	 *             CoreException
	 */
	private void collectMetaPackageCode( final HashMap<EClass, EClassMetaInfo> metaInfo, final IProject project, final IFolder srcRootFolder, final IFolder srcFolder, final GenPackage pack ) throws CoreException {
		IFolder packageSrcFolder = srcRootFolder.getFolder( new Path( pack.getBasePackage().toLowerCase().replaceAll( "\\.", "/" ) ) ); //$NON-NLS-1$ //$NON-NLS-2$
		for ( GenPackage subPack : pack.getNestedGenPackages() ) {
			collectMetaPackageCode( metaInfo, project, srcRootFolder, packageSrcFolder, subPack );
		}
		for ( GenClass genClass : pack.getGenClasses() ) {
			if ( !genClass.isDynamic() ) {
				EClassMetaInfo info = metaInfo.get( genClass.getEcoreClass() );
				if ( info == null ) {
					info = new EClassMetaInfo();
					metaInfo.put( genClass.getEcoreClass(), info );
				}
				info.setSrcFolder( packageSrcFolder.getFolder( new Path( pack.getPrefix().toLowerCase() ) ) );
				info.setSrcClassName( genClass.getEcoreClass().getName() );
				info.setSrcNamespace( info.getSrcFolder().getFullPath().makeRelativeTo( srcRootFolder.getFullPath() ).toString().replaceAll( "/", "." ) );
				info.setGenNamespace( info.getSrcNamespace() );
				info.setGenClassName( PreferenceHelper.getPrefixGeneratedClasses() + genClass.getEcoreClass().getName() );
				info.setInputFilterClassName( info.getSrcClassName() + new Path( PreferenceHelper.getPostfixInputFilterClasses() ) );
				for ( EReference ref : genClass.getEcoreClass().getEAllReferences() ) {
					if ( ref.isMany() ) {
						EClassMetaInfo mi = metaInfo.get( ref.getEReferenceType() );
						if ( mi == null ) {
							mi = new EClassMetaInfo();
							metaInfo.put( ref.getEReferenceType(), mi );
						}
						mi.getQueries().add( ref );
					}
				}
			}
		}
	}

	private void createFolderIfNotExists( IFolder folder ) throws CoreException {
		List<IFolder> structure = new ArrayList<>();
		if ( folder.toString().contains( "Basedata" ) ) {
			System.err.println();
		}
		while ( !folder.exists() ) {
			structure.add( 0, folder );
			if ( folder.getParent() instanceof IFolder ) {
				folder = (IFolder) folder.getParent();
			}
			else {
				throw new IllegalArgumentException( "Unexpected structure: " + folder );
			}
		}
		for ( IFolder f : structure ) {
			f.create( true, true, null );
		}
	}

	/**
	 * generatePackageCode.
	 * 
	 * @param metaInfo
	 *            metaInfo
	 * @param project
	 *            project
	 * @param srcParentFolder
	 *            srcParentFolder
	 * @param genParentFolder
	 *            genParentFolder
	 * @param pack
	 *            package
	 * @throws CoreException
	 *             CoreException
	 */
	private void generatePackageCode( final HashMap<EClass, EClassMetaInfo> metaInfo, final IProject project, final IFolder srcParentFolder, final GenPackage pack ) throws CoreException {
		for ( GenPackage subPack : pack.getNestedGenPackages() ) {
			IFolder subSrcFolder = srcParentFolder; // srcParentFolder.getFolder( new Path( subPack.getBasePackage().toLowerCase().replaceAll( "\\.", "/" ) ) ); //$NON-NLS-1$ //$NON-NLS-2$
			generatePackageCode( metaInfo, project, subSrcFolder, subPack );
		}

		for ( GenClass genClass : pack.getGenClasses() ) {
			if ( !genClass.isDynamic() && !genClass.isInterface() && !genClass.isAbstract() ) {
				try {
//					createFolderIfNotExists( metaInfo.get( genClass.getEcoreClass() ).getSrcFolder() );
					{
						String genContent = new EMAPGenerator().generate( genClass, metaInfo, TYPE_MAPPING ).toString();

						IFile genOutFile = srcParentFolder.getFile( new Path( metaInfo.get( genClass.getEcoreClass() ).getGenClassName() + ".emap" ) ); //$NON-NLS-1$
						if ( !genOutFile.exists() ) {
							try {
								genOutFile.create( new ByteArrayInputStream( genContent.getBytes() ), true, new NullProgressMonitor() );
							}
							catch ( CoreException e ) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						else {
							try {
								genOutFile.setContents( new ByteArrayInputStream( genContent.getBytes() ), IResource.KEEP_HISTORY | IResource.FORCE, new NullProgressMonitor() );
							}
							catch ( CoreException e ) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						// ICompilationUnit cu = null;
						format( genOutFile );
					}
				}
				catch ( Exception e ) {
					// TODO Auto-generated catch block
					System.err.println( Messages.GenModelGenerateDoctrineActionDelegate_15 + genClass.getEcoreClass().getName() );
					e.printStackTrace();
				}
			}
		}
	}

	private void format( IFile genOutFile ) {
		// try {
		// }
		// catch ( IOException e ) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// catch ( CoreException e ) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	@Override
	public void setActiveEditor( final IAction action, final IEditorPart targetEditor ) {
	}
}
