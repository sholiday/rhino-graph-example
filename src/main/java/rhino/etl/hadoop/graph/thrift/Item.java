/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package rhino.etl.hadoop.graph.thrift;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

public class Item extends org.apache.thrift.TUnion<Item, Item._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Item");
  private static final org.apache.thrift.protocol.TField SHORT_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("short_value", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField INT_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("int_value", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LONG_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("long_value", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField DOUBLE_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("double_value", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField STRING_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("string_value", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField BYTES_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("bytes_value", org.apache.thrift.protocol.TType.STRING, (short)6);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SHORT_VALUE((short)1, "short_value"),
    INT_VALUE((short)2, "int_value"),
    LONG_VALUE((short)3, "long_value"),
    DOUBLE_VALUE((short)4, "double_value"),
    STRING_VALUE((short)5, "string_value"),
    BYTES_VALUE((short)6, "bytes_value");

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
        case 1: // SHORT_VALUE
          return SHORT_VALUE;
        case 2: // INT_VALUE
          return INT_VALUE;
        case 3: // LONG_VALUE
          return LONG_VALUE;
        case 4: // DOUBLE_VALUE
          return DOUBLE_VALUE;
        case 5: // STRING_VALUE
          return STRING_VALUE;
        case 6: // BYTES_VALUE
          return BYTES_VALUE;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SHORT_VALUE, new org.apache.thrift.meta_data.FieldMetaData("short_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.INT_VALUE, new org.apache.thrift.meta_data.FieldMetaData("int_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LONG_VALUE, new org.apache.thrift.meta_data.FieldMetaData("long_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DOUBLE_VALUE, new org.apache.thrift.meta_data.FieldMetaData("double_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.STRING_VALUE, new org.apache.thrift.meta_data.FieldMetaData("string_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BYTES_VALUE, new org.apache.thrift.meta_data.FieldMetaData("bytes_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Item.class, metaDataMap);
  }

  public Item() {
    super();
  }

  public Item(_Fields setField, Object value) {
    super(setField, value);
  }

  public Item(Item other) {
    super(other);
  }
  public Item deepCopy() {
    return new Item(this);
  }

  public static Item short_value(short value) {
    Item x = new Item();
    x.setShort_value(value);
    return x;
  }

  public static Item int_value(int value) {
    Item x = new Item();
    x.setInt_value(value);
    return x;
  }

  public static Item long_value(long value) {
    Item x = new Item();
    x.setLong_value(value);
    return x;
  }

  public static Item double_value(double value) {
    Item x = new Item();
    x.setDouble_value(value);
    return x;
  }

  public static Item string_value(String value) {
    Item x = new Item();
    x.setString_value(value);
    return x;
  }

  public static Item bytes_value(ByteBuffer value) {
    Item x = new Item();
    x.setBytes_value(value);
    return x;
  }

  public static Item bytes_value(byte[] value) {
    Item x = new Item();
    x.setBytes_value(ByteBuffer.wrap(value));
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case SHORT_VALUE:
        if (value instanceof Short) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Short for field 'short_value', but got " + value.getClass().getSimpleName());
      case INT_VALUE:
        if (value instanceof Integer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Integer for field 'int_value', but got " + value.getClass().getSimpleName());
      case LONG_VALUE:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'long_value', but got " + value.getClass().getSimpleName());
      case DOUBLE_VALUE:
        if (value instanceof Double) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Double for field 'double_value', but got " + value.getClass().getSimpleName());
      case STRING_VALUE:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'string_value', but got " + value.getClass().getSimpleName());
      case BYTES_VALUE:
        if (value instanceof ByteBuffer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ByteBuffer for field 'bytes_value', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case SHORT_VALUE:
          if (field.type == SHORT_VALUE_FIELD_DESC.type) {
            Short short_value;
            short_value = iprot.readI16();
            return short_value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case INT_VALUE:
          if (field.type == INT_VALUE_FIELD_DESC.type) {
            Integer int_value;
            int_value = iprot.readI32();
            return int_value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LONG_VALUE:
          if (field.type == LONG_VALUE_FIELD_DESC.type) {
            Long long_value;
            long_value = iprot.readI64();
            return long_value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOUBLE_VALUE:
          if (field.type == DOUBLE_VALUE_FIELD_DESC.type) {
            Double double_value;
            double_value = iprot.readDouble();
            return double_value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STRING_VALUE:
          if (field.type == STRING_VALUE_FIELD_DESC.type) {
            String string_value;
            string_value = iprot.readString();
            return string_value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BYTES_VALUE:
          if (field.type == BYTES_VALUE_FIELD_DESC.type) {
            ByteBuffer bytes_value;
            bytes_value = iprot.readBinary();
            return bytes_value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case SHORT_VALUE:
        Short short_value = (Short)value_;
        oprot.writeI16(short_value);
        return;
      case INT_VALUE:
        Integer int_value = (Integer)value_;
        oprot.writeI32(int_value);
        return;
      case LONG_VALUE:
        Long long_value = (Long)value_;
        oprot.writeI64(long_value);
        return;
      case DOUBLE_VALUE:
        Double double_value = (Double)value_;
        oprot.writeDouble(double_value);
        return;
      case STRING_VALUE:
        String string_value = (String)value_;
        oprot.writeString(string_value);
        return;
      case BYTES_VALUE:
        ByteBuffer bytes_value = (ByteBuffer)value_;
        oprot.writeBinary(bytes_value);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case SHORT_VALUE:
          Short short_value;
          short_value = iprot.readI16();
          return short_value;
        case INT_VALUE:
          Integer int_value;
          int_value = iprot.readI32();
          return int_value;
        case LONG_VALUE:
          Long long_value;
          long_value = iprot.readI64();
          return long_value;
        case DOUBLE_VALUE:
          Double double_value;
          double_value = iprot.readDouble();
          return double_value;
        case STRING_VALUE:
          String string_value;
          string_value = iprot.readString();
          return string_value;
        case BYTES_VALUE:
          ByteBuffer bytes_value;
          bytes_value = iprot.readBinary();
          return bytes_value;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case SHORT_VALUE:
        Short short_value = (Short)value_;
        oprot.writeI16(short_value);
        return;
      case INT_VALUE:
        Integer int_value = (Integer)value_;
        oprot.writeI32(int_value);
        return;
      case LONG_VALUE:
        Long long_value = (Long)value_;
        oprot.writeI64(long_value);
        return;
      case DOUBLE_VALUE:
        Double double_value = (Double)value_;
        oprot.writeDouble(double_value);
        return;
      case STRING_VALUE:
        String string_value = (String)value_;
        oprot.writeString(string_value);
        return;
      case BYTES_VALUE:
        ByteBuffer bytes_value = (ByteBuffer)value_;
        oprot.writeBinary(bytes_value);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case SHORT_VALUE:
        return SHORT_VALUE_FIELD_DESC;
      case INT_VALUE:
        return INT_VALUE_FIELD_DESC;
      case LONG_VALUE:
        return LONG_VALUE_FIELD_DESC;
      case DOUBLE_VALUE:
        return DOUBLE_VALUE_FIELD_DESC;
      case STRING_VALUE:
        return STRING_VALUE_FIELD_DESC;
      case BYTES_VALUE:
        return BYTES_VALUE_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public short getShort_value() {
    if (getSetField() == _Fields.SHORT_VALUE) {
      return (Short)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'short_value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setShort_value(short value) {
    setField_ = _Fields.SHORT_VALUE;
    value_ = value;
  }

  public int getInt_value() {
    if (getSetField() == _Fields.INT_VALUE) {
      return (Integer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'int_value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setInt_value(int value) {
    setField_ = _Fields.INT_VALUE;
    value_ = value;
  }

  public long getLong_value() {
    if (getSetField() == _Fields.LONG_VALUE) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'long_value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLong_value(long value) {
    setField_ = _Fields.LONG_VALUE;
    value_ = value;
  }

  public double getDouble_value() {
    if (getSetField() == _Fields.DOUBLE_VALUE) {
      return (Double)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'double_value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDouble_value(double value) {
    setField_ = _Fields.DOUBLE_VALUE;
    value_ = value;
  }

  public String getString_value() {
    if (getSetField() == _Fields.STRING_VALUE) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'string_value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setString_value(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STRING_VALUE;
    value_ = value;
  }

  public byte[] getBytes_value() {
    setBytes_value(org.apache.thrift.TBaseHelper.rightSize(bufferForBytes_value()));
    ByteBuffer b = bufferForBytes_value();
    return b == null ? null : b.array();
  }

  public ByteBuffer bufferForBytes_value() {
    if (getSetField() == _Fields.BYTES_VALUE) {
      return (ByteBuffer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'bytes_value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBytes_value(byte[] value) {
    setBytes_value(ByteBuffer.wrap(value));
  }

  public void setBytes_value(ByteBuffer value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.BYTES_VALUE;
    value_ = value;
  }

  public boolean isSetShort_value() {
    return setField_ == _Fields.SHORT_VALUE;
  }


  public boolean isSetInt_value() {
    return setField_ == _Fields.INT_VALUE;
  }


  public boolean isSetLong_value() {
    return setField_ == _Fields.LONG_VALUE;
  }


  public boolean isSetDouble_value() {
    return setField_ == _Fields.DOUBLE_VALUE;
  }


  public boolean isSetString_value() {
    return setField_ == _Fields.STRING_VALUE;
  }


  public boolean isSetBytes_value() {
    return setField_ == _Fields.BYTES_VALUE;
  }


  public boolean equals(Object other) {
    if (other instanceof Item) {
      return equals((Item)other);
    } else {
      return false;
    }
  }

  public boolean equals(Item other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(Item other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    HashCodeBuilder hcb = new HashCodeBuilder();
    hcb.append(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      hcb.append(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        hcb.append(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        hcb.append(value);
      }
    }
    return hcb.toHashCode();
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


}
