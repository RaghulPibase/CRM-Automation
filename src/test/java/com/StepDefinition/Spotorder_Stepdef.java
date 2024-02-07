package com.StepDefinition;

import java.awt.AWTException;

import org.junit.Assert;
import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class Spotorder_Stepdef extends BaseClass {

	PageObjectManager dr = new PageObjectManager();

	@Given("User Navigate to Dashboard page and Verify the title in CRM")
	public void userNavigateToDashboardPageAndVerifyTheTitleInCRM() throws InterruptedException {
		Thread.sleep(500);
		dr.getSmokeTest().getDashboard().click();
		String dashboardTitleText = dr.getSmokeTest().getDashboardTitle().getText();
		Assert.assertEquals("Deposit Pending Approvals", dashboardTitleText);
		System.out.println(dashboardTitleText);
		moveToElement(dr.getSmokeTest().getDashboard());
		scrollToElement(dr.getSmokeTest().getSpotorder());
	}

	@Given("User Click on Publish Price Manually and Verify the Page Title")
	public void userClickOnPublishPriceManuallyAndVerifyThePageTitle() throws InterruptedException {
		dr.getSpotOrder().getPublishPriceButton().click();
		Thread.sleep(2000);
		String text = dr.getSpotOrder().getPublishPriceTitle().getText().toUpperCase();
		System.out.println(text);
		Assert.assertEquals("MANUAL PRICE PUBLISH", text);
	}

	@Given("User enter the {string} in Best Bit Price field")
	public void userEnterTheInBestBitPriceField(String BitPrice) {
		dr.getSpotOrder().getBitPrice().sendKeys(BitPrice);
	}

	@Given("User enter the {string} in Best Ask Price field")
	public void userEnterTheInBestAskPriceField(String AskPrice) {
		dr.getSpotOrder().getAskPrice().sendKeys(AskPrice);
	}

	@Given("User Click on Publish Price button")
	public void userClickOnPublishPriceButton() {
		dr.getSpotOrder().getPublishPriceSubmitButton().click();
	}

	@Given("User Verify the Toast Message")
	public void userVerifyTheToastMessage() throws InterruptedException {
		Thread.sleep(2000);
		String text = dr.getSpotOrder().getPublishPriceToastmsg().getText();
		Assert.assertEquals("Price Published successfully", text);
		System.out.println(text);
	}

	@Given("User Click on Place Order and Verify the Page Title")
	public void userClickOnPlaceOrderAndVerifyThePageTitle() throws InterruptedException {
		Thread.sleep(2000);
		dr.getSpotOrder().getPlaceOrderButton().click();
		String text = dr.getSpotOrder().getPlaceOderTitle().getText().toUpperCase();
		System.out.println(text);
		Assert.assertEquals("TRADE SPOT ORDER", text);
	}
//	
//	@When("User select Market in Type Dropdown box and Error Message appear on the Screen")
//	public void userSelectMarketInTypeDropdownBoxAndErrorMessageAppearOnTheScreen() throws InterruptedException {
//		Thread.sleep(1000);
//		dr.getSpotOrder().MarketTypeDropDownOpenOrder();
//		Thread.sleep(2000);
//		dr.getSpotOrder().getResetButton().click();
//	}

	@Then("Verify the user is on View Order Form")
	public void verifyTheUserIsOnViewOrderForm() {
		String text = dr.getSpotOrder().getViewOrderTitle().getText().toUpperCase();
		System.out.println(text);
		Assert.assertEquals("VIEW ORDER", text);
	}

	@Then("Verify the Open Order details appear on the View Oder form")
	public void verifyTheOpenOrderDetailsAppearOnTheViewOderForm() throws InterruptedException {
		dr.getSpotOrder().OpenOrderandViewOrderForm();
	}

	@When("User Click on Cancel option and Verify the Page Title")
	public void userClickOnCancelOptionAndVerifyThePageTitle() throws InterruptedException {
		dr.getSpotOrder().getCancelOption().click();
		Thread.sleep(2000);
		String text = dr.getSpotOrder().getCancelFormTitle().getText();
		Assert.assertEquals("Cancel Order", text);
	}

	@When("Click on the Cancel button and verify user is on the Open Order Page")
	public void clickOnTheCancelButtonAndVerifyUserIsOnTheOpenOrderPage() throws InterruptedException {
		Thread.sleep(2000);
		dr.getSpotOrder().getCancelButton().click();
		String text = dr.getSpotOrder().getOpenOrderTitle().getText();
		Assert.assertEquals("Open Orders", text);
	}

	@When("User Click on the Client ID and verify the Page Title")
	public void userClickOnTheClientIDAndVerifyThePageTitle() throws InterruptedException {
		dr.getSpotOrder().getClientIDOpenOrder().click();
//	   String text = dr.getSpotOrder().getClientManagementTitle().getText();
//	   Assert.assertEquals("Client Management", text);
//	   System.out.println(text);
//	   Thread.sleep(2000);
	}

	@Then("Verify the user is on View Trade Form")
	public void verifyTheUserIsOnViewTradeForm() {
		String text = dr.getSpotOrder().getViewTradeForm().getText();
		Assert.assertEquals("VIEW TRADE", text);
		System.out.println(text);
	}

	@Then("Verify the user is on View Order Execution Form")
	public void verifyTheUserIsOnViewOrderExecutionForm() {
		String text = dr.getSpotOrder().getViewOrderExecutionForm().getText();
		System.out.println(text);
		Assert.assertEquals("VIEW ORDER EXECUTION", text);
	}

	@Given("User select Limit {string} in Type Dropdown box and Verify Created data is listed on the page")
	public void userSelectLimitInTypeDropdownBoxAndVerifyCreatedDataIsListedOnThePage(String Limit) {
		dr.getSpotOrder().TypeDropdown(Limit);
	}

	@Given("User select Market {string} in Type Dropdown box and Verify Created data is listed on the page")
	public void userSelectMarketInTypeDropdownBoxAndVerifyCreatedDataIsListedOnThePage(String Market) {
		dr.getSpotOrder().TypeDropdown(Market);
	}

	@Given("User select Market maker {string} in Type Dropdown box and Verify Created data is listed on the page")
	public void userSelectMarketMakerInTypeDropdownBoxAndVerifyCreatedDataIsListedOnThePage(String Market_Maker) {
		dr.getSpotOrder().TypeDropdown(Market_Maker);
	}

//	@When("User select Limit in Type Dropdown box and Verify Created data is listed on the page")
//	public void userSelectLimitInTypeDropdownBoxAndVerifyCreatedDataIsListedOnThePage() throws InterruptedException {
//		Thread.sleep(1000);
//		dr.getSpotOrder().Limit();
//		Thread.sleep(2000);
//		dr.getSpotOrder().getResetButton().click();
//	}
//
//	@When("User select Market in Type Dropdown box and Verify Created data is listed on the page")
//	public void userSelectMarketInTypeDropdownBoxAndVerifyCreatedDataIsListedOnThePage() throws InterruptedException {
//		Thread.sleep(1000);
//		dr.getSpotOrder().MarketTypeDropDown();
//		Thread.sleep(2000);
//		dr.getSpotOrder().getResetButton().click();
//	}
//
//	@When("User select Market Maker in Type Dropdown box and Verify Created data is listed on the page")
//	public void userSelectMarketMakerInTypeDropdownBoxAndVerifyCreatedDataIsListedOnThePage()
//			throws InterruptedException {
//		Thread.sleep(2000);
//		dr.getSpotOrder().MarketMakerTypeDropDown();
//		Thread.sleep(2000);
//		dr.getSpotOrder().getResetButton().click();
//	}

	@Then("Verify the Order History details appear on the View Oder form")
	public void verifyTheOrderHistoryDetailsAppearOnTheViewOderForm() throws InterruptedException {
		dr.getSpotOrder().OrderHistoryandViewOrderForm();
	}

//	@When("User search Symbols in Pair Dropdown box and Verify search data is listed on the Page")
//	public void userSearchSymbolsInPairDropdownBoxAndVerifySearchDataIsListedOnThePage() throws AWTException, InterruptedException {
//	    dr.getSpotOrder().PairDropDwn();
//	    DownArrowPress();
//	}

	@Given("User search Symbols {string} in Pair Dropdown box and Verify search data is listed on the Page")
	public void userSearchSymbolsInPairDropdownBoxAndVerifySearchDataIsListedOnThePage(String BTCUSD) {
		dr.getSpotOrder().Pairdrpdown(BTCUSD);
	}

	@When("User search Buy in Side Dropdown box and Verify search data is listed on the Page")
	public void userSearchBuyInSideDropdownBoxAndVerifySearchDataIsListedOnThePage() {
		dr.getSpotOrder().getSide().click();
		dr.getSpotOrder().getSideBuy().click();
	}

	@When("User search Sell in side Dropdown box and Verify search data is listed on the Page")
	public void userSearchSellInSideDropdownBoxAndVerifySearchDataIsListedOnThePage() {
		dr.getSpotOrder().getSide().click();
		dr.getSpotOrder().getSideSell().click();
	}

	@Given("Select a symbols form symbol Dropdown box in Publish price")
	public void selectASymbolsFormSymbolDropdownBoxInPublishPrice() throws AWTException, InterruptedException {
		dr.getSpotOrder().getSymbolDDManualPrice().click();
		dr.getSpotOrder().DownArrowPress();
		Thread.sleep(1000);
	}

	@Given("User Select {string} symbols form symbol Dropdown box in Publish price")
	public void userSelectSymbolsFormSymbolDropdownBoxInPublishPrice(String Invalid) {
		dr.getSpotOrder().getSymbolDDManualPrice().sendKeys(Invalid);
	}

	@Then("User Verify the Error Message on the Manual price publish form")
	public void userVerifyTheErrorMessageOnTheManualPricePublishForm() {
		String BidPrice = dr.getSpotOrder().getErrBidPrice().getText();
		System.out.println(BidPrice);
		Assert.assertEquals("Best Bid Pirce must be a number", BidPrice);

		String AskPrice = dr.getSpotOrder().getErrAskPrice().getText();
		System.out.println(AskPrice);
		Assert.assertEquals("Best Ask Price must be a number", AskPrice);
	}

	@Then("User Verify the Symbols Error Message on the Manual price publish form")
	public void userVerifyTheSymbolsErrorMessageOnTheManualPricePublishForm() {
		String text = dr.getSpotOrder().getErrManualPrice().getText();
		Assert.assertEquals("Symbol is required", text);
		System.out.println(text);
	}

	@Given("User select client in Client DropDown Box in Spot order form")
	public void userSelectClientInClientDropDownBoxInSpotOrderForm() throws AWTException, InterruptedException {
		dr.getSpotOrder().getClientDDPlaceOrder().click();
		DownArrowPress();

	}

	@Given("Select a symbols form symbol Dropdown box in Spot order form")
	public void selectASymbolsFormSymbolDropdownBoxInSpotOrderForm() throws AWTException, InterruptedException {
		dr.getSpotOrder().getSymbolDDPLaceOrder().click();
		DownArrowPress();
	}

	@Then("User Verify the Error Message on the Place Oder form")
	public void userVerifyTheErrorMessageOnThePlaceOderForm() {
		String Symbol = dr.getSpotOrder().getErrManualPrice().getText();
		System.out.println(Symbol);
		Assert.assertEquals("Symbol is required", Symbol);

		String Client = dr.getSpotOrder().getErrClientPlaceOrderForm().getText();
		System.out.println(Client);
		Assert.assertEquals("Client is required", Client);
	}

	@Given("User enter {string} Data in Trade spot Order form")
	public void userEnterDataInTradeSpotOrderForm(String Invalid) {
		dr.getSpotOrder().getSymbolDDPLaceOrder().sendKeys(Invalid);
	}

	@When("User navigate across the Client Managment page")
	public void userNavigateAcrossTheClientManagmentPage() {
		dr.getSpotOrder().ClientManagementNav();
	}

	@When("User search Symbols in Pair Dropdown box and Verify search data is listed on the TradeHistory Page")
	public void userSearchSymbolsInPairDropdownBoxAndVerifySearchDataIsListedOnTheTradeHistoryPage()
			throws AWTException, InterruptedException {
		dr.getSpotOrder().getPairDropdown().click();
		DownArrowPress();
	}

	@When("User search Symbols in Pair Dropdown box and Verify search data is listed on the Order Execution page")
	public void userSearchSymbolsInPairDropdownBoxAndVerifySearchDataIsListedOnTheOrderExecutionPage()
			throws AWTException, InterruptedException {
		dr.getSpotOrder().getPairDropdown().sendKeys("BTCUSD");
		EnterKey();
	}

	@Given("User search Clients {string} in BuyUser ID Dropdown box and Verify search data is listed on the Order Execution page")
	public void userSearchClientsInBuyUserIDDropdownBoxAndVerifySearchDataIsListedOnTheOrderExecutionPage(String BuyID)
			throws InterruptedException, AWTException {
		dr.getSpotOrder().BuyuserID(BuyID);
	}

	@Given("User search Clients {string} in SellUser ID Dropdown box and Verify search data is listed on the Order Execution page")
	public void userSearchClientsInSellUserIDDropdownBoxAndVerifySearchDataIsListedOnTheOrderExecutionPage(
			String SellID) throws InterruptedException, AWTException {
		dr.getSpotOrder().SelluserID(SellID);
	}

	@Then("User close the form")
	public void userCloseTheForm() {
		dr.getSpotOrder().getCrossbutton().click();
	}

	@Given("User search BTCUSD {string} in Pair Dropdown box and Verify search data is listed on the TradeHistory Page")
	public void userSearchBTCUSDInPairDropdownBoxAndVerifySearchDataIsListedOnTheTradeHistoryPage(String BTCUSD) {
		dr.getSpotOrder().TradeHistoryPair(BTCUSD);
	}

	@Given("User search ETHUSD {string} in Pair Dropdown box and Verify search data is listed on the TradeHistory Page")
	public void userSearchETHUSDInPairDropdownBoxAndVerifySearchDataIsListedOnTheTradeHistoryPage(String ETHUSD) {
		dr.getSpotOrder().TradeHistoryPair(ETHUSD);
	}

	@Given("User search Buy {string} in Side Dropdown box and Verify search data is listed on the Page")
	public void userSearchBuyInSideDropdownBoxAndVerifySearchDataIsListedOnThePage(String Buy) {
		dr.getSpotOrder().SideDropdown(Buy);
	}

	@Given("User search Sell {string} in side Dropdown box and Verify search data is listed on the Page")
	public void userSearchSellInSideDropdownBoxAndVerifySearchDataIsListedOnThePage(String Sell) {
		dr.getSpotOrder().SideDropdown(Sell);
	}

	@Given("User select Limit {string} in Type Dropdown box and Verify Created data is listed on the OrderExecution page")
	public void userSelectLimitInTypeDropdownBoxAndVerifyCreatedDataIsListedOnTheOrderExecutionPage(String Limit) {
		dr.getSpotOrder().BuyOrderType(Limit);
	}

	@Given("User select Market {string} in Type Dropdown box and Verify Created data is listed on the OrderExecution page")
	public void userSelectMarketInTypeDropdownBoxAndVerifyCreatedDataIsListedOnTheOrderExecutionPage(String Market) {
		dr.getSpotOrder().BuyOrderType(Market);
	}

	@Given("User select Market maker {string} in Type Dropdown box and Verify Created data is listed on the OrderExecution page")
	public void userSelectMarketMakerInTypeDropdownBoxAndVerifyCreatedDataIsListedOnTheOrderExecutionPage(
			String Market_Maker) {
		dr.getSpotOrder().BuyOrderType(Market_Maker);
	}

	@Given("User select Limit {string} in SellOder Type Dropdown box and Verify Created data is listed on the OrderExecution page")
	public void userSelectLimitInSellOderTypeDropdownBoxAndVerifyCreatedDataIsListedOnTheOrderExecutionPage(
			String Limit) {
		dr.getSpotOrder().SellOrderType(Limit);
	}

	@Given("User select Market {string} in SellOder Type Dropdown box and Verify Created data is listed on the OrderExecution page")
	public void userSelectMarketInSellOderTypeDropdownBoxAndVerifyCreatedDataIsListedOnTheOrderExecutionPage(
			String Market) {
		dr.getSpotOrder().SellOrderType(Market);
	}

	@Given("User select Market maker {string} in SellOder Type Dropdown box and Verify Created data is listed on the OrderExecution page")
	public void userSelectMarketMakerInSellOderTypeDropdownBoxAndVerifyCreatedDataIsListedOnTheOrderExecutionPage(
			String Market_Maker) {
		dr.getSpotOrder().SellOrderType(Market_Maker);
	}

	@Given("User search Symbols BTCUSD {string} in Pair Dropdown box and Verify search data is listed on the SettledOrders Page")
	public void userSearchSymbolsBTCUSDInPairDropdownBoxAndVerifySearchDataIsListedOnTheSettledOrdersPage(
			String BTCUSD) {
		dr.getSpotOrder().SettledOrderPair(BTCUSD);
	}

	@Given("User search Symbols ETHUSD {string} in Pair Dropdown box and Verify search data is listed on the SettledOrders Page")
	public void userSearchSymbolsETHUSDInPairDropdownBoxAndVerifySearchDataIsListedOnTheSettledOrdersPage(
			String ETHUSD) {
		dr.getSpotOrder().SettledOrderPair(ETHUSD);
	}

	@Given("User select client in Client DropDown Box in Settled Orders page")
	public void userSelectClientInClientDropDownBoxInSettledOrdersPage() throws InterruptedException, AWTException {
		dr.getSpotOrder().SettledOrderClient("2200");
	}

	@Given("Select a BTCUSD {string} symbols form symbol Dropdown box and Verify search data is listed on the market Page")
	public void selectABTCUSDSymbolsFormSymbolDropdownBoxAndVerifySearchDataIsListedOnTheMarketPage(String BTCUSD) throws InterruptedException, AWTException {
		dr.getSpotOrder().MarketSymbols(BTCUSD);
	}

	@Given("Select a ETHUSD {string} symbols form symbol Dropdown box and Verify search data is listed on the market Page")
	public void selectAETHUSDSymbolsFormSymbolDropdownBoxAndVerifySearchDataIsListedOnTheMarketPage(String ETHUSD) throws InterruptedException, AWTException {
		dr.getSpotOrder().MarketSymbols(ETHUSD);
	}

	@Given("Select a UNIQUSD {string} symbols form symbol Dropdown box and Verify search data is listed on the market Page")
	public void selectAUNIQUSDSymbolsFormSymbolDropdownBoxAndVerifySearchDataIsListedOnTheMarketPage(String UNIQUSD) throws InterruptedException, AWTException {
		dr.getSpotOrder().MarketSymbols(UNIQUSD);
	}
	
	@Given("User scroll to Market")
	public void userScrollToMarket() {
		moveToElement(dr.getSmokeTest().getSpotorder());
		scrollToElement(dr.getSmokeTest().getMarkets());
	}

}
