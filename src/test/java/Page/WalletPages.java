package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class WalletPages extends BaseClass {

	public WalletPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='relative']//following::input)[1]")
	WebElement SearchCrp;

	@FindBy(xpath = "//div[@class='relative']//following::input")
	WebElement SearchFat;

	@FindBy(xpath = "//div[@class='relative']//following::input")
	WebElement SearchErn;

	public WebElement getSearchCrp() {
		return SearchCrp;
	}

	public WebElement getSearchFat() {
		return SearchFat;
	}

	public WebElement getSearchErn() {
		return SearchErn;
	}

	@FindBy(xpath = "//button[text()='Fiat']")
	WebElement Fiat;

	public WebElement getFiat() {
		return Fiat;
	}

	public WebElement getEarn() {
		return Earn;
	}

	@FindBy(xpath = "//button[text()='Earn']")
	WebElement Earn;

	// Crypto Transcation History

	@FindBy(xpath = "//span[text()='Deposit']")
	WebElement Deposite;

	@FindBy(xpath = "//span[text()='Withdraw']")
	WebElement Withdraw;

	@FindBy(xpath = "//span[text()='Send']")
	WebElement Send;

//	@FindBy(xpath = "//div[@class='w-32']//div[@class='relative mt-1 undefined']")
	@FindBy (xpath ="(//span[text()='Type']//parent::div//following::button)[1]")
	WebElement TypeDrop;

	public WebElement getDeposite() {
		return Deposite;
	}

	public WebElement getWithdraw() {
		return Withdraw;
	}

	public WebElement getSend() {
		return Send;
	}

	public WebElement getTypeDrop() {
		return TypeDrop;
	}

	@FindBy(xpath = "//div[@class='relative mt-1']")
	WebElement Assets;

	public WebElement getAssets() {
		return Assets;
	}

	@FindBy(xpath = "(//div[@class='relative mt-1']//following::input)[1]")
	WebElement AssetSearch;

	public WebElement getAssetSearch() {
		return AssetSearch;
	}

	@FindBy(xpath = "//div[@class='h-[200px] overflow-auto']//div[1]")
	WebElement Option;

	public WebElement getOption() {
		return Option;
	}

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]']//td[2])[1]")
	WebElement SeqID;

	public WebElement getSeqID() {
		return SeqID;
	}

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]']//td[7])[1]")
	WebElement SendSeqID;

	public WebElement getSendSeqID() {
		return SendSeqID;
	}

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]']//td[9])[1]")
	WebElement StatusCrpto;

	public WebElement getStatusCrpto() {
		return StatusCrpto;
	}

	@FindBy(xpath = "//div[text()='Approvers']")
	WebElement Approvers;

	public WebElement getApprovers() {
		return Approvers;
	}

	@FindBy(xpath = "//div[text()='Status History']")
	WebElement StatusHistory;

	public WebElement getStatusHistory() {
		return StatusHistory;
	}

	@FindBy(xpath = "//div[text()='Approval/Rejected History']")
	WebElement ApprovalReject;

	public WebElement getApprovalReject() {
		return ApprovalReject;
	}

	@FindBy(xpath = "//span[text()='Status']//parent::div//button//span[text()='All']")
	WebElement StatusDropdown;

	@FindBy(xpath = "//span[text()='Approved']")
	WebElement Approved;

	@FindBy(xpath = "//span[text()='Rejected']")
	WebElement Rejected;

	@FindBy(xpath = "//span[text()='Pending']")
	WebElement Pending;

	@FindBy(xpath = "//span[text()='Completed']")
	WebElement Completed;

	@FindBy(xpath = "//span[text()='Failed']")
	WebElement Failed;

	@FindBy(xpath = "//span[text()='Waiting For Approval']")
	WebElement WFApproval;

	public WebElement getStatusDropdown() {
		return StatusDropdown;
	}

	public WebElement getApproved() {
		return Approved;
	}

	public WebElement getRejected() {
		return Rejected;
	}

	public WebElement getPending() {
		return Pending;
	}

	public WebElement getCompleted() {
		return Completed;
	}

	public WebElement getFailed() {
		return Failed;
	}

	public WebElement getWFApproval() {
		return WFApproval;
	}

	@FindBy(xpath = "(//span[text()='Status']//ancestor::table//following::tr//td)[8]")
	WebElement StatusListed;

	public WebElement getStatusListed() {
		return StatusListed;
	}

	@FindBy(xpath = "//div[text()='Search Client']//parent::div//div[@class=' css-19bb58m']//input")
	WebElement UserSearch;

	public WebElement getUserSearch() {
		return UserSearch;
	}

	/*
	 * @FindBy (xpath
	 * ="//div[text()='Search Asset']//parent::div//div[@class=' css-19bb58m']//input"
	 * ) WebElement AssestSrch;
	 */

	@FindBy(xpath = "(//div[@class=' css-19bb58m'])[2]")
	WebElement AssestSrch;

	public WebElement getAssestSrch() {
		return AssestSrch;
	}
	
	@FindBy (xpath ="//div[ text()='BTC']")
	WebElement BTCassest;

	public WebElement getBTCassest() {
		return BTCassest;
	}
	
	@FindBy (xpath ="//button[text()='FIAT']")
	WebElement FiatType;
	
	@FindBy (xpath ="//button[text()='CRYPTO']")
	WebElement CryptoType;
	
	@FindBy (xpath ="//*[local-name()='svg' and @class='h-5 w-5 text-gray-400']")
	WebElement TypeDropdown; 
	
	public WebElement getTypeDropdown() {
		return TypeDropdown;
	}
	
	@FindBy(xpath ="//div[@class='py-1']//button[text()='Deposit']")
	WebElement CADeposit;
	
	@FindBy(xpath ="//div[@class='py-1']//button[text()='Withdraw']")
	WebElement CAWithdraw;
	

	public WebElement getCADeposit() {
		return CADeposit;
	}

	public WebElement getCAWithdraw() {
		return CAWithdraw;
	}

	public WebElement getFiatType() {
		return FiatType;
	}

	public WebElement getCryptoType() {
		return CryptoType;
	}
	
	@FindBy (xpath ="//input[@placeholder='Search Address']")
	WebElement CryptoAddressSearch;

	public WebElement getCryptoAddressSearch() {
		return CryptoAddressSearch;
	}
	
	@FindBy (xpath ="//div[@class='py-1']//button[text()='Buy']")
	WebElement WHBuy;
	
	@FindBy (xpath ="//div[@class='py-1']//button[text()='Sell']")
	WebElement WHSell;
	
	@FindBy (xpath ="//div[@class='py-1']//button[text()='Deposit']")
	WebElement WHDeposit;
	
	@FindBy (xpath ="//div[@class='py-1']//button[text()='Withdraw']")
	WebElement WHWithdraw;
	
	@FindBy (xpath ="//div[@class='py-1']//button[text()='Fee']")
	WebElement WHFee;
	
	@FindBy (xpath ="//div[@class='py-1']//button[text()='Earn']")
	WebElement WHEarn;

	public WebElement getWHBuy() {
		return WHBuy;
	}

	public WebElement getWHSell() {
		return WHSell;
	}

	public WebElement getWHDeposit() {
		return WHDeposit;
	}

	public WebElement getWHWithdraw() {
		return WHWithdraw;
	}

	public WebElement getWHFee() {
		return WHFee;
	}

	public WebElement getWHEarn() {
		return WHEarn;
	}

	public void ApprovedStatus() {
		List<WebElement> options = driver
				.findElements(By.xpath("//span[text()='Status']//ancestor::table//following::tr//td[8]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement List : options) {
			String values = List.getText();
			dr.add(values);
		}
		String expected = "APPROVED";
		boolean allMatch = false;
		for (String actual : dr) {
			if (actual.contains(expected)) {
				allMatch = true;
				break;
			}
		}
		if (allMatch) {
			System.out.println("Fait Transcation History listed with " + expected);
		} else {
			throw new RuntimeException("Fait Transcation History for APPROVED needs to be validated");
		}
	}

	public void RejectedStatus() {
		List<WebElement> Reject = driver
				.findElements(By.xpath("//span[text()='Status']//ancestor::table//following::tr//td[8]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement List : Reject) {
			String value = List.getText();
			dr.add(value);
		}
		String expected = "REJECTED";
		boolean allMatch = false;
		for (String actual : dr) {
			if (actual.contains(expected)) {
				allMatch = true;
				break;
			}
		}
		if (allMatch) {
			System.out.println("Fait Transcation History listed with " + expected);
		} else {
			throw new RuntimeException("Fait Transcation History for REJECTED needs to be validated");
		}
	}

	public void PendingStatus() {
		List<WebElement> Reject = driver
				.findElements(By.xpath("//span[text()='Status']//ancestor::table//following::tr//td[8]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement List : Reject) {
			String value = List.getText();
			dr.add(value);
		}
		String expected = "PENDING";
		boolean allMatch = false;
		for (String actual : dr) {
			if (actual.contains(expected)) {
				allMatch = true;
				break;
			}
		}
		if (allMatch) {
			System.out.println("Fait Transcation History listed with " + expected);
		} else {
			throw new RuntimeException("Fait Transcation History for PENDING needs to be validated");
		}
	}

	public void COMPLETEDStatus() {
		List<WebElement> Reject = driver
				.findElements(By.xpath("//span[text()='Status']//ancestor::table//following::tr//td[8]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement List : Reject) {
			String value = List.getText();
			dr.add(value);
		}
		String expected = "COMPLETED";
		boolean allMatch = false;
		for (String actual : dr) {
			if (actual.contains(expected)) {
				allMatch = true;
				break;
			}
		}
		if (allMatch) {
			System.out.println("Fait Transcation History listed with " + expected);
		} else {
			throw new RuntimeException("Fait Transcation History for COMPLETED needs to be validated");
		}
	}

	public void FailedStatus() {
		List<WebElement> Reject = driver
				.findElements(By.xpath("//span[text()='Status']//ancestor::table//following::tr//td[8]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement List : Reject) {
			String value = List.getText();
			dr.add(value);
		}
		String expected = "Failed";
		boolean allMatch = false;
		for (String actual : dr) {
			if (actual.contains(expected)) {
				allMatch = true;
				break;
			}
		}
		if (allMatch) {
			System.out.println("Fait Transcation History listed with " + expected);
		} else {
			throw new RuntimeException("Fait Transcation History for Failed needs to be validated");
		}
	}

	public void WAITINGFORAPPROVALStatus() {
		List<WebElement> Reject = driver
				.findElements(By.xpath("//span[text()='Status']//ancestor::table//following::tr//td[8]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement List : Reject) {
			String value = List.getText();
			dr.add(value);
		}
		String expected = "WAITING FOR APPROVAL";
		boolean allMatch = false;
		for (String actual : dr) {
			if (actual.contains(expected)) {
				allMatch = true;
				break;
			}
		}
		if (allMatch) {
			System.out.println("Fait Transcation History listed with " + expected);
		} else {
			throw new RuntimeException("Fait Transcation History for WAITING FOR APPROVAL needs to be validated");
		}
	}

	public void ClientBalanceAsset() {
		List<WebElement> Reject = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[4]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement List : Reject) {
			String value = List.getText();
			dr.add(value);
		}
		String expected = "WAITING FOR APPROVAL";
		boolean allMatch = false;
		for (String actual : dr) {
			if (actual.contains(expected)) {
				allMatch = true;
				break;
			}
		}
		if (allMatch) {
			System.out.println("Fait Transcation History listed with " + expected);
		} else {
			throw new RuntimeException("Fait Transcation History for WAITING FOR APPROVAL needs to be validated");
		}
	}
	
	

}
