@ClientGrop_NegativeScenarios
Feature: To validate the Client Group functionality with Negative Testcase 
	 
	@CreateClientGroup_UniqueValue
  Scenario Outline: To validate the Create functionality to Create Client group in CRM application
   	Given User Navigate to client Group and Verify the Page Title
   	And Click on the Create button and Verify the Form Title
   	And Enter the Valid Data "<Name>" in Name Field
   	And Enter the Valid Data "<Slug>" in Slug Field 
   	And Enter the Valid Data "<Description>" in Description Field 
   	And Click on the submit button
   	Then User Verify the Error message appear on the form 
   	Then Verify the Toast message for Creating Client Group
   	And User close the Browser
   	
   	Examples: 
		| Name 			| Slug		|	Description	|
		| Group 10	|	10			|	123					|
		
	 @CreateClientGroup_NullData
   Scenario Outline: To validate the Create functionality to Create client group in CRM application
   	Given User Navigate to client Group and Verify the Page Title
   	And Click on the Create button and Verify the Form Title
   	And Enter the InValid Data "<InvalidName>" in Name Field
   	And Enter the InValid Data "<InvalidSlug>" in Slug Field 
   	And Enter the InValid Data "<InvalidDescription>" in Description Field 
   	And Click on the submit button
   	Then Verify the Error message on the Create Client Group form
   	And Click on Cancel button
   	And User close the Browser
   	Examples: 
		| InvalidName 	| InvalidSlug		|	InvalidDescription	|
		| \n						|	\n						|	\n									|
		
			
	@CreateClientGroup_NameField_Null
	Scenario Outline: To validate the Create Client Group functionality using Name Field with Null value
		Given User Navigate to client Group and Verify the Page Title 
		And Click on the Create button and Verify the Form Title
		#And Enter the InValid Data "<InvalidName>" in Name Field 
		And Enter the Valid Data "<Slug>" in Slug Field 
   	And Enter the Valid Data "<Description>" in Description Field
		And Click on the submit button 		
		And Verify the Error message appear for the Name field
		Then Click on the Cancel button and verify user is on the Client Page 
		And User close the Browser
		Examples: 
		| Slug 	| Description	|
		| Jack	|	Check				|

		
	@CreateClientGroup_SlugField_Null
	Scenario Outline: To validate the create client group functionality using Slug Field with null value
		Given User Navigate to client Group and Verify the Page Title 
		And Click on the Create button and Verify the Form Title
		And Enter the Valid Data "<Name>" in Name Field
		And Enter the Valid Data "<Description>" in Description Field
		And Click on the submit button 		
		And Verify the Error message appear for the Slug field
		#Then Click on the Close button and verify user is on the Client Page 
		And User close the Browser
		Examples:
		| Name 	| Description	|
		| Jack	|	Check				|

	@EditClientGroup_InvalidData
	Scenario Outline: To validate the Edit functionality of the Client group with invalid data 
		Given User Navigate to client Group and Verify the Page Title 
		And User Click on More option 
		And User Click on the Edit option
		Then Verify the user is Edit Client Group Form 
		And Clear the Data in Name Field
   	And Clear the Data in Slug Field 
   	And Clear the Data in Description Field 
   	And Click on the submit button
   	Then Verify the Error message on the Edit Client Group form
   	#Then Click on the Close button and verify user is on the Client Page 
		And User close the Browser
		
	@AddMember_NullValue
	Scenario: To validate the Add Member functionality with Null Value
		Given User Navigate to client Group and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User Click on Add Member button
		Then Verify User is on Add Member form
		And Click on the submit button
		Then Verify the Error message on the Add Member form
		And User close the Browser
		
	@AddMember_InvalidData
	Scenario Outline: To validate the Add Member functionality with invalid Data
		Given User Navigate to client Group and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User Click on Add Member button
		Then Verify User is on Add Member form
		And User enter "<Invalid>" Data in Client form 
		And Verify the Suggestions Data 
		And User close the Browser
		Examples: 
		|	Invalid	|
		|	!@$%^&	|
		|	1234567 |
		|	ABCDE		|
		|	JOJO    |
		|	123@!@!	|
		|	!@$123	|
		|	ABC!@$	|
		|	!@$%ABC |
		
	@AddMember_ExistingMember
		Scenario Outline: To validate the Add Member functionality with Existing Data
		Given User Navigate to client Group and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User Click on Add Member button
		Then Verify User is on Add Member form
		And User select "<client>" in Client DropDown Box
		And Click on the submit button
		And User close the Browser
		Examples: 
		|	client |
		|	754		 |
		|	754		 |
		
	@SpotFeesPage_ToggleButton
	Scenario: To validate the Toggle button functionality in Spotfee page
		Given User Navigate to client Group and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User Click on Spot Fees option and Verify the Spot fees page Title
		And User click on the Toggle button randomly
		And User close the Browser
		
	@Levellimit_ToggleButton
		Scenario: To validate the Toggle button functionality in Levellimit page
		Given User Navigate to client Group and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User Click on Level limit option and Verify the Level limit page Title 
		And User click on the Toggle button randomly
		And User close the Browser

	@AddExcludeSymbols_NullValue
	Scenario: To validate the Add sysmbol functionality with Null value
		Given User Navigate to client Group and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User Click on Symbols option and Verify the Page Title
		And User Click on the Add Exclude sysmbols button and Verify the page title	
		And Click on the submit button
		Then Verify the Error message on the Add symbol form
		And User close the Browser
		
	@AddExcludeSymbols_InvalidSymbol
	Scenario Outline: To validate the Add exclude symbols field with invalid Data in Symbols field 
		Given User Navigate to client Group and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User Click on Symbols option and Verify the Page Title
		And User Click on the Add Exclude sysmbols button and Verify the page title
		And User enter "<Invalid>" Data in symbol form	
		And Verify the Suggestions Data
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
		
	@AddExcludeSymbols_ModeField_NullValue
	Scenario Outline: To validate the Add exclude symbols field with Null value in Mode field 
		Given User Navigate to client Group and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User Click on Symbols option and Verify the Page Title
		And User Click on the Add Exclude sysmbols button and Verify the page title
		And Select a symbols form symbol Dropdown box
		And Click on the submit button
		Then Verify the Error message on Mode Field
		And User close the Browser
		
	@SearchFunctionality_AddExcludeSymbols_Invalid
	Scenario Outline: To validate invalid search in Add excludesymbols page 
		Given User Navigate to client Group and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User Click on Symbols option and Verify the Page Title
		And User search for "<Invalid>" data in search field 
		Then Verify the Invalid data is listed on the screen 
		And Click the cancel button	
		And User close the Browser
		Examples:
		|	Invalid	|
		|	!@$%^&	|
		|	1234567 |
		|	\n			|
		|	JOJO    |
		|	ABC123	|
		|	123@!@!	|
		|	!@$123	|
		|	ABC!@$	|
		|	!@$%ABC |
	
	@SearchFunctionality_Invalid_ClientGroup
	Scenario Outline: To validate the invalid Search functionality in client group page
		Given User Navigate to client Group and Verify the Page Title
		And User search for "<Invalid>" data in search field
		Then Verify the Invalid data is listed on the screen 
		And Click the cancel button	
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

	@SearchFunctionality_Invalid_AddMember	
		Scenario Outline: To validate the invalid Search functionality in Add Member Page
		Given User Navigate to client Group and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User search for "<Invalid>" data in search field
		Then Verify the Invalid data is listed on the screen 
		And Click the cancel button	
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

		
		
		
		
		
		
		
		
		
		