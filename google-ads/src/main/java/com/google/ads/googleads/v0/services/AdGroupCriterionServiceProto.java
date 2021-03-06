// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/ad_group_criterion_service.proto

package com.google.ads.googleads.v0.services;

public final class AdGroupCriterionServiceProto {
  private AdGroupCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetAdGroupCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetAdGroupCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_AdGroupCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_AdGroupCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v0/services/ad_gr" +
      "oup_criterion_service.proto\022 google.ads." +
      "googleads.v0.services\032:google/ads/google" +
      "ads/v0/resources/ad_group_criterion.prot" +
      "o\032\034google/api/annotations.proto\032 google/" +
      "protobuf/field_mask.proto\032\036google/protob" +
      "uf/wrappers.proto\032\027google/rpc/status.pro" +
      "to\"3\n\032GetAdGroupCriterionRequest\022\025\n\rreso" +
      "urce_name\030\001 \001(\t\"\264\001\n\034MutateAdGroupCriteri" +
      "aRequest\022\023\n\013customer_id\030\001 \001(\t\022O\n\noperati" +
      "ons\030\002 \003(\0132;.google.ads.googleads.v0.serv" +
      "ices.AdGroupCriterionOperation\022\027\n\017partia" +
      "l_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\371" +
      "\001\n\031AdGroupCriterionOperation\022/\n\013update_m" +
      "ask\030\004 \001(\0132\032.google.protobuf.FieldMask\022E\n" +
      "\006create\030\001 \001(\01323.google.ads.googleads.v0." +
      "resources.AdGroupCriterionH\000\022E\n\006update\030\002" +
      " \001(\01323.google.ads.googleads.v0.resources" +
      ".AdGroupCriterionH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n" +
      "\toperation\"\243\001\n\035MutateAdGroupCriteriaResp" +
      "onse\0221\n\025partial_failure_error\030\003 \001(\0132\022.go" +
      "ogle.rpc.Status\022O\n\007results\030\002 \003(\0132>.googl" +
      "e.ads.googleads.v0.services.MutateAdGrou" +
      "pCriterionResult\"5\n\034MutateAdGroupCriteri" +
      "onResult\022\025\n\rresource_name\030\001 \001(\t2\273\003\n\027AdGr" +
      "oupCriterionService\022\303\001\n\023GetAdGroupCriter" +
      "ion\022<.google.ads.googleads.v0.services.G" +
      "etAdGroupCriterionRequest\0323.google.ads.g" +
      "oogleads.v0.resources.AdGroupCriterion\"9" +
      "\202\323\344\223\0023\0221/v0/{resource_name=customers/*/a" +
      "dGroupCriteria/*}\022\331\001\n\025MutateAdGroupCrite" +
      "ria\022>.google.ads.googleads.v0.services.M" +
      "utateAdGroupCriteriaRequest\032?.google.ads" +
      ".googleads.v0.services.MutateAdGroupCrit" +
      "eriaResponse\"?\202\323\344\223\0029\"4/v0/customers/{cus" +
      "tomer_id=*}/adGroupCriteria:mutate:\001*B\203\002" +
      "\n$com.google.ads.googleads.v0.servicesB\034" +
      "AdGroupCriterionServiceProtoP\001ZHgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v0/services;services\242\002\003GAA\252\002 Google." +
      "Ads.GoogleAds.V0.Services\312\002 Google\\Ads\\G" +
      "oogleAds\\V0\\Services\352\002$Google::Ads::Goog" +
      "leAds::V0::Servicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.AdGroupCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetAdGroupCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetAdGroupCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetAdGroupCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v0_services_AdGroupCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_AdGroupCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_AdGroupCriterionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.AdGroupCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
