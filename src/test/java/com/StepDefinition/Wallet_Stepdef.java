package com.StepDefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;
import junit.framework.Assert;

public class Wallet_Stepdef extends BaseClass {

	PageObjectManager dr = new PageObjectManager();
	
	@Given("User Click on Dashboard page and Verify the title in CRM")
	public void userClickOnDashboardPageAndVerifyTheTitleInCRM() throws InterruptedException {
		Thread.sleep(500);
		dr.getSmokeTest().getDashboard().click();
		String dashboardTitleText = dr.getSmokeTest().getDashboardTitle().getText();
		Assert.assertEquals("Deposit Pending Approvals", dashboardTitleText);
		System.out.println(dashboardTitleText);
		moveToElement(dr.getSmokeTest().getDashboard());
		scrollToElement(dr.getSmokeTest().getWallet());
	}

	@Given("User search for {string} in the Search field and Verify data is listed on the page")
	public void userSearchForInTheSearchFieldAndVerifyDataIsListedOnThePage(String Crypto) throws InterruptedException {
		dr.getWalletBalance().getSearchCrp().sendKeys(Crypto);
		Thread.sleep(2000);
		dr.getWalletBalance().getSearchCrp().clear();
	}

	@Given("User Navigate to Fiat Field")
	public void userNavigateToFiatField() {
		dr.getWalletBalance().getFiat().click();
	}

	@Given("User search for Fiat {string} in the Search field and Verify data is listed on the page")
	public void userSearchForFiatInTheSearchFieldAndVerifyDataIsListedOnThePage(String Fiat)
			throws InterruptedException {
		dr.getWalletBalance().getSearchFat().sendKeys(Fiat);
		Thread.sleep(2000);
		dr.getWalletBalance().getSearchFat().clear();
	}

	@Given("User Navigate to Earn Field")
	public void userNavigateToEarnField() {
		dr.getWalletBalance().getEarn().click();
	}

	@Given("User search for Earn {string} in the Search field and Verify data is listed on the page")
	public void userSearchForEarnInTheSearchFieldAndVerifyDataIsListedOnThePage(String Earn)
			throws InterruptedException {
		dr.getWalletBalance().getSearchErn().sendKeys(Earn);
		Thread.sleep(2000);
		dr.getWalletBalance().getSearchErn().clear();
	}

	@Given("User select Deposit in Type Dropdown box and Verify Created data is listed on the page")
	public void userSelectDepositInTypeDropdownBoxAndVerifyCreatedDataIsListedOnThePage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getDeposite().click();
		Thread.sleep(2000);
	}

	@Given("User select Withdraw in Type Dropdown box and Verify Created data is listed on the page")
	public void userSelectWithdrawInTypeDropdownBoxAndVerifyCreatedDataIsListedOnThePage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getWithdraw().click();
		Thread.sleep(2000);
	}

	@Given("User select Send in Type Dropdown box and Verify Created data is listed on the page")
	public void userSelectSendInTypeDropdownBoxAndVerifyCreatedDataIsListedOnThePage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getSend().click();
		Thread.sleep(2000);
	}

	@Given("User select Asset in Asset Dropdown box and Verify Created data is listed on the page")
	public void userSelectAssetInAssetDropdownBoxAndVerifyCreatedDataIsListedOnThePage()
			throws AWTException, InterruptedException {
		dr.getWalletBalance().getAssets().click();
		dr.getWalletBalance().getAssetSearch().sendKeys("Bitcoin");
		dr.getWalletBalance().getOption().click();
//	   DownArrowPress();
	}

	@Given("User Click on the Client SeqID and navigate across the Client Management page")
	public void userClickOnTheClientSeqIDAndNavigateAcrossTheClientManagementPage() {
		dr.getWalletBalance().getSeqID().click();
		dr.getSpotOrder().ClientManagementNav();
	}

	@Given("User click on the Send Client ID and navigate across the client management page")
	public void userClickOnTheSendClientIDAndNavigateAcrossTheClientManagementPage() {
		dr.getWalletBalance().getSendSeqID().click();
		dr.getSpotOrder().ClientManagementNav();
	}

	@Given("User verify the Crypto Transactions History Status")
	public void userVerifyTheCryptoTransactionsHistoryStatus() {
//	    String Status = dr.getWalletBalance().getStatusCrpto().getText();

	}

	@Then("Verify the user is on View Crypto Transactions History Form")
	public void verifyTheUserIsOnViewCryptoTransactionsHistoryForm() {

	}

	@Then("User Click on Approvers and verify the Approver is available")
	public void userClickOnApproversAndVerifyTheApproverIsAvailable() {
		dr.getWalletBalance().getApprovers().click();
	}

	@Then("User Click on Status History and verify the status history is available")
	public void userClickOnStatusHistoryAndVerifyTheStatusHistoryIsAvailable() {
		dr.getWalletBalance().getStatusHistory().click();
	}

	@Then("User Click on the Approval Reject History and verify the status is available")
	public void userClickOnTheApprovalRejectHistoryAndVerifyTheStatusIsAvailable() {
		dr.getWalletBalance().getApprovalReject().click();
	}

	@Given("User select Approved in Status dropdown box and verify data is listed on the page")
	public void userSelectApprovedInStatusDropdownBoxAndVerifyDataIsListedOnThePage() {
		dr.getWalletBalance().getStatusDropdown().click();
		dr.getWalletBalance().getApproved().click();
		dr.getWalletBalance().ApprovedStatus();
		// Verify
	}

	@Given("User select Rejected in Status dropdown box and verify data is listed on the page")
	public void userSelectRejectedInStatusDropdownBoxAndVerifyDataIsListedOnThePage() {
		dr.getWalletBalance().getStatusDropdown().click();
		dr.getWalletBalance().getRejected().click();
		dr.getWalletBalance().RejectedStatus();
	}

	@Given("User select Pending in Status dropdown box and verify data is listed on the page")
	public void userSelectPendingInStatusDropdownBoxAndVerifyDataIsListedOnThePage() {
		dr.getWalletBalance().getStatusDropdown().click();
		dr.getWalletBalance().getPending().click();
		dr.getWalletBalance().PendingStatus();
	}

	@Given("User select Completed in Status dropdown box and verify data is listed on the page")
	public void userSelectCompletedInStatusDropdownBoxAndVerifyDataIsListedOnThePage() {
		dr.getWalletBalance().getStatusDropdown().click();
		dr.getWalletBalance().getCompleted().click();
		dr.getWalletBalance().COMPLETEDStatus();
	}

	@Given("User select Failed in Status dropdown box and verify data is listed on the page")
	public void userSelectFailedInStatusDropdownBoxAndVerifyDataIsListedOnThePage() {
		dr.getWalletBalance().getStatusDropdown().click();
		dr.getWalletBalance().getFailed().click();
		dr.getWalletBalance().FailedStatus();
	}

	@Given("User select Waiting for approvals in Status dropdown box and verify data is listed on the page")
	public void userSelectWaitingForApprovalsInStatusDropdownBoxAndVerifyDataIsListedOnThePage() {
		dr.getWalletBalance().getStatusDropdown().click();
		dr.getWalletBalance().getWFApproval().click();
		dr.getWalletBalance().WAITINGFORAPPROVALStatus();
	}

	@Given("User select the Client in User dropdown box and verify data is listed on the page")
	public void userSelectTheClientInUserDropdownBoxAndVerifyDataIsListedOnThePage()
			throws AWTException, InterruptedException {
		dr.getWalletBalance().getUserSearch().sendKeys("678");
		DownArrowPress();
	}

	@Given("User select Asset in Asset Dropdown and Verify Created data is listed on Client Balance page")
	public void userSelectAssetInAssetDropdownAndVerifyCreatedDataIsListedOnClientBalancePage()
			throws AWTException, InterruptedException {
		dr.getWalletBalance().getAssestSrch().click();
		dr.getWalletBalance().getBTCassest().click();
		Thread.sleep(3000);
	}

	@Given("User select Fiat in Type Dropdown and Verify Selected data is listed on Client Balance page")
	public void userSelectFiatInTypeDropdownAndVerifySelectedDataIsListedOnClientBalancePage() throws InterruptedException {
		
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg' and @class='h-5 w-5 text-gray-400']"))).click().perform();
		dr.getWalletBalance().getFiatType().click();
		Thread.sleep(2000);
	}

	@Given("User select Crypto in Type Dropdown and Verify Selected data is listed on Client Balance page")
	public void userSelectCryptoInTypeDropdownAndVerifySelectedDataIsListedOnClientBalancePage() throws InterruptedException {
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg' and @class='h-5 w-5 text-gray-400']"))).click().perform();
		dr.getWalletBalance().getCryptoType().click();
		Thread.sleep(2000);
	}
	
	@Given("User Verify the data sames on the Client balance")
	public void userVerifyTheDataSamesOnTheClientBalance() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("User Search for a {string} in Crypto address search field and verify data is listed on the page")
	public void userSearchForAInCryptoAddressSearchFieldAndVerifyDataIsListedOnThePage(String address) {
	    dr.getWalletBalance().getCryptoAddressSearch().sendKeys(address);
	}
	
	@Given("User select Deposit in Type Dropdown box and Verify Created data is listed on the CryptoAddress page")
	public void userSelectDepositInTypeDropdownBoxAndVerifyCreatedDataIsListedOnTheCryptoAddressPage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getCADeposit().click();
		Thread.sleep(2000);
	}
	
	@Given("User select Withdraw in Type Dropdown box and Verify Created data is listed on the CryptoAddress page")
	public void userSelectWithdrawInTypeDropdownBoxAndVerifyCreatedDataIsListedOnTheCryptoAddressPage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getCAWithdraw().click();
		Thread.sleep(2000);
	}
	
	@Given("User select Buy in Type Dropdown and Verify Selected data is listed on Wallet History page")
	public void userSelectBuyInTypeDropdownAndVerifySelectedDataIsListedOnWalletHistoryPage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getWHBuy().click();
		Thread.sleep(2000);
	}
	
	@Given("User select Sell in Type Dropdown and Verify Selected data is listed on Wallet History page")
	public void userSelectSellInTypeDropdownAndVerifySelectedDataIsListedOnWalletHistoryPage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getWHSell().click();
		Thread.sleep(2000);
	}
	
	@Given("User select Deposit in Type Dropdown and Verify Selected data is listed on Wallet History page")
	public void userSelectDepositInTypeDropdownAndVerifySelectedDataIsListedOnWalletHistoryPage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getWHDeposit().click();
		Thread.sleep(2000);
	}
	
	@Given("User select Withdrawl in Type Dropdown and Verify Selected data is listed on Wallet History page")
	public void userSelectWithdrawlInTypeDropdownAndVerifySelectedDataIsListedOnWalletHistoryPage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getWHWithdraw().click();
		Thread.sleep(2000);
	}
	
	@Given("User select Fee in Type Dropdown and Verify Selected data is listed on Wallet History page")
	public void userSelectFeeInTypeDropdownAndVerifySelectedDataIsListedOnWalletHistoryPage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getWHFee().click();
		Thread.sleep(2000);
	}
	
	@Given("User select Earn in Type Dropdown and Verify Selected data is listed on Wallet History page")
	public void userSelectEarnInTypeDropdownAndVerifySelectedDataIsListedOnWalletHistoryPage() throws InterruptedException {
		dr.getWalletBalance().getTypeDrop().click();
		dr.getWalletBalance().getWHEarn().click();
		Thread.sleep(2000);
	}
}
