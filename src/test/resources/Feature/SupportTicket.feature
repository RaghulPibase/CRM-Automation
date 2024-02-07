@SupportTicket
Feature: To validate the Support Ticket Functionality in CRM application
	
#	 Background: To validate the Login Functionality of CRM application
#		Given User should navigate to Login page of CRM application 
#		And User enter the valid "raghul@Pibase.info" in the email field
#		And User enter the valid "Qwerty@123" in the password field
#		And User click on the Signin button 
		
	#Status : OPEN 
	#Priority : MEDIUM
	@Edit_SupportTicket_OPENStatus_MEDIUMPriority
	Scenario: To validate the Edit functionality in support Ticket page
		Given User Navigate to Dashboard page and Verify the title 
		And User Navigate to Support Ticket and Verify the page Title
		And User Navigate to Ticket page and verify the page Title 
		And User Click on More option 
		And User Click on the Edit option 
		Then Verify user is on Edit support ticket page 
		And User select the Status to Open
		And User select the Priority to Medium
		And Click on the submit button
		And Verify the Toast message for updating support Ticket
		Then Verify the updated Ticket appear on the Ticket page 
#		And User close the Browser
	
	#Status : OPEN
	#Priority : HIGH
	@Edit_SupportTicket_OPENStatus_HIGHPriority
	Scenario: To validate the Edit functionality in support Ticket page
#		Given User Navigate to Dashboard page and Verify the title 
#		And User Navigate to Support Ticket and Verify the page Title
#		And User Navigate to Ticket page and verify the page Title 
		And User Click on More option 
		And User Click on the Edit option 
		Then Verify user is on Edit support ticket page 
		And User select the Status to Open
		And User select the Priority to High
		And Click on the submit button
		And Verify the Toast message for updating support Ticket 
#		And User close the Browser

	#Status : OPEN
	#Priority : LOW
	@Edit_SupportTicket_OPENStatus_HIGHPriority
	Scenario: To validate the Edit functionality in support Ticket page
#		Given User Navigate to Dashboard page and Verify the title 
#		And User Navigate to Support Ticket and Verify the page Title
#		And User Navigate to Ticket page and verify the page Title 
		And User Click on More option 
		And User Click on the Edit option 
		Then Verify user is on Edit support ticket page 
		And User select the Status to Open	
		And User select the Priority to Low
		And Click on the submit button
		And Verify the Toast message for updating support Ticket 
#		And User close the Browser
		
	#Status : CLOSE
	#Priority : LOW	
	@Edit_SupportTicket_CLOSEStatus_LOWPriority	
	Scenario: To validate the Edit functionality in support Ticket page
#		Given User Navigate to Dashboard page and Verify the title 
#		And User Navigate to Support Ticket and Verify the page Title
#		And User Navigate to Ticket page and verify the page Title 
		And User Click on More option 
		And User Click on the Edit option 
		Then Verify user is on Edit support ticket page 
		And User select the Status to Close	
		And User select the Priority to Low
		And Click on the submit button
		And Verify the Toast message for updating support Ticket 
#		And User close the Browser
		
	#Status : CLOSE
	#Priority : MEDIUM
	@Edit_SupportTicket_CLOSEStatus_MEDIUMPriority	
	Scenario: To validate the Edit functionality in support Ticket page
#		Given User Navigate to Dashboard page and Verify the title 
#		And User Navigate to Support Ticket and Verify the page Title
#		And User Navigate to Ticket page and verify the page Title 
		And User Click on More option 
		And User Click on the Edit option 
		Then Verify user is on Edit support ticket page 
		And User select the Status to Close	
		And User select the Priority to Medium
		And Click on the submit button
		And Verify the Toast message for updating support Ticket 
#		And User close the Browser	
		
	#Status : CLOSE
	#Priority : HIGH
	@Edit_SupportTicket_CLOSEStatus_HIGHPriority
	Scenario: To validate the Edit functionality in support Ticket page
#		Given User Navigate to Dashboard page and Verify the title 
#		And User Navigate to Support Ticket and Verify the page Title
#		And User Navigate to Ticket page and verify the page Title 
		And User Click on More option 
		And User Click on the Edit option 
		Then Verify user is on Edit support ticket page 
		And User select the Status to Close	
		And User select the Priority to High
		And Click on the submit button
		And Verify the Toast message for updating support Ticket 
#		And User close the Browser
		
	@AssignSupportTicket	
	Scenario: To validate the Assign Functionality in Tickets page 
#		Given User Navigate to Dashboard page and Verify the title 
#		And User Navigate to Support Ticket and Verify the page Title
#		And User Navigate to Ticket page and verify the page Title 
		And User Click on More option
		And User Click on the Assign option
		Then Verify user is on Assign Form
		And User select the Assignee from Assign field 
		And Click on the submit button
		And Verify the Toast message for support Ticket Assigned
#		And User close the Browser
		
	@ViewFunctionality_SupportTicket
	Scenario Outline: To validate the View Functionality of Support Ticket 	
#		Given User Navigate to Dashboard page and Verify the title 
#		And User Navigate to Support Ticket and Verify the page Title
#		And User Navigate to Ticket page and verify the page Title 
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Support Ticket Information page
		Then Verify the Information form is Selected 
		And Verify the Suppor Ticket data appearing on the Information form 
		And Click on Messages Form 
		And Enter the "<Message>" data 
		And Click on the Send button
		Then Verify the message is appear on the screen
#		And User attach a File in Upload field 
#		Then Verify the File is appear on the screen
		And Click on Histories Form 
		Then Verify the Support Ticket Histories
#		And User close the Browser 
		Examples: 
		|	Message											|
		|	Our team will reach out within 24hours, and thanks for the patients 	|
		
	@ClientDropdown_SupportTicket
	Scenario: To Validate the Dropdown Functionality in Support Ticket page 
#		Given User Navigate to Dashboard page and Verify the title 
#		And User Navigate to Support Ticket and Verify the page Title
		And User Navigate to Ticket page and verify the page Title 
		And User select client in Client DropDown Box in suport ticket page 
		#Then Verify the Client is listed on the Screen 
		And User click on Reset button
		
	@SearchFunctionality_SupportTicket1
	Scenario: To validate the Search functionality in support Ticket 
#		Given User Navigate to Dashboard page and Verify the title 
#		And User Navigate to Support Ticket and Verify the page Title
#		And User Navigate to Ticket page and verify the page Title 
		When User search on Search field and Verify Search data is appear on the page
		And Click the cancel button
		And User click on Reset button
#		And User close the Browser
	
	@AssigneeDropdown_SupportTicket
	Scenario: To validate the Assignee dropdown functionality in support ticket page 
		Given User Navigate to Dashboard page and Verify the title 
		And User Navigate to Support Ticket and Verify the page Title
		And User Navigate to Ticket page and verify the page Title 
		And User select Assignee in Assignee DropDown Box in suport ticket page 
		And User click on Reset button
		