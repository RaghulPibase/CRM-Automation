@Export
Feature: To validate the Export functionality in CRM application 
#
#	Background: To validate the Login Functionality of CRM application
#		Given User should navigate to Login page of CRM application 
#		And User enter the valid "raghul@Pibase.info" in the email field
#		And User enter the valid "Qwerty@123" in the password field
#		And User click on the Signin button
		
#	@LeadExport_Export   
#	Scenario: To validate the Export Functionality in Lead Management page 
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title
#		And User Select New "NEW" in select Dropdown and Verify Search data is appear on the page
#		And User Select source in source Dropdown and Verify Search data is appear on the page
#		And User Select Country in Country Dropdown and Verify Search data is appear on the page
#		And User Select the approved "Approved" in the KYC status Dropdown and verify the Group is listed on the page
#		And User click the Export button and Verify the form
#		And User click on the Yes button
#		And User verify the Exported Initiated form Title 
#		And User Verifty the Notification appear on the screen 
#		And User click on the View button in the Notification form 
#		And User click on the Download button 
	 
	@ClientGroup_Export
	Scenario: To validate the Export Functionality in Client group page 
		Given User Navigate to Dashboard and Verify the title
   	And User Navigate to client Group and Verify the Page Title
   	And User Navigate to Group and Verify the page Title
   	And User click the Export button and Verify the form
		And User click on the Yes button
		And User verify the Exported Initiated form Title 
		And User Verifty the Notification appear on the screen 
		And User click on the View button in the Notification form 
		And User click on the Download button
		
	@OpenOrder_Export
	Scenario: To validate the Export Functionality in Open Order page 
		Given User Navigate to Dashboard page and Verify the title in CRM 
		And User Navigate to Spot Order and Verify the Page Title
		And User Navigate to Open Orders and Verify the Page Title
		And User select Limit "Limit" in Type Dropdown box and Verify Created data is listed on the page
		And User search Symbols "ETHUSD" in Pair Dropdown box and Verify search data is listed on the Page
		And User click the Export button and Verify the form
		And User click on the Yes button
		And User verify the Exported Initiated form Title 
		And User Verifty the Notification appear on the screen 
		And User click on the View button in the Notification form 
		And User click on the Download button
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		