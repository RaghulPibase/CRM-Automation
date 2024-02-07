package PageManager;

import Page.ClientGroupsPages;
import Page.ClientManagementPage;
import Page.EarnPages;
import Page.ExportPages;
import Page.LeadManagementPage;
import Page.LoginPages;
import Page.SupportTicketCrossFunc_Pages;
import Page.OpenorderCrossFunc_Pages;
import Page.SmokeTestingPages;
import Page.SpotOrderPages;
import Page.SupportTicketPage;
import Page.UserManagementPages;
import Page.WalletPages;

public class PageObjectManager {

	private SmokeTestingPages SmokeTest;
	public SmokeTestingPages getSmokeTest() {
		return (SmokeTest == null) ? SmokeTest = new SmokeTestingPages() : SmokeTest;
	}

	private ClientGroupsPages ClientGroup;
	public ClientGroupsPages getClientGroup() {
		return (ClientGroup == null) ? ClientGroup = new ClientGroupsPages() : ClientGroup;
	}

	private SupportTicketPage SupportTicket;
	public SupportTicketPage getSupportTicket() {
		return (SupportTicket == null) ? SupportTicket = new SupportTicketPage() : SupportTicket;
	}

	private SupportTicketCrossFunc_Pages CrossFunc;
	public SupportTicketCrossFunc_Pages getCrossFunc() {
		return (CrossFunc == null) ? CrossFunc = new SupportTicketCrossFunc_Pages() : CrossFunc;
	}

	private SpotOrderPages SpotOrder;
	public SpotOrderPages getSpotOrder() {
		return (SpotOrder == null) ? SpotOrder = new SpotOrderPages() : SpotOrder;
	}
	
	private OpenorderCrossFunc_Pages OpenOrder;
	public OpenorderCrossFunc_Pages getOpenOrder() {
		return (OpenOrder == null) ? OpenOrder = new OpenorderCrossFunc_Pages() : OpenOrder;
	}
	
	private WalletPages WalletBalance;
	public WalletPages getWalletBalance() {
		return (WalletBalance == null ) ? WalletBalance = new WalletPages() : WalletBalance;
	}
	
	private LeadManagementPage LeadManagement;
	public LeadManagementPage getLeadManagement() {
		return (LeadManagement == null) ? LeadManagement = new LeadManagementPage() :LeadManagement;
	}
	
	private ClientManagementPage ClientManagement;
	public ClientManagementPage getClientManagement() {
		return (ClientManagement == null )? ClientManagement = new ClientManagementPage() : ClientManagement;
	}
	
	private EarnPages Earn;
	public EarnPages getEarn() {
		return (Earn == null ) ? Earn = new EarnPages() : Earn;
	}
	
	private UserManagementPages UserManagement;
	public UserManagementPages getUserManagement() {
		return (UserManagement == null) ? UserManagement = new UserManagementPages() : UserManagement;
		
	}
	
	private LoginPages Login;
	public LoginPages getLogin() {
		return (Login == null )	? Login	= new LoginPages() : Login;
	}
	
	private ExportPages Export;
	public ExportPages getExport() {
		return (Export == null ) ? Export = new ExportPages() : Export ;
	}
}
