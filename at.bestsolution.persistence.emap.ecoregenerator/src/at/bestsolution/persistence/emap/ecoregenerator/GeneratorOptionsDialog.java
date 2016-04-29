/* ----------------------------------------------------------------
 * Original File Name:     GeneratorOptionsDialog.java
 * Creation Date:          2012-10-08
 * Description:            GeneratorOptionsDialog
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

import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.jdt.internal.ui.wizards.TypedViewerFilter;
import org.eclipse.jdt.internal.ui.wizards.buildpaths.FolderSelectionDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import at.bestsolution.persistence.emap.ecoregenerator.i18n.Messages;

/**
 * @author Martin Bluehweis
 */
@SuppressWarnings( "restriction" )
public class GeneratorOptionsDialog extends TitleAreaDialog {
	/**
	 * projects list.
	 */
	private final List<IProject> projects;
	/**
	 * projects comboViewer.
	 */
	private ComboViewer projectsViewer;
	/**
	 * Text field Folder.
	 */
	private Text tFolder;
	/**
	 * selectedProject.
	 */
	private IProject selectedProject = null;
	/**
	 * selectedFolder.
	 */
	private IFolder selectedFolder = null;

	/**
	 * Constructor.
	 * 
	 * @param parentShell
	 *            parent shell
	 * @param projects
	 *            projects
	 */
	public GeneratorOptionsDialog( final Shell parentShell, final List<IProject> projects ) {
		super( parentShell );
		this.projects = projects;
	}

	@Override
	protected final Control createDialogArea( final Composite parent ) {
		Composite area = new Composite( parent, SWT.NONE );
		area.setLayout( new GridLayout( 1, false ) );
		area.setLayoutData( new GridData( GridData.FILL_BOTH ) );

		getShell().setText( Messages.GeneratorOptionsDialog_shellTitle );
		setTitle( Messages.GeneratorOptionsDialog_title );

		Composite container = new Composite( area, SWT.NONE );
		container.setLayout( new GridLayout( 3, false ) );
		container.setLayoutData( new GridData( GridData.FILL_BOTH ) );

		{
			Label l = new Label( container, SWT.NONE );
			l.setText( Messages.GeneratorOptionsDialog_emapProject );

			projectsViewer = new ComboViewer( container, SWT.READ_ONLY );
			projectsViewer.setLabelProvider( new LabelProvider() {
				@Override
				public String getText( final Object element ) {
					if ( element == null ) {
						return ""; //$NON-NLS-1$
					}
					else {
						return ( (IProject) element ).getName();
					}
				}
			} );
			GridData gd = new GridData( GridData.FILL_HORIZONTAL );
			gd.horizontalSpan = 2;
			projectsViewer.getCombo().setLayoutData( gd );
			projectsViewer.setContentProvider( ArrayContentProvider.getInstance() );
			projectsViewer.setInput( projects );
			projectsViewer.addSelectionChangedListener( new ISelectionChangedListener() {
				@Override
				public void selectionChanged( final SelectionChangedEvent event ) {
					selectedFolder = null;
					ISelection s = event.getSelection();
					if ( s instanceof StructuredSelection && !s.isEmpty() ) {
						selectedProject = (IProject) ( (StructuredSelection) s ).getFirstElement();
						selectedFolder = selectedProject.getFolder( "/src/" + selectedProject.getName().replace( '.', '/' ) );
						tFolder.setText( selectedFolder.getFullPath().toString() );
					}
				}
			} );
		}
		{
			Label l = new Label( container, SWT.NONE );
			l.setText( Messages.GeneratorOptionsDialog_rootFolder );

			tFolder = new Text( container, SWT.READ_ONLY | SWT.BORDER );
			tFolder.setEditable( false );
			GridData gd = new GridData( GridData.FILL_HORIZONTAL );
			tFolder.setLayoutData( gd );

			Button b = new Button( container, SWT.NONE );
			b.setText( Messages.GeneratorOptionsDialog_buttonFolder );

			b.addSelectionListener( new SelectionAdapter() {

				@Override
				public void widgetSelected( final SelectionEvent e ) {
					if ( selectedProject != null ) {
						ILabelProvider lp = new WorkbenchLabelProvider();
						ITreeContentProvider cp = new WorkbenchContentProvider();

						Class<?>[] acceptedClasses = new Class[] { IFolder.class };
						ViewerFilter filter = new TypedViewerFilter( acceptedClasses );

						FolderSelectionDialog dialog = new FolderSelectionDialog( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), lp, cp );
						dialog.setTitle( Messages.GeneratorOptionsDialog_outputDirectory );
						dialog.setMessage( Messages.GeneratorOptionsDialog_selectOutputDirectory );
						dialog.addFilter( filter );
						dialog.setInput( selectedProject );
						if ( dialog.open() == Window.OK ) {
							selectedFolder = (IFolder) dialog.getFirstResult();
							tFolder.setText( selectedFolder.getFullPath().toString() );
						}
					}
				}
			} );

			if ( !projects.isEmpty() ) {
				projectsViewer.setSelection( new StructuredSelection( projects.get( 0 ) ) );
			}
		}
		return area;
	}

	@Override
	protected final void okPressed() {
		if ( selectedProject != null ) {
			if ( selectedFolder == null ) {
				setNoFolderErrorMessage();
			}
			else {
				super.okPressed();
			}
		}
	}

	/**
	 * setNoFolderErrorMessage.
	 */
	private void setNoFolderErrorMessage() {
		setErrorMessage( Messages.GeneratorOptionsDialog_noFolderSelected );
	}

	/**
	 * getSelectedProject.
	 * 
	 * @return selected project
	 */
	public final IProject getSelectedProject() {
		return selectedProject;
	}

	/**
	 * getSelectedFolder.
	 * 
	 * @return selected folder
	 */
	public final IFolder getSelectedFolder() {
		return selectedFolder;
	}
}
