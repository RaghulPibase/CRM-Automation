package Page;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class ClientManagementPage extends BaseClass {

//	private static final By WebElement value  drive = null;

	public ClientManagementPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Basic Information']")
	WebElement CMBasicInfo;

	@FindBy(xpath = "//h1[text()='Basic Information']")
	WebElement CMBasicInfoTitle;

	@FindBy(xpath = "//div[text()='Login Activities']")
	WebElement CMLogin;

	@FindBy(xpath = "//h1[text()='Login Activities']")
	WebElement CMLoginTitle;

	@FindBy(xpath = "//div[text()='Security Activities']")
	WebElement CMSecurity;

	@FindBy(xpath = "//h1[text()='Security Activities']")
	WebElement CMSecurityTitle;
	
	@FindBy (xpath ="//div[text()='Terms and Conditions History']")
	WebElement CMTermsCond;

	public WebElement getCMTermsCond() {
		return CMTermsCond;
	}
	
	@FindBy (xpath ="//h1[text()='Accepted Terms and Conditions']")
	WebElement CMTermsCondTitle;

	public WebElement getCMTermsCondTitle() {
		return CMTermsCondTitle;
	}

	@FindBy(xpath = "//div[text()='Wallet Balances']")
	WebElement CMWalletBalance;

	@FindBy(xpath = "//h1[text()='Wallet Balances']")
	WebElement CMWalletBalanceTitle;

	@FindBy(xpath = "//div[text()='Wallet Histories']")
	WebElement CMWalletHistories;

	@FindBy(xpath = "//h1[text()='Wallet Histories']")
	WebElement CMWalletHistoriesTitle;

	@FindBy(xpath = "//div[text()='Crypto Transactions History']")
	WebElement CMCrTarnsHis;

	@FindBy(xpath = "//h1[text()='Crypto Transactions History']")
	WebElement CMCrTarnsHisTitle;

	@FindBy(xpath = "//div[text()='Fiat Transactions History']")
	WebElement CMFiatTransHis;

	@FindBy(xpath = "//h1[text()='Fiat Transactions History']")
	WebElement CMFiatTransHisTitle;

	public WebElement getCMFiatTransHisTitle() {
		return CMFiatTransHisTitle;
	}

	@FindBy(xpath = "//div[text()='Spot Open Orders']")
	WebElement CMSpotOpen;

	@FindBy(xpath = "//h1[text()='Spot Open Orders']")
	WebElement CMSpotOpenTitle;

	@FindBy(xpath = "//div[text()='Spot Order History']")
	WebElement CMSpotOrder;

	@FindBy(xpath = "//h1[text()='Spot Order History']")
	WebElement CMSpotOrderTitle;

	@FindBy(xpath = "//div[text()='Spot Trade History']")
	WebElement CMSpotTrade;

	@FindBy(xpath = "//h1[text()='Spot Trade History']")
	WebElement CMSpotTradeTitle;

	@FindBy(xpath = "//div[text()='Deposit Fiat']")
	WebElement CMDepositFiat;

	@FindBy(xpath = "//p[text()='Deposit Fiat']")
	WebElement CMDepositFiatTitle;

	@FindBy(xpath = "//div[text()='Deposit Crypto']")
	WebElement CMDepositCrypto;

	@FindBy(xpath = "//p[text()='Deposit Crypto']")
	WebElement CMDepositCryptoTitle;

	@FindBy(xpath = "//div[text()='KYC']")
	WebElement CMKYC;

	@FindBy(xpath = "//h1[text()='KYC Details']")
	WebElement CMKYCTitle;

	@FindBy(xpath = "//div[text()='KYC Status History']")
	WebElement CMKYCHist;

	@FindBy(xpath = "//h1[text()='KYC Status History']")
	WebElement CMKYCHistTitle;

	@FindBy(xpath = "//div[text()='Spot Fees']")
	WebElement CMSpotFees;

	@FindBy(xpath = "//h1[text()='Spot Fees']")
	WebElement CMSpotFeesTitle;

	@FindBy(xpath = "//div[text()='Level Limits']")
	WebElement CMLevelLimit;

	@FindBy(xpath = "//h1[text()='Level Limits']")
	WebElement CMLevelLimitTitle;

	@FindBy(xpath = "//div[text()='Symbols']")
	WebElement CMSymbols;

	public WebElement getSeqId() {
		return SeqId;
	}

	@FindBy(xpath = "//h1[text()='Symbols']")
	WebElement CMSymbolsTitle;

	@FindBy(xpath = "//input[@placeholder='Search Client']")
	WebElement Search;

	@FindBy(xpath = "(//span[text()='Seq id']//ancestor::table//following::td)[1]")
	WebElement SeqId;

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getCMBasicInfo() {
		return CMBasicInfo;
	}

	public WebElement getCMBasicInfoTitle() {
		return CMBasicInfoTitle;
	}

	public WebElement getCMLogin() {
		return CMLogin;
	}

	public WebElement getCMLoginTitle() {
		return CMLoginTitle;
	}

	public WebElement getCMSecurity() {
		return CMSecurity;
	}

	public WebElement getCMSecurityTitle() {
		return CMSecurityTitle;
	}

	public WebElement getCMWalletBalance() {
		return CMWalletBalance;
	}

	public WebElement getCMWalletBalanceTitle() {
		return CMWalletBalanceTitle;
	}

	public WebElement getCMWalletHistories() {
		return CMWalletHistories;
	}

	public WebElement getCMWalletHistoriesTitle() {
		return CMWalletHistoriesTitle;
	}

	public WebElement getCMCrTarnsHis() {
		return CMCrTarnsHis;
	}

	public WebElement getCMCrTarnsHisTitle() {
		return CMCrTarnsHisTitle;
	}

	public WebElement getCMFiatTransHis() {
		return CMFiatTransHis;
	}

	public WebElement getCMSpotOpen() {
		return CMSpotOpen;
	}

	public WebElement getCMSpotOpenTitle() {
		return CMSpotOpenTitle;
	}

	public WebElement getCMSpotOrder() {
		return CMSpotOrder;
	}

	public WebElement getCMSpotOrderTitle() {
		return CMSpotOrderTitle;
	}

	public WebElement getCMSpotTrade() {
		return CMSpotTrade;
	}

	public WebElement getCMSpotTradeTitle() {
		return CMSpotTradeTitle;
	}

	public WebElement getCMDepositFiat() {
		return CMDepositFiat;
	}

	public WebElement getCMDepositFiatTitle() {
		return CMDepositFiatTitle;
	}

	public WebElement getCMDepositCrypto() {
		return CMDepositCrypto;
	}

	public WebElement getCMDepositCryptoTitle() {
		return CMDepositCryptoTitle;
	}

	public WebElement getCMKYC() {
		return CMKYC;
	}

	public WebElement getCMKYCTitle() {
		return CMKYCTitle;
	}

	public WebElement getCMKYCHist() {
		return CMKYCHist;
	}

	public WebElement getCMKYCHistTitle() {
		return CMKYCHistTitle;
	}

	public WebElement getCMSpotFees() {
		return CMSpotFees;
	}

	public WebElement getCMSpotFeesTitle() {
		return CMSpotFeesTitle;
	}

	public WebElement getCMLevelLimit() {
		return CMLevelLimit;
	}

	public WebElement getCMLevelLimitTitle() {
		return CMLevelLimitTitle;
	}

	public WebElement getCMSymbols() {
		return CMSymbols;
	}

	public WebElement getCMSymbolsTitle() {
		return CMSymbolsTitle;
	}

	public void ClientManagementNav() {
		CMBasicInfo.click();
		String Title = getCMBasicInfoTitle().getText();
		Assert.assertEquals("Basic Information", Title);
		System.out.println(Title);

		CMLogin.click();
		String LOGIN = getCMLoginTitle().getText();
		Assert.assertEquals("Login Activities", LOGIN);
		System.out.println(LOGIN);

		CMSecurity.click();
		String Security = getCMSecurityTitle().getText();
		Assert.assertEquals("Security Activities", Security);
		System.out.println(Security);
		
		CMTermsCond.click();
		String Terms = getCMTermsCondTitle().getText();
		Assert.assertEquals("Accepted Terms and Conditions", Terms);
		System.out.println(Terms);

		CMWalletBalance.click();
		String Wbalance = getCMWalletBalanceTitle().getText();
		Assert.assertEquals("Wallet Balances", Wbalance);
		System.out.println(Wbalance);

		CMWalletHistories.click();
		String WHistory = getCMWalletHistoriesTitle().getText();
		Assert.assertEquals("Wallet Histories", WHistory);
		System.out.println(WHistory);

		CMCrTarnsHis.click();
		String Crypto = getCMCrTarnsHisTitle().getText();
		Assert.assertEquals("Crypto Transactions History", Crypto);
		System.out.println(Crypto);

		CMFiatTransHis.click();
		String Fiat = getCMFiatTransHisTitle().getText();
		Assert.assertEquals("Fiat Transactions History", Fiat);
		System.out.println(Fiat);

		CMSpotOpen.click();
		String Open = getCMSpotOpenTitle().getText();
		Assert.assertEquals("Spot Open Orders", Open);
		System.out.println(Open);

		CMSpotOrder.click();
		String Order = getCMSpotOrderTitle().getText();
		Assert.assertEquals("Spot Order History", Order);
		System.out.println(Order);

		CMSpotTrade.click();
		String Trade = getCMSpotTradeTitle().getText();
		Assert.assertEquals("Spot Trade History", Trade);
		System.out.println(Trade);

		CMDepositFiat.click();
		String FiatTitle = getCMDepositFiatTitle().getText();
		Assert.assertEquals("Deposit Fiat", FiatTitle);
		System.out.println(FiatTitle);

		CMDepositCrypto.click();
		String CryptoTitle = getCMDepositCryptoTitle().getText();
		Assert.assertEquals("Deposit Crypto", CryptoTitle);
		System.out.println(CryptoTitle);

		CMKYC.click();
		String KYCTitle = getCMKYCTitle().getText();
		Assert.assertEquals("KYC Details", KYCTitle);
		System.out.println(KYCTitle);

		CMKYCHist.click();
		String KYCHisTitle = getCMKYCHistTitle().getText();
		Assert.assertEquals("KYC Status History", KYCHisTitle);
		System.out.println(KYCHisTitle);

		CMSpotFees.click();
		String SpotFees = getCMSpotFeesTitle().getText();
		Assert.assertEquals("Spot Fees", SpotFees);
		System.out.println(SpotFees);

		CMLevelLimit.click();
		String LevelFees = getCMLevelLimitTitle().getText();
		Assert.assertEquals("Level Limits", LevelFees);
		System.out.println(LevelFees);

		CMSymbols.click();
		String Symbols = getCMSymbolsTitle().getText();
		Assert.assertEquals("Symbols", Symbols);
		System.out.println(Symbols);
	}

	public static void SearchSeqID() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> supportTicketFisrtRow = driver
				.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[1]"));
		List<String> ID = new ArrayList<String>();
		for (WebElement ticketRows : supportTicketFisrtRow) {
			String values = ticketRows.getText();
			ID.add(values);
			// System.out.println(ID);
		}
		String[] stringArray = new String[ID.size()];
		for (int i = 0; i < ID.size(); i++) {
			stringArray[i] = String.valueOf(ID.get(i));
		}
		Random random = new Random();
		String Name1 = stringArray[random.nextInt(stringArray.length)];
		System.out.println(Name1);

		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search Client']"));
		Search.sendKeys(Name1);
		Thread.sleep(2000);
		WebElement Actual = driver.findElement(By.xpath("(//tr[@class='hover:bg-[#fbfbfb]']//td[1])[1]"));
		String textActual = Actual.getText();
		if (textActual.equals(Name1)) {
			System.out.println("Client Seq ID is listed on the Page");
		} else {
			throw new RuntimeException("Client Seq ID is not listed on the Page ");
		}
	}

	public static void SearchEmail() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> supportTicketFisrtRow = driver
				.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[2]"));
		List<String> ID = new ArrayList<String>();
		for (WebElement ticketRows : supportTicketFisrtRow) {
			String values = ticketRows.getText();
			ID.add(values);
		}
		String[] stringArray = new String[ID.size()];
		for (int i = 0; i < ID.size(); i++) {
			stringArray[i] = String.valueOf(ID.get(i));
		}
		Random random = new Random();
		String Name1 = stringArray[random.nextInt(stringArray.length)];
		System.out.println(Name1);

		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search Client']"));
		Search.sendKeys(Name1);
		Thread.sleep(2000);
		WebElement Actual = driver.findElement(By.xpath("(//tr[@class='hover:bg-[#fbfbfb]']//td[2])[1]"));
		String textActual = Actual.getText();
		if (textActual.equals(Name1)) {
			System.out.println("Client Email is listed on the Page");
		} else {
			throw new RuntimeException("Client Email is not listed on the Page ");
		}
	}

	@FindBy(xpath = "//h2[text()='No Client found']")
	WebElement Error;

	public WebElement getError() {
		return Error;
	}

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb]']//td[8])[1]")
	WebElement Row;

	public WebElement getRow() {
		return Row;
	}

	public void GrpDropdown() throws InterruptedException, AWTException {
		WebElement Dropdown = driver.findElement(By.xpath("//div[@class=' css-19bb58m']//input"));
		Dropdown.click();
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class=' css-qr46ko']//div"));
		List<String> dr = new ArrayList<String>();
		WebElement value = driver.findElement(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']"));
		for (WebElement option : options) {
			String Values = option.getText();
			dr.add(Values);
		}
		String[] stringArray = new String[dr.size()];
		for (int i = 0; i < dr.size(); i++) {
			stringArray[i] = String.valueOf(dr.get(i));
		}
		Random random = new Random();
		String AddMember1 = stringArray[random.nextInt(stringArray.length)];
		if (AddMember1.length() != 0) {
			System.out.println(AddMember1);
		} else {
			System.out.println("Invalid input");
		}
		WebElement Search = driver.findElement(By.xpath("//div[@class=' css-19bb58m']//input"));
		Search.sendKeys(AddMember1);
		Thread.sleep(1000);
		EnterKey();
		if (AddMember1.equals(getRow())) {
			System.out.println("Searched Group is listed on the page");
		} else if (getError().isDisplayed()) {
			System.out.println(getError().getText());
		} else {
			System.out.println("Something went wrong");
		}
	}
	
	private WebElement kycStatus(String status) {
		
		return driver.findElement(By.xpath("//button[text()='"+status+"']"));
	}
	
	public WebElement getKycStatus(String status) {
		
		return kycStatus(status);
	}

	@FindBy(xpath = "//tr[@class='hover:bg-[#fbfbfb]']//td[7]")
	WebElement Status;

	public WebElement getStatus() {
		return Status;
	}
	
	public void KYCStatus(String status) {
		WebElement Dropdown = driver.findElement(By.xpath("//span[text()='KYC Status']//parent::div//child::button"));
		Dropdown.click();
		
		getKycStatus(status).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) { e.printStackTrace();
		}
		
		List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[7]"));
		
		if(options.size() != 0) {
		
			for(WebElement option: options) {
				
				if(!option.getText().equalsIgnoreCase(status)) {
					
					System.out.println("Expected => "+status + "  Actual => " + option.getText());
				}
			}
		}else {
			System.out.println("No records found");
		}
		
	}


	@FindBy(xpath = "//div[text()='Search Country']//parent::div//child::input")
	WebElement Country;

	public WebElement getCountry() {
		return Country;
	}

	public static void CountryDropdown() throws InterruptedException, AWTException {
		
		WebElement Dropdown = driver.findElement(By.xpath("//div[text()='Search Country']//parent::div//child::input"));
		Dropdown.click();
		EnterKey();
		
		String Country = driver.findElement(By.xpath("//span[text()='Country']//parent::div//following::input//parent::div//parent::div//child::div")).getText();
		try {
			Thread.sleep(5000);
		} catch (Exception e) { e.printStackTrace();
		}
			
			List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[5]"));
			
			if(options.size() != 0) {
				
				for(WebElement option: options) {
					
					if(!option.getText().equalsIgnoreCase(Country)) {
						
						System.out.println("Expected => "+Country + "  Actual => " + option.getText());
					}
				}
			}else {
				System.out.println("No records found");
			}
	}
	
	

	@FindBy(xpath = "//span[text()='SUBMITTED']")
	WebElement KYCSubmitted;

	public WebElement getKYCSubmitted() {
		return KYCSubmitted;
	}

	@FindBy(xpath = "//span[text()='Approve']")
	WebElement Approve;

	public WebElement getApprove() {
		return Approve;
	}

	@FindBy(xpath = "//h3[text()='Approve Identity Verification']")
	WebElement ApproveForm;

	@FindBy(xpath = "//span[text()='Reject']")
	WebElement Reject;

	public WebElement getReject() {
		return Reject;
	}

	@FindBy(xpath = "//h1[text()='Reject Identity Verification']")
	WebElement RejectForm;

	public WebElement getApproveForm() {
		return ApproveForm;
	}

	public WebElement getRejectForm() {
		return RejectForm;
	}

	@FindBy(xpath = "//label[text()='Reject Reason']//parent::div//child::textarea")
	WebElement RejectReason;

	public WebElement getRejectReason() {
		return RejectReason;
	}

	@FindBy(xpath = "//div[text()='KYC approved']")
	WebElement KYCApproveToastmsg;

	public WebElement getKYCApproveToastmsg() {
		return KYCApproveToastmsg;
	}

	@FindBy(xpath = "(//span[text()='Approve'])[2]")
	WebElement ApproveButton;
	
	@FindBy(xpath ="//span[text()='Approve']")
	WebElement Approvebtn;

	public WebElement getApprovebtn() {
		return Approvebtn;
	}

	public WebElement getApproveButton() {
		return ApproveButton;
	}

	@FindBy(xpath = "//span[text()='APPROVED']")
	WebElement VerificationStatus;

	public WebElement getVerificationStatus() {
		return VerificationStatus;
	}

	@FindBy(xpath = "//dt[text()='ID']//parent::div//child::dd")
	WebElement ClientID;

	public WebElement getClientID() {
		return ClientID;
	}

	public void ClientId() {
//		Object ID = driver.findElements(ClientID);
		String ID = driver.findElement(By.xpath("//dt[text()='ID']//parent::div//child::dd")).getText();

	}

	
	@FindBy(xpath ="//div[text()='KYC Rejected']")
	WebElement RejectToastmsg;

	public WebElement getRejectToastmsg() {
		return RejectToastmsg;
	}
	
	@FindBy (xpath ="//span[text()='Select Crypto']")
	WebElement DepositCrypto;

	public WebElement getDepositCrypto() {
		return DepositCrypto;
	}
	
	@FindBy (xpath ="//div[text()='Bitcoin']")
	WebElement Bitcoin;

	public WebElement getBitcoin() {
		return Bitcoin;
	}
	
	@FindBy (xpath ="//div[@class='relative border rounded']//child::input")
	WebElement SearchAsset;

	public WebElement getSearchAsset() {
		return SearchAsset;
	}
	
	public WebElement getDepositbutton() {
		return Depositbutton;
	}

	@FindBy (xpath ="//div[@class='h-[300px] overflow-auto']//div[1]")
	WebElement Firstrow;

	public WebElement getFirstrow() {
		return Firstrow;
	}
	
	@FindBy (xpath ="//label[text()='Amount']/parent::div//following::input")
	WebElement AmountInput;

	public WebElement getAmountInput() {
		return AmountInput;
	}
	
	@FindBy (xpath ="//span[text()='Deposit']")
	WebElement Depositbutton;
	
	@FindBy (xpath ="//*[text()='Deposit initiated successfully']")
	WebElement DepositToastmsg;

	public WebElement getDepositToastmsg() {
		return DepositToastmsg;
	}
	
	@FindBy (xpath ="//span[text()='Select Fiat']")
	WebElement DepositFiat;

	public WebElement getDepositFiat() {
		return DepositFiat;
	}
	
	@FindBy (xpath ="//div[text()='Approve']")
	WebElement ApproveCrypto;

	public WebElement getApproveCrypto() {
		return ApproveCrypto;
	}
	
	@FindBy (xpath ="//div[text()='Reject']")
	WebElement RejectCrypto;
	
	public WebElement getRejectCrypto() {
		return RejectCrypto;
	}

	@FindBy (xpath ="//h3[text()='Approve']")
	WebElement ApproveTitle;
	
	public WebElement getApproveTitle() {
		return ApproveTitle;
	}

	@FindBy (xpath ="(//span[text()='Approve'])")
	WebElement ApprvalButton;

	public WebElement getApprvalButton() {
		return ApprvalButton;
	}
	
	@FindBy (xpath ="//span[text()='Reject']")
	WebElement RejectButton;

	public WebElement getRejectButton() {
		return RejectButton;
	}
}
