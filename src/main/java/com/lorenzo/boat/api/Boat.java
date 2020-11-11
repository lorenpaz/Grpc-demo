// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Boat.proto

package com.lorenzo.boat.api;

/**
 * Protobuf type {@code com.lorenzo.api.Boat}
 */
public  final class Boat extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.lorenzo.api.Boat)
    BoatOrBuilder {
  // Use Boat.newBuilder() to construct.
  private Boat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Boat() {
    model_ = "";
    captain_ = "";
    fuel_ = 0;
    cargo_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Boat(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            model_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            captain_ = s;
            break;
          }
          case 24: {

            fuel_ = input.readInt32();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            cargo_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BoatProtos.internal_static_com_lorenzo_boat_api_Boat_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BoatProtos.internal_static_com_lorenzo_boat_api_Boat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Boat.class, Boat.Builder.class);
  }

  /**
   * Protobuf enum {@code com.lorenzo.api.Boat.CargoType}
   */
  public enum CargoType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FRUIT = 0;</code>
     */
    FRUIT(0),
    /**
     * <code>WEAPONS = 1;</code>
     */
    WEAPONS(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FRUIT = 0;</code>
     */
    public static final int FRUIT_VALUE = 0;
    /**
     * <code>WEAPONS = 1;</code>
     */
    public static final int WEAPONS_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CargoType valueOf(int value) {
      return forNumber(value);
    }

    public static CargoType forNumber(int value) {
      switch (value) {
        case 0: return FRUIT;
        case 1: return WEAPONS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CargoType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CargoType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CargoType>() {
            public CargoType findValueByNumber(int number) {
              return CargoType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Boat.getDescriptor().getEnumTypes().get(0);
    }

    private static final CargoType[] VALUES = values();

    public static CargoType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CargoType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.lorenzo.api.Boat.CargoType)
  }

  public static final int MODEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object model_;
  /**
   * <code>string model = 1;</code>
   */
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   * <code>string model = 1;</code>
   */
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAPTAIN_FIELD_NUMBER = 2;
  private volatile java.lang.Object captain_;
  /**
   * <code>string captain = 2;</code>
   */
  public java.lang.String getCaptain() {
    java.lang.Object ref = captain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      captain_ = s;
      return s;
    }
  }
  /**
   * <code>string captain = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCaptainBytes() {
    java.lang.Object ref = captain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      captain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FUEL_FIELD_NUMBER = 3;
  private int fuel_;
  /**
   * <code>int32 fuel = 3;</code>
   */
  public int getFuel() {
    return fuel_;
  }

  public static final int CARGO_FIELD_NUMBER = 4;
  private int cargo_;
  /**
   * <code>.com.lorenzo.api.Boat.CargoType cargo = 4;</code>
   */
  public int getCargoValue() {
    return cargo_;
  }
  /**
   * <code>.com.lorenzo.api.Boat.CargoType cargo = 4;</code>
   */
  public Boat.CargoType getCargo() {
    Boat.CargoType result = Boat.CargoType.valueOf(cargo_);
    return result == null ? Boat.CargoType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getModelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, model_);
    }
    if (!getCaptainBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, captain_);
    }
    if (fuel_ != 0) {
      output.writeInt32(3, fuel_);
    }
    if (cargo_ != Boat.CargoType.FRUIT.getNumber()) {
      output.writeEnum(4, cargo_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getModelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, model_);
    }
    if (!getCaptainBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, captain_);
    }
    if (fuel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, fuel_);
    }
    if (cargo_ != Boat.CargoType.FRUIT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, cargo_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Boat)) {
      return super.equals(obj);
    }
    Boat other = (Boat) obj;

    boolean result = true;
    result = result && getModel()
        .equals(other.getModel());
    result = result && getCaptain()
        .equals(other.getCaptain());
    result = result && (getFuel()
        == other.getFuel());
    result = result && cargo_ == other.cargo_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (37 * hash) + CAPTAIN_FIELD_NUMBER;
    hash = (53 * hash) + getCaptain().hashCode();
    hash = (37 * hash) + FUEL_FIELD_NUMBER;
    hash = (53 * hash) + getFuel();
    hash = (37 * hash) + CARGO_FIELD_NUMBER;
    hash = (53 * hash) + cargo_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Boat parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Boat parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Boat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Boat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Boat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Boat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Boat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Boat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Boat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Boat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Boat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Boat parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Boat prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.lorenzo.api.Boat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.lorenzo.api.Boat)
          BoatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BoatProtos.internal_static_com_lorenzo_boat_api_Boat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BoatProtos.internal_static_com_lorenzo_boat_api_Boat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Boat.class, Boat.Builder.class);
    }

    // Construct using com.lorenzo.api.Boat.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      model_ = "";

      captain_ = "";

      fuel_ = 0;

      cargo_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BoatProtos.internal_static_com_lorenzo_boat_api_Boat_descriptor;
    }

    public Boat getDefaultInstanceForType() {
      return Boat.getDefaultInstance();
    }

    public Boat build() {
      Boat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Boat buildPartial() {
      Boat result = new Boat(this);
      result.model_ = model_;
      result.captain_ = captain_;
      result.fuel_ = fuel_;
      result.cargo_ = cargo_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Boat) {
        return mergeFrom((Boat)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Boat other) {
      if (other == Boat.getDefaultInstance()) return this;
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        onChanged();
      }
      if (!other.getCaptain().isEmpty()) {
        captain_ = other.captain_;
        onChanged();
      }
      if (other.getFuel() != 0) {
        setFuel(other.getFuel());
      }
      if (other.cargo_ != 0) {
        setCargoValue(other.getCargoValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Boat parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Boat) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     * <code>string model = 1;</code>
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string model = 1;</code>
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string model = 1;</code>
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      model_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string model = 1;</code>
     */
    public Builder clearModel() {
      
      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     * <code>string model = 1;</code>
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      model_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object captain_ = "";
    /**
     * <code>string captain = 2;</code>
     */
    public java.lang.String getCaptain() {
      java.lang.Object ref = captain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        captain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string captain = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCaptainBytes() {
      java.lang.Object ref = captain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        captain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string captain = 2;</code>
     */
    public Builder setCaptain(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      captain_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string captain = 2;</code>
     */
    public Builder clearCaptain() {
      
      captain_ = getDefaultInstance().getCaptain();
      onChanged();
      return this;
    }
    /**
     * <code>string captain = 2;</code>
     */
    public Builder setCaptainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      captain_ = value;
      onChanged();
      return this;
    }

    private int fuel_ ;
    /**
     * <code>int32 fuel = 3;</code>
     */
    public int getFuel() {
      return fuel_;
    }
    /**
     * <code>int32 fuel = 3;</code>
     */
    public Builder setFuel(int value) {
      
      fuel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fuel = 3;</code>
     */
    public Builder clearFuel() {
      
      fuel_ = 0;
      onChanged();
      return this;
    }

    private int cargo_ = 0;
    /**
     * <code>.com.lorenzo.api.Boat.CargoType cargo = 4;</code>
     */
    public int getCargoValue() {
      return cargo_;
    }
    /**
     * <code>.com.lorenzo.api.Boat.CargoType cargo = 4;</code>
     */
    public Builder setCargoValue(int value) {
      cargo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.lorenzo.api.Boat.CargoType cargo = 4;</code>
     */
    public Boat.CargoType getCargo() {
      Boat.CargoType result = Boat.CargoType.valueOf(cargo_);
      return result == null ? Boat.CargoType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.lorenzo.api.Boat.CargoType cargo = 4;</code>
     */
    public Builder setCargo(Boat.CargoType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cargo_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.lorenzo.api.Boat.CargoType cargo = 4;</code>
     */
    public Builder clearCargo() {
      
      cargo_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.lorenzo.api.Boat)
  }

  // @@protoc_insertion_point(class_scope:com.lorenzo.api.Boat)
  private static final Boat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Boat();
  }

  public static Boat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Boat>
      PARSER = new com.google.protobuf.AbstractParser<Boat>() {
    public Boat parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Boat(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Boat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Boat> getParserForType() {
    return PARSER;
  }

  public Boat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
