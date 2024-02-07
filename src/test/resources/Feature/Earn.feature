@Earn
Feature: To validate the Earn functionality in CRM application
	
	@Create_Earn
  Scenario: To validate the Create functionality on Earn Product in CRM application
   	Given User should login to CRM application
   	And User Navigate to Earn and Verify the Page Title 
		And User Navigate to Earn Products and verify the Page Title 
		And Click on the Create button and Verify the Form Title in Create Earn Product
		And User select Asset in Asset Dropdown 
		And User select Simple Earn in Type dropdown
		And Click on the submit button
		#And User verify the Toast message for create Earn 
		
	@Delete_Earn 
	Scenario: To validate the Delete functionality on Earn Product in CRM application
   	Given User should login to CRM application
   	And User Navigate to Earn and Verify the Page Title 
		And User Navigate to Earn Products and verify the Page Title
		And User Click on More option
		And User click on Delete option and Verify the Delete form Title
		And Click on Delete button
		
	@Search_Earn
	Scenario: To validate the search functionality on Earn Product in CRM application 
		Given User should login to CRM application
   	And User Navigate to Earn and Verify the Page Title 
		And User Navigate to Earn Products and verify the Page Title
		And User search for Earn and Verify Search data is appear on the page 
		And Click the cancel button 
		And User close the Browser
		
	@SimpleEarn_Flexible
	Scenario: To vaidate the Flexible functionality on Simple Earn page 
		Given User should login to CRM application
   	And User Navigate to Earn and Verify the Page Title 
   	And User Navigate to Simple Earn and verify the Page Title
   	And User click on the Flexible button 
   	And User select client in Client Dropdown 
		And User click on Reset button
		And User select Asset in Asset Dropdown and Verify Created data is listed on Client Balance page
		And User click on Reset button
		And User close the Browser
   	
	@SimpleEarn_Locked
		Scenario: To vaidate the Locked functionality on Simple Earn page 
		Given User should login to CRM application
   	And User Navigate to Earn and Verify the Page Title 
   	And User Navigate to Simple Earn and verify the Page Title
   	And User click on the Locked button 
   	And User select client in Client Dropdown 
		And User click on Reset button
		And User select Asset in Asset Dropdown and Verify Created data is listed on Client Balance page
		And User click on Reset button
		And User close the Browser
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	