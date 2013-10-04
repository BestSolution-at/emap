package at.bestsolution.persistence.emap.ecore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EcoreToEMapGenerator {
  private EClass eclass;
  
  public EcoreToEMapGenerator(final EClass eclass) {
    this.eclass = eclass;
  }
  
  public CharSequence generate() {
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
