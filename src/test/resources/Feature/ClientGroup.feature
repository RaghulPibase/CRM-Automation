@All
@ClientGroup
Feature: To validate the Client Group functionality of CRM application

  #Background: To validate the Login Functionality of CRM application
#		Given User should navigate to Login page of CRM application 
#		And User enter the valid "raghul@Pibase.info" in the email field
#		And User enter the valid "Qwerty@123" in the password field
#		And User click on the Signin button 
  
  @CreateClientGroup
  Scenario: To validate the Create functionality to Create Client group in CRM application
		Given User Navigate to Dashboard and Verify the title
   	And User Navigate to client Group and Verify the Page Title
   	And User Navigate to Group and Verify the page Title
   	And Click on the Create button and Verify the Form Title
   	And Enter the Valid Data in Name Field
   	And Enter the Valid Data in Slug Field 
   	And Enter the Valid Data in Description Field 
   	And Click on the submit button
   	Then Verify the Toast message for Creating Client Group
   #	And User close the Browser  
  
	@Edit_ClientGroup
	Scenario: To validate the Edit functionality under More option in Client group page 
#		Given User Navigate to Dashboard and Verify the title
     #And User Navigate to client Group and Verify the Page Title
#		 And User Navigate to Group and Verify the page Title
		 And User Click on More option 
		 And User Click on the Edit option
		 Then Verify the user is Edit Client Group Form 
   	 And User Edit the Data in Name Field 
   	 And User Edit the Data in Description Field
   	 And Click on the submit button
   	 Then Verify the Toast message for Editing Client Group 
   #	 And User close the Browser
   	
	@ViewFunctionality_ClientGroup
	Scenario: To validate the View functionality under More option in Client group page
#		Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
#		And User Navigate to Group and Verify the page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on Client Group Information page	
    #And User close the Browser
    
  @AddMember
  Scenario: To Validate the Add Member functionality in Clients form
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
#		And User Click on More option
#		And User Click on View option
#		Then Verify the user is on Client Group Information page
		And User Click on Add Member button
		Then Verify User is on Add Member form 
		And User select client in Client DropDown Box
		And Click on the submit button
		Then Verify the Toast message for Add Member
#		And User close the Browser
	
	@Search_Clients	
	Scenario: To Validate the Search Functionality in Client form
#		Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
#		And User Navigate to Group and Verify the page Title
#		And User Click on More option
#		And User Click on View option
		Then Verify the user is on Client Group Information page
		And User search for Name in search field and Verify Search data is appear on the page
		And Click the cancel button
#		And User close the Browser
  
  @ClientsPage_RemoveMember
  Scenario: To validate the Remove Members in Clients page 
 #	  Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
#		And User Click on More option
#		And User Click on View option
#		Then Verify the user is on Client Group Information page
		And User Click on More option
		And User Click on Remove option
		And Verify the Remove Form 
		And User Click on Remove button
		Then Verify the Toast message for Remove Member in clients page	
#		And User close the Browser
  
  @SpotFeesPage
  Scenario: Validate to Create the Spot fees in Client page 
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
#		And User Click on More option
#		And User Click on View option
#		Then Verify the user is on Client Group Information page
		And User Click on Spot Fees option and Verify the Spot fees page Title
		And User activated the Toggle button and verify the status
		And Click on Edit button 
		And Enter the Valid data on each field 
		And Click on the Tick button for Submit
#		And User close the Browser
		
	@LevelLimitsPage
	Scenario: Validate to Create the Level limit in client page
#		Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
#		And User Navigate to Group and Verify the page Title
#		And User Click on More option
#		And User Click on View option
#		Then Verify the user is on Client Group Information page
		And User Click on Level limit option and Verify the Level limit page Title 
		And User activated the Toggle button and verify the status
		And Click on Edit button 
		And Enter the data on each field on CRYPTO WITHDRAWAL LIMITS
		And Click on the Tick button for Submit
#		And User close the Browser
  
  @AddExcludeSymbols
  Scenario: Validate to Add Exclude Symbols for clients in Symbols page 
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
#		And User Click on More option
#		And User Click on View option
#		Then Verify the user is on Client Group Information page
		And User Click on Symbols option and Verify the Page Title
		And User Click on the Add Exclude sysmbols button and Verify the page title
		And Select a symbols form symbol Dropdown box
		And Select a option from Mode Dropdown box
		And Click on the submit button
		And Verify the Toast message for Adding symbol 
#		And User close the Browser
		
  @EditExcludeSymbols_Suspend
  Scenario Outline: Validate to Suspen symbols for clients in symbols page 
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
#		And User Click on More option
#		And User Click on View option
#		Then Verify the user is on Client Group Information page
#		And User Click on Symbols option and Verify the Page Title
		And User Click on More option
		And User click on Edit option and Verify the Edit form Title
		And Select a Suspend option from Mode Dropdown box
		And Enter Valid data on "<SuspendUntil>" Suspend Until feld
		And Click on the submit button
		And Verify the Toast message for Editing symbol to Suspend
  #	And User close the Browser
  	Examples: 
  	|	SuspendUntil	|
  	|	5							|
  	
  @EditExcludeSymbols_Stop
  Scenario: Validate to Stop symbols for Clients in sysmbols page
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
#		And User Click on More option
#		And User Click on View option
#		Then Verify the user is on Client Group Information page
#		And User Click on Symbols option and Verify the Page Title
		And User Click on More option
		And User click on Edit option and Verify the Edit form Title
		And Select a Stop option from Mode Dropdown box
		And Click on the submit button
		And Verify the Toast message for Editing symbol to Suspend
  #	And User close the Browser
  
  @DeleteExcludeSymbols
  Scenario: Validate to Delete Exclude symbols for Clients in Symbols page 
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
#		And User Click on More option
#		And User Click on View option
#		Then Verify the user is on Client Group Information page
#		And User Click on Symbols option and Verify the Page Title 
		And User Click on More option
		And User click on Delete option and Verify the Delete form Title
		And Click on Delete button
		And Verify the Toast message for Deleting Sysmbol
#		And User close the Browser
 	
 	@DeleteClientGroupPage
 	Scenario: To validate to Delete functionality in Client Group page 
  	Given User Navigate to Dashboard and Verify the title
   	And User Navigate to client Group and Verify the Page Title
  	And User Navigate to Group and Verify the page Title
		And User Click on More option
		And User click on Delete option and Verify the Delete form Title
		And Click on Delete button
		And Verify the Toast message for Deleting the Client Group
#		And User close the Browser
  
  @ToggleButtonFunctionality_ClienGroupPage
  Scenario: To validate the Toggle button functionality in Client Group Page
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
  	And User Click on the Toggle and Verify the Status 
  #	And User close the Browser  	
 
	@SearchFunctionality_ClientGroup
	Scenario: To validate the Search Functionality in Client Group page 
#		Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
#		And User Navigate to Group and Verify the page Title
		And User search on Name field and Verify Search data is appear on the page 
		And Click the cancel button 
#		And User close the Browser
  
  @AuditLogsFunctionality_Dropdown
  Scenario: To validate the Audit Logs Functionality in Client Group page
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
  	And User Click on the Audit Logs button and Verify the Page Title 
  	And User select Create in method Dropdown box and Verify Created data is listed on the page 
  	And User select Update in method Dropdown box and verify Update data is listed on the page 
  	And User select Delete in method Dropdown box and verify Delete data is listed on the page
  #	And User close the Browser
 
  @AuditLogsFunctionality_View
  Scenario: To validate the Audit Logs Functionality in Client Group page
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
  #	And User Click on the Audit Logs button and Verify the Page Title
  	And User Click on View option
  	And User Click on the Audit Logs Option and Verify the Page Title
  	And User Click on the Group option and Verify the Page Title
  #	And User close the Browser
  	
  #@ClientGroup_Pagination
  #Scenario: To validate between the pages in Client Group 
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
   #	Then Verify the user is Navigating between the pages
   #	And User close the Browser
   	
  @ToggleButtonFunctionality_ClienGroupPage_Click
  Scenario: To validate the Toggle button functionality in Client Group Page
  #	Given User Navigate to Dashboard and Verify the title
   #	And User Navigate to client Group and Verify the Page Title
  #	And User Navigate to Group and Verify the page Title
  	And User Click on each Toggle button and Verify the Toast message 
  #	And User close the Browser 
