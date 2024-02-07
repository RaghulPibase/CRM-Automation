

Feature: To validate the Login Functionality in CRM application

	@LoginPage
	Scenario Outline: To validate the Login Functionality of CRM application
		Given User should navigate to Login page of CRM application 
		And User enter the valid "<Email>" in the email field
		And User enter the valid "<Password>" in the password field
		And User click on the Signin button 
		Examples:
		|	Email								|	 Password		|
		| raghul@Pibase.info	| Qwerty@123	|