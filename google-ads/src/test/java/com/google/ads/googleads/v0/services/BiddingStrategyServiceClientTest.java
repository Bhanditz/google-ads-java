/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v0.services;

import com.google.ads.googleads.v0.resources.BiddingStrategy;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class BiddingStrategyServiceClientTest {
  private static MockAccountBudgetProposalService mockAccountBudgetProposalService;
  private static MockAccountBudgetService mockAccountBudgetService;
  private static MockAdGroupAdService mockAdGroupAdService;
  private static MockAdGroupAudienceViewService mockAdGroupAudienceViewService;
  private static MockAdGroupBidModifierService mockAdGroupBidModifierService;
  private static MockAdGroupCriterionService mockAdGroupCriterionService;
  private static MockAdGroupFeedService mockAdGroupFeedService;
  private static MockAdGroupService mockAdGroupService;
  private static MockAdParameterService mockAdParameterService;
  private static MockAdScheduleViewService mockAdScheduleViewService;
  private static MockAgeRangeViewService mockAgeRangeViewService;
  private static MockBiddingStrategyService mockBiddingStrategyService;
  private static MockBillingSetupService mockBillingSetupService;
  private static MockCampaignAudienceViewService mockCampaignAudienceViewService;
  private static MockCampaignBidModifierService mockCampaignBidModifierService;
  private static MockCampaignBudgetService mockCampaignBudgetService;
  private static MockCampaignCriterionService mockCampaignCriterionService;
  private static MockCampaignFeedService mockCampaignFeedService;
  private static MockCampaignService mockCampaignService;
  private static MockCampaignSharedSetService mockCampaignSharedSetService;
  private static MockCarrierConstantService mockCarrierConstantService;
  private static MockChangeStatusService mockChangeStatusService;
  private static MockConversionActionService mockConversionActionService;
  private static MockCustomerClientLinkService mockCustomerClientLinkService;
  private static MockCustomerClientService mockCustomerClientService;
  private static MockCustomerFeedService mockCustomerFeedService;
  private static MockCustomerManagerLinkService mockCustomerManagerLinkService;
  private static MockCustomerService mockCustomerService;
  private static MockDisplayKeywordViewService mockDisplayKeywordViewService;
  private static MockFeedItemService mockFeedItemService;
  private static MockFeedMappingService mockFeedMappingService;
  private static MockFeedService mockFeedService;
  private static MockGenderViewService mockGenderViewService;
  private static MockGeoTargetConstantService mockGeoTargetConstantService;
  private static MockGoogleAdsFieldService mockGoogleAdsFieldService;
  private static MockSharedCriterionService mockSharedCriterionService;
  private static MockSharedSetService mockSharedSetService;
  private static MockUserListService mockUserListService;
  private static MockGoogleAdsService mockGoogleAdsService;
  private static MockHotelGroupViewService mockHotelGroupViewService;
  private static MockHotelPerformanceViewService mockHotelPerformanceViewService;
  private static MockKeywordPlanAdGroupService mockKeywordPlanAdGroupService;
  private static MockKeywordPlanCampaignService mockKeywordPlanCampaignService;
  private static MockKeywordPlanIdeaService mockKeywordPlanIdeaService;
  private static MockKeywordPlanKeywordService mockKeywordPlanKeywordService;
  private static MockKeywordPlanNegativeKeywordService mockKeywordPlanNegativeKeywordService;
  private static MockKeywordPlanService mockKeywordPlanService;
  private static MockKeywordViewService mockKeywordViewService;
  private static MockLanguageConstantService mockLanguageConstantService;
  private static MockManagedPlacementViewService mockManagedPlacementViewService;
  private static MockMediaFileService mockMediaFileService;
  private static MockMobileAppCategoryConstantService mockMobileAppCategoryConstantService;
  private static MockMobileDeviceConstantService mockMobileDeviceConstantService;
  private static MockOperatingSystemVersionConstantService
      mockOperatingSystemVersionConstantService;
  private static MockParentalStatusViewService mockParentalStatusViewService;
  private static MockPaymentsAccountService mockPaymentsAccountService;
  private static MockProductGroupViewService mockProductGroupViewService;
  private static MockRecommendationService mockRecommendationService;
  private static MockRemarketingActionService mockRemarketingActionService;
  private static MockSearchTermViewService mockSearchTermViewService;
  private static MockTopicConstantService mockTopicConstantService;
  private static MockTopicViewService mockTopicViewService;
  private static MockUserInterestService mockUserInterestService;
  private static MockVideoService mockVideoService;
  private static MockServiceHelper serviceHelper;
  private BiddingStrategyServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAccountBudgetProposalService = new MockAccountBudgetProposalService();
    mockAccountBudgetService = new MockAccountBudgetService();
    mockAdGroupAdService = new MockAdGroupAdService();
    mockAdGroupAudienceViewService = new MockAdGroupAudienceViewService();
    mockAdGroupBidModifierService = new MockAdGroupBidModifierService();
    mockAdGroupCriterionService = new MockAdGroupCriterionService();
    mockAdGroupFeedService = new MockAdGroupFeedService();
    mockAdGroupService = new MockAdGroupService();
    mockAdParameterService = new MockAdParameterService();
    mockAdScheduleViewService = new MockAdScheduleViewService();
    mockAgeRangeViewService = new MockAgeRangeViewService();
    mockBiddingStrategyService = new MockBiddingStrategyService();
    mockBillingSetupService = new MockBillingSetupService();
    mockCampaignAudienceViewService = new MockCampaignAudienceViewService();
    mockCampaignBidModifierService = new MockCampaignBidModifierService();
    mockCampaignBudgetService = new MockCampaignBudgetService();
    mockCampaignCriterionService = new MockCampaignCriterionService();
    mockCampaignFeedService = new MockCampaignFeedService();
    mockCampaignService = new MockCampaignService();
    mockCampaignSharedSetService = new MockCampaignSharedSetService();
    mockCarrierConstantService = new MockCarrierConstantService();
    mockChangeStatusService = new MockChangeStatusService();
    mockConversionActionService = new MockConversionActionService();
    mockCustomerClientLinkService = new MockCustomerClientLinkService();
    mockCustomerClientService = new MockCustomerClientService();
    mockCustomerFeedService = new MockCustomerFeedService();
    mockCustomerManagerLinkService = new MockCustomerManagerLinkService();
    mockCustomerService = new MockCustomerService();
    mockDisplayKeywordViewService = new MockDisplayKeywordViewService();
    mockFeedItemService = new MockFeedItemService();
    mockFeedMappingService = new MockFeedMappingService();
    mockFeedService = new MockFeedService();
    mockGenderViewService = new MockGenderViewService();
    mockGeoTargetConstantService = new MockGeoTargetConstantService();
    mockGoogleAdsFieldService = new MockGoogleAdsFieldService();
    mockSharedCriterionService = new MockSharedCriterionService();
    mockSharedSetService = new MockSharedSetService();
    mockUserListService = new MockUserListService();
    mockGoogleAdsService = new MockGoogleAdsService();
    mockHotelGroupViewService = new MockHotelGroupViewService();
    mockHotelPerformanceViewService = new MockHotelPerformanceViewService();
    mockKeywordPlanAdGroupService = new MockKeywordPlanAdGroupService();
    mockKeywordPlanCampaignService = new MockKeywordPlanCampaignService();
    mockKeywordPlanIdeaService = new MockKeywordPlanIdeaService();
    mockKeywordPlanKeywordService = new MockKeywordPlanKeywordService();
    mockKeywordPlanNegativeKeywordService = new MockKeywordPlanNegativeKeywordService();
    mockKeywordPlanService = new MockKeywordPlanService();
    mockKeywordViewService = new MockKeywordViewService();
    mockLanguageConstantService = new MockLanguageConstantService();
    mockManagedPlacementViewService = new MockManagedPlacementViewService();
    mockMediaFileService = new MockMediaFileService();
    mockMobileAppCategoryConstantService = new MockMobileAppCategoryConstantService();
    mockMobileDeviceConstantService = new MockMobileDeviceConstantService();
    mockOperatingSystemVersionConstantService = new MockOperatingSystemVersionConstantService();
    mockParentalStatusViewService = new MockParentalStatusViewService();
    mockPaymentsAccountService = new MockPaymentsAccountService();
    mockProductGroupViewService = new MockProductGroupViewService();
    mockRecommendationService = new MockRecommendationService();
    mockRemarketingActionService = new MockRemarketingActionService();
    mockSearchTermViewService = new MockSearchTermViewService();
    mockTopicConstantService = new MockTopicConstantService();
    mockTopicViewService = new MockTopicViewService();
    mockUserInterestService = new MockUserInterestService();
    mockVideoService = new MockVideoService();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1",
            Arrays.<MockGrpcService>asList(
                mockAccountBudgetProposalService,
                mockAccountBudgetService,
                mockAdGroupAdService,
                mockAdGroupAudienceViewService,
                mockAdGroupBidModifierService,
                mockAdGroupCriterionService,
                mockAdGroupFeedService,
                mockAdGroupService,
                mockAdParameterService,
                mockAdScheduleViewService,
                mockAgeRangeViewService,
                mockBiddingStrategyService,
                mockBillingSetupService,
                mockCampaignAudienceViewService,
                mockCampaignBidModifierService,
                mockCampaignBudgetService,
                mockCampaignCriterionService,
                mockCampaignFeedService,
                mockCampaignService,
                mockCampaignSharedSetService,
                mockCarrierConstantService,
                mockChangeStatusService,
                mockConversionActionService,
                mockCustomerClientLinkService,
                mockCustomerClientService,
                mockCustomerFeedService,
                mockCustomerManagerLinkService,
                mockCustomerService,
                mockDisplayKeywordViewService,
                mockFeedItemService,
                mockFeedMappingService,
                mockFeedService,
                mockGenderViewService,
                mockGeoTargetConstantService,
                mockGoogleAdsFieldService,
                mockSharedCriterionService,
                mockSharedSetService,
                mockUserListService,
                mockGoogleAdsService,
                mockHotelGroupViewService,
                mockHotelPerformanceViewService,
                mockKeywordPlanAdGroupService,
                mockKeywordPlanCampaignService,
                mockKeywordPlanIdeaService,
                mockKeywordPlanKeywordService,
                mockKeywordPlanNegativeKeywordService,
                mockKeywordPlanService,
                mockKeywordViewService,
                mockLanguageConstantService,
                mockManagedPlacementViewService,
                mockMediaFileService,
                mockMobileAppCategoryConstantService,
                mockMobileDeviceConstantService,
                mockOperatingSystemVersionConstantService,
                mockParentalStatusViewService,
                mockPaymentsAccountService,
                mockProductGroupViewService,
                mockRecommendationService,
                mockRemarketingActionService,
                mockSearchTermViewService,
                mockTopicConstantService,
                mockTopicViewService,
                mockUserInterestService,
                mockVideoService));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    BiddingStrategyServiceSettings settings =
        BiddingStrategyServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BiddingStrategyServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void getBiddingStrategyTest() {
    String resourceName2 = "resourceName2625949903";
    BiddingStrategy expectedResponse =
        BiddingStrategy.newBuilder().setResourceName(resourceName2).build();
    mockBiddingStrategyService.addResponse(expectedResponse);

    String formattedResourceName =
        BiddingStrategyServiceClient.formatBiddingStrategyName("[CUSTOMER]", "[BIDDING_STRATEGY]");

    BiddingStrategy actualResponse = client.getBiddingStrategy(formattedResourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockBiddingStrategyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBiddingStrategyRequest actualRequest = (GetBiddingStrategyRequest) actualRequests.get(0);

    Assert.assertEquals(formattedResourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getBiddingStrategyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockBiddingStrategyService.addException(exception);

    try {
      String formattedResourceName =
          BiddingStrategyServiceClient.formatBiddingStrategyName(
              "[CUSTOMER]", "[BIDDING_STRATEGY]");

      client.getBiddingStrategy(formattedResourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateBiddingStrategiesTest() {
    MutateBiddingStrategiesResponse expectedResponse =
        MutateBiddingStrategiesResponse.newBuilder().build();
    mockBiddingStrategyService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<BiddingStrategyOperation> operations = new ArrayList<>();
    boolean partialFailure = true;
    boolean validateOnly = false;

    MutateBiddingStrategiesResponse actualResponse =
        client.mutateBiddingStrategies(customerId, operations, partialFailure, validateOnly);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockBiddingStrategyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateBiddingStrategiesRequest actualRequest =
        (MutateBiddingStrategiesRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertEquals(partialFailure, actualRequest.getPartialFailure());
    Assert.assertEquals(validateOnly, actualRequest.getValidateOnly());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateBiddingStrategiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockBiddingStrategyService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<BiddingStrategyOperation> operations = new ArrayList<>();
      boolean partialFailure = true;
      boolean validateOnly = false;

      client.mutateBiddingStrategies(customerId, operations, partialFailure, validateOnly);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateBiddingStrategiesTest2() {
    MutateBiddingStrategiesResponse expectedResponse =
        MutateBiddingStrategiesResponse.newBuilder().build();
    mockBiddingStrategyService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<BiddingStrategyOperation> operations = new ArrayList<>();

    MutateBiddingStrategiesResponse actualResponse =
        client.mutateBiddingStrategies(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockBiddingStrategyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateBiddingStrategiesRequest actualRequest =
        (MutateBiddingStrategiesRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateBiddingStrategiesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockBiddingStrategyService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<BiddingStrategyOperation> operations = new ArrayList<>();

      client.mutateBiddingStrategies(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
