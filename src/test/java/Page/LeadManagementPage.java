package Page;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class LeadManagementPage extends BaseClass {

	public LeadManagementPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Lead Management']")
	WebElement LeadManagementpage;

//	@FindBy (xpath = "(//div[@class='relative flex items-center']//input)[1]")
	@FindBy(xpath = "//label[text()='First Name']//parent::div//child::input")
	WebElement FirstName;

//	@FindBy (xpath ="(//div[@class='relative flex items-center']//input)[2]")
	@FindBy(xpath = "//label[text()='Last Name']//parent::div//child::input")
	WebElement SecondName;

//	@FindBy (xpath ="(//div[@class='relative flex items-center']//input)[3]")
	@FindBy(xpath = "//label[text()='Email']//parent::div//child::input")
	WebElement Emailfield;

	@FindBy(xpath = "//input[@placeholder='Phone Number']")
	WebElement Phonenumber;

	@FindBy(xpath = "(//div[text()='Select Source']//parent::div//following::input)[1]")
	WebElement Source;

	@FindBy(xpath = "//div[text()='Select Country']//parent::div//following::input")
	WebElement Country;

	@FindBy(xpath = "//button[text()='Create']")
	WebElement Create;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement Submit;

	@FindBy(xpath = "(//h1[text()='Create Client']//parent::div//following::*[local-name()='svg'])[1]")
	WebElement Closebutton;

	@FindBy(xpath = "//div[text()='Lead created successfully']")
	WebElement LeadToastMsg;

	@FindBy(xpath = "//span[text()='Status']//parent::div//child::div//button")
	WebElement Status;

	@FindBy(xpath = "//li//span[text()='NEW']")
	WebElement NewOption;

	@FindBy(xpath = "//li//span[text()='CALLBACK']")
	WebElement CallBackOption;

	@FindBy(xpath = "//li//span[text()='NO ANSWER']")
	WebElement NoanswerOption;

	@FindBy(xpath = "//li//span[text()='NOT AVAILABLE']")
	WebElement NotAvailable;

	@FindBy(xpath = "//li//span[text()='OUT OF COVERAGE']")
	WebElement OutofCoverage;

	@FindBy(xpath = "//li//span[text()='NOT INTERESTED']")
	WebElement NotIntrested;

	@FindBy(xpath = "//li//span[text()='GOOD LEAD']")
	WebElement GoodLead;

	@FindBy(xpath = "//li//span[text()='JUNK']")
	WebElement Junk;
	
	@FindBy (xpath ="//span[text()='Source']//parent::div//child::input")
	WebElement SourceDropdown;
	
	@FindBy (xpath ="//span[text()='Country']//parent::div//child::input")
	WebElement CountryDropdown;
	
	@FindBy (xpath ="//button[text()='Bulk Assignee']")
	WebElement BulkAssignee;
	
	@FindBy (xpath ="//span[@class='flex justify-center']//input")
	WebElement SelectAll;
	
	@FindBy (xpath ="//h1[text()='Edit Lead']")
	WebElement EditformTitle;
	
	@FindBy (xpath ="//*[@id='small']")
	WebElement StatusDropdown;
	
	@FindBy (xpath ="//div[text()='Status updated successfully']")
	WebElement LeadEditToast;
	
	@FindBy (xpath ="//div[text()='Assignee updated successfully']")
	WebElement AssignedToast;
	
	@FindBy (xpath ="//div[text()='Comments']")
	WebElement Comments;
	
	@FindBy (xpath ="//*[@id='comment']")
	WebElement CommentInput;
	
	@FindBy (xpath ="//button[text()='Post comment']")
	WebElement CommentButton;
	
	@FindBy (xpath ="//div[text()='Lead comment successfully']")
	WebElement CommentToastMSg;
	
	@FindBy (xpath ="(//label[text()='Assignee']//parent::div//following::*[local-name()='svg' and @class='css-8mmkcg'])[1]")
	WebElement CrossCancel;
	
	@FindBy (xpath ="//div[text()='Select Assignee']//parent::div//child::div[2]")
	WebElement AssignForm;
	
	@FindBy (xpath ="//label[text()='Call Back']//parent::div//child::input")
	WebElement CallBackDuration;
	
	public WebElement getCallBackDuration() {
		return CallBackDuration;
	}
	
	@FindBy (xpath ="//div[@class='dayContainer']//span[12]")
	WebElement Date;
	
	public WebElement getDate() {
		return Date;
	}

	@FindBy (xpath ="//label[text()='Time']//parent::div//child::input")
	WebElement Time ;
	
	public WebElement getTime() {
		return Time;
	}

	public WebElement getAssignForm() {
		return AssignForm;
	}

	public WebElement getCrossCancel() {
		return CrossCancel;
	}

	public WebElement getCommentButton() {
		return CommentButton;
	}

	public WebElement getCommentToastMSg() {
		return CommentToastMSg;
	}

	public WebElement getCommentInput() {
		return CommentInput;
	}

	public WebElement getComments() {
		return Comments;
	}

	public WebElement getAssignedToast() {
		return AssignedToast;
	}

	public WebElement getLeadEditToast() {
		return LeadEditToast;
	}

	public WebElement getStatusDropdown() {
		return StatusDropdown;
	}

	public WebElement getEditformTitle() {
		return EditformTitle;
	}

	public WebElement getBulkAssignee() {
		return BulkAssignee;
	}

	public WebElement getSelectAll() {
		return SelectAll;
	}

	public WebElement getSourceDropdown() {
		return SourceDropdown;
	}

	public WebElement getCountryDropdown() {
		return CountryDropdown;
	}

	public WebElement getNotAvailable() {
		return NotAvailable;
	}

	public WebElement getOutofCoverage() {
		return OutofCoverage;
	}

	public WebElement getNotIntrested() {
		return NotIntrested;
	}

	public WebElement getGoodLead() {
		return GoodLead;
	}

	public WebElement getJunk() {
		return Junk;
	}

	@FindBy(xpath = "//div[text()='Search Assignee']//parent::div//child::input")
	WebElement Assignee;

	public WebElement getNewOption() {
		return NewOption;
	}

	public WebElement getCallBackOption() {
		return CallBackOption;
	}

	public WebElement getNoanswerOption() {
		return NoanswerOption;
	}

	public WebElement getAssignee() {
		return Assignee;
	}

	public WebElement getStatus() {
		return Status;
	}

	public WebElement getLeadToastMsg() {
		return LeadToastMsg;
	}

	public WebElement getClosebutton() {
		return Closebutton;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getCreate() {
		return Create;
	}

	public WebElement getLeadManagementpage() {
		return LeadManagementpage;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getSecondName() {
		return SecondName;
	}

	public WebElement getEmailfield() {
		return Emailfield;
	}

	public WebElement getPhonenumber() {
		return Phonenumber;
	}

	public WebElement getSource() {
		return Source;
	}

	public WebElement getCountry() {
		return Country;
	}

	public void Createleads() throws AWTException, InterruptedException {
		Create.click();
		FirstName.sendKeys(RandomText());
		SecondName.sendKeys(RandomText());
		Emailfield.sendKeys("raghul+" + RandomText() + "@pibase.info");
		Phonenumber.sendKeys("9095392644");
		Source.click();
		DownArrowPress();
		Country.click();
		DownArrowPress();
		Submit.click();
	}

	public void MultipleLeads() throws AWTException, InterruptedException {

		for (int i = 0; i < 10; i++) {
			try {
				Createleads();
				Thread.sleep(1000);
				Assert.assertEquals("Lead created successfully", getText(LeadToastMsg));
				String ToastMsg = LeadToastMsg.getText();
				System.out.println(ToastMsg);
			} catch (Exception e) {
				Closebutton.click();
				System.out.println("Lead creation Failed");
			}
		}
	}

	public String AddMemberDropdown() throws InterruptedException {
		WebElement drpdown = driver
				.findElement(By.xpath("(//div[text()='Select Source']//parent::div//following::input)[1]"));
		drpdown.click();
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class=' css-1wy6c10']//div"));

		List<Integer> dr = new ArrayList<Integer>();
		for (WebElement option : options) {
			String Values = option.getText();
			int d = Integer.parseInt(Values.replaceAll("[^0-9.]", ""));
			dr.add(d);
		}
		String[] stringArray = new String[dr.size()];
		for (int i = 0; i < dr.size(); i++) {
			stringArray[i] = String.valueOf(dr.get(i));
		}
		Random random = new Random();
		String AddMember1 = stringArray[random.nextInt(stringArray.length)];
		return AddMember1;
	}

	public static void SearchLeadEmail() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> Email = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[6]"));
		List<String> ID = new ArrayList<String>();
		for (WebElement LeadMail : Email) {
			String values = LeadMail.getText();
			ID.add(values);
		}
		String[] stringArray = new String[ID.size()];
		for (int i = 0; i < ID.size(); i++) {
			stringArray[i] = String.valueOf(ID.get(i));
		}
		Random random = new Random();
		String Name1 = stringArray[random.nextInt(stringArray.length)];
//		System.out.println(Name1);
		WebElement Search = driver.findElement(By.xpath("//span[text()='Search']//parent::div//child::input"));
		Search.sendKeys(Name1);
		Thread.sleep(2000);
		WebElement Actual = driver.findElement(By.xpath("(//tr[@class='hover:bg-[#fbfbfb]']//td[6])[1]"));
//		System.out.println(Actual.getText());
		String textActual = Actual.getText();
		if (textActual.equals(Name1)) {
			System.out.println("Lead Mail is present");
		} else {
			throw new RuntimeException("No Lead is Found");
		}
	}

	public static void StatusField() {
		String Status = driver.findElement(By.xpath("//span[text()='Status']//parent::div//child::button")).getText();
		List<WebElement> Actual = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[9]"));
		boolean allMatch = false;
		if (Actual.size() != 0) {

			for (WebElement List : Actual) {
				if (List.getText().equals(Status)) {
					allMatch = true;
				} else {
					allMatch = false;
					break;
				}
			}
			System.out.println("All cell contents match the expected content: " + Status);
		} else if (Actual.size() == 0) {
			System.out.println("No data found");
		} else {

			System.out.println("Status Dropdown Functionality need to validat");
		}

	}
	
	private WebElement Leadstatus(String Lead) {
		
		return driver.findElement(By.xpath("//li//span[text()='"+ Lead+"']"));
	}
	
	public WebElement getLeadstatus(String Lead) {
		
		return Leadstatus(Lead);
	}
	
	public void LeadStatus(String Lead) {
		WebElement Dropdown = driver.findElement(By.xpath("//span[text()='Status']//parent::div//child::div//button"));
		Dropdown.click();
		
		getLeadstatus(Lead).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) { e.printStackTrace();
		}
		
		List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[9]"));
		
		if(options.size() != 0) {
		
			for(WebElement option: options) {
				
				if(!option.getText().equalsIgnoreCase(Lead)) {
					
					System.out.println("Expected => "+Lead + "  Actual => " + option.getText());
				}
			}
		}else {
			System.out.println("No records found");
		}
		
	}	
		
	private WebElement Leadassignee(String Assignee) {
		return driver.findElement(By.xpath("//div[@class=' css-1nmdiq5-menu']//div[text()='"+ Assignee +"']"));
	}
	
	public WebElement getLeadassignee(String Assignee) {
		return Leadassignee(Assignee);
	}
	
	public void LeadAssignee(String Assignee) {
		WebElement Dropdown = driver.findElement(By.xpath("//span[text()='Assignee']//parent::div//child::input"));
		Dropdown.click();
		
		getLeadassignee(Assignee).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) { e.printStackTrace();
		}
		
		List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[3]"));
		
		if(options.size() != 0) {
		
			for(WebElement option: options) {
				
				if(!option.getText().equals(Assignee)) {
					
					System.out.println("Expected => "+Assignee + "  Actual => " + option.getText());
				}
			}
		}else {
			System.out.println("No records found");
		}
		
	}
		
	public void DeleteLead() throws InterruptedException {
		
		Thread.sleep(500);
		String text = driver.findElement(By.xpath("//div[@class = 'Toastify__toast-body']//child::div")).getText();
		String Actual ="Lead deleted successfully";
		
		if (text.contains(Actual)) {
			System.out.println("Lead deleted successfully");
		} else {
			System.out.println("Lead is not deleted");
		}
	}

}
