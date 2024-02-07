@Client
Feature: To validate the Client Management Page in CRM application 
	
#	Background: To validate the Login Functionality of CRM application
#		Given User should navigate to Login page of CRM application 
#		And User enter the valid "raghul@Pibase.info" in the email field
#		And User enter the valid "Qwerty@123" in the password field
#		And User click on the Signin button 
		
	@CreateClient 
	Scenario: To validate the Create Client functionality in the Client Management page 
		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to Clients and Verify the Page Title
		And Click on the Create button
		And User enter the valid data in First name field 
		And User enter the Valid data in second name field 
		And User enter the valid data in Email field
		And User select the country in the country field
		And Click on the submit button
#		And User close the Browser
		
	@Navigate_ClientManagement
	Scenario: To validate the Navigation functionality in the Client Management  
		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to Clients and Verify the Page Title	
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Management page 
		And User Navigate across the Client Management page 
#		And User close the Browser
		
	@SearchClient
	Scenario: To validate the Search functionality in the Client Management page 
#		Given User Navigate to Dashboard page in CRM applicatione 
#		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to Clients and Verify the Page Title
		And User search for Client in search field and Verify Search data is appear on the page
		And User click on Reset button
		And User search for Client Email in search field and Verify Search data is appear on the page
		And User click on Reset button
#		And User close the Browser
		
	@GroupSearch
	Scenario: To validate the Client Group functionality in the Client Management page
#		Given User Navigate to Dashboard page in CRM applicatione 
#		And User Navigate to Client Management and Verify the Page Title
#		And User Navigate to Clients and Verify the Page Title
		And User Select the Group in the Group Dropdown and verify the Group is listed on the page
		And User click on Reset button
#		And User close the Browser
		
	@KYCStatusDropdown
	Scenario: To validate the KYC Status Dropdown functionality in the Client Management page
		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to Clients and Verify the Page Title 
		And User Select the approved "Approved" in the KYC status Dropdown and verify the Group is listed on the page
		And User click on Reset button
		And User Select the reject "Rejected" in the KYC status Dropdown and verify the Group is listed on the page
		And User click on Reset button
		And User Select the submitted "Submitted" in the KYC status Dropdown and verify the Group is listed on the page
		And User click on Reset button
		And User Select the incompleted "Incomplete" in the KYC status Dropdown and verify the Group is listed on the page
		And User click on Reset button
#		And User Select the All in the "KYC" status Dropdown and verify the Group is listed on the page
#		And User click on Reset button
#		And User close the Browser
		
	@CountryDropdown
	Scenario: To validate the Country Dropdown functionality in the Client Management page 
		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to Clients and Verify the Page Title
		And User Select the Country in the Country Dropdown and verify the Country is listed on the page 
		And User click on Reset button
#		And User close the Browser
		
		
	@KYCApproval
	Scenario: To validate the KYC Approval functionality in the client management page 
		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to KYC Submittted and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on KYC page in Client Management
		Then User verify the verification status on KYC page
		And User click on the Approvals and verify the form title 
		And User click on the Approvals and verify the Toast message 
		#Then User verify the Approval status on KYC page
		#And User Navigate to the Basic Information page and get the Client ID
		#And User Navigate to Clients and Verify the Page Title
		#And User search for Approved Client ID in search field and Verify data is appear on the page
		#Then User verify the Approval status on the Client page 
	
	@KYCReject
	Scenario: To validate the KYC Reject functionality in the Client management page 
#		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to KYC Submittted and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on KYC page in Client Management
		Then User verify the verification status on KYC page
		And User click on the Reject and verify the form title 
		And User enter the Reject Reason
		And Click on the submit button
		And User verify the Toast message	
		
	@ViewFunctionality_ClientManagement
	Scenario: To validate the Client Management sub-page functionality in the Client page 
#		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to Clients and Verify the Page Title
		And User Click on More option
		And User Click on View option	
		And User Navigate across the Client Management page
		And User Navigate to Client Management and Verify the Page Title 
		And User Navigate to Clients and Verify the Page Title
#		And User close the Browser
		
	@ViewFunctionality_DepositCrypto_Approval
	Scenario: To validate the Deposit Crypto functionality in the Client Management page 
#		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to Clients and Verify the Page Title
		And User Click on More option
		And User Click on View option	
		And User Navigate to Deposit Crypto page and Verify the page title 
		And User select the Crypto on the Crypto dropdown field
		And user enter the value on the amount field 
		And User Click on the Deposit button
		And User verify the Toast message and verify user navigate to the Crypto Transcation History page 
		And User Click on More option
		And User click on the Approvals button and verify the form title
		And User click on the Approve and verify the Toast message
#		And User close the Browser
		
	@ViewFunctionality_DepositCrypto_Reject
	Scenario: To validate the Deposit Crypto functionality in the Client Management page 
#		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to Clients and Verify the Page Title
		And User Click on More option
		And User Click on View option	
		And User Navigate to Deposit Crypto page and Verify the page title 
		And User select the Crypto on the Crypto dropdown field
		And user enter the value on the amount field 
		And User Click on the Deposit button
		And User verify the Toast message and verify user navigate to the Crypto Transcation History page 
		And User Click on More option
		And User click on the Reject button and verify the form title
		And User enter the Reject Reason
		And Click on the Reject button
		
	@ViewFunctionality_DepositFiat_Approval	
	Scenario: To validate the Deposit Fiat functionality in the Client Management page 
#		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to Clients and Verify the Page Title
		And User Click on More option
		And User Click on View option
		And User Navigate to Deposit Fiat page and Verify the page title
		And User select the Fiat on the Fiat dropdown field 
		And user enter the value on the amount field
		And User Click on the Deposit button
		And User verify the Toast message and verify user navigate to the Fiat Transcation History page
		And User Click on More option
		And User click on the Approvals button and verify the form title
		And User click on the Approve and verify the Toast message
#		And User close the Browser
		
	@ViewFunctionality_DepositFiat_Reject
	Scenario: To validate the Deposit Fiat functionality in the Client Management page 
#		Given User Navigate to Dashboard page in CRM applicatione 
		And User Navigate to Client Management and Verify the Page Title
		And User Navigate to Clients and Verify the Page Title
		And User Click on More option
		And User Click on View option
		And User Navigate to Deposit Fiat page and Verify the page title
		And User select the Fiat on the Fiat dropdown field 
		And user enter the value on the amount field
		And User Click on the Deposit button
		And User verify the Toast message and verify user navigate to the Fiat Transcation History page
		And User Click on More option
		And User click on the Reject button and verify the form title
		And User enter the Reject Reason
		And Click on the Reject button

	
	
	
	
	