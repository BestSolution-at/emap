package at.bestsolution.persistence.emap.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EcoreToEMapGenerator {
  private EClass eclass;
  
  public EcoreToEMapGenerator(final EClass eclass) {
    this.eclass = eclass;
  }
  
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package \uFFFDeclass.packageName\uFFFD;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\uFFFDIF eclass.abstract\uFFFDabstract\uFFFDENDIF\uFFFD entity \uFFFDeclass.name\uFFFD\uFFFDIF ! eclass.ESuperTypes.empty\uFFFD derives \uFFFDeclass.ESuperTypes.head.name\uFFFD\uFFFDENDIF\uFFFD {");
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
