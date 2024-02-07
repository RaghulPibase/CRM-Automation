package com.StepDefinition;

import static org.junit.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class Smoketesting_Stepdef extends BaseClass {

	PageObjectManager dr = new PageObjectManager();

	@Given("User Navigate to Dashboard and Verify the Page Title")
	public void userNavigateToDashboardAndVerifyThePageTitle() throws InterruptedException {
		Thread.sleep(500);
		dr.getSmokeTest().getDashboard().click();
		String dashboardTitleText = dr.getSmokeTest().getDashboardTitle().getText();
		Assert.assertEquals("Deposit Pending Approvals", dashboardTitleText);
		System.out.println(dashboardTitleText);
	}
	
	@Given("User Navigate to Dashboard and Verify the title")
	public void userNavigateToDashboardAndVerifyTheTitle() throws InterruptedException {
		Thread.sleep(500);
		dr.getSmokeTest().getDashboard().click();
		String dashboardTitleText = dr.getSmokeTest().getDashboardTitle().getText();
		Assert.assertEquals("Deposit Pending Approvals", dashboardTitleText);
		System.out.println(dashboardTitleText);
		moveToElement(dr.getSmokeTest().getDashboard());
		scrollToElement(dr.getSmokeTest().getClientGroup());
	}

	@Given("User Navigate to User Management and Verify the Page Title")
	public void userNavigateToUserManagementAndVerifyThePageTitle() {
		dr.getSmokeTest().getUserManagement().click();
//		String UserManagmentTitle = dr.getSmokeTest().getUsersTitle().getText();
//		System.out.println(UserManagmentTitle);
//		Assert.assertEquals("Users", dr.getSmokeTest().getUsersTitle().getText());
	}

	@Given("User Navigate to Roles and Verify the Page Title")
	public void userNavigateToRolesAndVerifyThePageTitle() {
		dr.getSmokeTest().getRoles().click();
		String RolesTitle = dr.getSmokeTest().getRolesTitle().getText();
		System.out.println(RolesTitle);
		Assert.assertEquals("Roles", dr.getSmokeTest().getRolesTitle().getText());
	}

	@Given("User Navigate to Permissions and Verify the Page Title")
	public void userNavigateToPermissionsAndVerifyThePageTitle() {
		dr.getSmokeTest().getPermissions().click();
		String PermissionTitle = dr.getSmokeTest().getPermissionsTitle().getText();
		System.out.println(PermissionTitle);
		Assert.assertEquals("Permissions", dr.getSmokeTest().getPermissionsTitle().getText());
	}

	@Given("User Navigate to Permission Entities and Verify the Page Title")
	public void userNavigateToPermissionEntitiesAndVerifyThePageTitle() {
		dr.getSmokeTest().getPermissionEntities().click();
		Assert.assertEquals("Permission Entities", getText(dr.getSmokeTest().getPermissionEntitiesTitle()));
		String PermissionEntitiesTitle = dr.getSmokeTest().getPermissionEntitiesTitle().getText();
		System.out.println(PermissionEntitiesTitle);
	}

	@Given("User Navigate to Approvals and Verify the Page Title")
	public void userNavigateToApprovalsAndVerifyThePageTitle() {
		waitClick(dr.getSmokeTest().getApprovals());
		Assert.assertEquals("Approvals", getText(dr.getSmokeTest().getApprovalsTitle()));
		String ApprovalsTitle = dr.getSmokeTest().getApprovalsTitle().getText();
		System.out.println(ApprovalsTitle);
	}

	@Given("User Navigate to Users and Verify the Page Title")
	public void userNavigateToUsersAndVerifyThePageTitle() {
		
		dr.getSmokeTest().getUsers().click();
//		String UserTitle = dr.getSmokeTest().getUsersTitle().getText();
//		Assert.assertEquals("Users", dr.getSmokeTest().getUsersTitle().getText());
//		System.out.println(UserTitle);
	}

	@Given("User Navigate to Client Management and Verify the Page Title")
	public void userNavigateToClientManagementAndVerifyThePageTitle() {
		dr.getSmokeTest().getClientManagement().click();
//		String ClientTitle = dr.getSmokeTest().getClientsTitle().getText();
//		System.out.println(ClientTitle);
//		Assert.assertEquals("Clients", dr.getSmokeTest().getClientsTitle().getText());
	}

	@Given("User Navigate to KYC Submittted and Verify the Page Title")
	public void userNavigateToKYCSubmitttedAndVerifyThePageTitle() {
		dr.getSmokeTest().getKYCSubmitted().click();
		String KYCSubmittedTitle = dr.getSmokeTest().getKYCSubmittedTitle().getText();
		System.out.println(KYCSubmittedTitle);
		Assert.assertEquals("KYC Submitted", dr.getSmokeTest().getKYCSubmittedTitle().getText());
	}

	@Given("User Navigate to Clients and Verify the Page Title")
	public void userNavigateToClientsAndVerifyThePageTitle() throws InterruptedException {
		dr.getSmokeTest().getClients().click();
		String ClientTitle = dr.getSmokeTest().getClientsTitle().getText();
		System.out.println(ClientTitle); 
		Thread.sleep(1000);
		Assert.assertEquals("Clients", dr.getSmokeTest().getClientsTitle().getText());
	}

	@Given("User Navigate to Earn and Verify the Page Title")
	public void userNavigateToEarnAndVerifyThePageTitle() {
		dr.getSmokeTest().getEarn().click();
//		String text = dr.getSmokeTest().getDashboardEarnTitle().getText();
//		System.out.println(text);
//		Assert.assertEquals("Simple Earn Flexible", text);
	}

	@Given("User Navigate to Earn Products and verify the Page Title")
	public void userNavigateToEarnProductsAndVerifyThePageTitle() {
		dr.getSmokeTest().getEarnProducts().click();
		String text = dr.getSmokeTest().getEarnProductsTitle().getText();
		System.out.println(text);
		Assert.assertEquals("Earn Products", text);
	}

	@Given("User Navigate to Simple Earn and verify the Page Title")
	public void userNavigateToSimpleEarnAndVerifyThePageTitle() {
		dr.getSmokeTest().getSimpleEarn().click();
		String text = dr.getSmokeTest().getSimpleEarnTitle().getText();
		System.out.println(text);
		Assert.assertEquals("Simple Earn", text);
	}

	@Given("User Navigate to Simple Earn Histories and verify the Page Title")
	public void userNavigateToSimpleEarnHistoriesAndVerifyThePageTitle() {
		dr.getSmokeTest().getSimpleEarnHistories().click();
		String text = dr.getSmokeTest().getSimpleEarnHistoriesTitle().getText();
		System.out.println(text);
		Assert.assertEquals("Simple Earn Histories", text);
		moveToElement(dr.getSmokeTest().getSimpleEarnHistories());
	}

	@Given("User Navigate to Walet and Verify the Page Title")
	public void userNavigateToWaletAndVerifyThePageTitle() {
		scrollToElement(dr.getSmokeTest().getWallet());
		dr.getSmokeTest().getWallet().click();
	}

	@Given("User Navigate to Crypto Transactions History and Verify the Page Title")
	public void userNavigateToCryptoTransactionsHistoryAndVerifyThePageTitle() {
		dr.getSmokeTest().getCryptoTransactionHistory().click();
		String CryptoTransHistoryTitle = dr.getSmokeTest().getCryptoTransactionHistoryTitle().getText();
		System.out.println(CryptoTransHistoryTitle);
		Assert.assertEquals("Crypto Transactions History", CryptoTransHistoryTitle);
	}

	@Given("User Navigate to Cryptoapi Transaction History and Verify the Page Title")
	public void userNavigateToCryptoapiTransactionHistoryAndVerifyThePageTitle() {
		dr.getSmokeTest().getCryptoapiTransactionRequests().click();
		String CryptoApiTransHistoryTitle = dr.getSmokeTest().getCryptoapiTransactionRequestsTitle().getText();
		System.out.println(CryptoApiTransHistoryTitle);
		Assert.assertEquals("Cryptoapi Transaction Requests", CryptoApiTransHistoryTitle);
	}

	@Given("User Navigate to Fiat Transaction History and Verify the Page Title")
	public void userNavigateToFiatTransactionHistoryAndVerifyThePageTitle() {
		dr.getSmokeTest().getFiatTransactionHistory().click();
		String FiatTranscHistoryTitle = dr.getSmokeTest().getFiatTransactionHistoryTitle().getText();
		System.out.println(FiatTranscHistoryTitle);
		Assert.assertEquals("Fiat Transactions History", FiatTranscHistoryTitle);
	}

	@Given("User Navigate to Client Balances and Verify the Page Title")
	public void userNavigateToClientBalancesAndVerifyThePageTitle() {
		dr.getSmokeTest().getClientBalances().click();
		String ClientBalanceTitle = dr.getSmokeTest().getClientBalancesTitle().getText();
		System.out.println(ClientBalanceTitle);
		Assert.assertEquals("Client Balances", ClientBalanceTitle);
	}

	@Given("User Navigate to Crypto Addresses and Verify the Page Title")
	public void userNavigateToCryptoAddressesAndVerifyThePageTitle() {
		dr.getSmokeTest().getCryptoAddress().click();
		String CryptoAddressTitle = dr.getSmokeTest().getCryptoAddressesTitle().getText();
		System.out.println(CryptoAddressTitle);
		Assert.assertEquals("Crypto Addresses", CryptoAddressTitle);
	}

	@Given("User Navigate to Wallet Histories and Verify the Page Title")
	public void userNavigateToWalletHistoriesAndVerifyThePageTitle() {
		dr.getSmokeTest().getWallethistories().click();
		String WalletHistryTitle = dr.getSmokeTest().getWalletHistoriesTitle().getText();
		System.out.println(WalletHistryTitle);
		Assert.assertEquals("Wallet Histories", WalletHistryTitle);
	}

	@Given("User Navigate to Wallet Balances and Verify the Page Title")
	public void userNavigateToWalletBalancesAndVerifyThePageTitle() {
		dr.getSmokeTest().getWalletBalances().click();
		String WalletBalanceTitle = dr.getSmokeTest().getWalletBalanceTitle().getText();
		System.out.println(WalletBalanceTitle);
		Assert.assertEquals("Wallet Balances", WalletBalanceTitle);
	}

	@Given("User Navigate to Spot Order and Verify the Page Title")
	public void userNavigateToSpotOrderAndVerifyThePageTitle() {
		dr.getSmokeTest().getSpotorder().click();
//		String SpotOrderTitle = dr.getSmokeTest().getOpenOrderTitle().getText();
//		System.out.println(SpotOrderTitle);
//		Assert.assertEquals("Open Orders", dr.getSmokeTest().getOpenOrderTitle().getText());
	}

	@Given("User Navigate to Order History and Verify the Page Title")
	public void userNavigateToOrderHistoryAndVerifyThePageTitle() {
		dr.getSmokeTest().getOrderHistory().click();
		String OrderHistoryTitle = dr.getSmokeTest().getOrderHistoryTitle().getText();
		System.out.println(OrderHistoryTitle);
		Assert.assertEquals("Order History", OrderHistoryTitle);
	}

	@Given("User Navigate to Trade History and Verify the Page Title")
	public void userNavigateToTradeHistoryAndVerifyThePageTitle() throws InterruptedException {
		dr.getSmokeTest().getTradeHistory().click();
		Thread.sleep(2000);
		String TradeHistoryTitle = dr.getSmokeTest().getTradeHistoryTitle().getText();
		System.out.println(TradeHistoryTitle);
		Assert.assertEquals("Trade History", TradeHistoryTitle);
	}

	@Given("User Navigate to Order Executions and Verify the Page Title")
	public void userNavigateToOrderExecutionsAndVerifyThePageTitle() {
		dr.getSmokeTest().getOrderExecution().click();
		String OrderExecutionsTitle = dr.getSmokeTest().getOrderExecutionsTitle().getText();
		System.out.println(OrderExecutionsTitle);
		Assert.assertEquals("Order Executions", OrderExecutionsTitle);
	}

	@Given("User Navigate to Settled Orders and Verify the Page Title")
	public void userNavigateToSettledOrdersAndVerifyThePageTitle() {
		dr.getSmokeTest().getSettledOrder().click();
		String SetteledOrderTitle = dr.getSmokeTest().getSetteledOrdersTitle().getText();
		System.out.println(SetteledOrderTitle);
		Assert.assertEquals("Settled Orders", SetteledOrderTitle);
	}

	@Given("User Navigate to Order Summary and Verify the Page Title")
	public void userNavigateToOrderSummaryAndVerifyThePageTitle() {
		dr.getSmokeTest().getOrderSummary().click();
		String OrdersummaryTitle = dr.getSmokeTest().getOrderSummaryTitle().getText();
		System.out.println(OrdersummaryTitle);
		Assert.assertEquals("Order Summary - Net Obligation report", OrdersummaryTitle);
	}

	@Given("User Navigate to Markets and Verify the Page Title")
	public void userNavigateToMarketsAndVerifyThePageTitle() {
		dr.getSmokeTest().getMarkets().click();
		String MarketTitle = dr.getSmokeTest().getMarketsTitle().getText();
		System.out.println(MarketTitle);
		if (MarketTitle.contains("Markets")) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		moveToElement(dr.getSmokeTest().getMarkets());
		// Assert.assertEquals("Markets", getText(dr.getSmokeTest().getMarketsTitle()));
	}

	@Given("User Navigate to Open Orders and Verify the Page Title")
	public void userNavigateToOpenOrdersAndVerifyThePageTitle() {
		dr.getSmokeTest().getOpenOrders().click();
		String OpenOrderTitle = dr.getSmokeTest().getOpenOrderTitle().getText();
		System.out.println(OpenOrderTitle);
		Assert.assertEquals("Open Orders", OpenOrderTitle);
	}

	@Given("User Navigate to Support Ticket and Verify the Page Title")
	public void userNavigateToSupportTicketAndVerifyThePageTitle() {
		scrollToElement(dr.getSmokeTest().getSupportTicket());
		dr.getSmokeTest().getSupportTicket().click();
//		Assert.assertEquals("Tickets", dr.getSmokeTest().getTicketsTitle().getText());
//		String TicketTitle = dr.getSmokeTest().getTicketsTitle().getText();
//		System.out.println(TicketTitle);
	}
	
	@Given("User Navigate to Ticket page and verify the page Title")
	public void userNavigateToTicketPageAndVerifyThePageTitle() {
	    dr.getSmokeTest().getTicket().click();
	}

	@Given("User Navigate to Client Group and Verify the Page Title")
	public void userNavigateToClientGroupAndVerifyThePageTitle() {
		elementWait();
		
		dr.getSmokeTest().getClientGroup().click();
//		
	}
	
	@Given("User Navigate to Group and Verify the page Title")
	public void userNavigateToGroupAndVerifyThePageTitle() throws InterruptedException {
		Thread.sleep(2000);
		dr.getSmokeTest().getGroups().click();
	}

	@Given("User Navigate to ProfileIcon and Verify the Profile settings options")
	public void userNavigateToProfileIconAndVerifyTheProfileSettingsOptions() throws InterruptedException {
		Thread.sleep(1000);
		dr.getSmokeTest().getProfileIcon().click();
	}

	@Given("User Click on Dashboard and Verify the Page Title")
	public void userClickOnDashboardAndVerifyThePageTitle() throws InterruptedException {
		dr.getSmokeTest().getDashboardProfile().click();
		Thread.sleep(2000);
		String dashboardTitleText = dr.getSmokeTest().getDashboardTitle().getText();
		Assert.assertEquals("Deposit Pending Approvals", dashboardTitleText);
		System.out.println(dashboardTitleText);
	}

	@Given("User Click on Settings and Verify the Page Title")
	public void userClickOnSettingsAndVerifyThePageTitle() throws InterruptedException {
		dr.getSmokeTest().getSettings().click();
		Thread.sleep(2000);
		String Settings = dr.getSmokeTest().getSettingsPageTitle().getText();
		Assert.assertEquals("Settings", Settings);
		System.out.println(Settings);
	}

	@Given("User Click on SignOut Option")
	public void userClickOnSignOutOption() {
		dr.getSmokeTest().getSignout().click();
		System.out.println("Sign-out");
	}

	// Pagination between the pages

	@Given("User Click on the Cryto option in Deposit Pending Approvals")
	public void userClickOnTheCrytoOptionInDepositPendingApprovals() {
		try {
			dr.getSmokeTest().getDPACryptoDashboard();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", dr.getSmokeTest().getDPACryptoDashboard());
		}
	}

	@Then("Verify the user is Navigating between the pages")
	public void verifyTheUserIsNavigatingBetweenThePages() throws InterruptedException {
		Thread.sleep(1000);
		dr.getSmokeTest().allpages();
	}

	@Then("User Click on the Fiat option in Deposit Pending Approvals")
	public void userClickOnTheFiatOptionInDepositPendingApprovals() {
		 // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Click on the Cryto option in WithDrawal Pending Approvals")
	public void userClickOnTheCrytoOptionInWithDrawalPendingApprovals() {
		 // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Click on the Fiat option in WithDrawal Pending Approvals")
	public void userClickOnTheFiatOptionInWithDrawalPendingApprovals() {
		 // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Click on the Cryto option in wallet balance page")
	public void userClickOnTheCrytoOptionInWalletBalancePage() {
		 // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Click on the Fiat option in wallet balance page")
	public void userClickOnTheFiatOptionInWalletBalancePage() {
		 // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("User Navigate to Dashboard in Client Management and Verify the Page Title")
	public void userNavigateToDashboardInClientManagementAndVerifyThePageTitle() {
	    dr.getSmokeTest().getDashboardClient().click();
	    String text = dr.getSmokeTest().getClientsTitle().getText();
	    System.out.println(text);
	    
	}
	
	@Given("User Navigate to the Lead Management page and verify the page Title")
	public void userNavigateToTheLeadManagementPageAndVerifyThePageTitle() {
	   dr.getSmokeTest().getLeadManagement().click();
//	   String text = dr.getSmokeTest().getLeadsTitle().getText();
//	   System.out.println(text);
	}
	
	@Given("User Navigate to the Lead page and Verify the page Title")
	public void userNavigateToTheLeadPageAndVerifyThePageTitle() {
		dr.getSmokeTest().getLeads().click();
		String text = dr.getSmokeTest().getLeadsTitle().getText();
		System.out.println(text);
	}
	
	@Given("User Navigate to Dashboard in Earn and Verify the Page Title")
	public void userNavigateToDashboardInEarnAndVerifyThePageTitle() {
	    dr.getSmokeTest().getEarnDashboard().click();
	    String text = dr.getSmokeTest().getEarnDashboardTitle().getText();
	    System.out.println(text);
	}
	 
	@Given("User Navigate to the Export page and verify the page Title")
	public void userNavigateToTheExportPageAndVerifyThePageTitle() {
	    dr.getSmokeTest().getExport().click();
//	    String text = dr.getSmokeTest().getExportTitle().getText();
//	    System.out.println(text);
	    
	}
	
	@Given("User Navigate to the Export Histories page and verify the page Title")
	public void userNavigateToTheExportHistoriesPageAndVerifyThePageTitle() {
	    dr.getSmokeTest().getExportHistories().click();
	}

}
