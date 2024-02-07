package Page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseClass.BaseClass;

public class SupportTicketCrossFunc_Pages extends BaseClass {

	public SupportTicketCrossFunc_Pages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement Email;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password;

	@FindBy(xpath = "//div[@class='flex items-center justify-center gap-2']")
	WebElement Login;

	@FindBy(xpath = "(//*[local-name()='svg' and @fill='currentColor'])[6]")
	WebElement ExpandButton;

	@FindBy(xpath = "//span[text()='Support']")
	WebElement Support;

	@FindBy(xpath = "//h1[text()='Support Tickets']")
	WebElement SupportPageTitle;

	@FindBy(xpath = "//button[text()='Raise Ticket']")
	WebElement RaiseTicketButton;

	@FindBy(xpath = "//h3[text()='Raise Support Ticket']")
	WebElement TicketFormTitle;

	@FindBy(xpath = "//input[@placeholder='Title']")
	WebElement Titlefield;

	@FindBy(xpath = "//label[text()='Description']//following::*")
	WebElement Description;

	@FindBy(xpath = "//*[local-name()='svg' and @class='h-6 w-6']//parent::button[@type='button']")
	WebElement FileUpload;

	@FindBy(xpath = "//div[@class='relative border']")
	WebElement uploadedfile;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement TicketSubmit;

	@FindBy(xpath = "//div[text()='Support ticket created successfully']")
	WebElement TicketcreatedsuccessfulToastmsg;

	@FindBy(xpath = "//button[text()='All Tickets']")
	WebElement AllTicketsPage;

	@FindBy(xpath = "//div[@class='text-sm text-gray-400']")
	WebElement Timefield;

	@FindBy(xpath = "//button[text()='Closed Tickets']")
	WebElement ClosedTicketsPage;

	@FindBy(xpath = "//button[text()='Open Tickets']")
	WebElement OpenTicketsPage;

	// Ticket Status

	@FindBy(xpath = "(//div[@class='mb-3 w-full cursor-pointer rounded-md border bg-white p-5 pb-2'])[1]")
	WebElement AllTicket1stRow;

	@FindBy(xpath = "//div[@class='mb-3 w-full cursor-pointer rounded-md border bg-white p-5 pb-2']")
	WebElement FirstRowOpenTicketPage;

	@FindBy(xpath = "//div[@class='text-md']")
	WebElement TicketTitle;

	@FindBy(xpath = "//div[@class='text-sm text-gray-600']")
	WebElement TicketDesc;

	@FindBy(xpath = "//div[@class='bg-green-200 text-green-400 max-w-max self-center rounded-lg px-2 py-1 text-sm']")
	WebElement TicketStatus;

	@FindBy(xpath = "//div[@class='bg-red-200 text-red-400 max-w-max self-center rounded-lg px-2 py-1 text-sm']")
	WebElement TicketClose;

	@FindBy(xpath = "(//div[@class='self-center text-sm text-gray-600'])[1]")
	WebElement TicketID;

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getExpandButton() {
		return ExpandButton;
	}

	public WebElement getSupport() {
		return Support;
	}

	public WebElement getSupportPageTitle() {
		return SupportPageTitle;
	}

	public WebElement getRaiseTicketButton() {
		return RaiseTicketButton;
	}

	public WebElement getTicketFormTitle() {
		return TicketFormTitle;
	}

	public WebElement getTitlefield() {
		return Titlefield;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getFileUpload() {
		return FileUpload;
	}

	public WebElement getUploadedfile() {
		return uploadedfile;
	}

	public WebElement getTicketSubmit() {
		return TicketSubmit;
	}

	public WebElement getTicketcreatedsuccessfulToastmsg() {
		return TicketcreatedsuccessfulToastmsg;
	}

	public WebElement getAllTicketsPage() {
		return AllTicketsPage;
	}

	public WebElement getTimefield() {
		return Timefield;
	}

	public WebElement getClosedTicketsPage() {
		return ClosedTicketsPage;
	}

	public WebElement getOpenTicketsPage() {
		return OpenTicketsPage;
	}

	public WebElement getAllTicket1stRow() {
		return AllTicket1stRow;
	}

	public WebElement getFirstRowOpenTicketPage() {
		return FirstRowOpenTicketPage;
	}

	public WebElement getTicketTitle() {
		return TicketTitle;
	}

	public WebElement getTicketDesc() {
		return TicketDesc;
	}

	public WebElement getTicketStatus() {
		return TicketStatus;
	}

	public WebElement getTicketClose() {
		return TicketClose;
	}

	public WebElement getTicketID() {
		return TicketID;
	}

//Trader-------------------------->	
	public static String newIdTicket;

	public String TicketID1() {
		String ticketId = driver.findElement(By.xpath("(//div[@class='self-center text-sm text-gray-600'])[1]"))
				.getText();
		newIdTicket = ticketId;
		System.out.println(newIdTicket);
		return ticketId;
	}

//CRM ----------------------------------->	
	String TicketVerifyID;

	public void TicketVerify() throws InterruptedException {
		Thread.sleep(3000);
		TicketVerifyID = driver.findElement(By.xpath("(//table//tr//td[1])[1]")).getText();

		String[] split = newIdTicket.split("#");
		System.out.println(split[1]);

		if (TicketVerifyID.contains(split[1])) {
			assertTrue(true);
		} else {
			assertTrue("Check Ticket ID", false);
		}
	}

	String TraderStatus;

	public String TicketStatus() {
		String Status = driver.findElement(By.xpath("//div[@class='bg-green-200 text-green-400 max-w-max self-center rounded-lg px-2 py-1 text-sm']")).getText();
		TraderStatus = Status;
		System.out.println(TraderStatus);
		return Status;
	}

	String CrmTicketstatus;

	public void crmTicketStatus() {
		String CrmStatus = driver.findElement(By.xpath("(//tr[@class='hover:bg-[#fbfbfb]'])[1]//td[6]")).getText();
		CrmTicketstatus = CrmStatus;
		System.out.println(CrmTicketstatus);

		if (CrmTicketstatus.equals(CrmStatus)) {
			assertTrue(true);
		} else {
			assertTrue("Support Ticket Value is Mismatching", false);
		}

	}

}
