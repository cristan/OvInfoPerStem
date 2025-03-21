package nl.openov.ovinfoperstem.proto;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: place.proto
// Protobuf Java Version: 4.29.3

public final class PlaceOuterClass {
  private PlaceOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      PlaceOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlaceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Place)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float latitude = 1 [json_name = "latitude"];</code>
     * @return The latitude.
     */
    float getLatitude();

    /**
     * <code>float longitude = 2 [json_name = "longitude"];</code>
     * @return The longitude.
     */
    float getLongitude();
  }
  /**
   * Protobuf type {@code Place}
   */
  public static final class Place extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Place)
      PlaceOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        Place.class.getName());
    }
    // Use Place.newBuilder() to construct.
    private Place(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Place() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PlaceOuterClass.internal_static_Place_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PlaceOuterClass.internal_static_Place_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PlaceOuterClass.Place.class, PlaceOuterClass.Place.Builder.class);
    }

    public static final int LATITUDE_FIELD_NUMBER = 1;
    private float latitude_ = 0F;
    /**
     * <code>float latitude = 1 [json_name = "latitude"];</code>
     * @return The latitude.
     */
    @java.lang.Override
    public float getLatitude() {
      return latitude_;
    }

    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private float longitude_ = 0F;
    /**
     * <code>float longitude = 2 [json_name = "longitude"];</code>
     * @return The longitude.
     */
    @java.lang.Override
    public float getLongitude() {
      return longitude_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Float.floatToRawIntBits(latitude_) != 0) {
        output.writeFloat(1, latitude_);
      }
      if (java.lang.Float.floatToRawIntBits(longitude_) != 0) {
        output.writeFloat(2, longitude_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(latitude_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, latitude_);
      }
      if (java.lang.Float.floatToRawIntBits(longitude_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, longitude_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof PlaceOuterClass.Place)) {
        return super.equals(obj);
      }
      PlaceOuterClass.Place other = (PlaceOuterClass.Place) obj;

      if (java.lang.Float.floatToIntBits(getLatitude())
          != java.lang.Float.floatToIntBits(
              other.getLatitude())) return false;
      if (java.lang.Float.floatToIntBits(getLongitude())
          != java.lang.Float.floatToIntBits(
              other.getLongitude())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getLatitude());
      hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getLongitude());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PlaceOuterClass.Place parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlaceOuterClass.Place parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlaceOuterClass.Place parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlaceOuterClass.Place parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlaceOuterClass.Place parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlaceOuterClass.Place parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlaceOuterClass.Place parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static PlaceOuterClass.Place parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static PlaceOuterClass.Place parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static PlaceOuterClass.Place parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PlaceOuterClass.Place parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static PlaceOuterClass.Place parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(PlaceOuterClass.Place prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Place}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Place)
        PlaceOuterClass.PlaceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PlaceOuterClass.internal_static_Place_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PlaceOuterClass.internal_static_Place_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PlaceOuterClass.Place.class, PlaceOuterClass.Place.Builder.class);
      }

      // Construct using PlaceOuterClass.Place.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        latitude_ = 0F;
        longitude_ = 0F;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PlaceOuterClass.internal_static_Place_descriptor;
      }

      @java.lang.Override
      public PlaceOuterClass.Place getDefaultInstanceForType() {
        return PlaceOuterClass.Place.getDefaultInstance();
      }

      @java.lang.Override
      public PlaceOuterClass.Place build() {
        PlaceOuterClass.Place result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PlaceOuterClass.Place buildPartial() {
        PlaceOuterClass.Place result = new PlaceOuterClass.Place(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(PlaceOuterClass.Place result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.latitude_ = latitude_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.longitude_ = longitude_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PlaceOuterClass.Place) {
          return mergeFrom((PlaceOuterClass.Place)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PlaceOuterClass.Place other) {
        if (other == PlaceOuterClass.Place.getDefaultInstance()) return this;
        if (other.getLatitude() != 0F) {
          setLatitude(other.getLatitude());
        }
        if (other.getLongitude() != 0F) {
          setLongitude(other.getLongitude());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 13: {
                latitude_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
              case 21: {
                longitude_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private float latitude_ ;
      /**
       * <code>float latitude = 1 [json_name = "latitude"];</code>
       * @return The latitude.
       */
      @java.lang.Override
      public float getLatitude() {
        return latitude_;
      }
      /**
       * <code>float latitude = 1 [json_name = "latitude"];</code>
       * @param value The latitude to set.
       * @return This builder for chaining.
       */
      public Builder setLatitude(float value) {

        latitude_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>float latitude = 1 [json_name = "latitude"];</code>
       * @return This builder for chaining.
       */
      public Builder clearLatitude() {
        bitField0_ = (bitField0_ & ~0x00000001);
        latitude_ = 0F;
        onChanged();
        return this;
      }

      private float longitude_ ;
      /**
       * <code>float longitude = 2 [json_name = "longitude"];</code>
       * @return The longitude.
       */
      @java.lang.Override
      public float getLongitude() {
        return longitude_;
      }
      /**
       * <code>float longitude = 2 [json_name = "longitude"];</code>
       * @param value The longitude to set.
       * @return This builder for chaining.
       */
      public Builder setLongitude(float value) {

        longitude_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>float longitude = 2 [json_name = "longitude"];</code>
       * @return This builder for chaining.
       */
      public Builder clearLongitude() {
        bitField0_ = (bitField0_ & ~0x00000002);
        longitude_ = 0F;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Place)
    }

    // @@protoc_insertion_point(class_scope:Place)
    private static final PlaceOuterClass.Place DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PlaceOuterClass.Place();
    }

    public static PlaceOuterClass.Place getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Place>
        PARSER = new com.google.protobuf.AbstractParser<Place>() {
      @java.lang.Override
      public Place parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Place> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Place> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PlaceOuterClass.Place getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Place_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Place_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013place.proto\"A\n\005Place\022\032\n\010latitude\030\001 \001(\002" +
      "R\010latitude\022\034\n\tlongitude\030\002 \001(\002R\tlongitude" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Place_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Place_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Place_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
