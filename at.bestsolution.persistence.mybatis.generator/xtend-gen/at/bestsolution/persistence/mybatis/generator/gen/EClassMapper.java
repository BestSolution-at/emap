package at.bestsolution.persistence.mybatis.generator.gen;

import at.bestsolution.persistence.mybatis.generator.ColumnInfoProvider;
import at.bestsolution.persistence.mybatis.generator.TableNameProvider;
import com.google.common.base.Objects;
import java.util.UUID;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
    _builder.append("<mapper namespace=\"");
    String _instanceClassName = this.eClass.getInstanceClassName();
    _builder.append(_instanceClassName, "");
    _builder.append("Mapper\">");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<select id=\"selectById\" parameterType=\"long\" resultMap=\"");
    String _name = this.eClass.getName();
    _builder.append(_name, "  ");
    _builder.append("Map\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("SELECT * FROM \"");
    String _tableName = tableNameProvider.getTableName(this.eClass);
    _builder.append(_tableName, "    ");
    _builder.append("\" WHERE \"");
    EList<EAttribute> _eAllAttributes = this.eClass.getEAllAttributes();
    final Function1<EAttribute,Boolean> _function = new Function1<EAttribute,Boolean>() {
        public Boolean apply(final EAttribute it) {
          boolean _isTransient = it.isTransient();
          boolean _not = (!_isTransient);
          return Boolean.valueOf(_not);
        }
      };
    Iterable<EAttribute> _filter = IterableExtensions.<EAttribute>filter(_eAllAttributes, _function);
    final Function1<EAttribute,Boolean> _function_1 = new Function1<EAttribute,Boolean>() {
        public Boolean apply(final EAttribute e) {
          boolean _isPrimaryKey = columnNameProvider.isPrimaryKey(e, EClassMapper.this.eClass);
          return Boolean.valueOf(_isPrimaryKey);
        }
      };
    EAttribute _findFirst = IterableExtensions.<EAttribute>findFirst(_filter, _function_1);
    String _columnName = columnNameProvider.getColumnName(_findFirst, this.eClass);
    _builder.append(_columnName, "    ");
    _builder.append("\" = #{id}");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("</select>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<select id=\"selectAll\" resultMap=\"");
    String _name_1 = this.eClass.getName();
    _builder.append(_name_1, "  ");
    _builder.append("Map\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("SELECT * FROM \"");
    String _tableName_1 = tableNameProvider.getTableName(this.eClass);
    _builder.append(_tableName_1, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("</select>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<resultMap id=\"");
    String _name_2 = this.eClass.getName();
    _builder.append(_name_2, "  ");
    _builder.append("Map\" type=\"");
    String _instanceClassName_1 = this.eClass.getInstanceClassName();
    _builder.append(_instanceClassName_1, "  ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<EAttribute> _eAllAttributes_1 = this.eClass.getEAllAttributes();
      final Function1<EAttribute,Boolean> _function_2 = new Function1<EAttribute,Boolean>() {
          public Boolean apply(final EAttribute e) {
            boolean _isPrimaryKey = columnNameProvider.isPrimaryKey(e, EClassMapper.this.eClass);
            return Boolean.valueOf(_isPrimaryKey);
          }
        };
      Iterable<EAttribute> _filter_1 = IterableExtensions.<EAttribute>filter(_eAllAttributes_1, _function_2);
      for(final EAttribute f : _filter_1) {
        _builder.append("  \t");
        _builder.append("<id property=\"");
        String _name_3 = f.getName();
        _builder.append(_name_3, "  	");
        _builder.append("\" column=\"");
        String _columnName_1 = columnNameProvider.getColumnName(f, this.eClass);
        _builder.append(_columnName_1, "  	");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EAttribute> _eAllAttributes_2 = this.eClass.getEAllAttributes();
      final Function1<EAttribute,Boolean> _function_3 = new Function1<EAttribute,Boolean>() {
          public Boolean apply(final EAttribute e) {
            boolean _and = false;
            boolean _and_1 = false;
            boolean _isPrimaryKey = columnNameProvider.isPrimaryKey(e, EClassMapper.this.eClass);
            boolean _not = (!_isPrimaryKey);
            if (!_not) {
              _and_1 = false;
            } else {
              boolean _isDerived = e.isDerived();
              boolean _not_1 = (!_isDerived);
              _and_1 = (_not && _not_1);
            }
            if (!_and_1) {
              _and = false;
            } else {
              boolean _isTransient = e.isTransient();
              boolean _not_2 = (!_isTransient);
              _and = (_and_1 && _not_2);
            }
            return Boolean.valueOf(_and);
          }
        };
      Iterable<EAttribute> _filter_2 = IterableExtensions.<EAttribute>filter(_eAllAttributes_2, _function_3);
      for(final EAttribute f_1 : _filter_2) {
        _builder.append("  \t");
        _builder.append("<result property=\"");
        String _name_4 = f_1.getName();
        _builder.append(_name_4, "  	");
        _builder.append("\" column=\"");
        String _columnName_2 = columnNameProvider.getColumnName(f_1, this.eClass);
        _builder.append(_columnName_2, "  	");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("</resultMap>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<insert id=\"insertObject\" parameterType=\"");
    String _instanceClassName_2 = this.eClass.getInstanceClassName();
    _builder.append(_instanceClassName_2, "  ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t");
    _builder.append("INSERT INTO ");
    String _tableName_2 = tableNameProvider.getTableName(this.eClass);
    _builder.append(_tableName_2, "  	");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t");
    _builder.append("(");
    _builder.newLine();
    {
      EList<EAttribute> _eAllAttributes_3 = this.eClass.getEAllAttributes();
      final Function1<EAttribute,Boolean> _function_4 = new Function1<EAttribute,Boolean>() {
          public Boolean apply(final EAttribute e) {
            boolean _isPrimaryKey = columnNameProvider.isPrimaryKey(e, EClassMapper.this.eClass);
            return Boolean.valueOf(_isPrimaryKey);
          }
        };
      Iterable<EAttribute> _filter_3 = IterableExtensions.<EAttribute>filter(_eAllAttributes_3, _function_4);
      for(final EAttribute f_2 : _filter_3) {
        _builder.append("  \t\t");
        String _columnName_3 = columnNameProvider.getColumnName(f_2, this.eClass);
        _builder.append(_columnName_3, "  		");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EAttribute> _eAllAttributes_4 = this.eClass.getEAllAttributes();
      final Function1<EAttribute,Boolean> _function_5 = new Function1<EAttribute,Boolean>() {
          public Boolean apply(final EAttribute e) {
            boolean _and = false;
            boolean _and_1 = false;
            boolean _isPrimaryKey = columnNameProvider.isPrimaryKey(e, EClassMapper.this.eClass);
            boolean _not = (!_isPrimaryKey);
            if (!_not) {
              _and_1 = false;
            } else {
              boolean _isDerived = e.isDerived();
              boolean _not_1 = (!_isDerived);
              _and_1 = (_not && _not_1);
            }
            if (!_and_1) {
              _and = false;
            } else {
              boolean _isTransient = e.isTransient();
              boolean _not_2 = (!_isTransient);
              _and = (_and_1 && _not_2);
            }
            return Boolean.valueOf(_and);
          }
        };
      Iterable<EAttribute> _filter_4 = IterableExtensions.<EAttribute>filter(_eAllAttributes_4, _function_5);
      for(final EAttribute f_3 : _filter_4) {
        _builder.append("  \t\t");
        _builder.append(", ");
        String _columnName_4 = columnNameProvider.getColumnName(f_3, this.eClass);
        _builder.append(_columnName_4, "  		");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EReference> _eAllReferences = this.eClass.getEAllReferences();
      final Function1<EReference,Boolean> _function_6 = new Function1<EReference,Boolean>() {
          public Boolean apply(final EReference e) {
            boolean _isRelation = EClassMapper.this.isRelation(e);
            return Boolean.valueOf(_isRelation);
          }
        };
      Iterable<EReference> _filter_5 = IterableExtensions.<EReference>filter(_eAllReferences, _function_6);
      for(final EReference f_4 : _filter_5) {
        _builder.append("  \t\t");
        _builder.append(", ");
        String _columnName_5 = columnNameProvider.getColumnName(f_4, this.eClass);
        _builder.append(_columnName_5, "  		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  \t");
    _builder.append(")");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("VALUES");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("(");
    _builder.newLine();
    {
      EList<EAttribute> _eAllAttributes_5 = this.eClass.getEAllAttributes();
      final Function1<EAttribute,Boolean> _function_7 = new Function1<EAttribute,Boolean>() {
          public Boolean apply(final EAttribute e) {
            boolean _isPrimaryKey = columnNameProvider.isPrimaryKey(e, EClassMapper.this.eClass);
            return Boolean.valueOf(_isPrimaryKey);
          }
        };
      Iterable<EAttribute> _filter_6 = IterableExtensions.<EAttribute>filter(_eAllAttributes_5, _function_7);
      for(final EAttribute f_5 : _filter_6) {
        _builder.append("  \t\t");
        _builder.append("( NEXT FOR \"");
        String _primaryKeySequenceName = columnNameProvider.getPrimaryKeySequenceName(f_5, this.eClass);
        _builder.append(_primaryKeySequenceName, "  		");
        _builder.append("\"),");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EAttribute> _eAllAttributes_6 = this.eClass.getEAllAttributes();
      final Function1<EAttribute,Boolean> _function_8 = new Function1<EAttribute,Boolean>() {
          public Boolean apply(final EAttribute e) {
            boolean _and = false;
            boolean _and_1 = false;
            boolean _isPrimaryKey = columnNameProvider.isPrimaryKey(e, EClassMapper.this.eClass);
            boolean _not = (!_isPrimaryKey);
            if (!_not) {
              _and_1 = false;
            } else {
              boolean _isDerived = e.isDerived();
              boolean _not_1 = (!_isDerived);
              _and_1 = (_not && _not_1);
            }
            if (!_and_1) {
              _and = false;
            } else {
              boolean _isTransient = e.isTransient();
              boolean _not_2 = (!_isTransient);
              _and = (_and_1 && _not_2);
            }
            return Boolean.valueOf(_and);
          }
        };
      Iterable<EAttribute> _filter_7 = IterableExtensions.<EAttribute>filter(_eAllAttributes_6, _function_8);
      for(final EAttribute f_6 : _filter_7) {
        _builder.append("  \t\t");
        _builder.append(", #{");
        String _name_5 = f_6.getName();
        _builder.append(_name_5, "  		");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EReference> _eAllReferences_1 = this.eClass.getEAllReferences();
      final Function1<EReference,Boolean> _function_9 = new Function1<EReference,Boolean>() {
          public Boolean apply(final EReference e) {
            boolean _isRelation = EClassMapper.this.isRelation(e);
            return Boolean.valueOf(_isRelation);
          }
        };
      Iterable<EReference> _filter_8 = IterableExtensions.<EReference>filter(_eAllReferences_1, _function_9);
      for(final EReference f_7 : _filter_8) {
        _builder.append("  \t\t");
        _builder.append(", #{");
        String _name_6 = f_7.getName();
        _builder.append(_name_6, "  		");
        _builder.append(".");
        EList<EAttribute> _eAllAttributes_7 = this.eClass.getEAllAttributes();
        final Function1<EAttribute,Boolean> _function_10 = new Function1<EAttribute,Boolean>() {
            public Boolean apply(final EAttribute e) {
              boolean _isPrimaryKey = columnNameProvider.isPrimaryKey(e, EClassMapper.this.eClass);
              return Boolean.valueOf(_isPrimaryKey);
            }
          };
        EAttribute _findFirst_1 = IterableExtensions.<EAttribute>findFirst(_eAllAttributes_7, _function_10);
        String _name_7 = _findFirst_1.getName();
        _builder.append(_name_7, "  		");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
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
    _builder.append("package ");
    String _packageName = EClassMapper.packageName(this.eClass);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import at.bestsolution.persistence.mybatis.mapper.BaseMapper;");
    _builder.newLine();
    _builder.append("import ");
    String _instanceClassName = this.eClass.getInstanceClassName();
    _builder.append(_instanceClassName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface ");
    String _name = this.eClass.getName();
    _builder.append(_name, "");
    _builder.append("Mapper extends BaseMapper<");
    String _name_1 = this.eClass.getName();
    _builder.append(_name_1, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
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
    {
      for(final EClass e : eClasses) {
        _builder.append("import ");
        String _instanceClassName = e.getInstanceClassName();
        _builder.append(_instanceClassName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        String _instanceClassName_1 = e.getInstanceClassName();
        _builder.append(_instanceClassName_1, "");
        _builder.append("Mapper;");
        _builder.newLineIfNotEmpty();
      }
    }
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
    {
      for(final EClass e_1 : eClasses) {
        _builder.append("\t\t");
        _builder.append("units.add(new URLMappingUnit(\"");
        UUID _randomUUID = UUID.randomUUID();
        String _string = _randomUUID.toString();
        _builder.append(_string, "		");
        _builder.append("\",");
        String _name = e_1.getName();
        _builder.append(_name, "		");
        _builder.append(".class,");
        String _name_1 = e_1.getName();
        _builder.append(_name_1, "		");
        _builder.append("Mapper.class,");
        String _packageName = EClassMapper.packageName(e_1);
        _builder.append(_packageName, "		");
        _builder.append(".");
        EPackage _ePackage = e_1.getEPackage();
        String _name_2 = _ePackage.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper, "		");
        _builder.append("Package.eINSTANCE.get");
        String _name_3 = e_1.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
        _builder.append(_firstUpper_1, "		");
        _builder.append("(),getClass().getClassLoader().getResource(\"mappers/");
        String _name_4 = e_1.getName();
        _builder.append(_name_4, "		");
        _builder.append("Mapper.xml\")));");
        _builder.newLineIfNotEmpty();
      }
    }
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
    _builder.append("<scr:component xmlns:scr=\"http://www.osgi.org/xmlns/scr/v1.1.0\" name=\"");
    _builder.append(projectName, "");
    _builder.append(".mappingprovider\">");
    _builder.newLineIfNotEmpty();
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
