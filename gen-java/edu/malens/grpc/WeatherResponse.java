// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/weather.proto

package edu.malens.grpc;

/**
 * Protobuf type {@code WeatherResponse}
 */
public  final class WeatherResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:WeatherResponse)
    WeatherResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeatherResponse.newBuilder() to construct.
  private WeatherResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeatherResponse() {
    city_ = "";
    weather_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeatherResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeatherResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            city_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              weather_ = new java.util.ArrayList<edu.malens.grpc.WeatherDay>();
              mutable_bitField0_ |= 0x00000001;
            }
            weather_.add(
                input.readMessage(edu.malens.grpc.WeatherDay.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        weather_ = java.util.Collections.unmodifiableList(weather_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.malens.grpc.WeatherProto.internal_static_WeatherResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.malens.grpc.WeatherProto.internal_static_WeatherResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.malens.grpc.WeatherResponse.class, edu.malens.grpc.WeatherResponse.Builder.class);
  }

  public static final int CITY_FIELD_NUMBER = 1;
  private volatile java.lang.Object city_;
  /**
   * <code>string city = 1;</code>
   * @return The city.
   */
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 1;</code>
   * @return The bytes for city.
   */
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEATHER_FIELD_NUMBER = 2;
  private java.util.List<edu.malens.grpc.WeatherDay> weather_;
  /**
   * <code>repeated .WeatherDay weather = 2;</code>
   */
  public java.util.List<edu.malens.grpc.WeatherDay> getWeatherList() {
    return weather_;
  }
  /**
   * <code>repeated .WeatherDay weather = 2;</code>
   */
  public java.util.List<? extends edu.malens.grpc.WeatherDayOrBuilder> 
      getWeatherOrBuilderList() {
    return weather_;
  }
  /**
   * <code>repeated .WeatherDay weather = 2;</code>
   */
  public int getWeatherCount() {
    return weather_.size();
  }
  /**
   * <code>repeated .WeatherDay weather = 2;</code>
   */
  public edu.malens.grpc.WeatherDay getWeather(int index) {
    return weather_.get(index);
  }
  /**
   * <code>repeated .WeatherDay weather = 2;</code>
   */
  public edu.malens.grpc.WeatherDayOrBuilder getWeatherOrBuilder(
      int index) {
    return weather_.get(index);
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
    if (!getCityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, city_);
    }
    for (int i = 0; i < weather_.size(); i++) {
      output.writeMessage(2, weather_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, city_);
    }
    for (int i = 0; i < weather_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, weather_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof edu.malens.grpc.WeatherResponse)) {
      return super.equals(obj);
    }
    edu.malens.grpc.WeatherResponse other = (edu.malens.grpc.WeatherResponse) obj;

    if (!getCity()
        .equals(other.getCity())) return false;
    if (!getWeatherList()
        .equals(other.getWeatherList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    if (getWeatherCount() > 0) {
      hash = (37 * hash) + WEATHER_FIELD_NUMBER;
      hash = (53 * hash) + getWeatherList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static edu.malens.grpc.WeatherResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.malens.grpc.WeatherResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.malens.grpc.WeatherResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.malens.grpc.WeatherResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.malens.grpc.WeatherResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.malens.grpc.WeatherResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.malens.grpc.WeatherResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.malens.grpc.WeatherResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.malens.grpc.WeatherResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.malens.grpc.WeatherResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.malens.grpc.WeatherResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.malens.grpc.WeatherResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(edu.malens.grpc.WeatherResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code WeatherResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:WeatherResponse)
      edu.malens.grpc.WeatherResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.malens.grpc.WeatherProto.internal_static_WeatherResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.malens.grpc.WeatherProto.internal_static_WeatherResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.malens.grpc.WeatherResponse.class, edu.malens.grpc.WeatherResponse.Builder.class);
    }

    // Construct using edu.malens.grpc.WeatherResponse.newBuilder()
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
        getWeatherFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      city_ = "";

      if (weatherBuilder_ == null) {
        weather_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        weatherBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.malens.grpc.WeatherProto.internal_static_WeatherResponse_descriptor;
    }

    @java.lang.Override
    public edu.malens.grpc.WeatherResponse getDefaultInstanceForType() {
      return edu.malens.grpc.WeatherResponse.getDefaultInstance();
    }

    @java.lang.Override
    public edu.malens.grpc.WeatherResponse build() {
      edu.malens.grpc.WeatherResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.malens.grpc.WeatherResponse buildPartial() {
      edu.malens.grpc.WeatherResponse result = new edu.malens.grpc.WeatherResponse(this);
      int from_bitField0_ = bitField0_;
      result.city_ = city_;
      if (weatherBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          weather_ = java.util.Collections.unmodifiableList(weather_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.weather_ = weather_;
      } else {
        result.weather_ = weatherBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof edu.malens.grpc.WeatherResponse) {
        return mergeFrom((edu.malens.grpc.WeatherResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(edu.malens.grpc.WeatherResponse other) {
      if (other == edu.malens.grpc.WeatherResponse.getDefaultInstance()) return this;
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        onChanged();
      }
      if (weatherBuilder_ == null) {
        if (!other.weather_.isEmpty()) {
          if (weather_.isEmpty()) {
            weather_ = other.weather_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWeatherIsMutable();
            weather_.addAll(other.weather_);
          }
          onChanged();
        }
      } else {
        if (!other.weather_.isEmpty()) {
          if (weatherBuilder_.isEmpty()) {
            weatherBuilder_.dispose();
            weatherBuilder_ = null;
            weather_ = other.weather_;
            bitField0_ = (bitField0_ & ~0x00000001);
            weatherBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWeatherFieldBuilder() : null;
          } else {
            weatherBuilder_.addAllMessages(other.weather_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      edu.malens.grpc.WeatherResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (edu.malens.grpc.WeatherResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 1;</code>
     * @return The city.
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 1;</code>
     * @return The bytes for city.
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 1;</code>
     * @param value The city to set.
     * @return This builder for chaining.
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      city_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCity() {
      
      city_ = getDefaultInstance().getCity();
      onChanged();
      return this;
    }
    /**
     * <code>string city = 1;</code>
     * @param value The bytes for city to set.
     * @return This builder for chaining.
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      city_ = value;
      onChanged();
      return this;
    }

    private java.util.List<edu.malens.grpc.WeatherDay> weather_ =
      java.util.Collections.emptyList();
    private void ensureWeatherIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        weather_ = new java.util.ArrayList<edu.malens.grpc.WeatherDay>(weather_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.malens.grpc.WeatherDay, edu.malens.grpc.WeatherDay.Builder, edu.malens.grpc.WeatherDayOrBuilder> weatherBuilder_;

    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public java.util.List<edu.malens.grpc.WeatherDay> getWeatherList() {
      if (weatherBuilder_ == null) {
        return java.util.Collections.unmodifiableList(weather_);
      } else {
        return weatherBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public int getWeatherCount() {
      if (weatherBuilder_ == null) {
        return weather_.size();
      } else {
        return weatherBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public edu.malens.grpc.WeatherDay getWeather(int index) {
      if (weatherBuilder_ == null) {
        return weather_.get(index);
      } else {
        return weatherBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public Builder setWeather(
        int index, edu.malens.grpc.WeatherDay value) {
      if (weatherBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeatherIsMutable();
        weather_.set(index, value);
        onChanged();
      } else {
        weatherBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public Builder setWeather(
        int index, edu.malens.grpc.WeatherDay.Builder builderForValue) {
      if (weatherBuilder_ == null) {
        ensureWeatherIsMutable();
        weather_.set(index, builderForValue.build());
        onChanged();
      } else {
        weatherBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public Builder addWeather(edu.malens.grpc.WeatherDay value) {
      if (weatherBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeatherIsMutable();
        weather_.add(value);
        onChanged();
      } else {
        weatherBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public Builder addWeather(
        int index, edu.malens.grpc.WeatherDay value) {
      if (weatherBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeatherIsMutable();
        weather_.add(index, value);
        onChanged();
      } else {
        weatherBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public Builder addWeather(
        edu.malens.grpc.WeatherDay.Builder builderForValue) {
      if (weatherBuilder_ == null) {
        ensureWeatherIsMutable();
        weather_.add(builderForValue.build());
        onChanged();
      } else {
        weatherBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public Builder addWeather(
        int index, edu.malens.grpc.WeatherDay.Builder builderForValue) {
      if (weatherBuilder_ == null) {
        ensureWeatherIsMutable();
        weather_.add(index, builderForValue.build());
        onChanged();
      } else {
        weatherBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public Builder addAllWeather(
        java.lang.Iterable<? extends edu.malens.grpc.WeatherDay> values) {
      if (weatherBuilder_ == null) {
        ensureWeatherIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, weather_);
        onChanged();
      } else {
        weatherBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public Builder clearWeather() {
      if (weatherBuilder_ == null) {
        weather_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        weatherBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public Builder removeWeather(int index) {
      if (weatherBuilder_ == null) {
        ensureWeatherIsMutable();
        weather_.remove(index);
        onChanged();
      } else {
        weatherBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public edu.malens.grpc.WeatherDay.Builder getWeatherBuilder(
        int index) {
      return getWeatherFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public edu.malens.grpc.WeatherDayOrBuilder getWeatherOrBuilder(
        int index) {
      if (weatherBuilder_ == null) {
        return weather_.get(index);  } else {
        return weatherBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public java.util.List<? extends edu.malens.grpc.WeatherDayOrBuilder> 
         getWeatherOrBuilderList() {
      if (weatherBuilder_ != null) {
        return weatherBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(weather_);
      }
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public edu.malens.grpc.WeatherDay.Builder addWeatherBuilder() {
      return getWeatherFieldBuilder().addBuilder(
          edu.malens.grpc.WeatherDay.getDefaultInstance());
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public edu.malens.grpc.WeatherDay.Builder addWeatherBuilder(
        int index) {
      return getWeatherFieldBuilder().addBuilder(
          index, edu.malens.grpc.WeatherDay.getDefaultInstance());
    }
    /**
     * <code>repeated .WeatherDay weather = 2;</code>
     */
    public java.util.List<edu.malens.grpc.WeatherDay.Builder> 
         getWeatherBuilderList() {
      return getWeatherFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.malens.grpc.WeatherDay, edu.malens.grpc.WeatherDay.Builder, edu.malens.grpc.WeatherDayOrBuilder> 
        getWeatherFieldBuilder() {
      if (weatherBuilder_ == null) {
        weatherBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            edu.malens.grpc.WeatherDay, edu.malens.grpc.WeatherDay.Builder, edu.malens.grpc.WeatherDayOrBuilder>(
                weather_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        weather_ = null;
      }
      return weatherBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:WeatherResponse)
  }

  // @@protoc_insertion_point(class_scope:WeatherResponse)
  private static final edu.malens.grpc.WeatherResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.malens.grpc.WeatherResponse();
  }

  public static edu.malens.grpc.WeatherResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeatherResponse>
      PARSER = new com.google.protobuf.AbstractParser<WeatherResponse>() {
    @java.lang.Override
    public WeatherResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeatherResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeatherResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeatherResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.malens.grpc.WeatherResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
