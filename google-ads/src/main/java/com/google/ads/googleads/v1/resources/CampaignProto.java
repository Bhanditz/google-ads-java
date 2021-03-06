// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/campaign.proto

package com.google.ads.googleads.v1.resources;

public final class CampaignProto {
  private CampaignProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_Campaign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_Campaign_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_Campaign_NetworkSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_Campaign_NetworkSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_Campaign_HotelSettingInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_Campaign_HotelSettingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_Campaign_DynamicSearchAdsSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_Campaign_DynamicSearchAdsSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_Campaign_AppCampaignSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_Campaign_AppCampaignSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_Campaign_SelectiveOptimization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_Campaign_SelectiveOptimization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_Campaign_ShoppingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_Campaign_ShoppingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_Campaign_TrackingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_Campaign_TrackingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_Campaign_GeoTargetTypeSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_Campaign_GeoTargetTypeSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_Campaign_VanityPharma_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_Campaign_VanityPharma_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v1/resources/camp" +
      "aign.proto\022!google.ads.googleads.v1.reso" +
      "urces\032,google/ads/googleads/v1/common/bi" +
      "dding.proto\0325google/ads/googleads/v1/com" +
      "mon/custom_parameter.proto\0322google/ads/g" +
      "oogleads/v1/common/frequency_cap.proto\032>" +
      "google/ads/googleads/v1/common/real_time" +
      "_bidding_setting.proto\0326google/ads/googl" +
      "eads/v1/common/targeting_setting.proto\032B" +
      "google/ads/googleads/v1/enums/ad_serving" +
      "_optimization_status.proto\032@google/ads/g" +
      "oogleads/v1/enums/advertising_channel_su" +
      "b_type.proto\032<google/ads/googleads/v1/en" +
      "ums/advertising_channel_type.proto\032:goog" +
      "le/ads/googleads/v1/enums/app_campaign_a" +
      "pp_store.proto\032Kgoogle/ads/googleads/v1/" +
      "enums/app_campaign_bidding_strategy_goal" +
      "_type.proto\0329google/ads/googleads/v1/enu" +
      "ms/bidding_strategy_type.proto\032<google/a" +
      "ds/googleads/v1/enums/brand_safety_suita" +
      "bility.proto\032;google/ads/googleads/v1/en" +
      "ums/campaign_serving_status.proto\0323googl" +
      "e/ads/googleads/v1/enums/campaign_status" +
      ".proto\032<google/ads/googleads/v1/enums/ne" +
      "gative_geo_target_type.proto\0320google/ads" +
      "/googleads/v1/enums/payment_mode.proto\032<" +
      "google/ads/googleads/v1/enums/positive_g" +
      "eo_target_type.proto\032Bgoogle/ads/googlea" +
      "ds/v1/enums/vanity_pharma_display_url_mo" +
      "de.proto\0326google/ads/googleads/v1/enums/" +
      "vanity_pharma_text.proto\032\036google/protobu" +
      "f/wrappers.proto\032\034google/api/annotations" +
      ".proto\"\201(\n\010Campaign\022\025\n\rresource_name\030\001 \001" +
      "(\t\022\'\n\002id\030\003 \001(\0132\033.google.protobuf.Int64Va" +
      "lue\022*\n\004name\030\004 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022P\n\006status\030\005 \001(\0162@.google.ads.goo" +
      "gleads.v1.enums.CampaignStatusEnum.Campa" +
      "ignStatus\022f\n\016serving_status\030\025 \001(\0162N.goog" +
      "le.ads.googleads.v1.enums.CampaignServin" +
      "gStatusEnum.CampaignServingStatus\022\202\001\n\036ad" +
      "_serving_optimization_status\030\010 \001(\0162Z.goo" +
      "gle.ads.googleads.v1.enums.AdServingOpti" +
      "mizationStatusEnum.AdServingOptimization" +
      "Status\022r\n\030advertising_channel_type\030\t \001(\016" +
      "2P.google.ads.googleads.v1.enums.Adverti" +
      "singChannelTypeEnum.AdvertisingChannelTy" +
      "pe\022|\n\034advertising_channel_sub_type\030\n \001(\016" +
      "2V.google.ads.googleads.v1.enums.Adverti" +
      "singChannelSubTypeEnum.AdvertisingChanne" +
      "lSubType\022;\n\025tracking_url_template\030\013 \001(\0132" +
      "\034.google.protobuf.StringValue\022N\n\025url_cus" +
      "tom_parameters\030\014 \003(\0132/.google.ads.google" +
      "ads.v1.common.CustomParameter\022Y\n\031real_ti" +
      "me_bidding_setting\030\' \001(\01326.google.ads.go" +
      "ogleads.v1.common.RealTimeBiddingSetting" +
      "\022U\n\020network_settings\030\016 \001(\0132;.google.ads." +
      "googleads.v1.resources.Campaign.NetworkS" +
      "ettings\022S\n\rhotel_setting\030  \001(\0132<.google." +
      "ads.googleads.v1.resources.Campaign.Hote" +
      "lSettingInfo\022g\n\032dynamic_search_ads_setti" +
      "ng\030! \001(\0132C.google.ads.googleads.v1.resou" +
      "rces.Campaign.DynamicSearchAdsSetting\022U\n" +
      "\020shopping_setting\030$ \001(\0132;.google.ads.goo" +
      "gleads.v1.resources.Campaign.ShoppingSet" +
      "ting\022K\n\021targeting_setting\030+ \001(\01320.google" +
      ".ads.googleads.v1.common.TargetingSettin" +
      "g\022a\n\027geo_target_type_setting\030/ \001(\0132@.goo" +
      "gle.ads.googleads.v1.resources.Campaign." +
      "GeoTargetTypeSetting\022\\\n\024app_campaign_set" +
      "ting\0303 \001(\0132>.google.ads.googleads.v1.res" +
      "ources.Campaign.AppCampaignSetting\0225\n\017ca" +
      "mpaign_budget\030\006 \001(\0132\034.google.protobuf.St" +
      "ringValue\022i\n\025bidding_strategy_type\030\026 \001(\016" +
      "2J.google.ads.googleads.v1.enums.Bidding" +
      "StrategyTypeEnum.BiddingStrategyType\0220\n\n" +
      "start_date\030\023 \001(\0132\034.google.protobuf.Strin" +
      "gValue\022.\n\010end_date\030\024 \001(\0132\034.google.protob" +
      "uf.StringValue\0226\n\020final_url_suffix\030& \001(\013" +
      "2\034.google.protobuf.StringValue\022I\n\016freque" +
      "ncy_caps\030( \003(\01321.google.ads.googleads.v1" +
      ".common.FrequencyCapEntry\022x\n\036video_brand" +
      "_safety_suitability\030* \001(\0162P.google.ads.g" +
      "oogleads.v1.enums.BrandSafetySuitability" +
      "Enum.BrandSafetySuitability\022O\n\rvanity_ph" +
      "arma\030, \001(\01328.google.ads.googleads.v1.res" +
      "ources.Campaign.VanityPharma\022a\n\026selectiv" +
      "e_optimization\030- \001(\0132A.google.ads.google" +
      "ads.v1.resources.Campaign.SelectiveOptim" +
      "ization\022U\n\020tracking_setting\030. \001(\0132;.goog" +
      "le.ads.googleads.v1.resources.Campaign.T" +
      "rackingSetting\022P\n\014payment_mode\0304 \001(\0162:.g" +
      "oogle.ads.googleads.v1.enums.PaymentMode" +
      "Enum.PaymentMode\0228\n\020bidding_strategy\030\027 \001" +
      "(\0132\034.google.protobuf.StringValueH\000\022@\n\nco" +
      "mmission\0301 \001(\0132*.google.ads.googleads.v1" +
      ".common.CommissionH\000\022?\n\nmanual_cpc\030\030 \001(\013" +
      "2).google.ads.googleads.v1.common.Manual" +
      "CpcH\000\022?\n\nmanual_cpm\030\031 \001(\0132).google.ads.g" +
      "oogleads.v1.common.ManualCpmH\000\022?\n\nmanual" +
      "_cpv\030% \001(\0132).google.ads.googleads.v1.com" +
      "mon.ManualCpvH\000\022S\n\024maximize_conversions\030" +
      "\036 \001(\01323.google.ads.googleads.v1.common.M" +
      "aximizeConversionsH\000\022\\\n\031maximize_convers" +
      "ion_value\030\037 \001(\01327.google.ads.googleads.v" +
      "1.common.MaximizeConversionValueH\000\022?\n\nta" +
      "rget_cpa\030\032 \001(\0132).google.ads.googleads.v1" +
      ".common.TargetCpaH\000\022X\n\027target_impression" +
      "_share\0300 \001(\01325.google.ads.googleads.v1.c" +
      "ommon.TargetImpressionShareH\000\022A\n\013target_" +
      "roas\030\035 \001(\0132*.google.ads.googleads.v1.com" +
      "mon.TargetRoasH\000\022C\n\014target_spend\030\033 \001(\0132+" +
      ".google.ads.googleads.v1.common.TargetSp" +
      "endH\000\022A\n\013percent_cpc\030\" \001(\0132*.google.ads." +
      "googleads.v1.common.PercentCpcH\000\022?\n\ntarg" +
      "et_cpm\030) \001(\0132).google.ads.googleads.v1.c" +
      "ommon.TargetCpmH\000\032\205\002\n\017NetworkSettings\0228\n" +
      "\024target_google_search\030\001 \001(\0132\032.google.pro" +
      "tobuf.BoolValue\0229\n\025target_search_network" +
      "\030\002 \001(\0132\032.google.protobuf.BoolValue\022:\n\026ta" +
      "rget_content_network\030\003 \001(\0132\032.google.prot" +
      "obuf.BoolValue\022A\n\035target_partner_search_" +
      "network\030\004 \001(\0132\032.google.protobuf.BoolValu" +
      "e\032H\n\020HotelSettingInfo\0224\n\017hotel_center_id" +
      "\030\001 \001(\0132\033.google.protobuf.Int64Value\032\352\001\n\027" +
      "DynamicSearchAdsSetting\0221\n\013domain_name\030\001" +
      " \001(\0132\034.google.protobuf.StringValue\0223\n\rla" +
      "nguage_code\030\002 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022:\n\026use_supplied_urls_only\030\003 \001(\0132" +
      "\032.google.protobuf.BoolValue\022+\n\005feeds\030\005 \003" +
      "(\0132\034.google.protobuf.StringValue\032\260\002\n\022App" +
      "CampaignSetting\022\214\001\n\032bidding_strategy_goa" +
      "l_type\030\001 \001(\0162h.google.ads.googleads.v1.e" +
      "nums.AppCampaignBiddingStrategyGoalTypeE" +
      "num.AppCampaignBiddingStrategyGoalType\022," +
      "\n\006app_id\030\002 \001(\0132\034.google.protobuf.StringV" +
      "alue\022]\n\tapp_store\030\003 \001(\0162J.google.ads.goo" +
      "gleads.v1.enums.AppCampaignAppStoreEnum." +
      "AppCampaignAppStore\032Q\n\025SelectiveOptimiza" +
      "tion\0228\n\022conversion_actions\030\001 \003(\0132\034.googl" +
      "e.protobuf.StringValue\032\342\001\n\017ShoppingSetti" +
      "ng\0220\n\013merchant_id\030\001 \001(\0132\033.google.protobu" +
      "f.Int64Value\0223\n\rsales_country\030\002 \001(\0132\034.go" +
      "ogle.protobuf.StringValue\0226\n\021campaign_pr" +
      "iority\030\003 \001(\0132\033.google.protobuf.Int32Valu" +
      "e\0220\n\014enable_local\030\004 \001(\0132\032.google.protobu" +
      "f.BoolValue\032E\n\017TrackingSetting\0222\n\014tracki" +
      "ng_url\030\001 \001(\0132\034.google.protobuf.StringVal" +
      "ue\032\372\001\n\024GeoTargetTypeSetting\022p\n\030positive_" +
      "geo_target_type\030\001 \001(\0162N.google.ads.googl" +
      "eads.v1.enums.PositiveGeoTargetTypeEnum." +
      "PositiveGeoTargetType\022p\n\030negative_geo_ta" +
      "rget_type\030\002 \001(\0162N.google.ads.googleads.v" +
      "1.enums.NegativeGeoTargetTypeEnum.Negati" +
      "veGeoTargetType\032\363\001\n\014VanityPharma\022\200\001\n\036van" +
      "ity_pharma_display_url_mode\030\001 \001(\0162X.goog" +
      "le.ads.googleads.v1.enums.VanityPharmaDi" +
      "splayUrlModeEnum.VanityPharmaDisplayUrlM" +
      "ode\022`\n\022vanity_pharma_text\030\002 \001(\0162D.google" +
      ".ads.googleads.v1.enums.VanityPharmaText" +
      "Enum.VanityPharmaTextB\033\n\031campaign_biddin" +
      "g_strategyB\372\001\n%com.google.ads.googleads." +
      "v1.resourcesB\rCampaignProtoP\001ZJgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v1/resources;resources\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V1.Resources\312\002!Google\\Ads" +
      "\\GoogleAds\\V1\\Resources\352\002%Google::Ads::G" +
      "oogleAds::V1::Resourcesb\006proto3"
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
          com.google.ads.googleads.v1.common.BiddingProto.getDescriptor(),
          com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v1.common.FrequencyCapProto.getDescriptor(),
          com.google.ads.googleads.v1.common.RealTimeBiddingSettingProto.getDescriptor(),
          com.google.ads.googleads.v1.common.TargetingSettingProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AdServingOptimizationStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AdvertisingChannelSubTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AdvertisingChannelTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AppCampaignAppStoreProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AppCampaignBiddingStrategyGoalTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.BrandSafetySuitabilityProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.CampaignServingStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.CampaignStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.NegativeGeoTargetTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PaymentModeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PositiveGeoTargetTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.VanityPharmaDisplayUrlModeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.VanityPharmaTextProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_Campaign_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_Campaign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_Campaign_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "ServingStatus", "AdServingOptimizationStatus", "AdvertisingChannelType", "AdvertisingChannelSubType", "TrackingUrlTemplate", "UrlCustomParameters", "RealTimeBiddingSetting", "NetworkSettings", "HotelSetting", "DynamicSearchAdsSetting", "ShoppingSetting", "TargetingSetting", "GeoTargetTypeSetting", "AppCampaignSetting", "CampaignBudget", "BiddingStrategyType", "StartDate", "EndDate", "FinalUrlSuffix", "FrequencyCaps", "VideoBrandSafetySuitability", "VanityPharma", "SelectiveOptimization", "TrackingSetting", "PaymentMode", "BiddingStrategy", "Commission", "ManualCpc", "ManualCpm", "ManualCpv", "MaximizeConversions", "MaximizeConversionValue", "TargetCpa", "TargetImpressionShare", "TargetRoas", "TargetSpend", "PercentCpc", "TargetCpm", "CampaignBiddingStrategy", });
    internal_static_google_ads_googleads_v1_resources_Campaign_NetworkSettings_descriptor =
      internal_static_google_ads_googleads_v1_resources_Campaign_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_Campaign_NetworkSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_Campaign_NetworkSettings_descriptor,
        new java.lang.String[] { "TargetGoogleSearch", "TargetSearchNetwork", "TargetContentNetwork", "TargetPartnerSearchNetwork", });
    internal_static_google_ads_googleads_v1_resources_Campaign_HotelSettingInfo_descriptor =
      internal_static_google_ads_googleads_v1_resources_Campaign_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v1_resources_Campaign_HotelSettingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_Campaign_HotelSettingInfo_descriptor,
        new java.lang.String[] { "HotelCenterId", });
    internal_static_google_ads_googleads_v1_resources_Campaign_DynamicSearchAdsSetting_descriptor =
      internal_static_google_ads_googleads_v1_resources_Campaign_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v1_resources_Campaign_DynamicSearchAdsSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_Campaign_DynamicSearchAdsSetting_descriptor,
        new java.lang.String[] { "DomainName", "LanguageCode", "UseSuppliedUrlsOnly", "Feeds", });
    internal_static_google_ads_googleads_v1_resources_Campaign_AppCampaignSetting_descriptor =
      internal_static_google_ads_googleads_v1_resources_Campaign_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v1_resources_Campaign_AppCampaignSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_Campaign_AppCampaignSetting_descriptor,
        new java.lang.String[] { "BiddingStrategyGoalType", "AppId", "AppStore", });
    internal_static_google_ads_googleads_v1_resources_Campaign_SelectiveOptimization_descriptor =
      internal_static_google_ads_googleads_v1_resources_Campaign_descriptor.getNestedTypes().get(4);
    internal_static_google_ads_googleads_v1_resources_Campaign_SelectiveOptimization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_Campaign_SelectiveOptimization_descriptor,
        new java.lang.String[] { "ConversionActions", });
    internal_static_google_ads_googleads_v1_resources_Campaign_ShoppingSetting_descriptor =
      internal_static_google_ads_googleads_v1_resources_Campaign_descriptor.getNestedTypes().get(5);
    internal_static_google_ads_googleads_v1_resources_Campaign_ShoppingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_Campaign_ShoppingSetting_descriptor,
        new java.lang.String[] { "MerchantId", "SalesCountry", "CampaignPriority", "EnableLocal", });
    internal_static_google_ads_googleads_v1_resources_Campaign_TrackingSetting_descriptor =
      internal_static_google_ads_googleads_v1_resources_Campaign_descriptor.getNestedTypes().get(6);
    internal_static_google_ads_googleads_v1_resources_Campaign_TrackingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_Campaign_TrackingSetting_descriptor,
        new java.lang.String[] { "TrackingUrl", });
    internal_static_google_ads_googleads_v1_resources_Campaign_GeoTargetTypeSetting_descriptor =
      internal_static_google_ads_googleads_v1_resources_Campaign_descriptor.getNestedTypes().get(7);
    internal_static_google_ads_googleads_v1_resources_Campaign_GeoTargetTypeSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_Campaign_GeoTargetTypeSetting_descriptor,
        new java.lang.String[] { "PositiveGeoTargetType", "NegativeGeoTargetType", });
    internal_static_google_ads_googleads_v1_resources_Campaign_VanityPharma_descriptor =
      internal_static_google_ads_googleads_v1_resources_Campaign_descriptor.getNestedTypes().get(8);
    internal_static_google_ads_googleads_v1_resources_Campaign_VanityPharma_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_Campaign_VanityPharma_descriptor,
        new java.lang.String[] { "VanityPharmaDisplayUrlMode", "VanityPharmaText", });
    com.google.ads.googleads.v1.common.BiddingProto.getDescriptor();
    com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v1.common.FrequencyCapProto.getDescriptor();
    com.google.ads.googleads.v1.common.RealTimeBiddingSettingProto.getDescriptor();
    com.google.ads.googleads.v1.common.TargetingSettingProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AdServingOptimizationStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AdvertisingChannelSubTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AdvertisingChannelTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AppCampaignAppStoreProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AppCampaignBiddingStrategyGoalTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.BrandSafetySuitabilityProto.getDescriptor();
    com.google.ads.googleads.v1.enums.CampaignServingStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.CampaignStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.NegativeGeoTargetTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PaymentModeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PositiveGeoTargetTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.VanityPharmaDisplayUrlModeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.VanityPharmaTextProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
