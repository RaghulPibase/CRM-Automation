package Page;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.math3.random.RandomData;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;
import io.netty.util.internal.ThreadLocalRandom;
import junit.framework.Assert;

public class ClientGroupsPages extends BaseClass {

	public ClientGroupsPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Client Group']")
	WebElement ClientGrp;

	@FindBy(xpath = "//*[text()='Client Groups']")
	WebElement GroupsTitle;

	@FindBy(xpath = "//button[text()='Create']")
	WebElement Createbutton;

	@FindBy(xpath = "//*[text()='Create Client Group']")
	WebElement Clientgrouptitle;

	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement Name;

	@FindBy(xpath = "//p[text()='Name is required field']")
	WebElement NamefieldErmsg;

	@FindBy(xpath = "//p[text()='Slug is required field']")
	WebElement SlugErmsg;

	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement CancelClientGroup;

	@FindBy(xpath = "//*[local-name()='svg' and @class='h-[25px] w-[25px] cursor-pointer']")
	WebElement CloseButton;

	@FindBy(xpath = "//input[@placeholder='Slug']")
	WebElement Slug;

	@FindBy(xpath = "//input[@placeholder='Description']")
	WebElement Description;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement Submitbutton;

	@FindBy(xpath = "//div[text()='Client Group created successfully']")
	WebElement Toastmsg;

	@FindBy(xpath = "(//td[@class='p-2 text-xs overflow-hidden truncate max-w-[200px]'])[1]")
	WebElement Createdgroup;

	@FindBy(xpath = "(//*[text()='More'])[1]")
	WebElement Morebutton;

	@FindBy(xpath = "//div[text()='Edit']")
	WebElement Editbutton;

	@FindBy(xpath = "//h1[text()='Edit Client Group']")
	WebElement EditformTitle;

	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement EditName;

	@FindBy(xpath = "//input[@placeholder='Slug']")
	WebElement EditSlug;

	@FindBy(xpath = "//input[@placeholder='Description']")
	WebElement EditDescription;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement EditSubmit;

	@FindBy(xpath = "//div[text()='Client Group updated successfully']")
	WebElement EnableDisableToastmsg;

	// VIEW FUNCTIONALITY IN CLIENT GROUP
	@FindBy(xpath = "(//span[text()='More'])[1]")
	WebElement More;

	@FindBy(xpath = "//div[text()='View']")
	WebElement View;

	@FindBy(xpath = "//h1[text()='Clients']")
	WebElement ClientgroupInformationTitle;

	// CLIENT PAGE
	@FindBy(xpath = "//button[text()='Add Member']")
	WebElement AddMember;

	@FindBy(xpath = "//h1[text()='Add Member']")
	WebElement AddMemberTitle;

	// Add Member in client page

	@FindBy(xpath = "//div[text()='Select Client']//parent::div//following::input")
	WebElement DrpdownAddMember;

	@FindBy(xpath = "//input[@role='combobox']")
	WebElement AddMemberClientDropdown;

	public WebElement getAddMemberClientDropdown() {
		return AddMemberClientDropdown;
	}

	@FindBy(xpath = "(//div[text()='Search Client']//parent::div//following::input)[1]")
	WebElement ClientDropdown;

	@FindBy(xpath = "(//div[text()='Select Client']//parent::div//following::input)[1]")
	WebElement ClientDropdownCG;

	public WebElement getClientDropdownCG() {
		return ClientDropdownCG;
	}

	@FindBy(xpath = "//p[text()='User is required field']")
	WebElement ClientErrormsg;

	@FindBy(xpath = "//div[text()='715 - Raghul Rajan']")
	WebElement Dropdownvalue;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement SubmitMember;

	@FindBy(xpath = "//div[text()='Member added successfully']")
	WebElement ToastmsgMember;

	@FindBy(xpath = "//tr[@class='hover:bg-[#fbfbfb]']")
	WebElement Addedmember;

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement Search;

	@FindBy(xpath = "//span[text()='More']")
	WebElement Moreoption;

	@FindBy(xpath = "//div[text()='Remove']")
	WebElement Remove;

	@FindBy(xpath = "//h3[text()='Remove']")
	WebElement RemoveTitle;

	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement Cancelbutton;

	@FindBy(xpath = "//span[text()='Remove']")
	WebElement RemoveButton;

	@FindBy(xpath = "//div[text()='Member removed successfully']")
	WebElement Toastmsgremove;

	// SPOT FEE PAGE
	@FindBy(xpath = "//div[text()='Spot Fees']")
	WebElement Spotfees;

	@FindBy(xpath = "//h1[text()='Spot Fees']")
	WebElement SpotfeesTitle;

	@FindBy(xpath = "//div[@class='relative flex items-center']")
	WebElement ToggleButton;

	@FindBy(xpath = "//button[@type='button' and @tabindex='0']")
	WebElement SpotfeeToggleButton;

	@FindBy(xpath = "(//div[@class='cursor-pointer self-center'])[1]")
	WebElement Editbut;

	@FindBy(xpath = "//input[@placeholder='Balance']")
	WebElement SpotfeeBalance;

	@FindBy(xpath = "(//*[local-name()='svg' and @fill='currentColor'])[16]")
	WebElement SpotfeeOperators;

	@FindBy(xpath = "//div[@class='relative mt-1']//child::button")
	WebElement SpotfeeOption;

	@FindBy(xpath = "//input[@placeholder='Volume']")
	WebElement SpotfeeVolume;

	@FindBy(xpath = "//input[@placeholder='Taker Commission']")
	WebElement TakerCommission;

	@FindBy(xpath = "//input[@placeholder='Maker Commission']")
	WebElement MakerCommission;

//	@FindBy(xpath = "(//*[local-name()='svg' and @fill='currentColor'])[16]")
	@FindBy(xpath = "//div[@class='grid grid-cols-2']//div[2]")
	WebElement Tickbutton;

	// LEVEL LIMIT PAGE
	@FindBy(xpath = "//div[text()='Level Limits']")
	WebElement LevelLimit;

	@FindBy(xpath = "//h1[text()='Level Limits']")
	WebElement LevelLimitTitle;

	@FindBy(xpath = "//button[@type='button' and @tabindex='0']")
	WebElement LevelLimitToastbutton;

	@FindBy(xpath = "//div[text()=\"Crypto withdrawal limits\"]")
	WebElement CWLTitle;

	@FindBy(xpath = "(//div[@class='cursor-pointer self-center'])[1]")
	WebElement CWLEdit;

	@FindBy(xpath = "(//*[@placeholder='Type'])[1]")
	WebElement CWLDaily;

	@FindBy(xpath = "(//*[@placeholder='Type'])[2]")
	WebElement CWLMonthly;

	@FindBy(xpath = "(//*[@placeholder='Type'])[3]")
	WebElement CWLYearly;

	@FindBy(xpath = "(//*[local-name()='svg' and @fill='currentColor'])[15]")
	WebElement CWLTickbutton;

	// SYMBOLS PAGE
	@FindBy(xpath = "//div[text()='Symbols']")
	WebElement Symbols;

	@FindBy(xpath = "//h1[text()='Symbols']")
	WebElement SymbolsTitle;

	@FindBy(xpath = "//button[text()='Add Exclude Symbol']")
	WebElement AddExcludeSymols;

	@FindBy(xpath = "//h1[text()='Add Exclude Symbol']")
	WebElement AddExcludeTitle;

	/*
	 * @FindBy(xpath =
	 * "//label//ancestor::div//child::*[local-name()='svg' and @class='css-8mmkcg']"
	 * ) WebElement SymbolsDrop;
	 */

	@FindBy(xpath = "//div[@class=' css-19bb58m']//input")
	WebElement SymbolsDrop;

	@FindBy(xpath = "//input[@aria-expanded='false']")
	WebElement Symbolsinput;

	@FindBy(xpath = "//a[text()='Audit Logs']")
	WebElement AuditLogsPage;

	@FindBy(xpath = "//a[text()='Groups']")
	WebElement AuditLogsGroups;

	@FindBy(xpath = "//div[text()='BTCUSD']")
	WebElement SymbolInput;

	@FindBy(xpath = "//select[@id='small']")
	WebElement Symbolsoptions;

	@FindBy(xpath = "//select[@id='small']")
	WebElement SymbolsMode;

	@FindBy(xpath = "//span[text()='VIEW']")
	WebElement SymbolsViewOptions;

	@FindBy(xpath = "//p[text()='Symbol is required field']")
	WebElement SymbolsErr;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement SymbolsSubmit;

	@FindBy(xpath = "//div[text()='Symbol added successfully']")
	WebElement ViewToastmsg;

	@FindBy(xpath = "//span[text()='More']")
	WebElement ViewMoreOption;

	@FindBy(xpath = "//div[text()='Edit']")
	WebElement EditOption;

	@FindBy(xpath = "//h1[text()='Edit Exclude Symbol']")
	WebElement EditSymbolsTitle;

	@FindBy(xpath = "(//*[local-name()='svg' and @fill='currentColor'])[15]")
	WebElement SuspendMoreButton;

	@FindBy(xpath = "//span[text()='SUSPEND']")
	WebElement Suspend;

	@FindBy(xpath = "//input[@placeholder='Suspend until']")
	WebElement SuspendUntilField;

	@FindBy(xpath = "//div[text()='Symbol updated successfully']")
	WebElement SuspendToastmsg;

	// STOP OPTION

	@FindBy(xpath = "//div[@class='flex']//span[text()='More']")
	WebElement StopMorebutton;

	@FindBy(xpath = "(//div[@role='menuitem'])[1]")
	WebElement StopEditButton;

	@FindBy(xpath = "(//label[text()='mode'])//parent::div//select")
	WebElement StopModeoption;

	@FindBy(xpath = "//div[text()='Symbol updated successfully']")
	WebElement StopToastmsg;

	@FindBy(xpath = "//div[text()='Delete']")
	WebElement Delete;

	@FindBy(xpath = "//h3[text()='Delete']")
	WebElement DeleteFormTitle;

	@FindBy(xpath = "//span[text()='Delete']")
	WebElement DeleteButton;

	@FindBy(xpath = "//div[text()='Symbol deleted successfully']")
	WebElement DeleteToastmsg;

	@FindBy(xpath = "//div[text()='Delete']")
	WebElement DeleteOption;

	@FindBy(xpath = "//h3[text()='Delete']")
	WebElement DeleteClientGroup;

	@FindBy(xpath = "//span[text()='Delete']")
	WebElement DeleteButtonClientgroup;

	@FindBy(xpath = "//div[text()='Client Group deleted successfully']")
	WebElement DeleteClientGroupToastmsg;

	@FindBy(xpath = "//div[@class='Toastify__toast-body' and @role='alert']")
	WebElement ToastMessage;

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]'])[1]//td[1]")
	WebElement FirstRowName;

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]'])[2]//td[1]")
	WebElement SecRowName;

	@FindBy(xpath = "//table[@class='w-full table-auto']//td[1]")
	List<WebElement> ClientGroupTable;

	@FindBy(xpath = "//nav//ul[@class='xs:mt-0 mt-2 inline-flex items-center -space-x-px']")
	List<WebElement> Pagenation;

	@FindBy(xpath = "//p[text()='Value should be unique']")
	WebElement SlugErrormsg;

	@FindBy(xpath = "(//div[@class='relative mb-3 w-full'])[2]")
	WebElement SlugBox;

	@FindBy(xpath = "//h2[text()='No Client Group found']")
	WebElement ErrorMsgClientGroupPage;

	@FindBy(xpath = "//h2[text()='No Symbol found']")
	WebElement SymbolErrmsg;

	@FindBy(xpath = "//button[text()='Audit Logs']")
	WebElement AuditLogs;

	@FindBy(xpath = "//select[@id='small']")
	WebElement AuditLogsDropdwn;

	@FindBy(xpath = "//h1[text()='Audit Logs']")
	WebElement AuditLogsTitle;

	@FindBy(xpath = "//button[text()='Reset']")
	WebElement ResetButton;

	@FindBy(xpath = "//tr[@class='hover:bg-[#fbfbfb]']//td[3]")
	WebElement MethodsStatus;

	@FindBy(xpath = "(//nav//ul[@class='xs:mt-0 mt-2 inline-flex items-center -space-x-px'])[1]//button")
	WebElement AuditLogsPagination;

	@FindBy(xpath = "//div[text()='No options']")
	WebElement InvalidSearch;

	@FindBy(xpath = "//p[text()='Mode is required field']")
	WebElement ModeFieldErmsg;

	@FindBy(xpath = "//p[text()='No records found.']")
	WebElement Errormsg;

	public WebElement getAuditLogsPage() {
		return AuditLogsPage;
	}

	public WebElement getSymbolsinput() {
		return Symbolsinput;
	}

	public WebElement getAuditLogsGroups() {
		return AuditLogsGroups;
	}

	public WebElement getSymbolErrmsg() {
		return SymbolErrmsg;
	}

	public WebElement getModeFieldErmsg() {
		return ModeFieldErmsg;
	}

	public WebElement getErrormsg() {
		return Errormsg;
	}

	public WebElement getInvalidSearch() {
		return InvalidSearch;
	}

	public WebElement getNamefieldErmsg() {
		return NamefieldErmsg;
	}

	public WebElement getSlugErmsg() {
		return SlugErmsg;
	}

	public WebElement getCancelClientGroup() {
		return CancelClientGroup;
	}

	public WebElement getCloseButton() {
		return CloseButton;
	}

	public WebElement getClientGrp() {
		return ClientGrp;
	}

	public WebElement getGroupsTitle() {
		return GroupsTitle;
	}

	public WebElement getCreatebutton() {
		return Createbutton;
	}

	public WebElement getClientgrouptitle() {
		return Clientgrouptitle;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getSlug() {
		return Slug;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getSubmitbutton() {
		return Submitbutton;
	}

	public WebElement getToastmsg() {
		return Toastmsg;
	}

	public WebElement getCreatedgroup() {
		return Createdgroup;
	}

	public WebElement getDrpdownAddMember() {
		return DrpdownAddMember;
	}

	public WebElement getMorebutton() {
		return Morebutton;
	}

	public WebElement getEditbutton() {
		return Editbutton;
	}

	public WebElement getEditformTitle() {
		return EditformTitle;
	}

	public WebElement getEditName() {
		return EditName;
	}

	public WebElement getEditSlug() {
		return EditSlug;
	}

	public WebElement getEditDescription() {
		return EditDescription;
	}

	public WebElement getEditSubmit() {
		return EditSubmit;
	}

	public WebElement getEnableDisableToastmsg() {
		return EnableDisableToastmsg;
	}

	public WebElement getToggleButton() {
		return ToggleButton;
	}

	public WebElement getSecRowName() {
		return SecRowName;
	}

	public WebElement getClientErrormsg() {
		return ClientErrormsg;
	}

	public WebElement getSymbolsErr() {
		return SymbolsErr;
	}

	public WebElement getEditSymbolsTitle() {
		return EditSymbolsTitle;
	}

	public WebElement getDeleteClientGroup() {
		return DeleteClientGroup;
	}

	public WebElement getDeleteButtonClientgroup() {
		return DeleteButtonClientgroup;
	}

	public WebElement getMore() {
		return More;
	}

	public WebElement getView() {
		return View;
	}

	public WebElement getClientgroupInformationTitle() {
		return ClientgroupInformationTitle;
	}

	public WebElement getAddMember() {
		return AddMember;
	}

	public WebElement getAddMemberTitle() {
		return AddMemberTitle;
	}

	public WebElement getClientDropdown() {
		return ClientDropdown;
	}

	public WebElement getDropdownvalue() {
		return Dropdownvalue;
	}

	public WebElement getSubmitMember() {
		return SubmitMember;
	}

	public WebElement getToastmsgMember() {
		return ToastmsgMember;
	}

	public WebElement getAddedmember() {
		return Addedmember;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getMoreoption() {
		return Moreoption;
	}

	public WebElement getRemove() {
		return Remove;
	}

	public WebElement getRemoveTitle() {
		return RemoveTitle;
	}

	public WebElement getCancelbutton() {
		return Cancelbutton;
	}

	public WebElement getRemoveButton() {
		return RemoveButton;
	}

	public WebElement getToastmsgremove() {
		return Toastmsgremove;
	}

	public WebElement getSpotfees() {
		return Spotfees;
	}

	public WebElement getSpotfeesTitle() {
		return SpotfeesTitle;
	}

	public WebElement getSpotfeeToggleButton() {
		return SpotfeeToggleButton;
	}

	public WebElement getEditbut() {
		return Editbut;
	}

	public WebElement getSpotfeeBalance() {
		return SpotfeeBalance;
	}

	public WebElement getSpotfeeOperators() {
		return SpotfeeOperators;
	}

	public WebElement getSpotfeeOption() {
		return SpotfeeOption;
	}

	public WebElement getSpotfeeVolume() {
		return SpotfeeVolume;
	}

	public WebElement getTakerCommission() {
		return TakerCommission;
	}

	public WebElement getMakerCommission() {
		return MakerCommission;
	}

	public WebElement getTickbutton() {
		return Tickbutton;
	}

	public WebElement getLevelLimit() {
		return LevelLimit;
	}

	public WebElement getLevelLimitTitle() {
		return LevelLimitTitle;
	}

	public WebElement getLevelLimitToastbutton() {
		return LevelLimitToastbutton;
	}

	public WebElement getCWLTitle() {
		return CWLTitle;
	}

	public WebElement getCWLEdit() {
		return CWLEdit;
	}

	public WebElement getCWLDaily() {
		return CWLDaily;
	}

	public WebElement getCWLMonthly() {
		return CWLMonthly;
	}

	public WebElement getCWLYearly() {
		return CWLYearly;
	}

	public WebElement getCWLTickbutton() {
		return CWLTickbutton;
	}

	public WebElement getSymbols() {
		return Symbols;
	}

	public WebElement getSymbolsTitle() {
		return SymbolsTitle;
	}

	public WebElement getAddExcludeSymols() {
		return AddExcludeSymols;
	}

	public WebElement getAddExcludeTitle() {
		return AddExcludeTitle;
	}

// Symbol Field
	public WebElement getSymbolsDrop() {
		return SymbolsDrop;
	}

	public WebElement getSymbolInput() {
		return SymbolInput;
	}

	public WebElement getSymbolsoptions() {
		return Symbolsoptions;
	}

// Symbol Mode Field
	public WebElement getSymbolsMode() {
		return SymbolsMode;
	}

	public WebElement getSymbolsViewOptions() {
		return SymbolsViewOptions;
	}

	// Symbol submit button
	public WebElement getSymbolsSubmit() {
		return SymbolsSubmit;
	}

	public WebElement getViewToastmsg() {
		return ViewToastmsg;
	}

	public WebElement getViewMoreOption() {
		return ViewMoreOption;
	}

	public WebElement getEditOption() {
		return EditOption;
	}

	public WebElement getSuspendMoreButton() {
		return SuspendMoreButton;
	}

	public WebElement getSuspend() {
		return Suspend;
	}

	public WebElement getSuspendUntilField() {
		return SuspendUntilField;
	}

	public WebElement getSuspendToastmsg() {
		return SuspendToastmsg;
	}

	public WebElement getStopMorebutton() {
		return StopMorebutton;
	}

	public WebElement getStopEditButton() {
		return StopEditButton;
	}

	public WebElement getStopModeoption() {
		return StopModeoption;
	}

	public WebElement getStopToastmsg() {
		return StopToastmsg;
	}

	public WebElement getDelete() {
		return Delete;
	}

	public WebElement getDeleteFormTitle() {
		return DeleteFormTitle;
	}

	public WebElement getDeleteButton() {
		return DeleteButton;
	}

	public WebElement getDeleteToastmsg() {
		return DeleteToastmsg;
	}

	public WebElement getDeleteOption() {
		return DeleteOption;
	}

	public WebElement getDeleteClientGroupToastmsg() {
		return DeleteClientGroupToastmsg;
	}

	public WebElement getToastMessage() {
		return ToastMessage;
	}

	public WebElement getFirstRowName() {
		return FirstRowName;
	}

	public List<WebElement> getClientGroupTable() {
		return ClientGroupTable;
	}

	public List<WebElement> getPagenation() {
		return Pagenation;
	}

	public WebElement getErrorMsgClientGroupPage() {
		return ErrorMsgClientGroupPage;
	}

	public WebElement getSlugErrormsg() {
		return SlugErrormsg;
	}

	public WebElement getSlugBox() {
		return SlugBox;
	}

	public WebElement getAuditLogs() {
		return AuditLogs;
	}

	public WebElement getAuditLogsDropdwn() {
		return AuditLogsDropdwn;
	}

	public WebElement getAuditLogsTitle() {
		return AuditLogsTitle;
	}

	public WebElement getResetButton() {
		return ResetButton;
	}

	public WebElement getMethodsStatus() {
		return MethodsStatus;
	}

	public WebElement getAuditLogsPagination() {
		return AuditLogsPagination;
	}

	public void NamefieldErrormsg() {
		String ExpectedName = "Name is required field";
		String ActualName = getNamefieldErmsg().getText();
		if (ActualName.contains(ExpectedName)) {
			System.out.println(ActualName);
		} else {
			System.out.println("Error Not Found " + ActualName);
		}
	}

	public void SlugErrormsg() {
		String ExpectedSlug = "Slug is required field";
		String ActualSlug = getSlugErmsg().getText();
		if (ActualSlug.contains(ExpectedSlug)) {
			System.out.println(ActualSlug);
		} else {
			System.out.println(ActualSlug);
		}
	}

	public void ToggleButton() {
		if (getToggleButton().isEnabled()) {
			System.out.println("Toggle Button Status Active");
		} else {
			getToggleButton().click();
		}
	}

	public void EnableDisableToggleButton() throws InterruptedException {
		WebElement AttributeTogglebut = driver.findElement(By.xpath("(//button[@role='switch'])[1]"));
		String Attribute = AttributeTogglebut.getAttribute("aria-checked");
		String ExpectedAttribute = "false";

		if (Attribute.equals(ExpectedAttribute)) {

			WebElement togglebutton = driver.findElement(By.xpath("(//button[@role='switch'])[1]"));
			togglebutton.click();
			Thread.sleep(2000);

			String ToastMSG = driver.findElement(By.xpath("//div[text()='Client Group updated successfully']"))
					.getText();
			Assert.assertEquals("Client Group updated successfully", ToastMSG);
			System.out.println(ToastMSG);
			Thread.sleep(2000);

			WebElement ToggleButFalse = driver.findElement(By.xpath("(//button[@role='switch'])[1]"));
			Thread.sleep(2000);
			String AttributeFalse = ToggleButFalse.getAttribute("aria-checked");

			if (AttributeFalse.equals(ExpectedAttribute)) {
				throw new RuntimeException("Toggle is not working");
			}
		} else {

			WebElement togglebutton = driver.findElement(By.xpath("(//button[@role='switch'])[1]"));
			togglebutton.click();
			Thread.sleep(2000);

			String ToastMSG = driver.findElement(By.xpath("//div[text()='Client Group updated successfully']"))
					.getText();
			Assert.assertEquals("Client Group updated successfully", ToastMSG);
			Thread.sleep(2000);
			System.out.println(ToastMSG);

			WebElement ToggleButTrue = driver.findElement(By.xpath("(//button[@role='switch'])[1]"));
			Thread.sleep(2000);
			String AttributeTrue = ToggleButTrue.getAttribute("aria-checked");

			if (!AttributeTrue.equals(ExpectedAttribute)) {
				throw new RuntimeException("Toggle is not working");
			}

		}

	}


	// Toggle Button ---> Spot Fee & Level Limit
	public void ToggleButtonSpotLevel() throws InterruptedException {
		WebElement ToggleSpot = driver.findElement(By.xpath("(//button[@role='switch'])[1]"));
		String Attribute = ToggleSpot.getAttribute("aria-checked");
		String ExpectedAttribute = "false";

		if (Attribute.equals(ExpectedAttribute)) {

			WebElement togglebutton = driver.findElement(By.xpath("(//button[@role='switch'])[1]"));
			togglebutton.click();
			Thread.sleep(2000);

			WebElement ToggleButFalse = driver.findElement(By.xpath("(//button[@role='switch'])[1]"));
			Thread.sleep(2000);
			String AttributeFalse = ToggleButFalse.getAttribute("aria-checked");

			if (AttributeFalse.equals(ExpectedAttribute)) {
				throw new RuntimeException("Toggle is not working");
			}
		} else {
			WebElement togglebutton = driver.findElement(By.xpath("(//button[@role='switch'])[1]"));
			togglebutton.click();
			Thread.sleep(2000);

			WebElement ToggleButTrue = driver.findElement(By.xpath("(//button[@role='switch'])[1]"));
			Thread.sleep(2000);
			String AttributeTrue = ToggleButTrue.getAttribute("aria-checked");

			if (!AttributeTrue.equals(ExpectedAttribute)) {
				throw new RuntimeException("Toggle is not working");
			}

		}
	}

	public void SearchDataIsAvalilable() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> ClientGroupTable = getClientGroupTable();
//		List<WebElement> pagenation = getPagenation();

		for (WebElement Search : ClientGroupTable) {
			if (Search.getText().equals("Group 17")) {
				assertTrue(true);
			} else {
				assertTrue(false);
			}
		}
	}

	public void InvalidSearch() throws InterruptedException {

	}

	public void Invalid() {
		List<WebElement> Table = getClientGroupTable();
		String ClientGroup = getErrorMsgClientGroupPage().getText();
		String Symbols = getSymbolErrmsg().getText();
		for (WebElement Search : Table) {
			if (Search.getText().equals("@#4")) {
				assertTrue(true);
			} else if (Search.getText().equals("@#4")) {
				Assert.assertEquals("No Client Group found", ClientGroup);
				System.out.println(ClientGroup);
			} else {
				Assert.assertEquals("No Symbol found", Symbols);
				System.out.println(Symbols);
			}
		}
	}

	public void SlugUnique() {
		WebElement Actual = driver.findElement(By.xpath("//p[text()='Value should be unique']"));
		WebElement Expected = driver.findElement(By.xpath("(//div[@class='relative mb-3 w-full'])[2]"));

		if (Expected.getText().contains("Value should be unique")) {
			if (Actual.getText().contains("Value should be unique")) {
				driver.findElement(By.xpath("//input[@placeholder='Slug']")).clear();
				driver.findElement(By.xpath("//input[@placeholder='Slug']")).sendKeys(RandomText());
				driver.findElement(By.xpath("//span[text()='Submit']")).click();
			}
		} else {
			System.out.println("Submited");
		}
	}

	public void SymbolsData() {
		String Symbols[] = { "BTCUSD", "ETHUSD", "ADAUSDT", "SHIBUSD", "SOLUSD" };
		Random random = new Random();
		String Groupname = Symbols[random.nextInt(Symbols.length)];
	}

	public void clientSubmit() {
		WebElement Submit = driver.findElement(By.xpath("//span[text()='Submit']"));
		Submit.click();
		if (Submit.equals(SlugErrormsg)) {
			driver.findElement(By.xpath("//input[@placeholder='Slug']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Slug']")).sendKeys(RandomText());
			driver.findElement(By.xpath("//span[text()='Submit']")).click();
		} else {
			System.out.println("****************************");
		}
	}

	public WebElement AddMembersDropdowns(String dataText) {
		String text = dataText;
		WebElement textElement = driver.findElement(By.xpath("//div[contains(text(),'" + text + "')]"));
		return textElement;
	}

	public void AuditLogsStatusCreate() {
		List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[3]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement List : options) {
			String values = List.getText();
			dr.add(values);
		}
		String expected = "CREATE";
		boolean allMatch = false;
		for (String actual : dr) {
			if (actual.contains(expected)) {
				allMatch = true;
				break;
			}
		}
		if (allMatch) {
			System.out.println("All cell contents match the expected content: " + expected);
		} else {
			throw new RuntimeException("Audit Log For Update Method needs to be validated");
		}
	}

	public void AuditLogs() {
		String Actual = driver.findElement(By.xpath("//label[text()='Method']//parent::div//child::select")).getText();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<WebElement> AuditLogs = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[3]"));

		if (AuditLogs.size() != 0) {

			for (WebElement option : AuditLogs) {

				if (!option.getText().equalsIgnoreCase(Actual)) {

					System.out.println("Expected => " + Actual + "  Actual => " + option.getText());
				}
			}
		} else {
			System.out.println("No records found");
		}

	}

	public static void ClientGroupSearch() throws InterruptedException {

		List<WebElement> NameColumn = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[1]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement Column : NameColumn) {
			String values = Column.getText();
			dr.add(values);
		}
		String[] stringArray = new String[dr.size()];
		for (int i = 0; i < dr.size(); i++) {
			stringArray[i] = String.valueOf(dr.get(i));
		}
		Random random = new Random();
		String Name = stringArray[random.nextInt(stringArray.length)];

		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		Search.sendKeys(Name);
		System.out.println(Name);
		Thread.sleep(2000);
		WebElement Actual = driver.findElement(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[1]"));
		String text = Actual.getText();
		System.out.println(text);

		if (text.equals(Name)) {
			System.out.println("Searched Client Group is listed on the page ");
		} else {
			throw new RuntimeException("Client Group is not listed on the page ");
		}
	}

	public static void ClientSearch() throws InterruptedException {
		List<WebElement> NameColumn = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[1]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement Column : NameColumn) {
			String values = Column.getText();
			dr.add(values);
		}
		String[] stringArray = new String[dr.size()];
		for (int i = 0; i < dr.size(); i++) {
			stringArray[i] = String.valueOf(dr.get(i));
		}
		Random random = new Random();
		String Name = stringArray[random.nextInt(stringArray.length)];

		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		Search.sendKeys(Name);
		Thread.sleep(2000);
		WebElement Actual = driver.findElement(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[1]"));
		String text = Actual.getText();
		if (text.equals(Name)) {
			System.out.println("Searched Client Group is listed on the page ");
		} else {
			throw new RuntimeException("Client Group is not listed on the page ");
		}
	}

	public void ToggleButtonClick() throws InterruptedException {
		List<WebElement> findElement = driver
				.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//div[@class='p-2 text-xs']//div//button"));

		for (WebElement ToggleClick : findElement) {
			elementWait();
			ToggleClick.click();
			Thread.sleep(500);
		}
	}

	public void RandomToggleClick() throws InterruptedException {

		for (int i = 1; i <= 10; i++) {
			SpotfeeToggleButton.click();
			Thread.sleep(50);
		}
	}

}
