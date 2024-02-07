 @Wallet
Feature: To validate the Wallet Page in CRM application 
	
		Background: To validate the Login Functionality of CRM application
		Given User should navigate to Login page of CRM application 
		And User enter the valid "raghul@Pibase.info" in the email field
		And User enter the valid "Qwerty@123" in the password field
		And User click on the Signin button 
		
	#WalletBalance
	@Search_Crypto 
	Scenario Outline: To validat the Search functionality on crypto field 
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Wallet Balances and Verify the Page Title 
		And User search for "<Crypto>" in the Search field and Verify data is listed on the page
		And User close the Browser
	Examples:
	|	Crypto	|
	|	BTC			|
	
	#WalletBalance
	@Search_Fiat 
	Scenario Outline: To validat the Search functionality on Fiat field 
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Wallet Balances and Verify the Page Title
		And User Navigate to Fiat Field 
		And User search for Fiat "<Fiat>" in the Search field and Verify data is listed on the page
		And User close the Browser
	Examples:
	|	Fiat	|
	|	USD		|
	
	#WalletBalance
	@Search_EarnWallet  
	Scenario Outline: To validat the Search functionality on Earn field 
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title 
		And User Navigate to Wallet Balances and Verify the Page Title
		And User Navigate to Earn Field 
		And User search for Earn "<Earn>" in the Search field and Verify data is listed on the page
		And User close the Browser
	Examples:
	|	Earn	|
	|	USD		|
	
	#CryptoTranscationHistory
	@CryptoTranHis_TypeDropdown
	Scenario: To validate the Type Dropdown Functionality in Crypto Tarnsaction History page 
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Transactions History and Verify the Page Title
		And User select Deposit in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User select Withdraw in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User select Send in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User close the Browser

	@CryptoTranHis_Asset_Dropdown
	Scenario: To validate the Asset Dropdown Functionality in Crypto Transaction History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Transactions History and Verify the Page Title
		And User select Asset in Asset Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User close the Browser
		
	@CryptoTranHis_NavigatethroughSEQID
	Scenario: To validate the SEQ ID Navigate to Client Management on Crypto Transaction History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Transactions History and Verify the Page Title
		And User Click on the Client SeqID and navigate across the Client Management page
		And User close the Browser
		
	@CryptoTranHis_NavigateThroughSendID 
	Scenario: To validate the Send User ID navigate to Client managment on Crypto Transcation History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Transactions History and Verify the Page Title
		And User select Send in Type Dropdown box and Verify Created data is listed on the page
		And User click on the Send Client ID and navigate across the client management page
		And User close the Browser
		
	@CryptoTranHis
	Scenario: To validate the More functionality on crypto Transaction History
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Transactions History and Verify the Page Title
		And User verify the Crypto Transactions History Status 
		And User Click on More option
		And User Click on View option
		Then Verify the user is on View Crypto Transactions History Form
		And User Click on Approvers and verify the Approver is available
		And User Click on Status History and verify the status history is available 
		And User Click on the Approval Reject History and verify the status is available
		And User close the Browser
	 
	@CryptoTranHis_Complete
	Scenario: To validate the crypto Transaction History status 
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Transactions History and Verify the Page Title
		And User verify the Crypto Transactions History Status 
		And User Click on More option
		And User Click on View option
		And User close the Browser
	
	@FiatTranHis_TypeDropdown
	Scenario: To validate the Type Dropdown Functionality in Fiat Tarnsaction History page 
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Fiat Transaction History and Verify the Page Title
		And User select Deposit in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User select Withdraw in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User close the Browser
	
	@FiatTranHis_AssetDropdown
	Scenario: To validate the Asset Dropdown Functionality in Fiat Transaction History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Fiat Transaction History and Verify the Page Title
		And User select Asset in Asset Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User close the Browser	
	
	@FiatTranHis_StatusDropdown_Approved
	Scenario: To validate the Status Dropdown Functionality in Fiat Transaction History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Fiat Transaction History and Verify the Page Title	
		And User select Approved in Status dropdown box and verify data is listed on the page 
		And User click on Reset button
		And User close the Browser	
	
	@FiatTranHis_StatusDropdown_Rejected
	Scenario: To validate the Status Dropdown Functionality in Fiat Transaction History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Fiat Transaction History and Verify the Page Title	
		And User select Rejected in Status dropdown box and verify data is listed on the page 
		And User click on Reset button
		And User close the Browser	
	
	@FiatTranHis_StatusDropdown_Pending
	Scenario: To validate the Status Dropdown Functionality in Fiat Transaction History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Fiat Transaction History and Verify the Page Title	
		And User select Pending in Status dropdown box and verify data is listed on the page 
		And User click on Reset button
		And User close the Browser	
	
	@FiatTranHis_StatusDropdown_Completed
	Scenario: To validate the Status Dropdown Functionality in Fiat Transaction History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Fiat Transaction History and Verify the Page Title	
		And User select Completed in Status dropdown box and verify data is listed on the page 
		And User click on Reset button
		And User close the Browser	
	
	@FiatTranHis_StatusDropdown_Failed
	Scenario: To validate the Status Dropdown Functionality in Fiat Transaction History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Fiat Transaction History and Verify the Page Title	
		And User select Failed in Status dropdown box and verify data is listed on the page 
		And User click on Reset button
		And User close the Browser	
	
	@FiatTranHis_StatusDropdown_WaitingforApproval
	Scenario: To validate the Status Dropdown Functionality in Fiat Transaction History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Fiat Transaction History and Verify the Page Title	
		And User select Waiting for approvals in Status dropdown box and verify data is listed on the page 
		And User click on Reset button
		And User close the Browser	
	
	@FiatTranHis_NavigatethroughSEQID
	Scenario: To validate the SEQ ID Navigate to Client Management on Crypto Transaction History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Fiat Transaction History and Verify the Page Title
		And User Click on the Client SeqID and navigate across the Client Management page
		And User close the Browser
		
	@ClientBalance_UserDropdown
	Scenario: To validate the User Dropdown Functionality in Client Balance page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Client Balances and Verify the Page Title
		And User select the Client in User dropdown box and verify data is listed on the page
		And User click on Reset button
		And User close the Browser
		
	@ClientBalance_AssetDropdown
	Scenario: To validate the Asset Dropdown Functionality in Client Balance page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Client Balances and Verify the Page Title	
	  And User select Asset in Asset Dropdown and Verify Created data is listed on Client Balance page
		And User click on Reset button
		And User close the Browser
		
	@ClientBalance_TypeDropdown
	Scenario: To validate the Type Dropdown Functionality in Client Balance page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Client Balances and Verify the Page Title
		And User select Fiat in Type Dropdown and Verify Selected data is listed on Client Balance page
		And User click on Reset button
		And User select Crypto in Type Dropdown and Verify Selected data is listed on Client Balance page
		And User click on Reset button
		And User close the Browser
		
	@ClientBalance_NavigatethroughSEQID
		Scenario: To validate the SEQ ID Navigate to Client Management on Client Balance page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Client Balances and Verify the Page Title
		And User Click on the Client SeqID and navigate across the Client Management page
		And User close the Browser
	
	@ClientBalance_ViewForm
	Scenario: To validate View Form in Client Balance page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Client Balances and Verify the Page Title
		And User Click on More option
		And User Click on View option
		#And User Verify the data sames on the Client balance
		And User close the Browser
	
	@CryptoAddress_UserDropdown
	Scenario: To validate the User Dropdown Functionality in Crypto Address page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Addresses and Verify the Page Title
		And User select the Client in User dropdown box and verify data is listed on the page
		And User click on Reset button
		And User close the Browser
	
	@CryptoAddress_CryptoAddressSearch
	Scenario Outline: To validate the Crypto Address Search Functionality in Crypto Address page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Addresses and Verify the Page Title
		And User Search for a "<address>" in Crypto address search field and verify data is listed on the page
		And User click on Reset button
		And User close the Browser
	Examples: 
	|	address	|
	|	n3XFvy6hV57Et3WXpNriL8Ew1J1hUbgwZX	|
	
	@CryptoAddress_AssetDropdown
	Scenario: To validate the Asset Dropdown Functionality in Crypto Address page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Addresses and Verify the Page Title	
		And User select Asset in Asset Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User close the Browser
	
	@CryptoAddress_TypeDropdown
	Scenario: To validate the Type Dropdown Functionality in Crypto Address page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Addresses and Verify the Page Title
		And User select Deposit in Type Dropdown box and Verify Created data is listed on the CryptoAddress page
		And User click on Reset button
		And User select Withdraw in Type Dropdown box and Verify Created data is listed on the CryptoAddress page
		And User click on Reset button
		And User close the Browser
	
	@CryptoAddress_NavigatethroughSEQID
	Scenario: To validate the SEQ ID Navigate to Client Management on Crypto Address page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Addresses and Verify the Page Title
		And User Click on the Client SeqID and navigate across the Client Management page
		And User close the Browser
		
	@CryptoAddress_ViewForm
	Scenario: To validate the View Form on Crypto Address page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Crypto Addresses and Verify the Page Title	
		And User Click on More option
		And User Click on View option
		And User close the Browser
		
	@WalletHistory_UserDropdown
	Scenario: To validate the User Dropdown Functionality in Wallet History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Wallet Histories and Verify the Page Title
		And User select the Client in User dropdown box and verify data is listed on the page
		And User click on Reset button
		And User close the Browser	
		
	@WalletHistory_AssetDropdown
	Scenario: To validate the Asset Dropdown Functionality in Wallet History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Wallet Histories and Verify the Page Title
		And User select Asset in Asset Dropdown and Verify Created data is listed on Client Balance page
		And User click on Reset button
		And User close the Browser		
		
	@WalletHistory_TypeDropdown
	Scenario: To validate the Type Dropdown Functionality in Wallet History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Wallet Histories and Verify the Page Title
		And User select Buy in Type Dropdown and Verify Selected data is listed on Wallet History page
		And User click on Reset button
		And User select Sell in Type Dropdown and Verify Selected data is listed on Wallet History page
		And User click on Reset button	
		And User select Deposit in Type Dropdown and Verify Selected data is listed on Wallet History page
		And User click on Reset button
		And User select Withdrawl in Type Dropdown and Verify Selected data is listed on Wallet History page
		And User click on Reset button
		And User select Fee in Type Dropdown and Verify Selected data is listed on Wallet History page
		And User click on Reset button
		And User select Earn in Type Dropdown and Verify Selected data is listed on Wallet History page
		And User click on Reset button
		And User close the Browser
		
	@WalletHistory_NavigatethroughSEQID
	Scenario: To validate the SEQ ID Navigate to Client Management on Wallet History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Wallet Histories and Verify the Page Title
		And User Click on the Client SeqID and navigate across the Client Management page
		And User close the Browser
		
	@WalletHistory_ViewForm
	Scenario: To validate the View Form on Wallet History page
		Given User Click on Dashboard page and Verify the title in CRM
		And User Navigate to Walet and Verify the Page Title
		And User Navigate to Wallet Histories and Verify the Page Title	
		And User Click on More option
		And User Click on View option
		And User close the Browser
		
		
		
		
		
		
		
		
		
		