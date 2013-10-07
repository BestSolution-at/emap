package at.bestsolution.persistence.mybatis.generator.gen;

import at.bestsolution.persistence.mybatis.generator.ColumnInfoProvider;
import at.bestsolution.persistence.mybatis.generator.TableNameProvider;
import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EClassMapper {
  private final EClass eClass;
  
  public EClassMapper(final EClass eClass) {
    this.eClass = eClass;
  }
  
  public CharSequence generateMapperXML(@Extension final TableNameProvider tableNameProvider, @Extension final ColumnInfoProvider columnNameProvider) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE mapper");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">");
    _builder.newLine();
    _builder.append("<mapper namespace=\"\uFFFDeClass.instanceClassName\uFFFDMapper\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<select id=\"selectById\" parameterType=\"long\" resultMap=\"\uFFFDeClass.name\uFFFDMap\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("SELECT * FROM \"\uFFFDeClass.tableName\uFFFD\" WHERE \"\uFFFDeClass.EAllAttributes.filter[!transient].findFirst[e|e.isPrimaryKey(eClass)].getColumnName(eClass)\uFFFD\" = #{id}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</select>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<select id=\"selectAll\" resultMap=\"\uFFFDeClass.name\uFFFDMap\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("SELECT * FROM \"\uFFFDeClass.tableName\uFFFD\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</select>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<resultMap id=\"\uFFFDeClass.name\uFFFDMap\" type=\"\uFFFDeClass.instanceClassName\uFFFD\">");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("\uFFFDFOR f : eClass.EAllAttributes.filter(e|e.isPrimaryKey(eClass))\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("<id property=\"\uFFFDf.name\uFFFD\" column=\"\uFFFDf.getColumnName(eClass)\uFFFD\" />");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("\uFFFDFOR f : eClass.EAllAttributes.filter(e|!e.isPrimaryKey(eClass) && !e.derived && !e.transient)\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("<result property=\"\uFFFDf.name\uFFFD\" column=\"\uFFFDf.getColumnName(eClass)\uFFFD\"/>");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</resultMap>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<insert id=\"insertObject\" parameterType=\"\uFFFDeClass.instanceClassName\uFFFD\">");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("INSERT INTO \uFFFDeClass.tableName\uFFFD ");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("(");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDFOR f : eClass.EAllAttributes.filter(e|e.isPrimaryKey(eClass))\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t\t");
    _builder.append("\uFFFDf.getColumnName(eClass)\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDFOR f : eClass.EAllAttributes.filter[e|!e.isPrimaryKey(eClass) && !e.derived && !e.transient]\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t\t");
    _builder.append(", \uFFFDf.getColumnName(eClass)\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDFOR f : eClass.EAllReferences.filter[e|e.isRelation]\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t\t");
    _builder.append(", \uFFFDf.getColumnName(eClass)\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append(")");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("VALUES");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("(");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDFOR f : eClass.EAllAttributes.filter(e|e.isPrimaryKey(eClass))\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t\t");
    _builder.append("( NEXT FOR \"\uFFFDf.getPrimaryKeySequenceName(eClass)\uFFFD\"),");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDFOR f : eClass.EAllAttributes.filter[e|!e.isPrimaryKey(eClass) && !e.derived && !e.transient]\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t\t");
    _builder.append(", #{\uFFFDf.name\uFFFD}");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDFOR f : eClass.EAllReferences.filter[e|e.isRelation]\uFFFD");
    _builder.newLine();
    _builder.append("  \t\t\t");
    _builder.append(", #{\uFFFDf.name\uFFFD.\uFFFDeClass.EAllAttributes.findFirst[e|e.isPrimaryKey(eClass)].name\uFFFD}");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append(")");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</insert>");
    _builder.newLine();
    _builder.append("</mapper>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateMapperJava() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package \uFFFDeClass.packageName\uFFFD;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import at.bestsolution.persistence.mybatis.mapper.BaseMapper;");
    _builder.newLine();
    _builder.append("import \uFFFDeClass.instanceClassName\uFFFD;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface \uFFFDeClass.name\uFFFDMapper extends BaseMapper<\uFFFDeClass.name\uFFFD> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence generatingMappingProviderJava(final EClass[] eClasses) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package mapping;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.Collections;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import at.bestsolution.persistence.mybatis.MappingProvider;");
    _builder.newLine();
    _builder.append("import at.bestsolution.persistence.mybatis.mapper.URLMappingUnit;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\uFFFDFOR e : eClasses\uFFFD");
    _builder.newLine();
    _builder.append("import \uFFFDe.instanceClassName\uFFFD;");
    _builder.newLine();
    _builder.append("import \uFFFDe.instanceClassName\uFFFDMapper;");
    _builder.newLine();
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class MappingProviderImpl implements MappingProvider {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<MappingUnit> units;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public MappingProviderImpl() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("units = new ArrayList<MappingUnit>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFDFOR e : eClasses\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("units.add(new URLMappingUnit(\"\uFFFDUUID::randomUUID.toString\uFFFD\",\uFFFDe.name\uFFFD.class,\uFFFDe.name\uFFFDMapper.class,\uFFFDe.packageName\uFFFD.\uFFFDe.EPackage.name.toFirstUpper\uFFFDPackage.eINSTANCE.get\uFFFDe.name.toFirstUpper\uFFFD(),getClass().getClassLoader().getResource(\"mappers/\uFFFDe.name\uFFFDMapper.xml\")));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFDENDFOR\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<MappingUnit> getMappingUnits() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Collections.unmodifiableList(units);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence generateMappingProviderReg(final String projectName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<scr:component xmlns:scr=\"http://www.osgi.org/xmlns/scr/v1.1.0\" name=\"\uFFFDprojectName\uFFFD.mappingprovider\">");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("<implementation class=\"mapping.MappingProviderImpl\"/>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("<service>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<provide interface=\"at.bestsolution.persistence.mybatis.MappingProvider\"/>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("</service>");
    _builder.newLine();
    _builder.append("</scr:component>");
    _builder.newLine();
    return _builder;
  }
  
  public String fqn(final EClass eClass) {
    StringBuilder _stringBuilder = new StringBuilder("");
    StringBuilder packname = _stringBuilder;
    EPackage sp = eClass.getEPackage();
    boolean _notEquals = (!Objects.equal(sp, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        String _name = sp.getName();
        packname.append(_name);
        EPackage _eSuperPackage = sp.getESuperPackage();
        sp = _eSuperPackage;
      }
      boolean _notEquals_1 = (!Objects.equal(sp, null));
      _while = _notEquals_1;
    }
    String _plus = (packname + ".");
    String _name = eClass.getName();
    return (_plus + _name);
  }
  
  public static String packageName(final EClass eClass) {
    String _instanceClassName = eClass.getInstanceClassName();
    String _instanceClassName_1 = eClass.getInstanceClassName();
    int _lastIndexOf = _instanceClassName_1.lastIndexOf(".");
    return _instanceClassName.substring(0, _lastIndexOf);
  }
  
  public boolean isRelation(final EReference f) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _isMany = f.isMany();
    boolean _not = (!_isMany);
    if (!_not) {
      _and_1 = false;
    } else {
      EReference _eOpposite = f.getEOpposite();
      boolean _notEquals = (!Objects.equal(_eOpposite, null));
      _and_1 = (_not && _notEquals);
    }
    if (!_and_1) {
      _and = false;
    } else {
      EReference _eOpposite_1 = f.getEOpposite();
      boolean _isContainment = _eOpposite_1.isContainment();
      _and = (_and_1 && _isContainment);
    }
    if (_and) {
      return true;
    }
    return false;
  }
}
