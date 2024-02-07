package Page;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.velocity.runtime.directive.contrib.For;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class SmokeTestingPages extends BaseClass {

	public SmokeTestingPages() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(xpath = "//input[@placeholder='Email']"), @FindBy(xpath = "//input[@name='email']") })
	WebElement Email;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password;

	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement Signin;

	@FindBy(xpath = "//button//*[local-name()='svg' and @viewBox='0 0 16 16']")
	WebElement Expand;

	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement Dashboard;

	@FindBy(xpath = "//div[text()='Deposit Pending Approvals']")
	WebElement DashboardTitle;

	@FindBy(xpath = "(//button[text()='Crypto'])[1]")
	WebElement DPACryptoDashboard;

	@FindBy(xpath = "(//button[text()='Fiat'])[1]")
	WebElement DPAFiatDashboard;

	@FindBy(xpath = "(//button[text()='Crypto'])[2]")
	WebElement WPACryptoDashboard;

	@FindBy(xpath = "(//button[text()='Fiat'])[2]")
	WebElement WPAFiatDashboard;

	@FindBy(xpath = "//span[text()='User Management']")
	WebElement UserManagement;

	@FindBy(xpath = "//span[text()='Users']")
	WebElement Users;

	@FindBy(xpath = "//h1[text()='Users']")
	WebElement UsersTitle;

	@FindBy(xpath = "//span[text()='Roles']")
	WebElement Roles;

	@FindBy(xpath = "//h1[text()='Roles']")
	WebElement RolesTitle;

	@FindBy(xpath = "//span[text()='Permissions']")
	WebElement Permissions;

	@FindBy(xpath = "//h1[text()='Permissions']")
	WebElement PermissionsTitle;

	@FindBy(xpath = "//span[text()='Permission Entities']")
	WebElement PermissionEntities;

	@FindBy(xpath = "//h1[text()='Permission Entities']")
	WebElement PermissionEntitiesTitle;

	@FindBy(xpath = "//span[text()='Approvals']")
	WebElement Approvals;

	@FindBy(xpath = "//h1[text()='Approvals']")
	WebElement ApprovalsTitle;

	@FindBy(xpath = "//span[text()='Client Management']")
	WebElement ClientManagement;

	@FindBy(xpath = "//span[text()='Clients']")
	WebElement Clients;

	@FindBy(xpath = "//h1[text()='Clients']")
	WebElement ClientsTitle;

	@FindBy(xpath = "//span[text()='KYC Submitted']")
	WebElement KYCSubmitted;

	@FindBy(xpath = "//h1[text()='KYC Submitted']")
	WebElement KYCSubmittedTitle;
	
	@FindBy (xpath ="//span[text()='Earn']")
	WebElement Earn;
	
	public WebElement getEarn() {
		return Earn;
	}

	public WebElement getEarnDashboard() {
		return EarnDashboard;
	}

	public WebElement getDashboardEarnTitle() {
		return DashboardEarnTitle;
	}

	public WebElement getSimpleEarn() {
		return SimpleEarn;
	}

	public WebElement getSimpleEarnTitle() {
		return SimpleEarnTitle;
	}

	public WebElement getSimpleEarnHistories() {
		return SimpleEarnHistories;
	}

	public WebElement getSimpleEarnHistoriesTitle() {
		return SimpleEarnHistoriesTitle;
	}

	@FindBy (xpath ="(//span[text()='Dashboard'])[3]")
	WebElement EarnDashboard;
	
	@FindBy (xpath ="//h1[text()='Simple Earn Flexible']")
	WebElement DashboardEarnTitle;
	
	@FindBy(xpath = "//span[text()='Earn Products']")
	WebElement EarnProducts;

	@FindBy(xpath = "//h1[text()='Earn Products']")
	WebElement EarnProductsTitle;
	
	@FindBy (xpath ="//span[text()='Simple Earn']")
	WebElement SimpleEarn;
	
	@FindBy (xpath ="//h1[text()='Simple Earn']")
	WebElement SimpleEarnTitle;
	
	@FindBy (xpath="//span[text()='Simple Earn Histories']")
	WebElement SimpleEarnHistories;
	
	@FindBy (xpath ="//h1[text()='Simple Earn Histories']")
	WebElement SimpleEarnHistoriesTitle;
	
	@FindBy(xpath = "//span[text()='Wallet']")
	WebElement Wallet;

	@FindBy(xpath = "//span[text()='Wallet Balances']")
	WebElement WalletBalances;

	@FindBy(xpath = "//h1[text()='Wallet Balances']")
	WebElement WalletBalanceTitle;

	@FindBy(xpath = "//span[text()='Crypto Transactions History']")
	WebElement CryptoTransactionHistory;

	@FindBy(xpath = "//h1[text()='Crypto Transactions History']")
	WebElement CryptoTransactionHistoryTitle;

	@FindBy(xpath = "//span[text()='Cryptoapi Transaction Requests']")
	WebElement CryptoapiTransactionRequests;

	@FindBy(xpath = "//h1[text()='Cryptoapi Transaction Requests']")
	WebElement CryptoapiTransactionRequestsTitle;

	@FindBy(xpath = "//span[text()='Fiat Transactions History']")
	WebElement FiatTransactionHistory;

	@FindBy(xpath = "//h1[text()='Fiat Transactions History']")
	WebElement FiatTransactionHistoryTitle;

	@FindBy(xpath = "//span[text()='Client Balances']")
	WebElement ClientBalances;

	@FindBy(xpath = "//h1[text()='Client Balances']")
	WebElement ClientBalancesTitle;

	@FindBy(xpath = "//span[text()='Crypto Addresses']")
	WebElement CryptoAddress;

	@FindBy(xpath = "//h1[text()='Crypto Addresses']")
	WebElement CryptoAddressesTitle;

	@FindBy(xpath = "//span[text()='Wallet Histories']")
	WebElement Wallethistories;

	@FindBy(xpath = "//h1[text()='Wallet Histories']")
	WebElement WalletHistoriesTitle;

	@FindBy(xpath = "//span[text()='Spot order']")
	WebElement Spotorder;

	@FindBy(xpath = "//span[text()='Open Orders']")
	WebElement OpenOrders;

	@FindBy(xpath = "//h1[text()='Open Orders']")
	WebElement OpenOrderTitle;

	@FindBy(xpath = "//span[text()='Order History']")
	WebElement OrderHistory;

	@FindBy(xpath = "//h1[text()='Order History']")
	WebElement OrderHistoryTitle;

	@FindBy(xpath = "//span[text()='Trade History']")
	WebElement TradeHistory;

	@FindBy(xpath = "//h1[text()='Trade History']")
	WebElement TradeHistoryTitle;

	@FindBy(xpath = "//span[text()='Order Executions']")
	WebElement OrderExecution;

	@FindBy(xpath = "//h1[text()='Order Executions']")
	WebElement OrderExecutionsTitle;

	@FindBy(xpath = "//span[text()='Settled Orders']")
	WebElement SettledOrder;

	@FindBy(xpath = "//h1[text()='Settled Orders']")
	WebElement SetteledOrdersTitle;

	@FindBy(xpath = "//span[text()='Order Summary']")
	WebElement OrderSummary;

	@FindBy(xpath = "//h1[text()='Order Summary - Net Obligation report']")
	WebElement OrderSummaryTitle;

	@FindBy(xpath = "//span[text()='Markets']")
	WebElement Markets;

	@FindBy(xpath = "//h1[text()='Markets']")
	WebElement MarketsTitle;

	@FindBy(xpath = "//span[text()='Support Ticket']")
	WebElement SupportTicket;

	@FindBy(xpath = "//span[text()='Tickets']")
	WebElement Tickets;

	@FindBy(xpath = "//h1[text()='Tickets']")
	WebElement TicketsTitle;

	@FindBy(xpath = "//span[text()='Client Group']")
	WebElement ClientGroup;

	@FindBy(xpath = "//span[text()='Groups']")
	WebElement Groups;

	@FindBy(xpath = "//h1[text()='Client Groups']")
	WebElement GroupsTitle;

	@FindBy(xpath = "//div[@class='flex items-center']//child::button")
	WebElement ProfileIcon;

	@FindBy(xpath = "//h1[text()='Settings']")
	WebElement SettingsPageTitle;

	@FindBy(xpath = "//a[text()='Dashboard']")
	WebElement DashboardProfile;

	@FindBy(xpath = "//*[text()='Settings']")
	WebElement Settings;

	@FindBy(xpath = "//*[text()='Sign Out']")
	WebElement Signout;
	
	@FindBy (xpath ="(//span[text()='Dashboard'])[2]")
	WebElement DashboardClient;
	
	@FindBy (xpath ="//span[text()='Lead Management']")
	WebElement LeadManagement;
	
	@FindBy (xpath ="//span[text()='Leads']")
	WebElement Leads;
	
	public WebElement getLeads() {
		return Leads;
	}

	@FindBy (xpath ="//h1[text()='Leads']")
	WebElement LeadsTitle;
	
	@FindBy (xpath ="//h1[text()='Export History']")
	WebElement ExportTitle;
	
	@FindBy (xpath ="//span[text()='Export']")
	WebElement Export;
	
	@FindBy (xpath ="//h1[text()='Simple Earn Flexible']")
	WebElement EarnDashboardTitle;
	
	@FindBy (xpath ="//span[text()='Export History']")
	WebElement ExportHistories;
	
	@FindBy (xpath ="//span[text()='Tickets']")
	WebElement Ticket;

	public WebElement getTicket() {
		return Ticket;
	}

	public WebElement getExportHistories() {
		return ExportHistories;
	}

	public WebElement getEarnDashboardTitle() {
		return EarnDashboardTitle;
	}

	public WebElement getDashboardClient() {
		return DashboardClient;
	}

	public WebElement getLeadManagement() {
		return LeadManagement;
	}

	public WebElement getLeadsTitle() {
		return LeadsTitle;
	}

	public WebElement getExportTitle() {
		return ExportTitle;
	}

	public WebElement getExport() {
		return Export;
	}

	public WebElement getDPACryptoDashboard() {
		return DPACryptoDashboard;
	}

	public WebElement getDPAFiatDashboard() {
		return DPAFiatDashboard;
	}

	public WebElement getWPACryptoDashboard() {
		return WPACryptoDashboard;
	}

	public WebElement getWPAFiatDashboard() {
		return WPAFiatDashboard;
	}

	public List<WebElement> getDPACrypto() {
		return DPACrypto;
	}

	public WebElement getEarnProducts() {
		return EarnProducts;
	}

	public WebElement getEarnProductsTitle() {
		return EarnProductsTitle;
	}

	public WebElement getProfileIcon() {
		return ProfileIcon;
	}

	public WebElement getSettingsPageTitle() {
		return SettingsPageTitle;
	}

	public WebElement getDashboardProfile() {
		return DashboardProfile;
	}

	public WebElement getSettings() {
		return Settings;
	}

	public WebElement getSignout() {
		return Signout;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSignin() {
		return Signin;
	}

	public WebElement getDashboard() {
		return Dashboard;
	}

	public WebElement getDashboardTitle() {
		return DashboardTitle;
	}

	public WebElement getUserManagement() {
		return UserManagement;
	}

	public WebElement getUsers() {
		return Users;
	}

	public WebElement getUsersTitle() {
		return UsersTitle;
	}

	public WebElement getRoles() {
		return Roles;
	}

	public WebElement getRolesTitle() {
		return RolesTitle;
	}

	public WebElement getPermissions() {
		return Permissions;
	}

	public WebElement getPermissionsTitle() {
		return PermissionsTitle;
	}

	public WebElement getPermissionEntities() {
		return PermissionEntities;
	}

	public WebElement getPermissionEntitiesTitle() {
		return PermissionEntitiesTitle;
	}

	public WebElement getApprovals() {
		return Approvals;
	}

	public WebElement getApprovalsTitle() {
		return ApprovalsTitle;
	}

	public WebElement getClientManagement() {
		return ClientManagement;
	}

	public WebElement getClients() {
		return Clients;
	}

	public WebElement getClientsTitle() {
		return ClientsTitle;
	}

	public WebElement getKYCSubmitted() {
		return KYCSubmitted;
	}

	public WebElement getKYCSubmittedTitle() {
		return KYCSubmittedTitle;
	}

	public WebElement getWallet() {
		return Wallet;
	}

	public WebElement getWalletBalances() {
		return WalletBalances;
	}

	public WebElement getWalletBalanceTitle() {
		return WalletBalanceTitle;
	}

	public WebElement getCryptoTransactionHistory() {
		return CryptoTransactionHistory;
	}

	public WebElement getCryptoTransactionHistoryTitle() {
		return CryptoTransactionHistoryTitle;
	}

	public WebElement getCryptoapiTransactionRequests() {
		return CryptoapiTransactionRequests;
	}

	public WebElement getCryptoapiTransactionRequestsTitle() {
		return CryptoapiTransactionRequestsTitle;
	}

	public WebElement getFiatTransactionHistory() {
		return FiatTransactionHistory;
	}

	public WebElement getFiatTransactionHistoryTitle() {
		return FiatTransactionHistoryTitle;
	}

	public WebElement getClientBalances() {
		return ClientBalances;
	}

	public WebElement getClientBalancesTitle() {
		return ClientBalancesTitle;
	}

	public WebElement getCryptoAddress() {
		return CryptoAddress;
	}

	public WebElement getCryptoAddressesTitle() {
		return CryptoAddressesTitle;
	}

	public WebElement getWallethistories() {
		return Wallethistories;
	}

	public WebElement getWalletHistoriesTitle() {
		return WalletHistoriesTitle;
	}

	public WebElement getSpotorder() {
		return Spotorder;
	}

	public WebElement getOpenOrders() {
		return OpenOrders;
	}

	public WebElement getOpenOrderTitle() {
		return OpenOrderTitle;
	}

	public WebElement getOrderHistory() {
		return OrderHistory;
	}

	public WebElement getOrderHistoryTitle() {
		return OrderHistoryTitle;
	}

	public WebElement getTradeHistory() {
		return TradeHistory;
	}

	public WebElement getTradeHistoryTitle() {
		return TradeHistoryTitle;
	}

	public WebElement getOrderExecution() {
		return OrderExecution;
	}

	public WebElement getOrderExecutionsTitle() {
		return OrderExecutionsTitle;
	}

	public WebElement getSettledOrder() {
		return SettledOrder;
	}

	public WebElement getSetteledOrdersTitle() {
		return SetteledOrdersTitle;
	}

	public WebElement getOrderSummary() {
		return OrderSummary;
	}

	public WebElement getOrderSummaryTitle() {
		return OrderSummaryTitle;
	}

	public WebElement getMarkets() {
		return Markets;
	}

	public WebElement getMarketsTitle() {
		return MarketsTitle;
	}

	public WebElement getSupportTicket() {
		return SupportTicket;
	}

	public WebElement getTickets() {
		return Tickets;
	}

	public WebElement getTicketsTitle() {
		return TicketsTitle;
	}

	public WebElement getClientGroup() {
		return ClientGroup;
	}

	public WebElement getGroups() {
		return Groups;
	}

	public WebElement getGroupsTitle() {
		return GroupsTitle;
	}

	public WebElement getExpand() {
		return Expand;
	}

	public void Market() throws InterruptedException {
		Thread.sleep(1000);
		WebElement Market = driver.findElement(By.xpath("//h1[@class='flex items-center gap-2 text-xl font-medium']"));
		if (Market.isDisplayed()) {
			System.out.println("Market is displayed");
		}
	}

	public void CRMlogin() throws InterruptedException, FileNotFoundException, IOException {
		driver = new ChromeDriver();
		loadUrl(getPropertyFileValue("Url"));
		driver.manage().window().maximize();
		elementWait();
		SmokeTestingPages st = new SmokeTestingPages();
		st.getEmail().sendKeys(getPropertyFileValue("Username"));
		st.getPassword().sendKeys(getPropertyFileValue("Password"));
		Thread.sleep(2000);
		st.getSignin().click();
		waitClick(st.getExpand());
		Thread.sleep(3000);
	}

	@FindBy(xpath = "(//nav[@class='cursor-pointer'])[1]//button")
	private List<WebElement> DPACrypto; // Deposit Pending Approvals Crypto

	public List<WebElement> getAllPagesCrypto() {
		return DPACrypto;
	}

	@FindBy(xpath = "(//nav[@class=\"cursor-pointer\"])[2]//button")
	private List<WebElement> DPAFiat; // Deposit Pending Approvals Fiat

	public List<WebElement> getDPAFiat() {
		return DPAFiat;
	}

	public void allpages() throws InterruptedException {
		List<WebElement> allPagesCrypto2 = getAllPagesCrypto();

		for (int i = 0; i < allPagesCrypto2.size(); i++) {
			allPagesCrypto2.get(i).click();
			Thread.sleep(500);
		}
	}
}
