// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/weather.proto

package edu.malens.grpc;

public interface WeatherRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:weatherproto.WeatherRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string city = 1;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <code>string city = 1;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>repeated .weatherproto.Date date = 2;</code>
   */
  java.util.List<edu.malens.grpc.Date> 
      getDateList();
  /**
   * <code>repeated .weatherproto.Date date = 2;</code>
   */
  edu.malens.grpc.Date getDate(int index);
  /**
   * <code>repeated .weatherproto.Date date = 2;</code>
   */
  int getDateCount();
  /**
   * <code>repeated .weatherproto.Date date = 2;</code>
   */
  java.util.List<? extends edu.malens.grpc.DateOrBuilder> 
      getDateOrBuilderList();
  /**
   * <code>repeated .weatherproto.Date date = 2;</code>
   */
  edu.malens.grpc.DateOrBuilder getDateOrBuilder(
      int index);
}
