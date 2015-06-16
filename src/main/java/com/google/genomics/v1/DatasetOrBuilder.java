// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/datasets.proto

package com.google.genomics.v1;

public interface DatasetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.Dataset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string id = 1;</code>
   *
   * <pre>
   * The server-assigned dataset ID, immutable.
   * </pre>
   */
  java.lang.String getId();
  /**
   * <code>optional string id = 1;</code>
   *
   * <pre>
   * The server-assigned dataset ID, immutable.
   * </pre>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>optional string project_id = 2;</code>
   *
   * <pre>
   * The Google Developers Console project number that this dataset belongs to.
   * </pre>
   */
  java.lang.String getProjectId();
  /**
   * <code>optional string project_id = 2;</code>
   *
   * <pre>
   * The Google Developers Console project number that this dataset belongs to.
   * </pre>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>optional string name = 3;</code>
   *
   * <pre>
   * The dataset name.
   * </pre>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 3;</code>
   *
   * <pre>
   * The dataset name.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}