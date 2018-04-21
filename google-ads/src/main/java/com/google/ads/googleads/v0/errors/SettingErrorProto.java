// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/setting_error.proto

package com.google.ads.googleads.v0.errors;

public final class SettingErrorProto {
  private SettingErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_SettingErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_SettingErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v0/errors/setting" +
      "_error.proto\022\036google.ads.googleads.v0.er" +
      "rors\"\276\010\n\020SettingErrorEnum\"\251\010\n\014SettingErr" +
      "or\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022!\n\035SETT" +
      "ING_TYPE_IS_NOT_AVAILABLE\020\003\0220\n,SETTING_T" +
      "YPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN\020\004\022;\n" +
      "7TARGETING_SETTING_CONTAINS_INVALID_CRIT" +
      "ERION_TYPE_GROUP\020\005\022Q\nMTARGETING_SETTING_" +
      "DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_B" +
      "E_SET_TO_TARGET_ALL\020\006\022\\\nXTARGETING_SETTI" +
      "NG_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR" +
      "_DEMOGRAPHIC_CRITERION_TYPE_GROUP\020\007\022C\n?D" +
      "YNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_F" +
      "EED_ID_MUST_BE_PRESENT\020\010\022;\n7DYNAMIC_SEAR" +
      "CH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_N" +
      "AME\020\t\0226\n2DYNAMIC_SEARCH_ADS_SETTING_CONT" +
      "AINS_SUBDOMAIN_NAME\020\n\022=\n9DYNAMIC_SEARCH_" +
      "ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CO" +
      "DE\020\013\022>\n:TARGET_ALL_IS_NOT_ALLOWED_FOR_PL" +
      "ACEMENT_IN_SEARCH_CAMPAIGN\020\014\0228\n4UNIVERSA" +
      "L_APP_CAMPAIGN_SETTING_DUPLICATE_DESCRIP" +
      "TION\020\r\022B\n>UNIVERSAL_APP_CAMPAIGN_SETTING" +
      "_DESCRIPTION_LINE_WIDTH_TOO_LONG\020\016\022<\n8UN" +
      "IVERSAL_APP_CAMPAIGN_SETTING_APP_ID_CANN" +
      "OT_BE_MODIFIED\020\017\0228\n4TOO_MANY_YOUTUBE_MED" +
      "IA_IDS_IN_UNIVERSAL_APP_CAMPAIGN\020\020\0226\n2TO" +
      "O_MANY_IMAGE_MEDIA_IDS_IN_UNIVERSAL_APP_" +
      "CAMPAIGN\020\021\0221\n-MEDIA_INCOMPATIBLE_FOR_UNI" +
      "VERSAL_APP_CAMPAIGN\020\022\022\036\n\032TOO_MANY_EXCLAM" +
      "ATION_MARKS\020\023B\307\001\n\"com.google.ads.googlea" +
      "ds.v0.errorsB\021SettingErrorProtoP\001ZDgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v0/errors;errors\242\002\003GAA\252\002\036Google.A" +
      "ds.GoogleAds.V0.Errors\312\002\036Google\\Ads\\Goog" +
      "leAds\\V0\\Errorsb\006proto3"
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
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_SettingErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_SettingErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_SettingErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}