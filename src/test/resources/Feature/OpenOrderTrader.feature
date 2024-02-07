
Feature: To validate the Open Order flow between Trader and CRM application 

	@Trader_OpenOrder
	Scenario: To place the Open order in Trader 
		Given User should login to Trader application 
		And User Navigate to Trader page 
		And User search for Symbol and verify the title
		And User Click on Buy Limit order
		And User Enter the Limit Price 
		And User Enter the Limit Amount 
		And User Click On Buy button and Verify the Toast message 
		And Verify the Order is appear on the Open order page
	
		 