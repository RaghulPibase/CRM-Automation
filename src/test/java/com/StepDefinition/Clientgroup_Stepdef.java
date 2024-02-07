package com.StepDefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class Clientgroup_Stepdef extends BaseClass {

	PageObjectManager dr = new PageObjectManager();

	@Given("User Navigate to client Group and Verify the Page Title")
	public void userNavigateToClientGroupAndErifyThePageTitle()throws FileNotFoundException, IOException, InterruptedException {
//		LoginCRM();
//		Thread.sleep(2000);
//		scrollDownJs(null);
		dr.getClientGroup().getClientGrp().click();
//		Assert.assertEquals("Client Groups", getText(dr.getClientGroup().getGroupsTitle()));
//		String GroupsTitle = dr.getClientGroup().getGroupsTitle().getText();
//		System.out.println(GroupsTitle);

	}

	@Given("Click on the Create button and Verify the Form Title")
	public void clickOnTheCreateButtonAndVerifyTheFormTitle() {
		waitClick(dr.getClientGroup().getCreatebutton());
		String Clientgrouptitle = dr.getClientGroup().getClientgrouptitle().getText();
		Assert.assertEquals("CREATE CLIENT GROUP", getText(dr.getClientGroup().getClientgrouptitle()));
		System.out.println(Clientgrouptitle);
	}

	@Given("Enter the Valid Data {string} in Name Field")
	public void enterTheValidDataInNameField(String Groupname) {
		dr.getClientGroup().getName().click();
		dr.getClientGroup().getName().sendKeys(RandomGroupName());
	}

	@Given("Enter the Valid Data {string} in Slug Field")
	public void enterTheValidDataInSlugField(String Slug) {
		dr.getClientGroup().getSlug().sendKeys(Slug);

	}

	@Given("Enter the Valid Data {string} in Description Field")
	public void enterTheValidDataInDescriptionField(String Description) {
		dr.getClientGroup().getDescription().sendKeys(Description);
	}

	@Given("Click on the submit button")
	public void clickOnTheSubmitButton() throws InterruptedException {
		Thread.sleep(2000);
		dr.getClientGroup().getSubmitbutton().click();
	}

	@Then("Verify the Toast message for Creating Client Group")
	public void verifyTheToastMessageForCreatingClientGroup() throws InterruptedException {
		Thread.sleep(2000);
		try {
			String Toastmsg = dr.getClientGroup().getToastmsg().getText();
			System.out.println(Toastmsg);
			Assert.assertEquals("Client Group created successfully", getText(dr.getClientGroup().getToastmsg()));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("User close the Browser")
	public void userCloseTheBrowser() {
		dr.getClientGroup().close();
	}

	@Given("User Click on More option")
	public void userClickOnMoreOption() throws InterruptedException {
		Thread.sleep(2000);
		dr.getClientGroup().getMorebutton().click();
	}

	@Given("User Click on the Edit option")
	public void userClickOnTheEditOption() {
		dr.getClientGroup().getEditbutton().click();
	}

	@Then("Verify the user is Edit Client Group Form")
	public void verifyTheUserIsEditClientGroupForm() throws InterruptedException {
		Thread.sleep(2000);
		String EditTitle = dr.getClientGroup().getEditformTitle().getText();
		System.out.println(EditTitle);
		Assert.assertEquals("EDIT CLIENT GROUP", getText(dr.getClientGroup().getEditformTitle()));
	}

	@Then("User Edit the Data in Name Field")
	public void userEditTheDataInNameField() throws InterruptedException {
		dr.getClientGroup().getName().clear();
		Thread.sleep(500);
		dr.getClientGroup().getName().sendKeys(RandomGroupName());
	}

	@Then("User Edit the Data in Description Field")
	public void userEditTheDataInDescriptionField() throws InterruptedException {
		dr.getClientGroup().getDescription().clear();
		Thread.sleep(500);
		dr.getClientGroup().getDescription().sendKeys(RandomDesc());
	}

	@Then("Verify the Toast message for Editing Client Group")
	public void verifyTheToastMessageForEditingClientGroup() throws InterruptedException {
		Thread.sleep(2000);
		String EditToastmsg = dr.getClientGroup().getEnableDisableToastmsg().getText();
		System.out.println(EditToastmsg);
		Assert.assertEquals("Client Group updated successfully",
				getText(dr.getClientGroup().getEnableDisableToastmsg()));
	}

	@Given("User Click on View option")
	public void userClickOnViewOption() {
		dr.getClientGroup().getView().click();
	}

	@Then("Verify the user is on Client Group Information page")
	public void verifyTheUserIsOnClientGroupInformationPage() throws InterruptedException {
		Thread.sleep(2000);
		String ClientgroupInformationTitle = dr.getClientGroup().getClientgroupInformationTitle().getText();
		System.out.println(ClientgroupInformationTitle);
		Assert.assertEquals("Clients", getText(dr.getClientGroup().getClientgroupInformationTitle()));
	}

	@Then("User Click on Add Member button")
	public void userClickOnAddMemberButton() {
		dr.getClientGroup().getAddMember().click();

	}

	@Then("Verify User is on Add Member form")
	public void verifyUserIsOnAddMemberForm() {
		String AddMemberTitle = dr.getClientGroup().getAddMemberTitle().getText().toUpperCase();
		System.out.println(AddMemberTitle);
		Assert.assertEquals("ADD MEMBER", dr.getClientGroup().getAddMemberTitle().getText().toUpperCase());
	}

	@Then("User select client in Client DropDown Box")
	public void userSelectClientInClientDropDownBox() throws InterruptedException {
		elementWait();
		String addMemberDropdown = dr.getClientGroup().AddMemberRandom();
		dr.getClientGroup().getAddMemberClientDropdown().sendKeys(addMemberDropdown);
		Thread.sleep(2000);
		dr.getClientGroup().AddMembersDropdowns(addMemberDropdown).click();
	}

	@Then("Verify the Toast message for Add Member")
	public void verifyTheToastMessageForAddMember() throws InterruptedException {
		Thread.sleep(2000);
		String ToastmsgMember = dr.getClientGroup().getToastmsgMember().getText();
		Assert.assertEquals("Member added successfully", getText(dr.getClientGroup().getToastmsgMember()));
		System.out.println(ToastmsgMember);
	}

	@Then("User search for Name in search field and Verify Search data is appear on the page")
	public void userSearchForNameInSearchFieldAndVerifySearchDataIsAppearOnThePage() throws InterruptedException {
		dr.getClientGroup().ClientSearch();
	}

	@Then("User Click on Remove option")
	public void userClickOnRemoveOption() {
		dr.getClientGroup().getRemove().click();
	}

	@Then("Verify the Remove Form")
	public void verifyTheRemoveForm() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals("Remove", getText(dr.getClientGroup().getRemoveTitle()));
	}

	@Then("User Click on Remove button")
	public void userClickOnRemoveButton() {
		dr.getClientGroup().getRemoveButton().click();
	}

	@Then("Verify the Toast message for Remove Member in clients page")
	public void verifyTheToastMessageForRemoveMemberInClientsPage() throws InterruptedException {
		Thread.sleep(500);
		String Toastmsgremove = dr.getClientGroup().getToastmsgremove().getText();
		Assert.assertEquals("Member removed successfully", getText(dr.getClientGroup().getToastmsgremove()));
		System.out.println(Toastmsgremove);
	}

	@Then("User Click on Spot Fees option and Verify the Spot fees page Title")
	public void userClickOnSpotFeesOptionAndVerifyTheSpotFeesPageTitle() {
		dr.getClientGroup().getSpotfees().click();
		String SpotfeesTitle = dr.getClientGroup().getSpotfeesTitle().getText();
		System.out.println(SpotfeesTitle);
		Assert.assertEquals("Spot Fees", getText(dr.getClientGroup().getSpotfeesTitle()));
	}

	@Then("User activated the Toggle button and verify the status")
	public void userActivatedTheToggleButtonAndVerifyTheStatus() throws InterruptedException {
//		dr.getClientGroup().ToggleButton();
		dr.getClientGroup().ToggleButtonSpotLevel();
	}

	@Then("Click on Edit button")
	public void clickOnEditButton() throws InterruptedException {
		Thread.sleep(1000);
		dr.getClientGroup().getEditbut().click();
	}

	@Then("Enter the Valid data on each field")
	public void enterTheValidDataOnEachField() throws InterruptedException, AWTException {
		dr.getClientGroup().getSpotfeeBalance().clear();
		dr.getClientGroup().getSpotfeeBalance().sendKeys("1");
		dr.getClientGroup().getSpotfeeOperators().click();
//		dr.getClientGroup().getSpotfeeOperators().click();
//		EnterKey();
		dr.getClientGroup().getSpotfeeVolume().clear();
		dr.getClientGroup().getSpotfeeVolume().sendKeys("1");
		dr.getClientGroup().getTakerCommission().clear();
		dr.getClientGroup().getTakerCommission().sendKeys("1");
		dr.getClientGroup().getMakerCommission().clear();
		dr.getClientGroup().getMakerCommission().sendKeys("1");
	}

	@Then("Click on the Tick button for Submit")
	public void clickOnTheTickButtonForSubmit() {
		dr.getClientGroup().getTickbutton().click();
	}

	@Then("User Click on Level limit option and Verify the Level limit page Title")
	public void userClickOnLevelLimitOptionAndVerifyTheLevelLimitPageTitle() {
		dr.getClientGroup().getLevelLimit().click();
		String LevellimitTitle = dr.getClientGroup().getLevelLimitTitle().getText();
		Assert.assertEquals("Level Limits", getText(dr.getClientGroup().getLevelLimitTitle()));
		System.out.println(LevellimitTitle);
	}

	@Then("Enter the data on each field on CRYPTO WITHDRAWAL LIMITS")
	public void enterTheDataOnEachFieldOnCRYPTOWITHDRAWALLIMITS() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals("CRYPTO WITHDRAWAL LIMITS", getText(dr.getClientGroup().getCWLTitle()));
		dr.getClientGroup().getCWLDaily().clear();
		dr.getClientGroup().getCWLDaily().sendKeys("1");
		dr.getClientGroup().getCWLMonthly().clear();
		dr.getClientGroup().getCWLMonthly().sendKeys("11");
		dr.getClientGroup().getCWLYearly().clear();
		dr.getClientGroup().getCWLYearly().sendKeys("2000");
		dr.getClientGroup().getCWLTickbutton().click();
	}

	@Then("User Click on Symbols option and Verify the Page Title")
	public void userClickOnSymbolsOptionAndVerifyThePageTitle() {
		dr.getClientGroup().getSymbols().click();
		Assert.assertEquals("Symbols", getText(dr.getClientGroup().getSymbolsTitle()));
	}

	@Then("User Click on the Add Exclude sysmbols button and Verify the page title")
	public void userClickOnTheAddExcludeSysmbolsButtonAndVerifyThePageTitle() throws InterruptedException {
		dr.getClientGroup().getAddExcludeSymols().click();
		Thread.sleep(500);
		Assert.assertEquals("ADD EXCLUDE SYMBOL", getText(dr.getClientGroup().getAddExcludeTitle()));
	}

	@Then("Select a symbols form symbol Dropdown box")
	public void selectASymbolsFormSymbolDropdownBox() throws InterruptedException {
		elementWait();
		dr.getClientGroup().getSymbolsDrop().click();
		dr.getClientGroup().getSymbolInput().click();
	}

	@Then("Select a option from Mode Dropdown box")
	public void selectAOptionFromModeDropdownBox() {
		selectByValue("VIEW", dr.getClientGroup().getSymbolsMode());
	}

	@Then("Verify the Toast message for Adding symbol")
	public void verifyTheToastMessageForAddingSymbol() throws InterruptedException {
		Thread.sleep(2000);
		String ViewToastmsg = dr.getClientGroup().getViewToastmsg().getText();
		Assert.assertEquals("Symbol added successfully", getText(dr.getClientGroup().getViewToastmsg()));
		System.out.println(ViewToastmsg);
	}

	@Then("User click on Edit option and Verify the Edit form Title")
	public void userClickOnEditOptionAndVerifyTheEditFormTitle() {
		dr.getClientGroup().getEditOption().click();
		String EditSymbolsTitle = dr.getClientGroup().getEditSymbolsTitle().getText().toUpperCase();
		System.out.println(EditSymbolsTitle);
		Assert.assertEquals("EDIT EXCLUDE SYMBOL", dr.getClientGroup().getEditSymbolsTitle().getText().toUpperCase());
	}

	@Then("Select a Suspend option from Mode Dropdown box")
	public void selectASuspendOptionFromModeDropdownBox() throws InterruptedException {
		Thread.sleep(1000);
		selectByValue("SUSPEND", dr.getClientGroup().getSymbolsMode());
	}

	@Then("Enter Valid data on {string} Suspend Until feld")
	public void enterValidDataOnSuspendUntilFeld(String SuspendUntil) {
		dr.getClientGroup().getSuspendUntilField().clear();
		dr.getClientGroup().getSuspendUntilField().sendKeys(SuspendUntil);
	}

	@Then("Verify the Toast message for Editing symbol to Suspend")
	public void verifyTheToastMessageForEditingSymbolToSuspend() throws InterruptedException {
		Thread.sleep(500);
		String SuspendToastmsg = dr.getClientGroup().getSuspendToastmsg().getText();
		Assert.assertEquals("Symbol updated successfully", getText(dr.getClientGroup().getSuspendToastmsg()));
		System.out.println(SuspendToastmsg);
	}

	@Then("Select a Stop option from Mode Dropdown box")
	public void selectAStopOptionFromModeDropdownBox() {
		selectByValue("STOP", dr.getClientGroup().getStopModeoption());
	}

	@Then("User click on Delete option and Verify the Delete form Title")
	public void userClickOnDeleteOptionAndVerifyTheDeleteFormTitle() throws InterruptedException {
		dr.getClientGroup().getDelete().click();
		Thread.sleep(2000);
		String DeleteFormTitle = dr.getClientGroup().getDeleteFormTitle().getText();
		Assert.assertEquals("Delete", getText(dr.getClientGroup().getDeleteFormTitle()));
		System.out.println(DeleteFormTitle);
	}

	@Then("Click on Delete button")
	public void clickOnDeleteButton() {
		dr.getClientGroup().getDeleteButton().click();
	}

	@Then("Verify the Toast message for Deleting Sysmbol")
	public void verifyTheToastMessageForDeletingSysmbol() throws InterruptedException {
		Thread.sleep(2000);
		String DeleteToastmsg = dr.getClientGroup().getDeleteToastmsg().getText();
		System.out.println(DeleteToastmsg);
		Assert.assertEquals("Symbol deleted successfully", getText(dr.getClientGroup().getDeleteToastmsg()));
	}

	@Given("Verify the Toast message for Deleting the Client Group")
	public void verifyTheToastMessageForDeletingTheClientGroup() throws InterruptedException {
		Thread.sleep(2000);
		String ClientGroupToastmsg = dr.getClientGroup().getDeleteClientGroupToastmsg().getText();
		Assert.assertEquals("Client Group deleted successfully",
				getText(dr.getClientGroup().getDeleteClientGroupToastmsg()));
		System.out.println(ClientGroupToastmsg);
	}

	@Given("User Click on the Toggle and Verify the Status")
	public void userClickOnTheToggleAndVerifyTheStatus() throws InterruptedException {
		dr.getClientGroup().EnableDisableToggleButton();
	}

	@Given("User search on Name field and Verify Search data is appear on the page")
	public void userSearchOnNameFieldAndVerifySearchDataIsAppearOnThePage() throws InterruptedException {
		Thread.sleep(2000);
		dr.getClientGroup().ClientGroupSearch();
	}

	@Then("Click the cancel button")
	public void clickTheCancelButton() throws InterruptedException {
		dr.getClientGroup().getSearch().clear();
		refresh();
		Thread.sleep(2000);
	}

	@Given("User Click on the Audit Logs button and Verify the Page Title")
	public void userClickOnTheAuditLogsButtonAndVerifyThePageTitle() {
		dr.getClientGroup().getAuditLogs().click();
		String text = dr.getClientGroup().getAuditLogsTitle().getText();
		System.out.println(text);
		Assert.assertEquals("Audit Logs", text);
	}

	@Given("User select Create in method Dropdown box and Verify Created data is listed on the page")
	public void userSelectCreateInMethodDropdownBoxAndVerifyCreatedDataIsListedOnThePage() throws InterruptedException {
		selectByValue("CREATE", dr.getClientGroup().getAuditLogsDropdwn());
		Thread.sleep(3000);
		dr.getClientGroup().AuditLogs();
		dr.getClientGroup().getResetButton().click();
	}

	@Given("User select Update in method Dropdown box and verify Update data is listed on the page")
	public void userSelectUpdateInMethodDropdownBoxAndVerifyUpdateDataIsListedOnThePage() throws InterruptedException {
		selectByValue("UPDATE", dr.getClientGroup().getAuditLogsDropdwn());
		Thread.sleep(3000);
		dr.getClientGroup().AuditLogs();
		dr.getClientGroup().getResetButton().click();

	}

	@Given("User select Delete in method Dropdown box and verify Delete data is listed on the page")
	public void userSelectDeleteInMethodDropdownBoxAndVerifyDeleteDataIsListedOnThePage() throws InterruptedException {
		selectByValue("SOFT_DELETE", dr.getClientGroup().getAuditLogsDropdwn());
		Thread.sleep(3000);
		dr.getClientGroup().AuditLogs();
		dr.getClientGroup().getResetButton().click();

	}

	// Negative Scenario Negative Scenario Negative Scenario Negative Scenario

	@Given("Enter the Valid Data in Name Field")
	public void enterTheValidDataInNameField() {
		dr.getClientGroup().getName().sendKeys(RandomGroupName());
	}

	@Given("Enter the Valid Data in Slug Field")
	public void enterTheValidDataInSlugField() {
		dr.getClientGroup().getSlug().sendKeys(RandomText());
	}

	@Given("Enter the Valid Data in Description Field")
	public void enterTheValidDataInDescriptionField() {
		dr.getClientGroup().getDescription().sendKeys(RandomDesc());
	}

	@Then("User Verify the Error message appear on the form")
	public void userVerifyTheErrorMessageAppearOnTheForm() {
		dr.getClientGroup().SlugUnique();

	}

	@Given("Enter the InValid Data {string} in Name Field")
	public void enterTheInValidDataInNameField(String InvalidName) {
		dr.getClientGroup().getName().sendKeys(InvalidName);
	}

	@Given("Enter the InValid Data {string} in Slug Field")
	public void enterTheInValidDataInSlugField(String InvalidSlug) {
		dr.getClientGroup().getSlug().sendKeys(InvalidSlug);
	}

	@Given("Enter the InValid Data {string} in Description Field")
	public void enterTheInValidDataInDescriptionField(String InvalidDescription) {
		dr.getClientGroup().getDescription().sendKeys(InvalidDescription);
	}

	@Then("Verify the Error message on the Create Client Group form")
	public void verifyTheErrorMessageOnTheCreateClientGrouForm() {
		dr.getClientGroup().NamefieldErrormsg();
		dr.getClientGroup().SlugErrormsg();
	}

	@Then("Click on Cancel button")
	public void clickOnCancelButton() {
		dr.getClientGroup().getCancelClientGroup().click();
	}

	@Given("Verify the Error message appear for the Name field")
	public void verifyTheErrorMessageAppearForTheNameField() throws InterruptedException {
		dr.getClientGroup().NamefieldErrormsg();
		Thread.sleep(2000);
	}

	@Then("Click on the Cancel button and verify user is on the Client Page")
	public void clickOnTheCancelButtonAndVerifyUserIsOnTheClientPage() throws InterruptedException {
		dr.getClientGroup().getCancelbutton().click();
		Thread.sleep(2000);
		Assert.assertEquals("Client Groups", getText(dr.getClientGroup().getGroupsTitle()));
		String GroupsTitle = dr.getClientGroup().getGroupsTitle().getText();
		System.out.println(GroupsTitle);
	}

	@Given("Verify the Error message appear for the Slug field")
	public void verifyTheErrorMessageAppearForTheSlugField() {
		dr.getClientGroup().SlugErrormsg();
	}

	@Then("Click on the Close button and verify user is on the Client Page")
	public void clickOnTheCloseButtonAndVerifyUserIsOnTheClientPage() throws InterruptedException {
		dr.getClientGroup().getCloseButton().click();
		Thread.sleep(2000);
		Assert.assertEquals("Client Groups", getText(dr.getClientGroup().getGroupsTitle()));
		String GroupsTitle = dr.getClientGroup().getGroupsTitle().getText();
		System.out.println(GroupsTitle);
	}

	@Then("Clear the Data in Name Field")
	public void clearTheDataInNameField() {
		dr.getClientGroup().getName().clear();
	}

	@Then("Clear the Data in Slug Field")
	public void clearTheDataInSlugField() {
		dr.getClientGroup().getSlug().clear();
	}

	@Then("Clear the Data in Description Field")
	public void clearTheDataInDescriptionField() {
		dr.getClientGroup().getDescription().clear();
	}

	@Then("Verify the Error message on the Edit Client Group form")
	public void verifyTheErrorMessageOnTheEditClientGroupForm() {
		dr.getClientGroup().NamefieldErrormsg();
		dr.getClientGroup().SlugErrormsg();
	}

	@Then("Verify the Error message on the Add Member form")
	public void verifyTheErrorMessageOnTheAddMemberForm() throws InterruptedException {
		Thread.sleep(2000);
		String ClientErr = dr.getClientGroup().getClientErrormsg().getText();
		System.out.println(ClientErr);
		Assert.assertEquals("User is required field", getText(dr.getClientGroup().getClientErrormsg()));
	}

	@Then("Verify the Error message on the Add symbol form")
	public void verifyTheErrorMessageOnTheAddSymbolForm() {
		String SymbolErr = dr.getClientGroup().getSymbolsErr().getText();
		System.out.println(SymbolErr);
		Assert.assertEquals("Symbol is required field", dr.getClientGroup().getSymbolsErr().getText());

		String text = dr.getClientGroup().getModeFieldErmsg().getText();
		System.out.println(text);
		Assert.assertEquals("Mode is required field", text);
	}

	@Then("User search for {string} data in search field")
	public void userSearchForDataInSearchField(String Invalid) throws InterruptedException {
		Thread.sleep(1000);
		dr.getClientGroup().getSearch().sendKeys(Invalid);
		Thread.sleep(1000);
	}

	@Then("Verify the Invalid data is listed on the screen")
	public void verifyTheInvalidDataIsListedOnTheScreen() throws InterruptedException {
		dr.getClientGroup().getErrormsg().isDisplayed();
		System.out.println("No record found");
	}

	@Then("Verify the Suggestions Data")
	public void verifyTheSuggestionsData() {
		WebElement invalidSearch = dr.getClientGroup().getInvalidSearch();
		System.out.println("Invalid search in the Add Member Page " + invalidSearch.getText());
		invalidSearch.isDisplayed();
	}

	@Then("User enter {string} Data in symbol form")
	public void userEnterDataInSymbolForm(String Invalid) {
		dr.getClientGroup().getSymbolsinput().sendKeys(Invalid);
	}

	@Given("User Click on the Audit Logs Option and Verify the Page Title")
	public void userClickOnTheAuditLogsOptionAndVerifyThePageTitle() throws InterruptedException {
		Thread.sleep(1000);
		dr.getClientGroup().getAuditLogsPage().click();
		String text = dr.getClientGroup().getAuditLogsTitle().getText();
		Assert.assertEquals("Audit Logs", text);
		System.out.println(text);
	}

	@Given("User Click on the Group option and Verify the Page Title")
	public void userClickOnTheGroupOptionAndVerifyThePageTitle() throws InterruptedException {
		Thread.sleep(1000);
		dr.getClientGroup().getAuditLogsGroups().click();
		String text = dr.getClientGroup().getGroupsTitle().getText();
		Assert.assertEquals("Client Groups", text);
		System.out.println(text);
	}

	@Given("User Click on each Toggle button and Verify the Toast message")
	public void userClickOnEachToggleButtonAndVerifyTheToastMessage() throws InterruptedException {
		Thread.sleep(1000);
		dr.getClientGroup().ToggleButtonClick();
	}

	@Then("User select {string} in Client DropDown Box")
	public void userSelectInClientDropDownBox(String client) throws AWTException, InterruptedException {
		dr.getClientGroup().getClientDropdownCG().sendKeys(client);
		DownArrowPress();
	}

	@Then("Verify the Error message on Mode Field")
	public void verifyTheErrorMessageOnModeField() {
		String text = dr.getClientGroup().getModeFieldErmsg().getText();
		System.out.println(text);
		Assert.assertEquals("Mode is required field", text);
	}

	@Then("User click on the Toggle button randomly")
	public void userClickOnTheToggleButtonRandomly() throws InterruptedException {
		dr.getClientGroup().RandomToggleClick();
	}
	
	@Then("User enter {string} Data in Client form")
	public void userEnterDataInClientForm(String Invalid) {
		dr.getClientGroup().getClientDropdownCG().sendKeys(Invalid);
	}

}
