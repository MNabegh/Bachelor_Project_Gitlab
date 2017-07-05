// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/http.proto

package com.google.api;

public interface HttpRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.HttpRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Used for listing and getting information about resources.
   * </pre>
   *
   * <code>optional string get = 2;</code>
   */
  java.lang.String getGet();
  /**
   * <pre>
   * Used for listing and getting information about resources.
   * </pre>
   *
   * <code>optional string get = 2;</code>
   */
  com.google.protobuf.ByteString
      getGetBytes();

  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>optional string put = 3;</code>
   */
  java.lang.String getPut();
  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>optional string put = 3;</code>
   */
  com.google.protobuf.ByteString
      getPutBytes();

  /**
   * <pre>
   * Used for creating a resource.
   * </pre>
   *
   * <code>optional string post = 4;</code>
   */
  java.lang.String getPost();
  /**
   * <pre>
   * Used for creating a resource.
   * </pre>
   *
   * <code>optional string post = 4;</code>
   */
  com.google.protobuf.ByteString
      getPostBytes();

  /**
   * <pre>
   * Used for deleting a resource.
   * </pre>
   *
   * <code>optional string delete = 5;</code>
   */
  java.lang.String getDelete();
  /**
   * <pre>
   * Used for deleting a resource.
   * </pre>
   *
   * <code>optional string delete = 5;</code>
   */
  com.google.protobuf.ByteString
      getDeleteBytes();

  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>optional string patch = 6;</code>
   */
  java.lang.String getPatch();
  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>optional string patch = 6;</code>
   */
  com.google.protobuf.ByteString
      getPatchBytes();

  /**
   * <pre>
   * Custom pattern is used for defining custom verbs.
   * </pre>
   *
   * <code>optional .google.api.CustomHttpPattern custom = 8;</code>
   */
  com.google.api.CustomHttpPattern getCustom();
  /**
   * <pre>
   * Custom pattern is used for defining custom verbs.
   * </pre>
   *
   * <code>optional .google.api.CustomHttpPattern custom = 8;</code>
   */
  com.google.api.CustomHttpPatternOrBuilder getCustomOrBuilder();

  /**
   * <pre>
   * The name of the request field whose value is mapped to the HTTP body, or
   * `*` for mapping all fields not captured by the path pattern to the HTTP
   * body.
   * </pre>
   *
   * <code>optional string body = 7;</code>
   */
  java.lang.String getBody();
  /**
   * <pre>
   * The name of the request field whose value is mapped to the HTTP body, or
   * `*` for mapping all fields not captured by the path pattern to the HTTP
   * body.
   * </pre>
   *
   * <code>optional string body = 7;</code>
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must not
   * specify a selector and must not contain additional bindings.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  java.util.List<com.google.api.HttpRule> 
      getAdditionalBindingsList();
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must not
   * specify a selector and must not contain additional bindings.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  com.google.api.HttpRule getAdditionalBindings(int index);
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must not
   * specify a selector and must not contain additional bindings.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  int getAdditionalBindingsCount();
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must not
   * specify a selector and must not contain additional bindings.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  java.util.List<? extends com.google.api.HttpRuleOrBuilder> 
      getAdditionalBindingsOrBuilderList();
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must not
   * specify a selector and must not contain additional bindings.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  com.google.api.HttpRuleOrBuilder getAdditionalBindingsOrBuilder(
      int index);

  public com.google.api.HttpRule.PatternCase getPatternCase();
}