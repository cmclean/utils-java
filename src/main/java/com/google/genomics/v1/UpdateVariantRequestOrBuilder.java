// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface UpdateVariantRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.UpdateVariantRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string variant_id = 1;</code>
   *
   * <pre>
   * The ID of the variant to be updated.
   * </pre>
   */
  java.lang.String getVariantId();
  /**
   * <code>optional string variant_id = 1;</code>
   *
   * <pre>
   * The ID of the variant to be updated.
   * </pre>
   */
  com.google.protobuf.ByteString
      getVariantIdBytes();

  /**
   * <code>optional .google.genomics.v1.Variant variant = 2;</code>
   *
   * <pre>
   * The new variant data.
   * </pre>
   */
  boolean hasVariant();
  /**
   * <code>optional .google.genomics.v1.Variant variant = 2;</code>
   *
   * <pre>
   * The new variant data.
   * </pre>
   */
  com.google.genomics.v1.Variant getVariant();
  /**
   * <code>optional .google.genomics.v1.Variant variant = 2;</code>
   *
   * <pre>
   * The new variant data.
   * </pre>
   */
  com.google.genomics.v1.VariantOrBuilder getVariantOrBuilder();

  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  boolean hasUpdateMask();
  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}