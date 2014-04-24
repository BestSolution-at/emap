/** -----------------------------------------------------------------
 * Copyright ( c) 2014 BestSolution.at EDV Systemhaus GmbH
 * All Rights Reserved .
 *
 * BestSolution.at MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE
 * SUITABILITY OF THE SOFTWARE , EITHER EXPRESS OR IMPLIED , INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE , OR NON - INFRINGEMENT.
 *
 * BestSolution.at SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
 * LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS
 * SOFTWARE OR ITS DERIVATIVES.
 *
 * This software is released under the terms of the
 *
 * "Eclipse Public License, Version 1.0
 * or any later version "
 *
 * and may only be distributed and used under the terms of the
 * mentioned license. You should have received a copy of the license
 * along with this software product, if not you can download it from
 * http://www.eclipse.org/legal/epl-v10.html
 * ----------------------------------------------------------------
 */
package at.bestsolution.emf.navi.databinding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.core.databinding.observable.list.ListDiffEntry;
import org.eclipse.core.databinding.property.INativePropertyListener;
import org.eclipse.core.databinding.property.ISimplePropertyListener;
import org.eclipse.core.databinding.property.SimplePropertyEvent;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.core.databinding.property.list.SimpleListProperty;
import org.eclipse.core.internal.databinding.property.list.SimplePropertyObservableList;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.emf.navi.FeaturePath;
import at.bestsolution.emf.navi.FeaturePathCallback;
import at.bestsolution.emf.navi.FeaturePathSegment;
import at.bestsolution.emf.navi.FeaturePathUtil;

/**
 * 
 * @author Martin Platter
 *
 */
public class FeaturePathDatabindingUtil {
	private static final class NavigableListProperty extends SimpleListProperty {
		private FeaturePath path;

		public NavigableListProperty( FeaturePath path ) {
			this.path = path;
		}

		private FeaturePathSegment[] getSegments() {
			return path.getSegments().toArray( new FeaturePathSegment[ 0 ] );
		}

		@Override
		public Object getElementType() {
			FeaturePathSegment[] segs = getSegments();
			return segs[ segs.length - 1 ].feature.getEType();
		}

		@SuppressWarnings( "rawtypes" )
		@Override
		protected List doGetList( Object source ) {
			return FeaturePathUtil.filter( (EObject) source, path );
		}

		@SuppressWarnings( "rawtypes" )
		@Override
		protected void doSetList( Object source, List list, ListDiff diff ) {
			List<?> currentList = doGetList( source );
			diff.applyTo( currentList );
		}

		@SuppressWarnings( "restriction" )
		public IObservableList observe( Realm realm, Object source ) {
			return new SimplePropertyObservableList( realm, source, this );
		}

		@Override
		public INativePropertyListener adaptListener( final ISimplePropertyListener listener ) {
			return new FeaturePathListListener( listener, this );
		}

		private static class FeaturePathNodeListener extends AdapterImpl {
			private EObject source;
			private EStructuralFeature feature;
			private List<Object> children = new ArrayList<Object>();
			private ISimplePropertyListener listener;
			private NavigableListProperty owner;
			private boolean root;

			public FeaturePathNodeListener( FeaturePathNodeListener parent, EObject node, EStructuralFeature feature, ISimplePropertyListener listener,
					NavigableListProperty owner ) {
				this.source = node;
				this.feature = feature;
				this.listener = listener;
				this.owner = owner;
				this.root = parent == null;
				if ( !root ) {
					parent.registerChild( this );
				}
			}

			private void registerChild( Object leaf ) {
				children.add( leaf );
			}

			@Override
			public void notifyChanged( Notification msg ) {
				if ( msg.getFeature() == feature && !msg.isTouch() ) {
					List<EObject> oldvalues = new ArrayList<EObject>();
					fillOldValues( oldvalues );
					List<EObject> newvalues = new ArrayList<EObject>();
					fillNewValues( newvalues );
					ListDiff diff = Diffs.computeListDiff( oldvalues, newvalues );
					for ( ListDiffEntry de : diff.getDifferences() ) {
						if ( !de.isAddition() ) {
							cleanup( (EObject) de.getElement() );
						}
					}
					listener.handleEvent( ( new SimplePropertyEvent( SimplePropertyEvent.CHANGE, msg.getNotifier(), owner, diff ) ) );
				}
			}

			private Boolean cleanup( EObject element ) {
				if ( source == element ) {
					return source.eAdapters().remove( this );
				}
				else {
					Iterator<Object> it = children.iterator();
					while ( it.hasNext() ) {
						Object child = it.next();
						if ( child == element ) {
							it.remove();
							return null;
						}
						if ( child instanceof FeaturePathNodeListener ) {
							Boolean result = ( (FeaturePathNodeListener) child ).cleanup( element );
							if ( result == null ) {
								return null;
							}
							if ( result ) {
								children.remove( child );
								return null;
							}
						}
					}
					return false;
				}
			}

			private int getFeaturePathSegmentIndex( FeaturePathSegment[] segs, EStructuralFeature feature ) {
				for ( int i = 0; i < segs.length; i++ ) {
					if ( segs[ i ].feature == feature ) {
						return i;
					}
				}
				return -1;
			}

			private void fillNewValues( List<EObject> newvalues ) {
				FeaturePathSegment[] segs = owner.getSegments();
				List<Object> result = new ArrayList<Object>();
				FeaturePathUtil.filter( source, segs, getFeaturePathSegmentIndex( segs, feature ), result, new FeaturePathRunnableRegistrationCallback(
						listener, owner ), this );
				for ( Object o : result ) {
					newvalues.add( (EObject) o );
				}
			}

			private void fillOldValues( List<EObject> oldvalues ) {
				for ( Object child : children ) {
					if ( child instanceof FeaturePathNodeListener ) {
						( (FeaturePathNodeListener) child ).fillOldValues( oldvalues );
					}
					else {
						oldvalues.add( (EObject) child );
					}
				}
			}
		}

		private static class FeaturePathRunnableRegistrationCallback implements FeaturePathCallback {
			private ISimplePropertyListener listener;
			private NavigableListProperty owner;
			private FeaturePathNodeListener root;

			public FeaturePathRunnableRegistrationCallback( ISimplePropertyListener listener, NavigableListProperty owner ) {
				this.listener = listener;
				this.owner = owner;
			}

			@Override
			public Object runOnLeaf( Object memento, EObject leaf, FeaturePathSegment segment ) {
				( (FeaturePathNodeListener) memento ).registerChild( leaf );
				return memento;
			}

			@Override
			public void runOnLeaf(Object memento, Object leaf) {
				( (FeaturePathNodeListener) memento ).registerChild( leaf );
			}
			
			@Override
			public Object runOnNode( Object memento, EObject node, FeaturePathSegment segment ) {
				EList<Adapter> eAdapters = node.eAdapters();
				// TODO [PM] try to avoid being inclined to register a adapter several times
				for ( Adapter adapter : eAdapters ) {
					if ( adapter instanceof FeaturePathNodeListener && ( (FeaturePathNodeListener) adapter ).listener == listener ) {
						return adapter;
					}
				}
				FeaturePathNodeListener fpnlistener = new FeaturePathNodeListener( (FeaturePathNodeListener) memento, node, segment.feature, listener, owner );
				if ( memento == null ) {
					root = fpnlistener;
				}
				eAdapters.add( fpnlistener );
				return fpnlistener;
			}

			public void cleanup( EObject source ) {
				root.cleanup( source );
			}

			public FeaturePathSegment[] getSegments() {
				return owner.getSegments();
			}
		}

		private static class FeaturePathListListener implements INativePropertyListener {
			private FeaturePathRunnableRegistrationCallback cb;

			public FeaturePathListListener( ISimplePropertyListener listener, NavigableListProperty owner ) {
				cb = new FeaturePathRunnableRegistrationCallback( listener, owner );
			}

			@Override
			public void removeFrom( Object source ) {
				if ( source != null ) {
					cb.cleanup( (EObject) source );
				}
			}

			@Override
			public void addTo( Object source ) {
				if ( source != null ) {
					FeaturePathUtil.filter( (EObject) source, cb.getSegments(), cb );
				}
			}
		}
	}

	public static IListProperty list( FeaturePath path ) {
		return new NavigableListProperty( path );
	}
}
