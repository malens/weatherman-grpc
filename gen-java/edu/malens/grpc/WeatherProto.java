// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/weather.proto

package edu.malens.grpc;

public final class WeatherProto {
  private WeatherProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Date_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Date_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeatherRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeatherRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeatherDay_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeatherDay_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeatherResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeatherResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_City_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_City_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023proto/weather.proto\"0\n\004Date\022\013\n\003day\030\001 \001" +
      "(\005\022\r\n\005month\030\002 \001(\005\022\014\n\004year\030\003 \001(\005\"3\n\016Weath" +
      "erRequest\022\014\n\004city\030\001 \001(\t\022\023\n\004date\030\002 \003(\0132\005." +
      "Date\"?\n\nWeatherDay\022\023\n\004date\030\001 \001(\0132\005.Date\022" +
      "\034\n\005state\030\002 \001(\0162\r.WeatherState\"=\n\017Weather" +
      "Response\022\014\n\004city\030\001 \001(\t\022\034\n\007weather\030\002 \003(\0132" +
      "\013.WeatherDay\"\024\n\004City\022\014\n\004name\030\001 \001(\t*9\n\014We" +
      "atherState\022\t\n\005CLEAR\020\000\022\n\n\006CLOUDY\020\001\022\010\n\004RAI" +
      "N\020\002\022\010\n\004SNOW\020\0032U\n\007Weather\022&\n\tsubscribe\022\005." +
      "City\032\020.WeatherResponse0\001\022\"\n\007testget\022\005.Ci" +
      "ty\032\020.WeatherResponseB&\n\017edu.malens.grpcB" +
      "\014WeatherProtoP\001\242\002\002WPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Date_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Date_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Date_descriptor,
        new java.lang.String[] { "Day", "Month", "Year", });
    internal_static_WeatherRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_WeatherRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeatherRequest_descriptor,
        new java.lang.String[] { "City", "Date", });
    internal_static_WeatherDay_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_WeatherDay_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeatherDay_descriptor,
        new java.lang.String[] { "Date", "State", });
    internal_static_WeatherResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_WeatherResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeatherResponse_descriptor,
        new java.lang.String[] { "City", "Weather", });
    internal_static_City_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_City_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_City_descriptor,
        new java.lang.String[] { "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}