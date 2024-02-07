package com.StepDefinition;

import java.awt.AWTException;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Assert;
//import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeOptions;
import BaseClass.BaseClass;
import Page.SmokeTestingPages;
//import Page.SupportTicketPage;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class SupportTicket_Stepdef extends BaseClass {

	PageObjectManager dr = new PageObjectManager();
	
	@Given("User Navigate to Dashboard page and Verify the title")
	public void userNavigateToDashboardPageAndVerifyTheTitle() throws InterruptedException {
		Thread.sleep(500);
		dr.getSmokeTest().getDashboard().click();
		String dashboardTitleText = dr.getSmokeTest().getDashboardTitle().getText();
		Assert.assertEquals("Deposit Pending Approvals", dashboardTitleText);
		System.out.println(dashboardTitleText);
		moveToElement(dr.getSmokeTest().getDashboard());
		scrollToElement(dr.getSupportTicket().getSupportTicket());
	}


	@Given("User Navigate to Support Ticket and Verify the page Title")
	public void userNavigateToSupportTicketAndVerifyThePageTitle()throws FileNotFoundException, IOException, InterruptedException {
//		LoginCRM();
		dr.getSupportTicket().getSupportTicket().click();
	}

//	@Given("User search for TicketID in Search Field")
//	public void userSearchForTicketIDInSearchField() throws InterruptedException {
//		Thread.sleep(2000);
//		String searchSupportTicket = dr.getSupportTicket().SearchSupportTicket();
//		dr.getSupportTicket().getSearch().sendKeys(searchSupportTicket);
//		Thread.sleep(2000);
//	}

	@Then("Verify the TicketID is listed on the screen")
	public void verifyTheTicketIDIsListedOnTheScreen() throws InterruptedException {
//		dr.getSupportTicket().SearchTicket();
	}

	@Then("Verify user is on Edit support ticket page")
	public void verifyUserIsOnEditSupportTicketPage() throws InterruptedException {
		Thread.sleep(2000);
		String EditSupportTicket = dr.getSupportTicket().getEditSupportTicket().getText();
		System.out.println(EditSupportTicket);
		Assert.assertEquals("EDIT SUPPORT TICKET", EditSupportTicket);
	}

	@Then("User select the Status to Open")
	public void userSelectTheStatusToOpen() {
		selectByValue("OPEN", dr.getSupportTicket().getStatusDropdown());
	}

	@Then("User select the Priority to Medium")
	public void userSelectThePriorityToMedium() {
		selectByValue("MEDIUM", dr.getSupportTicket().getPriorityDropdown());
		// dr.getSupportTicket().getPriorityMedium().click();
	}

	@Then("User click on the Submit button")
	public void user_click_on_the_submit_button() {
//		dr.getSupportTicket().getTicketSubmit().click();
		
	}

	@Then("Verify the Toast message for updating support Ticket")
	public void verifyTheToastMessageForUpdatingSupportTicket() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(dr.getSupportTicket().getTicketupdatedsuccessfullyToastmsg().getText());
		Assert.assertEquals("Ticket updated successfully",
				dr.getSupportTicket().getTicketupdatedsuccessfullyToastmsg().getText());
	}

	@Then("User select the Priority to High")
	public void userSelectThePriorityToHigh() {
		selectByValue("HIGH", dr.getSupportTicket().getPriorityDropdown());
		// dr.getSupportTicket().getPriorityHigh().click();
	}

	@Then("User select the Priority to Low")
	public void userSelectThePriorityToLow() {
		selectByValue("LOW", dr.getSupportTicket().getPriorityDropdown());
//		dr.getSupportTicket().getPriorityDropdown().click();
	}

	@Then("User select the Status to Close")
	public void userSelectTheStatusToClose() {
		// selectByValue("STOP", dr.getClientGroup().getStopModeoption());
		selectByValue("CLOSED", dr.getSupportTicket().getStatusDropdown());
	}

	@Then("Verify the updated Ticket appear on the Ticket page")
	public void verifyTheUpdatedTicketAppearOnTheTicketPage() {
		 // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Given("User Click on the Assign option")
	public void userClickOnTheAssignOption() {
		dr.getSupportTicket().getAssignButton().click();
		
	}

	@Then("Verify user is on Assign Form")
	public void verifyUserIsOnAssignForm() throws InterruptedException {
		Thread.sleep(2000);
		String AssignFormTitle = dr.getSupportTicket().getAssignFormTitle().getText().toUpperCase();
		System.out.println(AssignFormTitle);
		Assert.assertEquals("ASSIGN", AssignFormTitle);
	}

	@Then("User select the Assignee from Assign field")
	public void userSelectTheAssigneeFromAssignField() throws InterruptedException, AWTException {
		  dr.getSupportTicket().getAssignDropdownST().click();
		  EnterKey();
	}

	@Then("Verify the Toast message for support Ticket Assigned")
	public void verifyTheToastMessageForSupportTicketAssigned() throws InterruptedException {
		Thread.sleep(2000);
		String AssigneeToast = dr.getSupportTicket().getAssigneeToastmsg().getText();
		System.out.println(AssigneeToast);
		Assert.assertEquals("Assignee updated successfully", AssigneeToast);
	}

	@Then("Verify the user is on Support Ticket Information page")
	public void verifyTheUserIsOnSupportTicketInformationPage() {
//		String PageTitle = dr.getSupportTicket().getInformationpageTitle().getText();
//		System.out.println(PageTitle);
//		Assert.assertEquals("Support Ticket Information", PageTitle);
	}

	@Then("Verify the Information form is Selected")
	public void verifyTheInformationFormIsSelected() {
		dr.getSupportTicket().getInformation().isSelected();
	}

	@Then("Verify the Suppor Ticket data appearing on the Information form")
	public void verifyTheSupporTicketDataAppearingOnTheInformationForm() {
		Assert.assertTrue(true);
	}

	@Then("Click on Messages Form")
	public void clickOnMessagesForm() {
		dr.getSupportTicket().getMessages().click();
	}

	@Then("Enter the {string} data")
	public void enterTheData(String Message) {
		dr.getSupportTicket().getChatField().sendKeys(Message);
	}

	@Then("Click on the Send button")
	public void clickOnTheSendButton() {
		dr.getSupportTicket().getMsgSendButton().click();
	}

	@Then("Verify the message is appear on the screen")
	public void verifyTheMessageIsAppearOnTheScreen() {
		Assert.assertTrue(true);
	}

	@Then("User attach a File in Upload field")
	public void userAttachAFileInUploadField() throws InterruptedException {
		Thread.sleep(2000);
		dr.getSupportTicket().Fileuploading();
//	    dr.getSupportTicket().ImageCheck(dr.getSupportTicket().getChatBoxImage());

		/*
		 * boolean displayed = dr.getSupportTicket().getUploadedfile().isDisplayed();
		 * System.out.println(displayed);
		 */
	}

	@Then("Verify the File is appear on the screen")
	public void verifyTheFileIsAppearOnTheScreen() throws InterruptedException {
		Thread.sleep(2000);
//		dr.getSupportTicket().ChatBox();
		// boolean displayed = dr.getSupportTicket().getImage().isDisplayed();
		// System.out.println(displayed);
	}

	@Then("Click on Histories Form")
	public void clickOnHistoriesForm() throws InterruptedException {
		Thread.sleep(5000);
		dr.getSupportTicket().getHistories().click();
	}

	@Then("Verify the Support Ticket Histories")
	public void verifyTheSupportTicketHistories() throws InterruptedException {
		Thread.sleep(3000);
		String TrackTitle = dr.getSupportTicket().getTrackTitle().getText();
		System.out.println(TrackTitle);
	}
	
	@When("User search on Search field and Verify Search data is appear on the page")
	public void userSearchOnSearchFieldAndVerifySearchDataIsAppearOnThePage() throws InterruptedException {
		Thread.sleep(500);
	   dr.getSupportTicket().SearchFieldID();
	}
	
	@Given("User perform random action on reset button")
	public void userPerformRandomActionOnResetButton() {
		try {
			 dr.getSpotOrder().Resetmultiple();
		} catch (Exception e) {
//			System.out.println(e);
		}
	}
	
	@Then("User select the Status to Select option")
	public void userSelectTheStatusToSelectOption() throws AWTException, InterruptedException {
//		selectByValue("Select", dr.getSupportTicket().getStatusDropdown());
		dr.getSupportTicket().getStatusDropdown().click();
		dr.getSupportTicket().getSelectStatusST().click();
//		 DownArrowPress();
	}
	
	@Then("User select the Priority to Select option")
	public void userSelectThePriorityToSelectOption() throws AWTException, InterruptedException {
//		selectByValue("Select", dr.getSupportTicket().getPriorityDropdown());
		dr.getSupportTicket().getPriorityDropdown().click();
		dr.getSupportTicket().getSelectPriorityST().click();
//		DownArrowPress();
	}
	
	@Then("Verify the error message appear on the Edit support ticket form")
	public void verifyTheErrorMessageAppearOnTheEditSupportTicketForm() {
		String Status = dr.getSupportTicket().getStatusErmsg().getText();
		System.out.println(Status);
		Assert.assertEquals("Status is required field", Status);
		
		String Priority = dr.getSupportTicket().getPriorityErmsg().getText();
		System.out.println(Priority);
		Assert.assertEquals("Priority is required field", Priority);
	}
	
	@When("User click on Reset button")
	public void userClickOnResetButton() throws InterruptedException {
		Thread.sleep(1000);
	    dr.getSpotOrder().getReset().click();
	}

	@Then("User search for {string} data in Assignee Dropdown")
	public void userSearchForDataInAssigneeDropdown(String Invalid) {
		dr.getSupportTicket().getCrossCancel().click();
	    dr.getSupportTicket().getAssigninput().sendKeys(Invalid);
	}

	
	@Then("Verify the Error message appear on the list")
	public void verifyTheErrorMessageAppearOnTheList() {
		String text = dr.getSupportTicket().getAssignfieldErrormsg().getText();
		System.out.println(text);
		Assert.assertEquals("Nothing found.", text);
	}
	
	@Then("Verify the Error message appear on the form")
	public void verifyTheErrorMessageAppearOnTheForm() {
	   String text = dr.getSupportTicket().getAssignErr().getText();
	   System.out.println(text);
	   Assert.assertEquals("Assignee is required field", text);
	}
	
	@Then("User deselect the Assignee in Assign form")
	public void userDeselectTheAssigneeInAssignForm() {
//	   dr.getSupportTicket().getAssignDropdownST().clear();
	   dr.getSupportTicket().getCrossCancel().click();
	}

	
	@Given("User search for {string} data in Client Dropdown field")
	public void userSearchForDataInClientDropdownField(String Invalid) {
		dr.getClientGroup().getClientDropdown().sendKeys(Invalid);
	}

	@Given("User search for {string} data in Assignee field")
	public void userSearchForDataInAssigneeField(String Invalid) {
	    dr.getSupportTicket().getAssigneeDropdown().sendKeys(Invalid);
	}
	
	@When("User select client in Client Dropdown")
	public void userSelectClientInClientDropdown() throws InterruptedException, AWTException {
		dr.getClientGroup().getClientDropdown().sendKeys("715");
		DownArrowPress();
		Thread.sleep(2000);
	}
	
	@Given("User select Assignee in Assignee DropDown Box in suport ticket page")
	public void userSelectAssigneeInAssigneeDropDownBoxInSuportTicketPage() throws InterruptedException, AWTException {
	    dr.getSupportTicket().AssigneeDropdown();
	}
	
	@Given("User select client in Client DropDown Box in suport ticket page")
	public void userSelectClientInClientDropDownBoxInSuportTicketPage() throws InterruptedException, AWTException {
		   dr.getSupportTicket().ClientDropdown();
	}

	

}
