package at.bestsolution.persistence.emap.ecoregenerator.generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public class EMapHelper {
	public static String getTableName( EClass ec ) {
		return upperCaseUnderscore( ec.getName() );
	}

	private static String upperCaseUnderscore( String name ) {
		if ( "FROM".equalsIgnoreCase( name ) ) {
			return "FROM_";
		}
		StringBuilder sb = new StringBuilder();
		for ( int i = 0; i < name.length(); i++ ) {
			char ch = name.charAt( i );
			if ( Character.isUpperCase( ch ) && i > 0 ) {
				sb.append( '_' );
			}
			sb.append( Character.toUpperCase( ch ) );
		}
		return sb.toString();
	}

	public static String getTableColumnName( EAttribute a ) {
		return upperCaseUnderscore( a.getName() );
	}

	public static String getReferenceQueryCall( EReference r ) {
		if ( r.isMany() ) {
			return r.getEReferenceType().getName() + "."+ getReferenceQuerySignature( r ) + "( SID )";
		}
		else {
			return r.getEReferenceType().getName() + ".selectById(" + getFKName( r ) + ")";
		}

	}

	public static String getFKName( EReference r ) {
		return "FK_" + upperCaseUnderscore( r.getName() );
	}

	public static String getReferenceQuerySignature( EReference r ) {
		EClass eClass = (EClass)r.eContainer();
		String name = eClass.getName();
		EClass tecl = r.getEReferenceType();
		for ( EReference ref : eClass.getEAllReferences() ) {
			if ( r != ref && tecl == ref.getEReferenceType()) {
				return "selectAllFor"+name+r.getName();
			}
		}
		return "selectAllFor"+name;
	}

}
