package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseClass;

public class ExportPages extends BaseClass{
	
	public ExportPages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//button[text()='Export']")
	WebElement Export;
	
	@FindBy (xpath ="//p[text()='Export Document']")
	WebElement ExportForm;
	
	@FindBy (xpath ="//span[text()='Yes']")
	WebElement Yes;
	
	@FindBy (xpath ="//span[text()='No']")
	WebElement No;
	
	@FindBy (xpath ="//h1[text()='Export Initiated']")
	WebElement ExportInitiatedForm;
	
	@FindBy (xpath ="(//span[text()='Export History'])[2]")
	WebElement ExportHistory;
	
	@FindBy (xpath ="//button[text()='Close']")
	WebElement CloseButton;
	
	@FindBy (xpath ="//span[text()='Exported Document']")
	WebElement ExportNotify;
	
	@FindBy (xpath ="//div[text()='Document Exported Successfully']")
	WebElement ExportSucc;
	
	@FindBy (xpath ="//a[text()='View']")
	WebElement ViewButton;
	
	@FindBy (xpath ="//tr[@class='hover:bg-[#fbfbfb]']//td[3]")
	WebElement Download;
	
	public WebElement getDownload() {
		return Download;
	}

	public WebElement getExportSucc() {
		return ExportSucc;
	}

	public WebElement getViewButton() {
		return ViewButton;
	}

	public WebElement getExportNotify() {
		return ExportNotify;
	}

	public WebElement getExport() {
		return Export;
	}

	public WebElement getExportForm() {
		return ExportForm;
	}

	public WebElement getYes() {
		return Yes;
	}

	public WebElement getNo() {
		return No;
	}

	public WebElement getExportInitiatedForm() {
		return ExportInitiatedForm;
	}

	public WebElement getExportHistory() {
		return ExportHistory;
	}

	public WebElement getCloseButton() {
		return CloseButton;
	}

}
