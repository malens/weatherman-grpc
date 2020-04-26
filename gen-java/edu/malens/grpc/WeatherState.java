// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/weather.proto

package edu.malens.grpc;

/**
 * Protobuf enum {@code WeatherState}
 */
public enum WeatherState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CLEAR = 0;</code>
   */
  CLEAR(0),
  /**
   * <code>CLOUDY = 1;</code>
   */
  CLOUDY(1),
  /**
   * <code>RAIN = 2;</code>
   */
  RAIN(2),
  /**
   * <code>SNOW = 3;</code>
   */
  SNOW(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CLEAR = 0;</code>
   */
  public static final int CLEAR_VALUE = 0;
  /**
   * <code>CLOUDY = 1;</code>
   */
  public static final int CLOUDY_VALUE = 1;
  /**
   * <code>RAIN = 2;</code>
   */
  public static final int RAIN_VALUE = 2;
  /**
   * <code>SNOW = 3;</code>
   */
  public static final int SNOW_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static WeatherState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WeatherState forNumber(int value) {
    switch (value) {
      case 0: return CLEAR;
      case 1: return CLOUDY;
      case 2: return RAIN;
      case 3: return SNOW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WeatherState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WeatherState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WeatherState>() {
          public WeatherState findValueByNumber(int number) {
            return WeatherState.forNumber(number);
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
    return edu.malens.grpc.WeatherProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final WeatherState[] VALUES = values();

  public static WeatherState valueOf(
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

  private WeatherState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:WeatherState)
}

