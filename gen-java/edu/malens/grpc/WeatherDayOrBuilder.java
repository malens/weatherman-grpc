// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/weather.proto

package edu.malens.grpc;

public interface WeatherDayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:weatherproto.WeatherDay)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.weatherproto.Date date = 1;</code>
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   * <code>.weatherproto.Date date = 1;</code>
   * @return The date.
   */
  edu.malens.grpc.Date getDate();
  /**
   * <code>.weatherproto.Date date = 1;</code>
   */
  edu.malens.grpc.DateOrBuilder getDateOrBuilder();

  /**
   * <code>.weatherproto.WeatherState state = 2;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <code>.weatherproto.WeatherState state = 2;</code>
   * @return The state.
   */
  edu.malens.grpc.WeatherState getState();
}
