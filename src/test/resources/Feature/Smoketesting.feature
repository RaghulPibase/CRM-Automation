@SmokeTesting
Feature: Navigations Functionalities of CRM application
			
	  @Page_NavigationFunctionality
	  Scenario: To validate the Navigation functionality across the application
			Given User Navigate to Dashboard and Verify the Page Title
			And User Navigate to User Management and Verify the Page Title
			And User Navigate to Users and Verify the Page Title
			And User Navigate to Roles and Verify the Page Title 
			And User Navigate to Permissions and Verify the Page Title 
			And User Navigate to Permission Entities and Verify the Page Title 
			And User Navigate to Approvals and Verify the Page Title
			And User Navigate to Client Management and Verify the Page Title
			And User Navigate to Dashboard in Client Management and Verify the Page Title
			And User Navigate to Clients and Verify the Page Title
			And User Navigate to KYC Submittted and Verify the Page Title
			And User Navigate to the Lead Management page and verify the page Title
			And User Navigate to the Lead page and Verify the page Title
			And User Navigate to Earn and Verify the Page Title 
			And User Navigate to Dashboard in Earn and Verify the Page Title 
			And User Navigate to Earn Products and verify the Page Title 
			And User Navigate to Simple Earn and verify the Page Title 
			And User Navigate to Simple Earn Histories and verify the Page Title
			And User Navigate to Earn and Verify the Page Title 
			And User Navigate to Walet and Verify the Page Title
			And User Navigate to Wallet Balances and Verify the Page Title
			And User Navigate to Crypto Transactions History and Verify the Page Title 
			And User Navigate to Cryptoapi Transaction History and Verify the Page Title 
			And User Navigate to Fiat Transaction History and Verify the Page Title 
			And User Navigate to Client Balances and Verify the Page Title 
			And User Navigate to Crypto Addresses and Verify the Page Title 
			And User Navigate to Wallet Histories and Verify the Page Title 
			And User Navigate to Spot Order and Verify the Page Title
			And User Navigate to Open Orders and Verify the Page Title 
			And User Navigate to Order History and Verify the Page Title
			And User Navigate to Trade History and Verify the Page Title
			And User Navigate to Order Executions and Verify the Page Title 
			And User Navigate to Settled Orders and Verify the Page Title 
			And User Navigate to Order Summary and Verify the Page Title
			And User Navigate to Markets and Verify the Page Title 
			And User Navigate to Support Ticket and Verify the Page Title 
			And User Navigate to Ticket page and verify the page Title 
			And User Navigate to Client Group and Verify the Page Title
			And User Navigate to Group and Verify the page Title 
			And User Navigate to the Export page and verify the page Title 
			And User Navigate to the Export Histories page and verify the page Title  		
			And User Navigate to ProfileIcon and Verify the Profile settings options 
			And User Click on Dashboard and Verify the Page Title 
			And User Navigate to ProfileIcon and Verify the Profile settings options
			And User Click on Settings and Verify the Page Title
			And User Navigate to ProfileIcon and Verify the Profile settings options
			And User Click on SignOut Option 
			And User close the Browser
			
		#@Pagination_Acrosstheapplication
		Scenario: To validate the Pagination functionality across the application
			Given User should login to CRM application
			And User Navigate to Dashboard and Verify the Page Title
			And User Click on the Cryto option in Deposit Pending Approvals
			Then Verify the user is Navigating between the pages 
			And User Click on the Fiat option in Deposit Pending Approvals
			Then Verify the user is Navigating between the pages
		#	And User Click on the Cryto option in WithDrawal Pending Approvals
			#Then Verify the user is Navigating between the pages
			#And User Click on the Fiat option in WithDrawal Pending Approvals
			#Then Verify the user is Navigating between the pages
			And User Navigate to User Management and Verify the Page Title
			Then Verify the user is Navigating between the pages
			And User Navigate to Roles and Verify the Page Title 
			Then Verify the user is Navigating between the pages
			And User Navigate to Permissions and Verify the Page Title
			Then Verify the user is Navigating between the pages
			And User Navigate to Permission Entities and Verify the Page Title
			Then Verify the user is Navigating between the pages
			And User Navigate to Approvals and Verify the Page Title
			Then Verify the user is Navigating between the pages
			And User Navigate to Client Management and Verify the Page Title
			Then Verify the user is Navigating between the pages
			And User Navigate to KYC Submittted and Verify the Page Title
			Then Verify the user is Navigating between the pages
			And User Navigate to Walet and Verify the Page Title
			And User Click on the Cryto option in wallet balance page 
			Then Verify the user is Navigating between the pages
			And User Click on the Fiat option in wallet balance page
			Then Verify the user is Navigating between the pages
			And User Navigate to Crypto Transactions History and Verify the Page Title
			Then Verify the user is Navigating between the pages
			And User Navigate to Cryptoapi Transaction History and Verify the Page Title 
			Then Verify the user is Navigating between the pages
			And User Navigate to Fiat Transaction History and Verify the Page Title
			Then Verify the user is Navigating between the pages
			And User Navigate to Client Balances and Verify the Page Title
			Then Verify the user is Navigating between the pages
			And User Navigate to Crypto Addresses and Verify the Page Title
			Then Verify the user is Navigating between the pages
			And User Navigate to Wallet Histories and Verify the Page Title
			
			
			
			
			
			
		
