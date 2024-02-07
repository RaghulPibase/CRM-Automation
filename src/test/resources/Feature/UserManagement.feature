
@UserManagement
Feature: To validate the Approvals functionality in User Management page
	
#	 Background: To validate the Login Functionality of CRM application
#		Given User should navigate to Login page of CRM application 
#		And User enter the valid "raghul@Pibase.info" in the email field
#		And User enter the valid "Qwerty@123" in the password field
#		And User click on the Signin button 
		
	@UserManagement_Approvals
	Scenario: To validate the Send Crypto approvals in User Management 
#		Given User should login to CRM application
		Given User Navigate to User Management and Verify the Page Title
		And User Navigate to Approvals and Verify the Page Title
		And User Click on More option 
		And User Click on the Edit option
		And User Verify the Page Title in Approvals page
		Then User select the approvers 
		And Click on the submit button
		And User Click on More option in Withdraw fiat
		And User Click on the Edit option
		And User Verify the Page Title in Approvals page
		Then User select the approvers 
		And Click on the submit button
		And User Click on More option in Cryto Withdraw  
		And User Click on the Edit option
		And User Verify the Page Title in Approvals page
		Then User select the approvers 
		And Click on the submit button
		And User Click on More option in Cryto Deposit   
		And User Click on the Edit option
		And User Verify the Page Title in Approvals page
		Then User select the approvers 
		And Click on the submit button
		And User Click on More option in Fiat Deposit   
		And User Click on the Edit option
		And User Verify the Page Title in Approvals page
		Then User select the approvers 
		And Click on the submit button
#		And User close the Browser

	@Approvals_ToggleFunctionality
	Scenario: To validate the Toggle functionality in Approvals page 
#		Given User should login to CRM application
		Given User Navigate to User Management and Verify the Page Title
		And User Navigate to Approvals and Verify the Page Title
		And User Click on each Toggle button and Verify the Toast message
	
			
	@PermissionEntities
	Scenario: To validate the Permission entities functionality in user management 
#		Given User should login to CRM application
#		Given User Navigate to User Management and Verify the Page Title
		And User Navigate to Permission Entities and Verify the Page Title
		And Click on the Create button 
		And User enter the values in Name & Slug Field 
		And Click on the submit button
#		And User close the Browser
		
	@Permissions
	Scenario: To validate the Permission functionality in User Management page 
#		Given User should login to CRM application
#		Given User Navigate to User Management and Verify the Page Title
		And User Navigate to Permissions and Verify the Page Title
		And Click on the Create button
		And User enter the values in Name, Slug and Entity field
		And Click on the submit button
#		And User close the Browser

	@Roles
	Scenario: To validate the Roles functionality in the User Management page 
#		Given User should login to CRM application
#		Given User Navigate to User Management and Verify the Page Title
		And User Navigate to Roles and Verify the Page Title
		And Click on the Create button
		And User enter the values in Name,Slug Field and select the roles
		And Click on the submit button
#		And User close the Browser
		
	@CreateUser
	Scenario: To validate the Create user functionality in the user management page 
#		Given User should login to CRM application
#		Given User Navigate to User Management and Verify the Page Title
		And User Navigate to Users and Verify the Page Title
		And Click on the Create button
		And User enter the valid data in Email field
		And User select the Roles in the Dropdown field
		And User enter the valid data in First name field 
		And User enter the Valid data in second name field
		And Click on the submit button
		And User close the Browser
		
	@ToggleButton_Active
	Scenario: To validate the Toggle button functionality in User management page 
#		Given User should login to CRM application
#		Given User Navigate to User Management and Verify the Page Title
		And User Navigate to Users and Verify the Page Title
		And User Click on each Toggle button and Verify the Toast message	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	