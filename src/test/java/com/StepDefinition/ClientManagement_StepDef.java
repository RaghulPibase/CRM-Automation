package com.StepDefinition;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;

public class ClientManagement_StepDef extends BaseClass {

	PageObjectManager dr = new PageObjectManager();

	@Given("User Navigate to Dashboard page in CRM applicatione")
	public void userNavigateToDashboardPageInCRMApplicatione() throws InterruptedException {
		Thread.sleep(500);
		dr.getSmokeTest().getDashboard().click();
		String dashboardTitleText = dr.getSmokeTest().getDashboardTitle().getText();
		Assert.assertEquals("Deposit Pending Approvals", dashboardTitleText);
		System.out.println(dashboardTitleText);
		moveToElement(dr.getSmokeTest().getDashboard());
		scrollToElement(dr.getSmokeTest().getClientManagement());
	}

	@Then("Verify the user is on Client Management page")
	public void verifyTheUserIsOnClientManagementPage() {

	}

	@Then("User Navigate across the Client Management page")
	public void userNavigateAcrossTheClientManagementPage() {
		dr.getClientManagement().ClientManagementNav();
	}

	@Given("User search for Client in search field and Verify Search data is appear on the page")
	public void userSearchForClientInSearchFieldAndVerifySearchDataIsAppearOnThePage() throws InterruptedException {
		dr.getClientManagement().SearchSeqID();
	}

	@Given("User search for Client Email in search field and Verify Search data is appear on the page")
	public void userSearchForClientEmailInSearchFieldAndVerifySearchDataIsAppearOnThePage()
			throws InterruptedException {
		dr.getClientManagement().SearchEmail();
	}

	@Given("User Select the Group in the Group Dropdown and verify the Group is listed on the page")
	public void userSelectTheGroupInTheGroupDropdownAndVerifyTheGroupIsListedOnThePage()
			throws InterruptedException, AWTException {
		dr.getClientManagement().GrpDropdown();
	}

	@Given("User Select the approved {string} in the KYC status Dropdown and verify the Group is listed on the page")
	public void userSelectTheApprovedInTheKYCStatusDropdownAndVerifyTheGroupIsListedOnThePage(String APPROVED) {
		dr.getClientManagement().KYCStatus(APPROVED);
	}

	@Given("User Select the reject {string} in the KYC status Dropdown and verify the Group is listed on the page")
	public void userSelectTheRejectInTheKYCStatusDropdownAndVerifyTheGroupIsListedOnThePage(String REJECTED) {
		dr.getClientManagement().KYCStatus(REJECTED);
	}

	@Given("User Select the submitted {string} in the KYC status Dropdown and verify the Group is listed on the page")
	public void userSelectTheSubmittedInTheKYCStatusDropdownAndVerifyTheGroupIsListedOnThePage(String SUBMITTED) {
		dr.getClientManagement().KYCStatus(SUBMITTED);
	}

	@Given("User Select the incompleted {string} in the KYC status Dropdown and verify the Group is listed on the page")
	public void userSelectTheIncompletedInTheKYCStatusDropdownAndVerifyTheGroupIsListedOnThePage(String INCOMPLETE) {
		dr.getClientManagement().KYCStatus(INCOMPLETE);
	}
	
//	@Given("User Select the All in the {string} status Dropdown and verify the Group is listed on the page")
//	public void userSelectTheAllInTheStatusDropdownAndVerifyTheGroupIsListedOnThePage(String All) {
//		dr.getClientManagement().KYCStatus(All);
//	}

	@Given("User Select the Country in the Country Dropdown and verify the Country is listed on the page")
	public void userSelectTheCountryInTheCountryDropdownAndVerifyTheCountryIsListedOnThePage()
			throws InterruptedException, AWTException {
		dr.getClientManagement().CountryDropdown();
	}

	@Then("Verify the user is on KYC page in Client Management")
	public void verifyTheUserIsOnKYCPageInClientManagement() {
		dr.getClientManagement().getCMKYC().click();
		Assert.assertEquals("KYC Details", getText(dr.getClientManagement().getCMKYCTitle()));
		String KYCTitle = dr.getClientManagement().getCMKYCTitle().getText();
		System.out.println(KYCTitle);
	}

	@Then("User verify the verification status on KYC page")
	public void userVerifyTheVerificationStatusOnKYCPage() {
		Assert.assertEquals("SUBMITTED", getText(dr.getClientManagement().getKYCSubmitted()));
		String status = getText(dr.getClientManagement().getKYCSubmitted());
		System.out.println(status);
	}

	@Then("User click on the Approvals and verify the form title")
	public void userClickOnTheApprovalsAndVerifyTheFormTitle() throws InterruptedException {
		dr.getClientManagement().getApprove().click();
		Thread.sleep(2000);
		Assert.assertEquals("Approve Identity Verification", dr.getClientManagement().getApproveForm().getText());

		String Form = dr.getClientManagement().getApproveForm().getText();
		System.out.println(Form);
	}

	@Then("User click on the Approvals and verify the Toast message")
	public void userClickOnTheApprovalsAndVerifyTheToastMessage() throws InterruptedException {
		dr.getClientManagement().getApproveButton().click();
		Thread.sleep(2000);
		Assert.assertEquals("KYC approved", dr.getClientManagement().getKYCApproveToastmsg().getText());
		String Toastmsg = dr.getClientManagement().getKYCApproveToastmsg().getText();
		System.out.println(Toastmsg);
	}

	@Then("User verify the Approval status on KYC page")
	public void userVerifyTheApprovalStatusOnKYCPage() {
		Assert.assertEquals("APPROVED", getText(dr.getClientManagement().getVerificationStatus()));
		String status = getText(dr.getClientManagement().getVerificationStatus());
		System.out.println(status);
	}

	@Then("User Navigate to the Basic Information page and get the Client ID")
	public void userNavigateToTheBasicInformationPageAndGetTheClientID() {
		dr.getClientManagement().getCMBasicInfo().click();
		dr.getClientManagement().ClientId();
	}

	@Then("User search for Approved Client ID in search field and Verify data is appear on the page")
	public void userSearchForApprovedClientIDInSearchFieldAndVerifyDataIsAppearOnThePage() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User verify the Approval status on the Client page")
	public void userVerifyTheApprovalStatusOnTheClientPage() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User click on the Reject and verify the form title")
	public void userClickOnTheRejectAndVerifyTheFormTitle() throws InterruptedException {
		dr.getClientManagement().getReject().click();
		Thread.sleep(2000);
		String Form = dr.getClientManagement().getRejectForm().getText().toUpperCase();
		System.out.println(Form);
		Assert.assertEquals("REJECT IDENTITY VERIFICATION", Form);
		System.out.println(Form);

	}

	@Then("User enter the Reject Reason")
	public void userEnterTheRejectReason() {
		dr.getClientManagement().getRejectReason().sendKeys("Documents need to be validate on the Bank details");
	}

	@Then("User verify the Toast message")
	public void userVerifyTheToastMessage() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals("KYC Rejected", dr.getClientManagement().getRejectToastmsg().getText());
		String text = dr.getClientManagement().getRejectToastmsg().getText();
		System.out.println(text);
	}

	@Given("User Navigate to Deposit Crypto page and Verify the page title")
	public void userNavigateToDepositCryptoPageAndVerifyThePageTitle() {
		dr.getClientManagement().getCMDepositCrypto().click();
		Assert.assertEquals("Deposit Crypto", dr.getClientManagement().getCMDepositCryptoTitle().getText());
		String text = dr.getClientManagement().getCMDepositCryptoTitle().getText();
		System.out.println(text);
	}

	@Given("User select the Crypto on the Crypto dropdown field")
	public void userSelectTheCryptoOnTheCryptoDropdownField() throws InterruptedException, AWTException {
		dr.getClientManagement().getDepositCrypto().click();
		dr.getClientManagement().getSearchAsset().sendKeys("ETH");
//	    DownArrowPress();
		dr.getClientManagement().getFirstrow().click();
	}

	@Given("user enter the value on the amount field")
	public void userEnterTheValueOnTheAmountField() {
		dr.getClientManagement().getAmountInput().sendKeys("50");
	}

	@Given("User Click on the Deposit button")
	public void userClickOnTheDepositButton() {
		dr.getClientManagement().getDepositbutton().click();
	}

	@Given("User verify the Toast message and verify user navigate to the Crypto Transcation History page")
	public void userVerifyTheToastMessageAndVerifyUserNavigateToTheCryptoTranscationHistoryPage()
			throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals("Deposit initiated successfully", dr.getClientManagement().getDepositToastmsg().getText());
		String text = dr.getClientManagement().getDepositToastmsg().getText();
		System.out.println(text);
		Thread.sleep(1000);
		Assert.assertEquals("Crypto Transactions History", dr.getClientManagement().getCMCrTarnsHisTitle().getText());
		String Crypto = dr.getClientManagement().getCMCrTarnsHisTitle().getText();
		System.out.println(Crypto);
	}

	@Given("User Navigate to Deposit Fiat page and Verify the page title")
	public void userNavigateToDepositFiatPageAndVerifyThePageTitle() throws InterruptedException {
		dr.getClientManagement().getCMDepositFiat().click();
		Assert.assertEquals("Deposit Fiat", dr.getClientManagement().getCMDepositFiatTitle().getText());
		String text = dr.getClientManagement().getCMDepositFiatTitle().getText();
		System.out.println(text);
	}

	@Given("User select the Fiat on the Fiat dropdown field")
	public void userSelectTheFiatOnTheFiatDropdownField() {
		dr.getClientManagement().getDepositFiat().click();
		dr.getClientManagement().getSearchAsset().sendKeys("USD");
		dr.getClientManagement().getFirstrow().click();
	}

	@Given("User verify the Toast message and verify user navigate to the Fiat Transcation History page")
	public void userVerifyTheToastMessageAndVerifyUserNavigateToTheFiatTranscationHistoryPage()
			throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
//		WebElement waitUntil = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("dr.getClientManagement().getCMFiatTransHisTitle()")));

//		String text = dr.getClientManagement().getDepositToastmsg().getText();
//		Assert.assertEquals("Deposit initiated successfully", text);
//		System.out.println(text);

		/*
		 * String Fiat = dr.getClientManagement().getCMFiatTransHisTitle().getText();
		 * Assert.assertEquals("Fiat Transactions History", Fiat);
		 * System.out.println(Fiat);
		 */
	}

	@Given("User click on the Approvals button and verify the form title")
	public void userClickOnTheApprovalsButtonAndVerifyTheFormTitle() {
		dr.getClientManagement().getApproveCrypto().click();
		String text = dr.getClientManagement().getApproveTitle().getText();
		Assert.assertEquals("Approve", text);
	}

	@Given("User click on the Approve and verify the Toast message")
	public void userClickOnTheApproveAndVerifyTheToastMessage() {
		dr.getClientManagement().getApprovebtn().click();
	}

	@Given("User click on the Reject button and verify the form title")
	public void userClickOnTheRejectButtonAndVerifyTheFormTitle() {
		dr.getClientManagement().getRejectCrypto().click();
	}

	@Given("Click on the Reject button")
	public void clickOnTheRejectButton() {
		dr.getClientManagement().getRejectButton().click();
	}
}
