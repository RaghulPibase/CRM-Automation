@LeadManagement
Feature: To validate the Lead Management in CRM application 
	
#	Background: To validate the Login Functionality of CRM application
#		Given User should navigate to Login page of CRM application 
#		And User enter the valid "raghul@Pibase.info" in the email field
#		And User enter the valid "Qwerty@123" in the password field
#		And User click on the Signin button 
		
	@Create_Leads
	Scenario: Validate to create Leads in Lead Management page on CRM application  
		Given User Navigate to Dashboard page in CRM 
		And User Navigate to Lead Management page and Verify the Page Title
		And User Navigate to the Lead page and Verify the page Title
		And Click on the Create button 
		And User enter the valid data in First name field 
		And User enter the Valid data in second name field 
		And User enter the valid data in Email field  
		And User enter the valid data in mobile filed 
		And User select the source in source field 
		And User select the country in the country field
		And Click on the submit button
#		And User close the Browser
		
#	@Create_Multipe
#	Scenario: To create a multiple Leads in lead management page 
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title
#		And User will create a lead multiple times 
		
	@SearchEmail
	Scenario: To validate the search Functionality in Lead Management page
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title
		And User search for Email in search field and Verify Search data is appear on the page
		And User click on Reset button
#		And User close the Browser
		
	@StatusDropdown
	Scenario: To validate the Status Dropdown Functionality in Lead Management page
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title
		And User Select New "NEW" in select Dropdown and Verify Search data is appear on the page
		And User click on Reset button
		And User Select Call Back "CALLBACK" in select Dropdown and Verify Search data is appear on the page
		And User click on Reset button
		And User Select No Answer "NO ANSWER" in select Dropdown and Verify Search data is appear on the page
		And User click on Reset button
		And User Select Not Available "NOT AVAILABLE" in select Dropdown and Verify Search data is appear on the page
		And User click on Reset button
		And User Select OutOfCoverage "OUT OF COVERAGE" in select Dropdown and Verify Search data is appear on the page
		And User click on Reset button
		And User Select Not interested "NOT INTERESTED" in select Dropdown and Verify Search data is appear on the page
		And User click on Reset button
		And User Select Good Lead "GOOD LEAD" in select Dropdown and Verify Search data is appear on the page
		And User click on Reset button
		And User Select Junk "JUNK" in select Dropdown and Verify Search data is appear on the page
		And User click on Reset button
		
	@AssigneeDropdown_Lead
	Scenario: To validate the Assignee Dropdown functionality in the Lead Management page
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title
		And User select unassigned "Unassigned" in Assignee dropdown
		And User click on Reset button 
		And User select Assignee "Nithin S" in Assignee dropdown
		And User click on Reset button 
	
	@SourceDropdown	
	Scenario: To validate the Source Dropdown functionality in the Lead Management page
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title	
		And User Select source in source Dropdown and Verify Search data is appear on the page
		And User click on Reset button
		
	@CountryDropdown_Lead
	Scenario: To validate the Country Dropdown functionality in the Lead Management page
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title	
		And User Select Country in Country Dropdown and Verify Search data is appear on the page
		And User click on Reset button
		
	@KYCStatusDropdown_Lead
	Scenario: To validate the KYC Status Dropdown functionality in the Lead Management page
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title 
		And User Select the approved "Approved" in the KYC status Dropdown and verify the Group is listed on the page
		And User click on Reset button
		And User Select the reject "Rejected" in the KYC status Dropdown and verify the Group is listed on the page
		And User click on Reset button
		And User Select the submitted "Submitted" in the KYC status Dropdown and verify the Group is listed on the page
		And User click on Reset button
		And User Select the incompleted "Incomplete" in the KYC status Dropdown and verify the Group is listed on the page
		And User click on Reset button
		And User Select the Not-Register "Not-Register" in the KYC status Dropdown and verify the Group is listed on the page
		And User click on Reset button
		
	@BulkAssignee
	Scenario: To validate the Bulk Assignee functionality in the Lead Management page
		Given User Navigate to Dashboard page in CRM 
		And User Navigate to Lead Management page and Verify the Page Title
		And User Navigate to the Lead page and Verify the page Title
		And User Click on the Bulk Assignee button 
		And User Select the Select all check box 
		And User Click on the Bulk Assignee button
		Then Verify user is on Assign Form
		And User select the Assignee from Assign field 
		And Click on the submit button 
		
	@Edit_Lead
	Scenario: To validate the Edit functionality on Lead Management page 
		Given User Navigate to Dashboard page in CRM 
		And User Navigate to Lead Management page and Verify the Page Title
		And User Navigate to the Lead page and Verify the page Title
		And User Click on More option 
		And User Click on the Edit option	
#		Then Verify the user is on Edit Form 
		And User select New "NEW" status in the status dropdown  
		And Click on the submit button
		Then Verify the Toast message for Editing Lead
		And User Click on More option 
		And User Click on the Edit option	
		And User select ASSIGNED "ASSIGNED" status in the status dropdown  
		And Click on the submit button
		Then Verify the Toast message for Editing Lead
#		And User Click on More option 
#		And User Click on the Edit option	
#		And User select CALLBACK "CALLBACK" status in the status dropdown  
#		And Click on the submit button
#		Then Verify the Toast message for Editing Lead
#		And User Click on More option 
#		And User Click on the Edit option	
#		And User select NO ANSWER "NO ANSWER" status in the status dropdown  
#		And Click on the submit button
#		Then Verify the Toast message for Editing Lead
#		And User Click on More option 
#		And User Click on the Edit option	
#		And User select NOT AVAILABLE "NOT AVAILABLE" status in the status dropdown  
#		And Click on the submit button
#		Then Verify the Toast message for Editing Lead
#		And User Click on More option 
#		And User Click on the Edit option	
#		And User select OUT OF COVERAGE "OUT OF COVERAGE" status in the status dropdown  
#		And Click on the submit button
#		Then Verify the Toast message for Editing Lead
#		And User Click on More option 
#		And User Click on the Edit option	
#		And User select NOT INTERESTED "NOT INTERESTED" status in the status dropdown  
#		And Click on the submit button
#		Then Verify the Toast message for Editing Lead
#		And User Click on More option 
#		And User Click on the Edit option	
#		And User select GOOD LEAD "GOOD LEAD" status in the status dropdown  
#		And Click on the submit button
#		Then Verify the Toast message for Editing Lead
#		And User Click on More option 
#		And User Click on the Edit option	
#		And User select JUNK "JUNK" status in the status dropdown  
#		And Click on the submit button
#		Then Verify the Toast message for Editing Lead  
		
	@Assign_Lead
	Scenario: To validate the Assign functionality on Lead Management page 
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title
		And User Click on More option
		And User Click on the Assign option
		Then Verify user is on Assign Form
		And user clear the old assignee 
		And User select Assignee in Assignee DropDown Box  
		And Click on the submit button
		Then Verify the Toast message for Assigning the Lead 
		
	@View_Lead
	Scenario: To validate the View functionality on Lead management
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title
		And User Click on More option
		And User Click on View option
		And User navigate to the comment page
		And User enter the comment and Verify the Toast message
		
	@DeleteLead
	Scenario: To validate the Delete functionality on Lead Management page 
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
		And User Navigate to the Lead page and Verify the page Title
		And User Click on More option
		And User click on Delete option and Verify the Delete form Title
		And Click on Delete button
		And Verify the Toast message for Deleting the Leads
		
#	@AuditLog_Lead
#	Scenario: To validate the AuditLog functionality in Lead management page
#		Given User Navigate to Dashboard page in CRM 
#		And User Navigate to Lead Management page and Verify the Page Title
#		And User Navigate to the Lead page and Verify the page Title
		
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	