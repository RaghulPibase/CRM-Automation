@Negative_SupportTicket
Feature: To validate the Support Ticket functionality with the Negative scenarios

	@ResetButton_InvalidAction 
	Scenario: To validate the Reset button functionality 
		Given User Navigate to Support Ticket and Verify the page Title
		And User perform random action on reset button
		And User close the Browser
		
	@EditSupportTicket_withSelectOption
	Scenario: To validate the Edit support Ticket with selecting Select option on both Status and Priority field 
		Given User Navigate to Support Ticket and Verify the page Title
		And User Click on More option 
		And User Click on the Edit option 
		Then Verify user is on Edit support ticket page
		And User select the Status to Select option
		And User select the Priority to Select option
		And Click on the submit button
		Then Verify the error message appear on the Edit support ticket form 
		And User close the Browser
		
	@SearchDropdown_withInvalidSearch
	Scenario Outline: To validate the search Functionality with invalid data on support ticket page 
		Given User Navigate to Support Ticket and Verify the page Title
		And User search for "<Invalid>" data in search field
		And User click on Reset button
		And User close the Browser
		Examples:
		|	Invalid	|
		|	!@$%^&	|
		|	1234567 |
		|	JOJO    |
		|	ABC123	|
		|	123@!@!	|
		|	!@$123	|
		|	ABC!@$	|
		|	!@$%ABC |
	
	@AssigneeDropdown_withInvlidSearch
	Scenario Outline: To validate the Assignee dropdown with invalid data on support ticket page 
		Given User Navigate to Support Ticket and Verify the page Title
		And User search for "<Invalid>" data in Assignee field
		#When User search for invalid data in Assignee Dropdown and Verify the result
		And User click on Reset button
		And User close the Browser
		Examples:
		|	Invalid	|
		|	!@$%^&	|
		|	1234567 |
		|	JOJO    |
		|	ABC123	|
		|	123@!@!	|
		|	!@$123	|
		|	ABC!@$	|
		|	!@$%ABC |
		
		
	@ClientDropdown_withInvalidSearch
	Scenario Outline: To validate the Client dropdown with invalid data on support ticket page 
		Given User Navigate to Support Ticket and Verify the page Title
		And User search for "<Invalid>" data in Client Dropdown field
		#When User search for invalid data in Client field and Verify the result
		And User click on Reset button
		And User close the Browser
		Examples:
		|	Invalid	|
		|	!@$%^&	|
		|	1234567 |
		|	JOJO    |
		|	ABC123	|
		|	123@!@!	|
		|	!@$123	|
		|	ABC!@$	|
		|	!@$%ABC |
		
	@STAssignForm_withNulldata
	Scenario: To validate the Assign form with Null data 
		Given User Navigate to Support Ticket and Verify the page Title
		And User Click on More option
		And User Click on the Assign option
		Then Verify user is on Assign Form
		And User deselect the Assignee in Assign form
		And Click on the submit button
		Then Verify the Error message appear on the form 
		And User close the Browser
		
	@AssignForm_withInvalidData
	Scenario Outline: To validate the Assign form with invalid data
		Given User Navigate to Support Ticket and Verify the page Title
		And User Click on More option
		And User Click on the Assign option
		Then Verify user is on Assign Form
		And User deselect the Assignee in Assign form
		And User search for "<Invalid>" data in Assignee Dropdown
		#Then Verify the Error message appear on the list
		And User close the Browser
		Examples:
		|	Invalid	|
		|	!@$%^&	|
		|	1234567 |
		|	JOJO    |
		|	ABC123	|
		|	123@!@!	|
		|	!@$123	|
		|	ABC!@$	|
		|	!@$%ABC |
		
	#@InvalidText_MessageField
	Scenario Outline: To validate the Message field with invalid data 
		Given User Navigate to Support Ticket and Verify the page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Support Ticket Information page
		And Click on Messages Form 
		And Enter the "<Message>" data 
		And Click on the Send button
		Examples: 
		|																												Message											|
		|	222222222222222222222222222222222222222222222222222222222222222222222222222222222	|
	
	