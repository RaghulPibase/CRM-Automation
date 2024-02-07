package Page;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import BaseClass.BaseClass;

public class SupportTicketPage extends BaseClass {

	public SupportTicketPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement TicketSubmit;

	@FindBy(xpath = "//span[text()='Support Ticket']")
	WebElement SupportTicket;

	@FindBy(xpath = "//span[text()='Tickets']")
	WebElement Tickets;

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement Search;

	@FindBy(xpath = "//table[@class='w-full table-auto']//td[1]")
	List<WebElement> TicketTable;

	@FindBy(xpath = "//span[text()='More']")
	WebElement FirstRowMoreButton;

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]'])[1]//td[1]")
	WebElement TicketIDcrm;

	@FindBy(xpath = "//tr[@class='hover:bg-[#fbfbfb]']")
	WebElement FirstrowCRM;

	@FindBy(xpath = "(//td[@class='p-2 text-xs overflow-hidden truncate max-w-[200px]'])[1]")
	WebElement CRMTicketID;

	@FindBy(xpath = "(//td[@class='p-2 text-xs overflow-hidden truncate max-w-[200px]'])[8]")
	WebElement FirstRowTime;

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]'])[1]//td[2]")
	WebElement TicketAssignee;

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]'])[1]//td[3]")
	WebElement TicketClient;

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]'])[1]//td[4]")
	WebElement TicketTitlecrm;

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]'])[1]//td[5]")
	WebElement TicketDesCrm;

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]'])[1]//td[6]")
	WebElement TicketStatusCRM;

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]'])[1]//td[7]")
	WebElement TicketPriorityCrm;

	@FindBy(xpath = "//span[text()='More']")
	WebElement MoreButton;

	@FindBy(xpath = "//div[text()='Edit']")
	WebElement EditButton;

	@FindBy(xpath = "//h1[text()='Edit Support Ticket']")
	WebElement EditFormTitle;

	@FindBy(xpath = "(//label[text()='Status'])//parent::div//select")
	WebElement StatusDropdown;

	@FindBy(xpath = "//span[text()='OPEN']")
	WebElement StatusOpen;

	@FindBy(xpath = "//span[text()='CLOSED']")
	WebElement StatusClose;

	@FindBy(xpath = "(//label[text()='Priority'])//parent::div//select")
	WebElement PriorityDropdown;

	@FindBy(xpath = "//span[text()='LOW']")
	WebElement LowPriority;

	@FindBy(xpath = "//span[text()='MEDIUM']")
	WebElement MediumPriority;

	@FindBy(xpath = "//span[text()='HIGH']")
	WebElement HighPriority;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement EditSubmit;

	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement EditCancel;

	@FindBy(xpath = "//*[local-name()='svg' and @class='h-[25px] w-[25px] cursor-pointer']")
	WebElement EditFormCrossCancel;

	@FindBy(xpath = "//div[text()='Ticket updated successfully']")
	WebElement TicketupdatedsuccessfullyToastmsg;

	@FindBy(xpath = "//div[text()='Assign']")
	WebElement AssignButton;

	@FindBy(xpath = "//h1[text()='Assign']")
	WebElement AssignFormTitle;

	@FindBy(xpath = "//*[local-name()='svg' and @class='h-5 w-5 text-gray-400']")
	WebElement AssigneeDropdownbutton;
	
	@FindBy (xpath ="//span[text()='Client']//parent::div//following::div[text()='Search Client']//parent::div//child::input")
	WebElement ClientDrpdwn;

	/*
	 * @FindBy(xpath = "//span[text()='Raghul R']") WebElement AssigneeOptions;
	 * 
	 * @FindBy(xpath = "//ul[@role='listbox']//li//span") WebElement AssignOpt;
	 */

	/*
	 * @FindBy(xpath = "//div[@class='relative mt-1']//div//input") WebElement
	 * AssigneDropdown;
	 */
	
	public WebElement getClientDrpdwn() {
		return ClientDrpdwn;
	}

	@FindBy(xpath ="//div[text()='Select Assignee']//parent::div//following::input")
	WebElement AssignDropdownST;
	
	@FindBy (xpath ="//span[text()='Assignee']//parent::div//following::div[text()='Search Assignee']//parent::div//child::input")
	WebElement AssigneeDropdownST;

	public WebElement getAssigneeDropdownST() {
		return AssigneeDropdownST;
	}

	public WebElement getAssignDropdownST() {
		return AssignDropdownST;
	}

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement AssignSubmit;

	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement AssignCancel;

	@FindBy(xpath = "//*[local-name()='svg' and @class='h-[25px] w-[25px] cursor-pointer']")
	WebElement AssignFormCrossCancel;

	@FindBy(xpath = "//div[text()='View']")
	WebElement ViewButton;

	@FindBy(xpath = "//h1[text()='Support Ticket Information']")
	WebElement InformationpageTitle;

	@FindBy(xpath = "//div[text()='Information']")
	WebElement Information;

	@FindBy(xpath = "(//dt[text()='Ticket Id']//following::*[@class='mt-1 text-sm text-gray-900 sm:col-span-2 sm:mt-0'])[1]")
	WebElement TicketIDInfo;

	@FindBy(xpath = "(//dt[text()='Ticket Id']//following::*[@class='mt-1 text-sm text-gray-900 sm:col-span-2 sm:mt-0'])[2]")
	WebElement TicketClientInfo;

	@FindBy(xpath = "(//dt[text()='Ticket Id']//following::*[@class='mt-1 text-sm text-gray-900 sm:col-span-2 sm:mt-0'])[3]")
	WebElement TicketTitleInfo;

	@FindBy(xpath = "(//dt[text()='Ticket Id']//following::*[@class='mt-1 text-sm text-gray-900 sm:col-span-2 sm:mt-0'])[4]")
	WebElement TicketDescInfo;

	@FindBy(xpath = "//*[@id=\"headlessui-tabs-panel-:rcq:\"]/div/div[2]/div[2]/img")
	WebElement ImgInfo;

	@FindBy(xpath = "//div[text()='Messages']")
	WebElement Messages;

	@FindBy(xpath = "//input[@placeholder='message']")
	WebElement ChatField;

	@FindBy(xpath = "//*[local-name()='svg' and @class='cursor-pointer self-center']")
	WebElement FileUploadField;

	@FindBy(xpath = "//*[local-name()='svg' and @class='rotate-90 cursor-pointer self-center']")
	WebElement MsgSendButton;

	@FindBy(xpath = "//img[@class='rounded-[10px]']")
	WebElement Image;

	@FindBy(xpath = "//div[text()='Histories']")
	WebElement Histories;

	@FindBy(xpath = "//h1[text()='Ticket Histories']")
	WebElement HistoriesPageTitle;

	@FindBy(xpath = "(//div[@class='track_tiltle'])[1]")
	WebElement TrackTitle;

	@FindBy(xpath = "//div[text()='Support Ticket Created']")
	WebElement SupportTicketCreated;

	@FindBy(xpath = "//div[text()='Support Ticket closed']")
	WebElement SupportTicketclosed;

	@FindBy(xpath = "//div[text()='Assignee Updated']")
	WebElement AssigneeUpdated;

	@FindBy(xpath = "//div[text()='Priority Changed to medium']")
	WebElement PriorityChangedtoMedium;

	@FindBy(xpath = "//div[text()='Priority Changed to low']")
	WebElement PriorityChangedtolow;

	@FindBy(xpath = "//div[text()='Priority Changed to high']")
	WebElement PriorityChangedtohigh;

	@FindBy(xpath = "//h1[text()='Edit Support Ticket']")
	WebElement EditSupportTicket;

	@FindBy(xpath = "//option[text()='CLOSED']")
	WebElement CloseStatus;

	@FindBy(xpath = "//option[text()='LOW']")
	WebElement PriorityLow;

	@FindBy(xpath = "//option[text()='MEDIUM']")
	WebElement PriorityMedium;

	@FindBy(xpath = "//option[text()='HIGH']")
	WebElement PriorityHigh;

	@FindBy(xpath = "//div[text()='Ticket updated successfully']")
	WebElement TicketupdateToast;

	@FindBy(xpath = "//div[text()=\"Assignee updated successfully\"]")
	WebElement AssigneeToastmsg;

	@FindBy(xpath = "(//div[@class='col-start-3 col-span-8'])[1]")
	WebElement MSGField;

	@FindBy(xpath = "(//div[@class='flex justify-end']//div)[1]")
	WebElement ChatMSG;

	@FindBy(xpath = "//div[@class='flex justify-end']//div[@class='max-h-[200px] max-w-[200px] rounded-md']")
	WebElement ChatBoxImage;

	@FindBy(xpath = "//tr[@class='hover:bg-[#fbfbfb]']//td[4]")
	WebElement SearchByTitle;
	
	@FindBy (xpath ="//p[text()='Assignee is required field']")
	WebElement AssignErr;
	
	/*
	 * @FindBy (xpath ="//label[text()='Assignee']//parent::div//following::input")
	 * WebElement Assigninput;
	 */
	
	@FindBy (xpath ="(//div[text()='Search Assignee']//parent::div//following::input[@role='combobox'])[2]")
	WebElement Assigninput;
	
	@FindBy (xpath ="//div[text()='Nothing found.']")
	WebElement AssignfieldErrormsg;
	
	@FindBy (xpath ="//div[text()='Search Assignee']//parent::div//following::input[@role='combobox']")
	WebElement AssigneeDropdown;
	
	@FindBy (xpath ="//option[text()='Select']")
	WebElement SelectStatusST;
	
	@FindBy (xpath ="(//option[text()='Select'])[2]")
	WebElement SelectPriorityST;
	
	@FindBy (xpath ="//p[text()='Status is required field']")
	WebElement StatusErmsg;
	
	@FindBy (xpath ="//p[text()='Priority is required field']")
	WebElement PriorityErmsg;
	
	@FindBy (xpath ="(//label[text()='Assignee']//parent::div//following::*[local-name()='svg' and @class='css-8mmkcg'])[1]")
	WebElement CrossCancel;

	public WebElement getCrossCancel() {
		return CrossCancel;
	}

	public WebElement getStatusErmsg() {
		return StatusErmsg;
	}

	public WebElement getPriorityErmsg() {
		return PriorityErmsg;
	}

	public WebElement getSelectPriorityST() {
		return SelectPriorityST;
	}

	public WebElement getSelectStatusST() {
		return SelectStatusST;
	}

	public WebElement getAssigneeDropdown() {
		return AssigneeDropdown;
	}

	public WebElement getAssignfieldErrormsg() {
		return AssignfieldErrormsg;
	}

	public WebElement getAssigninput() {
		return Assigninput;
	}

	public WebElement getAssignErr() {
		return AssignErr;
	}

	public WebElement getTicketSubmit() {
		return TicketSubmit;
	}

	/*
	 * public WebElement getAssigneDropdown() { return AssigneDropdown; }
	 * 
	 * public WebElement getAssignOpt() { return AssignOpt; }
	 */

	private String attribute;

	public String getAttribute() {
		return attribute;
	}

	public WebElement getSupportTicket() {
		return SupportTicket;
	}

	public WebElement getTickets() {
		return Tickets;
	}

	public WebElement getSearch() {
		return Search;
	}

	public List<WebElement> getTicketTable() {
		return TicketTable;
	}

	public WebElement getFirstRowMoreButton() {
		return FirstRowMoreButton;
	}

	public WebElement getTicketIDcrm() {
		return TicketIDcrm;
	}

	public WebElement getFirstrowCRM() {
		return FirstrowCRM;
	}

	public WebElement getCRMTicketID() {
		return CRMTicketID;
	}

	public WebElement getFirstRowTime() {
		return FirstRowTime;
	}

	public WebElement getTicketAssignee() {
		return TicketAssignee;
	}

	public WebElement getTicketClient() {
		return TicketClient;
	}

	public WebElement getTicketTitlecrm() {
		return TicketTitlecrm;
	}

	public WebElement getTicketDesCrm() {
		return TicketDesCrm;
	}

	public WebElement getTicketStatusCRM() {
		return TicketStatusCRM;
	}

	public WebElement getTicketPriorityCrm() {
		return TicketPriorityCrm;
	}

	public WebElement getMoreButton() {
		return MoreButton;
	}

	public WebElement getEditButton() {
		return EditButton;
	}

	public WebElement getEditFormTitle() {
		return EditFormTitle;
	}

	public WebElement getStatusDropdown() {
		return StatusDropdown;
	}

	public WebElement getStatusOpen() {
		return StatusOpen;
	}

	public WebElement getStatusClose() {
		return StatusClose;
	}

	public WebElement getPriorityDropdown() {
		return PriorityDropdown;
	}

	public WebElement getLowPriority() {
		return LowPriority;
	}

	public WebElement getMediumPriority() {
		return MediumPriority;
	}

	public WebElement getHighPriority() {
		return HighPriority;
	}

	public WebElement getEditSubmit() {
		return EditSubmit;
	}

	public WebElement getEditCancel() {
		return EditCancel;
	}

	public WebElement getEditFormCrossCancel() {
		return EditFormCrossCancel;
	}

	public WebElement getTicketupdatedsuccessfullyToastmsg() {
		return TicketupdatedsuccessfullyToastmsg;
	}

	public WebElement getAssignButton() {
		return AssignButton;
	}

	public WebElement getAssignFormTitle() {
		return AssignFormTitle;
	}

	public WebElement getAssigneeDropdownbutton() {
		return AssigneeDropdownbutton;
	}

	/*
	 * public WebElement getAssigneeOptions() { return AssigneeOptions; }
	 */

	public WebElement getAssignSubmit() {
		return AssignSubmit;
	}

	public WebElement getAssignCancel() {
		return AssignCancel;
	}

	public WebElement getAssignFormCrossCancel() {
		return AssignFormCrossCancel;
	}

	public WebElement getViewButton() {
		return ViewButton;
	}

	public WebElement getInformationpageTitle() {
		return InformationpageTitle;
	}

	public WebElement getInformation() {
		return Information;
	}

	public WebElement getTicketIDInfo() {
		return TicketIDInfo;
	}

	public WebElement getTicketClientInfo() {
		return TicketClientInfo;
	}

	public WebElement getTicketTitleInfo() {
		return TicketTitleInfo;
	}

	public WebElement getTicketDescInfo() {
		return TicketDescInfo;
	}

	public WebElement getImgInfo() {
		return ImgInfo;
	}

	public WebElement getMessages() {
		return Messages;
	}

	public WebElement getChatField() {
		return ChatField;
	}

	public WebElement getFileUploadField() {
		return FileUploadField;
	}

	public WebElement getMsgSendButton() {
		return MsgSendButton;
	}

	public WebElement getImage() {
		return Image;
	}

	public WebElement getHistories() {
		return Histories;
	}

	public WebElement getHistoriesPageTitle() {
		return HistoriesPageTitle;
	}

	public WebElement getTrackTitle() {
		return TrackTitle;
	}

	public WebElement getSupportTicketCreated() {
		return SupportTicketCreated;
	}

	public WebElement getSupportTicketclosed() {
		return SupportTicketclosed;
	}

	public WebElement getAssigneeUpdated() {
		return AssigneeUpdated;
	}

	public WebElement getPriorityChangedtoMedium() {
		return PriorityChangedtoMedium;
	}

	public WebElement getPriorityChangedtolow() {
		return PriorityChangedtolow;
	}

	public WebElement getPriorityChangedtohigh() {
		return PriorityChangedtohigh;
	}

	public WebElement getEditSupportTicket() {
		return EditSupportTicket;
	}

	public WebElement getCloseStatus() {
		return CloseStatus;
	}

	public WebElement getPriorityLow() {
		return PriorityLow;
	}

	public WebElement getPriorityMedium() {
		return PriorityMedium;
	}

	public WebElement getPriorityHigh() {
		return PriorityHigh;
	}

	public WebElement getTicketupdateToast() {
		return TicketupdateToast;
	}

	public WebElement getAssigneeToastmsg() {
		return AssigneeToastmsg;
	}

	public WebElement getMSGField() {
		return MSGField;
	}

	public WebElement getChatMSG() {
		return ChatMSG;
	}

	public WebElement getChatBoxImage() {
		return ChatBoxImage;
	}

	public WebElement getSearchByTitle() {
		return SearchByTitle;
	}

	public void AssigneDropdown() {
		WebElement AssignDd = driver.findElement(By.xpath("//ul[@role='listbox']//li//span"));
		Select Dropdown = new Select(AssignDd);
		List<WebElement> options = Dropdown.getOptions();
		for (int j = 0; j < options.size(); j++) {
			System.out.println(options.get(j).getText());
		}
	}

	public void Fileuploading() throws InterruptedException {
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		String Imgpath = "C:\\Users\\HP\\Desktop\\SampleIMAGES\\JPG\\Image.jpg";
		fileInput.sendKeys(Imgpath);
		Thread.sleep(3000);
	}

	public void TicketisDisplayed_CRM(String Title, String Description) {
		String CRMFirstRow = getFirstrowCRM().getText();
		String ExpectedTime = "a few seconds ago";
		String ActualTime = getFirstRowTime().getText();
		String ExpectedTitle = Title;
		String ExpectedDec = Description;
		String ExpectedStatus = "OPEN";

		if (CRMFirstRow.contains(ExpectedTitle) && CRMFirstRow.contains(ExpectedDec)
				&& CRMFirstRow.contains(ExpectedStatus)) {
			System.out.println("support Ticket is listed on the CRM ");
			System.out.println("CRM " + ExpectedTitle);
			System.out.println("CRM " + ExpectedDec);
		}
	}

	public void SearchTicket() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> TicketTable = getTicketTable();
		for (WebElement Search : TicketTable) {
			if (Search.getText().equals("530")) {
				assertTrue(true);
			} else {
				assertTrue(false);
			}
		}
	}

//	public String SearchSupportTicket() {
//		WebElement Search = driver.findElement(By.xpath("//INPUT[@placeholder='Search']"));
//
//		WebElement TitleTable = driver.findElement(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[4]"));
//		List<String> dr = new ArrayList<String>();
//		for (WebElement TitleTablevalue : TicketTable) {
//			String values = TitleTablevalue.getText();
//			dr.add(values);
//		}
//		String[] TitleValue = new String[dr.size()];
//		for (int i = 0; i < dr.size(); i++) {
//			TitleValue[i] = String.valueOf(dr.get(i));
//		}
//		Random random = new Random();
//		String RandomTitleValue = TitleValue[random.nextInt(TitleValue.length)];
//		return RandomTitleValue;
//	}

	public static void SearchFieldID() throws InterruptedException {
		String TicketID = driver.findElement(By.xpath("(//tr[@class='hover:bg-[#fbfbfb]']//td[1])[1]")).getText();

		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		Search.sendKeys(TicketID);
		Thread.sleep(2000);
		
		List<WebElement> Actual = driver.findElements(By.xpath("(//tr[@class='hover:bg-[#fbfbfb]']//td[1])"));
		
		if(Actual.size() != 0) {
			
				if(Actual.equals(TicketID)) {
					
					System.out.println("Expected => "+TicketID + "  Actual => " + Actual);
				}
			
		}else {
			System.out.println("No records found");
		}
	}
	


	public void ClientDropdown() throws InterruptedException, AWTException {
		
//		WebElement AssigneeDropdown = driver.findElement(By.xpath("//span[text()='Assignee']//parent::div//following::div[text()='Search Assignee']//parent::div//child::input"));
		ClientDrpdwn.click();
		EnterKey();
		try {

			String Assignee = driver.findElement(By.xpath("(//tr[@class='hover:bg-[#fbfbfb]']//td[3])")).getText();
			
			Thread.sleep(5000);
			
			List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[3]"));
			
			if (options.size() != 0) {
			
				for(WebElement option: options) {
					
					if(!option.getText().equalsIgnoreCase(Assignee)) {
						
						System.out.println("Expected => "+Assignee + "  Actual => " + option.getText());
					}
				}
				
			}else {
				
				System.out.println("No records found");
			}
			
		}catch(Exception ex) {
			
			System.out.println("No records found");
		}
	}
	
	public void AssigneeDropdown() throws InterruptedException, AWTException {
		
		WebElement AssigneeDropdown = driver.findElement(By.xpath("//span[text()='Assignee']//parent::div//following::div[text()='Search Assignee']//parent::div//child::input"));
		AssigneeDropdown.click();
		EnterKey();
		try {

			String Assignee = driver.findElement(By.xpath("(//tr[@class='hover:bg-[#fbfbfb]']//td[2])[1]")).getText();
			
			Thread.sleep(5000);
			
			List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[2]"));
			
			if (options.size() != 0) {
			
				for(WebElement option: options) {
					
					if(!option.getText().equalsIgnoreCase(Assignee)) {
						
						System.out.println("Expected => "+Assignee + "  Actual => " + option.getText());
					}
				}
				
			}else {
				
				System.out.println("No records found");
			}
			
		}catch(Exception ex) {
			
			System.out.println("No records found");
		}
	}
	
	
	
	public void AssignSuportTicket() {
		String findElement = driver.findElement(By.xpath("(//tr[@class='hover:bg-[#fbfbfb]']//td[2])[1]")).getTagName();
		String Expected = "Unassigned";
		WebElement More = driver.findElement(By.xpath("(//span[text()='More'])[1]"));
		WebElement Assign = driver.findElement(By.xpath("//div[text()='Assign']"));
		if (findElement.equals(Expected)) {
			More.click();
			Assign.click();
		}
	}
//	
//	public void  AssignforSupportTicket() throws InterruptedException {									
//		WebElement drpdown = driver.findElement(By.xpath("(//div[@class=' css-19bb58m'])[3]")); 	
//		drpdown.click();
//		Thread.sleep(3000);
//		List<WebElement> options = driver.findElements(By.xpath("//div[@class=' css-1kwr78d']//div")); 
//		List<String> dr = new ArrayList<String>();													
//		for (WebElement option : options) {
//			String Values = option.getText();
//			dr.add(Values);
//		}
//		String[] stringArray = new String[dr.size()];
//		for (int i = 0; i < dr.size(); i++) {
//			stringArray[i] = String.valueOf(dr.get(i));
//		}
//		Random random = new Random();
//		String AddMember1 = stringArray[random.nextInt(stringArray.length)];
//		WebElement Assignfield = driver.findElement(By.xpath("//div[@class=' css-1r8c3z0-placeholder']//following::input"));
//		Assignfield.sendKeys(AddMember1);
//	}

}
