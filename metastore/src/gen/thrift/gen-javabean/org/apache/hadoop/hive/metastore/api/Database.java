/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Database implements org.apache.thrift.TBase<Database, Database._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Database");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LOCATION_URI_FIELD_DESC = new org.apache.thrift.protocol.TField("locationUri", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("parameters", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("privileges", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField OWNER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("ownerName", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField OWNER_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("ownerType", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DatabaseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DatabaseTupleSchemeFactory());
  }

  private String name; // required
  private String description; // required
  private String locationUri; // required
  private Map<String,String> parameters; // required
  private PrincipalPrivilegeSet privileges; // optional
  private String ownerName; // optional
  private PrincipalType ownerType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    DESCRIPTION((short)2, "description"),
    LOCATION_URI((short)3, "locationUri"),
    PARAMETERS((short)4, "parameters"),
    PRIVILEGES((short)5, "privileges"),
    OWNER_NAME((short)6, "ownerName"),
    /**
     * 
     * @see PrincipalType
     */
    OWNER_TYPE((short)7, "ownerType");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // DESCRIPTION
          return DESCRIPTION;
        case 3: // LOCATION_URI
          return LOCATION_URI;
        case 4: // PARAMETERS
          return PARAMETERS;
        case 5: // PRIVILEGES
          return PRIVILEGES;
        case 6: // OWNER_NAME
          return OWNER_NAME;
        case 7: // OWNER_TYPE
          return OWNER_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.PRIVILEGES,_Fields.OWNER_NAME,_Fields.OWNER_TYPE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCATION_URI, new org.apache.thrift.meta_data.FieldMetaData("locationUri", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("parameters", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("privileges", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrincipalPrivilegeSet.class)));
    tmpMap.put(_Fields.OWNER_NAME, new org.apache.thrift.meta_data.FieldMetaData("ownerName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OWNER_TYPE, new org.apache.thrift.meta_data.FieldMetaData("ownerType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PrincipalType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Database.class, metaDataMap);
  }

  public Database() {
  }

  public Database(
    String name,
    String description,
    String locationUri,
    Map<String,String> parameters)
  {
    this();
    this.name = name;
    this.description = description;
    this.locationUri = locationUri;
    this.parameters = parameters;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Database(Database other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    if (other.isSetLocationUri()) {
      this.locationUri = other.locationUri;
    }
    if (other.isSetParameters()) {
      Map<String,String> __this__parameters = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.parameters.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__parameters_copy_key = other_element_key;

        String __this__parameters_copy_value = other_element_value;

        __this__parameters.put(__this__parameters_copy_key, __this__parameters_copy_value);
      }
      this.parameters = __this__parameters;
    }
    if (other.isSetPrivileges()) {
      this.privileges = new PrincipalPrivilegeSet(other.privileges);
    }
    if (other.isSetOwnerName()) {
      this.ownerName = other.ownerName;
    }
    if (other.isSetOwnerType()) {
      this.ownerType = other.ownerType;
    }
  }

  public Database deepCopy() {
    return new Database(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.description = null;
    this.locationUri = null;
    this.parameters = null;
    this.privileges = null;
    this.ownerName = null;
    this.ownerType = null;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public String getLocationUri() {
    return this.locationUri;
  }

  public void setLocationUri(String locationUri) {
    this.locationUri = locationUri;
  }

  public void unsetLocationUri() {
    this.locationUri = null;
  }

  /** Returns true if field locationUri is set (has been assigned a value) and false otherwise */
  public boolean isSetLocationUri() {
    return this.locationUri != null;
  }

  public void setLocationUriIsSet(boolean value) {
    if (!value) {
      this.locationUri = null;
    }
  }

  public int getParametersSize() {
    return (this.parameters == null) ? 0 : this.parameters.size();
  }

  public void putToParameters(String key, String val) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String,String>();
    }
    this.parameters.put(key, val);
  }

  public Map<String,String> getParameters() {
    return this.parameters;
  }

  public void setParameters(Map<String,String> parameters) {
    this.parameters = parameters;
  }

  public void unsetParameters() {
    this.parameters = null;
  }

  /** Returns true if field parameters is set (has been assigned a value) and false otherwise */
  public boolean isSetParameters() {
    return this.parameters != null;
  }

  public void setParametersIsSet(boolean value) {
    if (!value) {
      this.parameters = null;
    }
  }

  public PrincipalPrivilegeSet getPrivileges() {
    return this.privileges;
  }

  public void setPrivileges(PrincipalPrivilegeSet privileges) {
    this.privileges = privileges;
  }

  public void unsetPrivileges() {
    this.privileges = null;
  }

  /** Returns true if field privileges is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivileges() {
    return this.privileges != null;
  }

  public void setPrivilegesIsSet(boolean value) {
    if (!value) {
      this.privileges = null;
    }
  }

  public String getOwnerName() {
    return this.ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public void unsetOwnerName() {
    this.ownerName = null;
  }

  /** Returns true if field ownerName is set (has been assigned a value) and false otherwise */
  public boolean isSetOwnerName() {
    return this.ownerName != null;
  }

  public void setOwnerNameIsSet(boolean value) {
    if (!value) {
      this.ownerName = null;
    }
  }

  /**
   * 
   * @see PrincipalType
   */
  public PrincipalType getOwnerType() {
    return this.ownerType;
  }

  /**
   * 
   * @see PrincipalType
   */
  public void setOwnerType(PrincipalType ownerType) {
    this.ownerType = ownerType;
  }

  public void unsetOwnerType() {
    this.ownerType = null;
  }

  /** Returns true if field ownerType is set (has been assigned a value) and false otherwise */
  public boolean isSetOwnerType() {
    return this.ownerType != null;
  }

  public void setOwnerTypeIsSet(boolean value) {
    if (!value) {
      this.ownerType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    case LOCATION_URI:
      if (value == null) {
        unsetLocationUri();
      } else {
        setLocationUri((String)value);
      }
      break;

    case PARAMETERS:
      if (value == null) {
        unsetParameters();
      } else {
        setParameters((Map<String,String>)value);
      }
      break;

    case PRIVILEGES:
      if (value == null) {
        unsetPrivileges();
      } else {
        setPrivileges((PrincipalPrivilegeSet)value);
      }
      break;

    case OWNER_NAME:
      if (value == null) {
        unsetOwnerName();
      } else {
        setOwnerName((String)value);
      }
      break;

    case OWNER_TYPE:
      if (value == null) {
        unsetOwnerType();
      } else {
        setOwnerType((PrincipalType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case DESCRIPTION:
      return getDescription();

    case LOCATION_URI:
      return getLocationUri();

    case PARAMETERS:
      return getParameters();

    case PRIVILEGES:
      return getPrivileges();

    case OWNER_NAME:
      return getOwnerName();

    case OWNER_TYPE:
      return getOwnerType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case DESCRIPTION:
      return isSetDescription();
    case LOCATION_URI:
      return isSetLocationUri();
    case PARAMETERS:
      return isSetParameters();
    case PRIVILEGES:
      return isSetPrivileges();
    case OWNER_NAME:
      return isSetOwnerName();
    case OWNER_TYPE:
      return isSetOwnerType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Database)
      return this.equals((Database)that);
    return false;
  }

  public boolean equals(Database that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_locationUri = true && this.isSetLocationUri();
    boolean that_present_locationUri = true && that.isSetLocationUri();
    if (this_present_locationUri || that_present_locationUri) {
      if (!(this_present_locationUri && that_present_locationUri))
        return false;
      if (!this.locationUri.equals(that.locationUri))
        return false;
    }

    boolean this_present_parameters = true && this.isSetParameters();
    boolean that_present_parameters = true && that.isSetParameters();
    if (this_present_parameters || that_present_parameters) {
      if (!(this_present_parameters && that_present_parameters))
        return false;
      if (!this.parameters.equals(that.parameters))
        return false;
    }

    boolean this_present_privileges = true && this.isSetPrivileges();
    boolean that_present_privileges = true && that.isSetPrivileges();
    if (this_present_privileges || that_present_privileges) {
      if (!(this_present_privileges && that_present_privileges))
        return false;
      if (!this.privileges.equals(that.privileges))
        return false;
    }

    boolean this_present_ownerName = true && this.isSetOwnerName();
    boolean that_present_ownerName = true && that.isSetOwnerName();
    if (this_present_ownerName || that_present_ownerName) {
      if (!(this_present_ownerName && that_present_ownerName))
        return false;
      if (!this.ownerName.equals(that.ownerName))
        return false;
    }

    boolean this_present_ownerType = true && this.isSetOwnerType();
    boolean that_present_ownerType = true && that.isSetOwnerType();
    if (this_present_ownerType || that_present_ownerType) {
      if (!(this_present_ownerType && that_present_ownerType))
        return false;
      if (!this.ownerType.equals(that.ownerType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_description = true && (isSetDescription());
    builder.append(present_description);
    if (present_description)
      builder.append(description);

    boolean present_locationUri = true && (isSetLocationUri());
    builder.append(present_locationUri);
    if (present_locationUri)
      builder.append(locationUri);

    boolean present_parameters = true && (isSetParameters());
    builder.append(present_parameters);
    if (present_parameters)
      builder.append(parameters);

    boolean present_privileges = true && (isSetPrivileges());
    builder.append(present_privileges);
    if (present_privileges)
      builder.append(privileges);

    boolean present_ownerName = true && (isSetOwnerName());
    builder.append(present_ownerName);
    if (present_ownerName)
      builder.append(ownerName);

    boolean present_ownerType = true && (isSetOwnerType());
    builder.append(present_ownerType);
    if (present_ownerType)
      builder.append(ownerType.getValue());

    return builder.toHashCode();
  }

  public int compareTo(Database other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Database typedOther = (Database)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(typedOther.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, typedOther.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocationUri()).compareTo(typedOther.isSetLocationUri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocationUri()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locationUri, typedOther.locationUri);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParameters()).compareTo(typedOther.isSetParameters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameters, typedOther.parameters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrivileges()).compareTo(typedOther.isSetPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privileges, typedOther.privileges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOwnerName()).compareTo(typedOther.isSetOwnerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwnerName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ownerName, typedOther.ownerName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOwnerType()).compareTo(typedOther.isSetOwnerType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwnerType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ownerType, typedOther.ownerType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Database(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("description:");
    if (this.description == null) {
      sb.append("null");
    } else {
      sb.append(this.description);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locationUri:");
    if (this.locationUri == null) {
      sb.append("null");
    } else {
      sb.append(this.locationUri);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameters:");
    if (this.parameters == null) {
      sb.append("null");
    } else {
      sb.append(this.parameters);
    }
    first = false;
    if (isSetPrivileges()) {
      if (!first) sb.append(", ");
      sb.append("privileges:");
      if (this.privileges == null) {
        sb.append("null");
      } else {
        sb.append(this.privileges);
      }
      first = false;
    }
    if (isSetOwnerName()) {
      if (!first) sb.append(", ");
      sb.append("ownerName:");
      if (this.ownerName == null) {
        sb.append("null");
      } else {
        sb.append(this.ownerName);
      }
      first = false;
    }
    if (isSetOwnerType()) {
      if (!first) sb.append(", ");
      sb.append("ownerType:");
      if (this.ownerType == null) {
        sb.append("null");
      } else {
        sb.append(this.ownerType);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (privileges != null) {
      privileges.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DatabaseStandardSchemeFactory implements SchemeFactory {
    public DatabaseStandardScheme getScheme() {
      return new DatabaseStandardScheme();
    }
  }

  private static class DatabaseStandardScheme extends StandardScheme<Database> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Database struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOCATION_URI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.locationUri = iprot.readString();
              struct.setLocationUriIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARAMETERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map86 = iprot.readMapBegin();
                struct.parameters = new HashMap<String,String>(2*_map86.size);
                for (int _i87 = 0; _i87 < _map86.size; ++_i87)
                {
                  String _key88; // required
                  String _val89; // required
                  _key88 = iprot.readString();
                  _val89 = iprot.readString();
                  struct.parameters.put(_key88, _val89);
                }
                iprot.readMapEnd();
              }
              struct.setParametersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PRIVILEGES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.privileges = new PrincipalPrivilegeSet();
              struct.privileges.read(iprot);
              struct.setPrivilegesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // OWNER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ownerName = iprot.readString();
              struct.setOwnerNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // OWNER_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ownerType = PrincipalType.findByValue(iprot.readI32());
              struct.setOwnerTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Database struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.description != null) {
        oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
        oprot.writeString(struct.description);
        oprot.writeFieldEnd();
      }
      if (struct.locationUri != null) {
        oprot.writeFieldBegin(LOCATION_URI_FIELD_DESC);
        oprot.writeString(struct.locationUri);
        oprot.writeFieldEnd();
      }
      if (struct.parameters != null) {
        oprot.writeFieldBegin(PARAMETERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.parameters.size()));
          for (Map.Entry<String, String> _iter90 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter90.getKey());
            oprot.writeString(_iter90.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.privileges != null) {
        if (struct.isSetPrivileges()) {
          oprot.writeFieldBegin(PRIVILEGES_FIELD_DESC);
          struct.privileges.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ownerName != null) {
        if (struct.isSetOwnerName()) {
          oprot.writeFieldBegin(OWNER_NAME_FIELD_DESC);
          oprot.writeString(struct.ownerName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ownerType != null) {
        if (struct.isSetOwnerType()) {
          oprot.writeFieldBegin(OWNER_TYPE_FIELD_DESC);
          oprot.writeI32(struct.ownerType.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DatabaseTupleSchemeFactory implements SchemeFactory {
    public DatabaseTupleScheme getScheme() {
      return new DatabaseTupleScheme();
    }
  }

  private static class DatabaseTupleScheme extends TupleScheme<Database> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Database struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetDescription()) {
        optionals.set(1);
      }
      if (struct.isSetLocationUri()) {
        optionals.set(2);
      }
      if (struct.isSetParameters()) {
        optionals.set(3);
      }
      if (struct.isSetPrivileges()) {
        optionals.set(4);
      }
      if (struct.isSetOwnerName()) {
        optionals.set(5);
      }
      if (struct.isSetOwnerType()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetLocationUri()) {
        oprot.writeString(struct.locationUri);
      }
      if (struct.isSetParameters()) {
        {
          oprot.writeI32(struct.parameters.size());
          for (Map.Entry<String, String> _iter91 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter91.getKey());
            oprot.writeString(_iter91.getValue());
          }
        }
      }
      if (struct.isSetPrivileges()) {
        struct.privileges.write(oprot);
      }
      if (struct.isSetOwnerName()) {
        oprot.writeString(struct.ownerName);
      }
      if (struct.isSetOwnerType()) {
        oprot.writeI32(struct.ownerType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Database struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.locationUri = iprot.readString();
        struct.setLocationUriIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map92 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.parameters = new HashMap<String,String>(2*_map92.size);
          for (int _i93 = 0; _i93 < _map92.size; ++_i93)
          {
            String _key94; // required
            String _val95; // required
            _key94 = iprot.readString();
            _val95 = iprot.readString();
            struct.parameters.put(_key94, _val95);
          }
        }
        struct.setParametersIsSet(true);
      }
      if (incoming.get(4)) {
        struct.privileges = new PrincipalPrivilegeSet();
        struct.privileges.read(iprot);
        struct.setPrivilegesIsSet(true);
      }
      if (incoming.get(5)) {
        struct.ownerName = iprot.readString();
        struct.setOwnerNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.ownerType = PrincipalType.findByValue(iprot.readI32());
        struct.setOwnerTypeIsSet(true);
      }
    }
  }

}

