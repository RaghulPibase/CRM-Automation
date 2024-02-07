@SpotOrder
Feature: To validate the Spot Oder Page in CRM application 
	
#	Background: To validate the Login Functionality of CRM application
#		Given User should navigate to Login page of CRM application 
#		And User enter the valid "raghul@Pibase.info" in the email field
#		And User enter the valid "Qwerty@123" in the password field
#		And User click on the Signin button 
	
#	@OpenOrder
	@OpenOrder_PublishPriceManually @OpenOrder
	Scenario Outline: To validate the Manual Price Publish 
		Given User Navigate to Dashboard page and Verify the title in CRM 
		And User Navigate to Spot Order and Verify the Page Title
		And User Navigate to Open Orders and Verify the Page Title
		And User Click on Publish Price Manually and Verify the Page Title
		And Select a symbols form symbol Dropdown box in Publish price
		And User enter the "<BitPrice>" in Best Bit Price field
		And User enter the "<AskPrice>" in Best Ask Price field
		And User Click on Publish Price button 
		And User Verify the Toast Message
#		And User close the Browser  
		Examples: 
		|	BitPrice	|	AskPrice	|
		| 1					|	2					|

 #@OpenOrder		
 @OpenOrder_PlaceOrder_Functionality @OpenOrder
	Scenario: To validate the place Order Functionality in Open Order
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title 
#		And User Navigate to Open Orders and Verify the Page Title
		And User Click on Place Order and Verify the Page Title 
		And User select client in Client DropDown Box in Spot order form 
		And Select a symbols form symbol Dropdown box in Spot order form
		And Click on the submit button
#		And User close the Browser
	
	@OpenOrder_TypeDropdown @OpenOrder
	Scenario: To validate the Type Dropdown Functionality in Open Order 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
		And User Navigate to Open Orders and Verify the Page Title
		And User select Limit "Limit" in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User select Market "Market" in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User select Market maker "Market Maker" in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button		
#		And User close the Browser
		
#	#@TimeDropdown
		
  #@OpenOrder
	@PairDropDown_OpenOrder @OpenOrder
	Scenario: To validate the Pair Dropdown Functionality in Open Order Page
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Open Orders and Verify the Page Title
		And User search Symbols "BTCUSD" in Pair Dropdown box and Verify search data is listed on the Page
		And User click on Reset button
		And User search Symbols "ETHUSD" in Pair Dropdown box and Verify search data is listed on the Page
		And User click on Reset button
#		And User close the Browser
	
#OpenOrder
	@ClientDropdown_OpenOder @OpenOrder
	Scenario: To validate the Client Dropdown Functionality in Open Order Page
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Open Orders and Verify the Page Title
		And User select client in Client DropDown Box in suport ticket page 
		And User click on Reset button
#		And User close the Browser
	
#OpenOrder
#	@OpenOrder_ViewFunctionality @OpenOrder
#	Scenario: To validate the More Functionality in Open Order
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Open Orders and Verify the Page Title
#		And User Click on More option
#		And User Click on View option
#		Then Verify the user is on View Order Form 
#		Then Verify the Open Order details appear on the View Oder form 
#		And User close the Browser
		
#OpenOrder
	@OpenOrder_CancelFunctionality @OpenOrder
	Scenario: To validate the Cancel Functionality of Open Order
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Open Orders and Verify the Page Title
		And User Click on More option
		And User Click on Cancel option and Verify the Page Title 
		And Click on the Cancel button and verify user is on the Open Order Page
#		And User close the Browser
		
#OpenOrder
#	@OpenOrder_NavigatingClientManagement @OpenOrder
#	Scenario: To validate the Client ID in Open Order Page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Open Orders and Verify the Page Title
#		And User Click on the Client ID and verify the Page Title 
#		And User Navigate across the Client Management page 
#		And User close the Browser

#OrderHistory
	@OrderHistory_TypeDropdown @OrderHistory
	Scenario: To validate the Type Dropdown Functionality in Order History page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
		And User Navigate to Order History and Verify the Page Title
		And User select Limit "Limit" in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User select Market "Market" in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
		And User select Market maker "Market Maker" in Type Dropdown box and Verify Created data is listed on the page
		And User click on Reset button
#		And User close the Browser
		
#OrderHistory
	@PairDropDown_OrderHistory @OrderHistory
	Scenario: To validate the Pair Dropdown Functionality in Order History Page
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Order History and Verify the Page Title
		And User search Symbols "BTCUSD" in Pair Dropdown box and Verify search data is listed on the Page
		And User click on Reset button
		And User search Symbols "ETHUSD" in Pair Dropdown box and Verify search data is listed on the Page
		And User click on Reset button
#		And User close the Browser
#			
#OrderHistory
	@ClientDropdown_OrderHistory @OrderHistory
	Scenario: To validate the Client Dropdown Functionality in Order History Page
		Given User Navigate to Dashboard page and Verify the title in CRM 
		And User Navigate to Spot Order and Verify the Page Title
		And User Navigate to Order History and Verify the Page Title
		And User select client in Client DropDown Box in suport ticket page
		And User click on Reset button
#		And User close the Browser
	
#OrderHistory
#	@OrderHistory_ViewFunctionality @OrderHistory
#	Scenario: To validate the View Functionality in Order History page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Order History and Verify the Page Title 
#		And User Click on More option
#		And User Click on View option
#		Then Verify the user is on View Order Form 
#		Then Verify the Order History details appear on the View Oder form 
#		And User close the Browser
#		
#OrderHistory
	@OrderHistory_NavigatingClientManagement @OrderHistory
	Scenario: To validate the Client ID in Order History Page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Order History and Verify the Page Title
		And User Click on the Client ID and verify the Page Title
		And User Navigate across the Client Management page
#		And User close the Browser

#	#@TimeDropdown_OrderHistory

#Trade History
	@View_TradeHistory @TradeHistory
	Scenario: To validate the View Functionality in Trade History page 
		Given User Navigate to Dashboard page and Verify the title in CRM 
		And User Navigate to Spot Order and Verify the Page Title
		And User Navigate to Trade History and Verify the Page Title 
		And User Click on More option
		And User Click on View option
		Then Verify the user is on View Trade Form
		And User close the form
#		And User close the Browser
#		
#	#TradeHistory
#	@TradeHistory_NavigatingClientManagement @TradeHistory
#	Scenario: To validate the Client ID in Trade History Page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Trade History and Verify the Page Title 
#		And User Click on the Client ID and verify the Page Title 
#		And User Navigate across the Client Management page 
#		And User close the Browser	

#TradeHistory
	@ClientDropdown_TradeHistory @TradeHistory 
	Scenario: To validate the User Dropdown Functionality in Trade History Page
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
		And User Navigate to Trade History and Verify the Page Title 
		And User select client in Client Dropdown  
		And User click on Reset button
#		And User close the Browser
#		
#TradeHistory
	@Pair_TradeHistory @TradeHistory
	Scenario: To validate the Pair Dropdown Functionality in Trade History Page
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Trade History and Verify the Page Title 
		And User search BTCUSD "BTCUSD" in Pair Dropdown box and Verify search data is listed on the TradeHistory Page
		And User click on Reset button
		And User search ETHUSD "ETHUSD" in Pair Dropdown box and Verify search data is listed on the TradeHistory Page
		And User click on Reset button
#		And User close the Browser
#	
@TradeHistory
	@Side_TradeHistory @TradeHistory
	Scenario: To validate the Side Dropdown Functionality in Trade History Page
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Trade History and Verify the Page Title
		And User search Buy "Buy" in Side Dropdown box and Verify search data is listed on the Page
		And User click on Reset button
		And User search Sell "Sell" in side Dropdown box and Verify search data is listed on the Page
		And User click on Reset button
#		And User close the Browser

#	@Time_TradeHistory
		
#OrderExecution
	@OrderExecution_View @OrderExecution
	Scenario: To validate the View Functionality in Order Execution page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
		And User Navigate to Order Executions and Verify the Page Title
		And User Click on More option
		And User Click on View option
		Then Verify the user is on View Order Execution Form
		And User close the form
#		And User close the Browser
		 
#OrderExecution
	@OrderExecution_Pair @OrderExecution
	Scenario: To validate the Pair Dropdown functionality in Order Execution page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Order Executions and Verify the Page Title
		And User search Symbols in Pair Dropdown box and Verify search data is listed on the Order Execution page
		And User click on Reset button
#		And User close the Browser
#		
#OrderExecution 
	@OrderExecution_BuyUserID @OrderExecution
	Scenario: To validate the Order Execution page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Order Executions and Verify the Page Title	
		And User search Clients "1539" in BuyUser ID Dropdown box and Verify search data is listed on the Order Execution page
		And User click on Reset button
#		#And User close the Browser
		
#OrderExecution 
	@OrderExecution_SellUserID @OrderExecution
	Scenario: To validate the Order Execution page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Order Executions and Verify the Page Title	
		And User search Clients "2200" in SellUser ID Dropdown box and Verify search data is listed on the Order Execution page
		And User click on Reset button
#		#And User close the Browser
#		
#OrderExecution 
	@OrderExecution_BuyOrderType @OrderExecution
	Scenario: To validate the Order Execution page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Order Executions and Verify the Page Title	
		And User select Limit "Limit" in Type Dropdown box and Verify Created data is listed on the OrderExecution page
		And User click on Reset button
		And User select Market "Market" in Type Dropdown box and Verify Created data is listed on the OrderExecution page
		And User click on Reset button
		And User select Market maker "Market Maker" in Type Dropdown box and Verify Created data is listed on the OrderExecution page
		And User click on Reset button
#		And User close the Browser
#		
#OrderExecution 
	@OrderExecution_SellOrderType @OrderExecution
	Scenario: To validate the Order Execution page 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Order Executions and Verify the Page Title	
		And User select Limit "Limit" in SellOder Type Dropdown box and Verify Created data is listed on the OrderExecution page
		And User click on Reset button
		And User select Market "Market" in SellOder Type Dropdown box and Verify Created data is listed on the OrderExecution page
		And User click on Reset button
		And User select Market maker "Market Maker" in SellOder Type Dropdown box and Verify Created data is listed on the OrderExecution page
		And User click on Reset button
#		#And User close the Browser
#		
	@SettledOrders_PairDropdown
	Scenario: To validate the Settled Order page functionality
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
		And User Navigate to Settled Orders and Verify the Page Title
		And User search Symbols BTCUSD "BTCUSD" in Pair Dropdown box and Verify search data is listed on the SettledOrders Page
		And User click on Reset button
		And User search Symbols ETHUSD "ETHUSD" in Pair Dropdown box and Verify search data is listed on the SettledOrders Page
		And User click on Reset button
#		#And User close the Browser
#		
#	#	@Time_SettledOrders
#	

	@SettledOrders_ClientSearch
	Scenario: To validate the Settled Order page functionality
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
#		And User Navigate to Settled Orders and Verify the Page Title
		And User select client in Client DropDown Box in Settled Orders page
		And User click on Reset button
#		
	@OrderSummary 
	Scenario: To validate the Order Summary page functionality 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title
		And User Navigate to Order Summary and Verify the Page Title	
#		And User close the Browser
#		
#	@Markets 
#	Scenario: To validate the Market page functionality 
#		Given User Navigate to Dashboard page and Verify the title in CRM 
#		And User Navigate to Spot Order and Verify the Page Title	
#		And User scroll to Market 
#		And User Navigate to Markets and Verify the Page Title
#		And Select a BTCUSD "BTCUSD" symbols form symbol Dropdown box and Verify search data is listed on the market Page
#		And User click on Reset button
#		And Select a ETHUSD "ETHUSD" symbols form symbol Dropdown box and Verify search data is listed on the market Page
#		And User click on Reset button
#		And Select a UNIQUSD "UNIQUSD" symbols form symbol Dropdown box and Verify search data is listed on the market Page
#		And User click on Reset button
#		And User close the Browser	
		
 		
	
	