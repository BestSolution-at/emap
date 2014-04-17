/**
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 */
package at.bestsolution.persistence.emap.ecore;

import at.bestsolution.persistence.emap.ecore.NamingStrategy;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EcoreToEMapGenerator {
  private EClass eclass;
  
  public EcoreToEMapGenerator(final EClass eclass) {
    this.eclass = eclass;
  }
  
  public CharSequence generate(@Extension final NamingStrategy namingStrategy) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = EcoreToEMapGenerator.packageName(this.eclass);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _isAbstract = this.eclass.isAbstract();
      if (_isAbstract) {
        _builder.append("abstract");
      }
    }
    _builder.append(" entity ");
    String _name = this.eclass.getName();
    _builder.append(_name, "");
    {
      EList<EClass> _eSuperTypes = this.eclass.getESuperTypes();
      boolean _isEmpty = _eSuperTypes.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(" derives ");
        EList<EClass> _eSuperTypes_1 = this.eclass.getESuperTypes();
        EClass _head = IterableExtensions.<EClass>head(_eSuperTypes_1);
        String _name_1 = _head.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("etype \"");
    EPackage _ePackage = this.eclass.getEPackage();
    String _nsURI = _ePackage.getNsURI();
    _builder.append(_nsURI, "	");
    _builder.append("\"#");
    String _name_2 = this.eclass.getName();
    _builder.append(_name_2, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("attributes {");
    _builder.newLine();
    {
      EList<EAttribute> _eAttributes = this.eclass.getEAttributes();
      for(final EAttribute a : _eAttributes) {
        _builder.append("\t\t");
        String _name_3 = a.getName();
        _builder.append(_name_3, "		");
        _builder.append(" => ");
        String _columnName = namingStrategy.getColumnName(a, this.eclass);
        _builder.append(_columnName, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EReference> _eReferences = this.eclass.getEReferences();
      for(final EReference r : _eReferences) {
        {
          boolean _isContainment = r.isContainment();
          if (_isContainment) {
            _builder.append("\t\t");
            String _name_4 = r.getName();
            _builder.append(_name_4, "		");
            _builder.append(" => resolve ");
            EClassifier _eType = r.getEType();
            String _name_5 = _eType.getName();
            _builder.append(_name_5, "		");
            _builder.append(".selectAllFor");
            String _name_6 = this.eclass.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name_6);
            _builder.append(_firstUpper, "		");
            _builder.append("()");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static String packageName(final EClass eClass) {
    String _instanceClassName = eClass.getInstanceClassName();
    String _instanceClassName_1 = eClass.getInstanceClassName();
    int _lastIndexOf = _instanceClassName_1.lastIndexOf(".");
    return _instanceClassName.substring(0, _lastIndexOf);
  }
}
