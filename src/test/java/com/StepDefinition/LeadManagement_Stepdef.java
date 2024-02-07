package com.StepDefinition;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class LeadManagement_Stepdef extends BaseClass {

	PageObjectManager dr = new PageObjectManager();

	@Given("User Navigate to Dashboard page in CRM")
	public void userNavigateToDashboardPageInCRM() throws InterruptedException {
		Thread.sleep(500);
		dr.getSmokeTest().getDashboard().click();
		String dashboardTitleText = dr.getSmokeTest().getDashboardTitle().getText();
		Assert.assertEquals("Deposit Pending Approvals", dashboardTitleText);
		System.out.println(dashboardTitleText);
//		moveToElement(dr.getSmokeTest().getDashboard());
//		scrollToElement(dr.getLeadManagement().getLeadManagementpage());
	}

	@Given("User Navigate to Lead Management page and Verify the Page Title")
	public void userNavigateToLeadManagementPageAndVerifyThePageTitle() {
		dr.getLeadManagement().getLeadManagementpage().click();
	}

	@Given("Click on the Create button")
	public void clickOnTheCreateButton() {
		dr.getLeadManagement().getCreate().click();
	}

	@Given("User enter the valid data in First name field")
	public void userEnterTheValidDataInFirstNameField() {
		dr.getLeadManagement().getFirstName().sendKeys(RandomText());
	}

	@Given("User enter the Valid data in second name field")
	public void userEnterTheValidDataInSecondNameField() {
		dr.getLeadManagement().getSecondName().sendKeys(RandomText());
	}

	@Given("User enter the valid data in Email field")
	public void userEnterTheValidDataInEmailField() {
		dr.getLeadManagement().getEmailfield().sendKeys("raghul+" + RandomText() + "@pibase.info");
	}

	@Given("User enter the valid data in mobile filed")
	public void userEnterTheValidDataInMobileFiled() {
		dr.getLeadManagement().getPhonenumber().sendKeys("9095392644");
	}

	@Given("User select the source in source field")
	public void userSelectTheSourceInSourceField() throws AWTException, InterruptedException {
		dr.getLeadManagement().getSource().click();
		DownArrowPress();
	}

	@Given("User select the country in the country field")
	public void userSelectTheCountryInTheCountryField() throws AWTException, InterruptedException {
		dr.getLeadManagement().getCountry().click();
		DownArrowPress();
	}

	@Given("User will create a lead multiple times")
	public void userWillCreateALeadMultipleTimes() throws AWTException, InterruptedException {
		/*
		 * Actions act = new Actions(driver);
		 * act.moveToElement(MultipleLeads()).click().perform();
		 */

		dr.getLeadManagement().MultipleLeads();
	}

	@Given("User search for Email in search field and Verify Search data is appear on the page")
	public void userSearchForEmailInSearchFieldAndVerifySearchDataIsAppearOnThePage() throws InterruptedException {
		dr.getLeadManagement().SearchLeadEmail();
	}

	@Given("User Select New {string} in select Dropdown and Verify Search data is appear on the page")
	public void userSelectNewInSelectDropdownAndVerifySearchDataIsAppearOnThePage(String ALL) {
		dr.getLeadManagement().LeadStatus(ALL);
	}

	@Given("User Select Call Back {string} in select Dropdown and Verify Search data is appear on the page")
	public void userSelectCallBackInSelectDropdownAndVerifySearchDataIsAppearOnThePage(String CALLBACK) {
		dr.getLeadManagement().LeadStatus(CALLBACK);
	}

	@Given("User Select No Answer {string} in select Dropdown and Verify Search data is appear on the page")
	public void userSelectNoAnswerInSelectDropdownAndVerifySearchDataIsAppearOnThePage(String NO_ANSWER) {
		dr.getLeadManagement().LeadStatus(NO_ANSWER);
	}

	@Given("User Select Not Available {string} in select Dropdown and Verify Search data is appear on the page")
	public void userSelectNotAvailableInSelectDropdownAndVerifySearchDataIsAppearOnThePage(String NOT_AVAILABLE) {
		dr.getLeadManagement().LeadStatus(NOT_AVAILABLE);
	}

	@Given("User Select OutOfCoverage {string} in select Dropdown and Verify Search data is appear on the page")
	public void userSelectOutOfCoverageInSelectDropdownAndVerifySearchDataIsAppearOnThePage(String OUT_OF_COVERAGE) {
		dr.getLeadManagement().LeadStatus(OUT_OF_COVERAGE);
	}

	@Given("User Select Not interested {string} in select Dropdown and Verify Search data is appear on the page")
	public void userSelectNotInterestedInSelectDropdownAndVerifySearchDataIsAppearOnThePage(String NOT_INTERESTED) {
		dr.getLeadManagement().LeadStatus(NOT_INTERESTED);
	}

	@Given("User Select Good Lead {string} in select Dropdown and Verify Search data is appear on the page")
	public void userSelectGoodLeadInSelectDropdownAndVerifySearchDataIsAppearOnThePage(String GOOD_LEAD) {
		dr.getLeadManagement().LeadStatus(GOOD_LEAD);
	}

	@Given("User Select Junk {string} in select Dropdown and Verify Search data is appear on the page")
	public void userSelectJunkInSelectDropdownAndVerifySearchDataIsAppearOnThePage(String JUNK) {
		dr.getLeadManagement().LeadStatus(JUNK);
	}

//	@Given("User Click on the Assignee Dropdown")
//	public void userClickOnTheAssigneeDropdown() {
//		dr.getLeadManagement().getAssignee().click();
//	}

//	@Given("User select the unassignee option in the dropdown and verify data is appear on the page")
//	public void userSelectTheUnassigneeOptionInTheDropdownAndVerifyDataIsAppearOnThePage()
//			throws AWTException, InterruptedException {
//		DownArrowPress();
//	}

	@Given("User select unassigned {string} in Assignee dropdown")
	public void userSelectUnassignedInAssigneeDropdown(String Unassigned) {
		dr.getLeadManagement().LeadAssignee(Unassigned);
	}

	@Given("User select Assignee {string} in Assignee dropdown")
	public void userSelectAssigneeInAssigneeDropdown(String Nithin_S) {
		dr.getLeadManagement().LeadAssignee(Nithin_S);
	}

	@Given("User Select source in source Dropdown and Verify Search data is appear on the page")
	public void userSelectSourceInSourceDropdownAndVerifySearchDataIsAppearOnThePage()
			throws InterruptedException, AWTException {
		dr.getLeadManagement().getSourceDropdown().click();
		dr.getLeadManagement().getSourceDropdown().sendKeys("Google");
		EnterKey();
	}

	@Given("User Select Country in Country Dropdown and Verify Search data is appear on the page")
	public void userSelectCountryInCountryDropdownAndVerifySearchDataIsAppearOnThePage()
			throws InterruptedException, AWTException {
		dr.getLeadManagement().getCountryDropdown().click();
		dr.getLeadManagement().getCountryDropdown().sendKeys("India");
		EnterKey();
	}

	@Given("User Click on the Bulk Assignee button")
	public void userClickOnTheBulkAssigneeButton() {
		dr.getLeadManagement().getBulkAssignee().click();
	}

	@Given("User Select the Select all check box")
	public void userSelectTheSelectAllCheckBox() {
		dr.getLeadManagement().getSelectAll().click();
	}

	@Given("User Select the Not-Register {string} in the KYC status Dropdown and verify the Group is listed on the page")
	public void userSelectTheNotRegisterInTheKYCStatusDropdownAndVerifyTheGroupIsListedOnThePage(String NotRegister) {
		dr.getClientManagement().KYCStatus(NotRegister);
	}

	@Then("Verify the user is on Edit Form")
	public void verifyTheUserIsOnEditForm() {
		String text = dr.getLeadManagement().getEditformTitle().getText().toUpperCase();
		Assert.assertEquals("EDIT LEAD", text);
	}

//	@Then("User select status in the status dropdown")
//	public void userSelectStatusInTheStatusDropdown() {
//		selectByValue("NEW", dr.getLeadManagement().getStatusDropdown());
//	}


	@Then("User select New {string} status in the status dropdown")
	public void userSelectNewStatusInTheStatusDropdown(String NEW) {
		selectByValue("NEW", dr.getLeadManagement().getStatusDropdown());
	}

	@Then("User select ASSIGNED {string} status in the status dropdown")
	public void userSelectASSIGNEDStatusInTheStatusDropdown(String ASSIGNED) {
		selectByValue("ASSIGNED", dr.getLeadManagement().getStatusDropdown());
	}

	@Then("User select CALLBACK {string} status in the status dropdown")
	public void userSelectCALLBACKStatusInTheStatusDropdown(String CALLBACK) {
		selectByValue("CALLBACK", dr.getLeadManagement().getStatusDropdown());
		dr.getLeadManagement().getCallBackDuration().click();
		dr.getLeadManagement().getDate().click();
		dr.getLeadManagement().getTime().sendKeys("10:00");
	}

	@Then("User select NO ANSWER {string} status in the status dropdown")
	public void userSelectNOANSWERStatusInTheStatusDropdown(String NO_ANSWER) {
		selectByValue("NO ANSWER", dr.getLeadManagement().getStatusDropdown());
	}

	@Then("User select NOT AVAILABLE {string} status in the status dropdown")
	public void userSelectNOTAVAILABLEStatusInTheStatusDropdown(String NOT_AVAILABLE) {
		selectByValue("NOT AVAILABLE", dr.getLeadManagement().getStatusDropdown());
	}

	@Then("User select OUT OF COVERAGE {string} status in the status dropdown")
	public void userSelectOUTOFCOVERAGEStatusInTheStatusDropdown(String OUT_OF_COVERAGE) {
		selectByValue("OUT OF COVERAGE", dr.getLeadManagement().getStatusDropdown());
	}

	@Then("User select NOT INTERESTED {string} status in the status dropdown")
	public void userSelectNOTINTERESTEDStatusInTheStatusDropdown(String NOT_INTERESTED) {
		selectByValue("NOT INTERESTED", dr.getLeadManagement().getStatusDropdown());
	}

	@Then("User select GOOD LEAD {string} status in the status dropdown")
	public void userSelectGOODLEADStatusInTheStatusDropdown(String GOOD_LEAD) {
		selectByValue("GOOD LEAD", dr.getLeadManagement().getStatusDropdown());
	}

	@Then("User select JUNK {string} status in the status dropdown")
	public void userSelectJUNKStatusInTheStatusDropdown(String JUNK) {
		selectByValue("JUNK", dr.getLeadManagement().getStatusDropdown());
	}

	@Then("Verify the Toast message for Editing Lead")
	public void verifyTheToastMessageForEditingLead() throws InterruptedException {
		Thread.sleep(500);
		String text = dr.getLeadManagement().getLeadEditToast().getText();
		Assert.assertEquals("Status updated successfully", text);
	}

	@Then("Verify the Toast message for Assigning the Lead")
	public void verifyTheToastMessageForAssigningTheLead() throws InterruptedException {
		Thread.sleep(500);
		String text = dr.getLeadManagement().getAssignedToast().getText();
		Assert.assertEquals("Assignee updated successfully", text);
	}

	@Given("User navigate to the comment page")
	public void userNavigateToTheCommentPage() {
		dr.getLeadManagement().getComments().click();
	}

	@Given("User enter the comment and Verify the Toast message")
	public void userEnterTheCommentAndVerifyTheToastMessage() throws InterruptedException {
		dr.getLeadManagement().getCommentInput().sendKeys("Lead Is created for ths client ");
		dr.getLeadManagement().getCommentButton().click();
		Thread.sleep(1000);
		String text = dr.getLeadManagement().getCommentToastMSg().getText();
		Assert.assertEquals("Lead comment successfully", text);
	}

	@Given("Verify the Toast message for Deleting the Leads")
	public void verifyTheToastMessageForDeletingTheLeads() throws InterruptedException {
		dr.getLeadManagement().DeleteLead();
	}

	@Then("user clear the old assignee")
	public void userClearTheOldAssignee() {
		dr.getLeadManagement().getCrossCancel().click();
	}

	@Then("User select Assignee in Assignee DropDown Box")
	public void userSelectAssigneeInAssigneeDropDownBox() throws InterruptedException, AWTException {
		dr.getLeadManagement().getAssignForm().click();
		EnterKey();
	}

}
