// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/weather.proto

package edu.malens.grpc;

public interface WeatherResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:WeatherResponse)
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
   * <code>repeated .WeatherDay weather = 2;</code>
   */
  java.util.List<edu.malens.grpc.WeatherDay> 
      getWeatherList();
  /**
   * <code>repeated .WeatherDay weather = 2;</code>
   */
  edu.malens.grpc.WeatherDay getWeather(int index);
  /**
   * <code>repeated .WeatherDay weather = 2;</code>
   */
  int getWeatherCount();
  /**
   * <code>repeated .WeatherDay weather = 2;</code>
   */
  java.util.List<? extends edu.malens.grpc.WeatherDayOrBuilder> 
      getWeatherOrBuilderList();
  /**
   * <code>repeated .WeatherDay weather = 2;</code>
   */
  edu.malens.grpc.WeatherDayOrBuilder getWeatherOrBuilder(
      int index);
}