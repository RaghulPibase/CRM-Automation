@CrossFunction
Feature: To validate the Support Ticket Functionality across Trader and CRM application
	
	@CreateSupportTicket
	Scenario Outline: To validate the Raise Ticket fuctionality in Support Ticket page 
		Given User Navigate to Support and Verify the page Title 
		And Click on the Raise Ticket button and Verify the form Title 
		And Enter the Valid Data "<Title>" in Title field 
		And Enter the Valid Data "<Description>" in Description field 
		And User attach a File in Upload field 
		And Click on the submit button
		And Verify the Toast message for Raise Ticket 
		And User close the Browser
		Examples:
		|	Title	   						  |	Description								| 
		|  Balance							|	Wallet Balance checking		|
	
	@Validate_SupportTicket_CRM
	Scenario: To validate the Support Ticket raised by the Client in CRM application 
		Given User Navigate to Support Ticket and Verify the page Title   
		And Verify the client Support Ticket appear on the Tickets Page 
		And Verify the Client Support Ticket status on the Ticket page