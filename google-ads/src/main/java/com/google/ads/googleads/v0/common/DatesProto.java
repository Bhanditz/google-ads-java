// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/dates.proto

package com.google.ads.googleads.v0.common;

public final class DatesProto {
  private DatesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_DateRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_DateRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/ads/googleads/v0/common/dates.p" +
      "roto\022\036google.ads.googleads.v0.common\032\036go" +
      "ogle/protobuf/wrappers.proto\"m\n\tDateRang" +
      "e\0220\n\nstart_date\030\001 \001(\0132\034.google.protobuf." +
      "StringValue\022.\n\010end_date\030\002 \001(\0132\034.google.p" +
      "rotobuf.StringValueB\345\001\n\"com.google.ads.g" +
      "oogleads.v0.commonB\nDatesProtoP\001ZDgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v0/common;common\242\002\003GAA\252\002\036Google.Ad" +
      "s.GoogleAds.V0.Common\312\002\036Google\\Ads\\Googl" +
      "eAds\\V0\\Common\352\002\"Google::Ads::GoogleAds:" +
      ":V0::Commonb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_common_DateRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_common_DateRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_DateRange_descriptor,
        new java.lang.String[] { "StartDate", "EndDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
