@SpotOrder_Negative
Feature: To validate the Spot Order page with Negative scenarios 

	@InvalidSymbolPublishPriceManually
	Scenario Outline: To validate the Manual Price Publish form with Invalid Data 
		Given User should login to CRM application 
		And User Navigate to Spot Order and Verify the Page Title
		And User Click on Publish Price Manually and Verify the Page Title
		And User Select "<Invalid>" symbols form symbol Dropdown box in Publish price 
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
		
	@NullvalueSymbolPublishPriceManually
		Scenario Outline: To validate the Manual Price Publish form with Null Data 
		Given User should login to CRM application 
		And User Navigate to Spot Order and Verify the Page Title
		And User Click on Publish Price Manually and Verify the Page Title
		And User Click on Publish Price button
		Then User Verify the Symbols Error Message on the Manual price publish form
		And User close the Browser
		
	@NullPublishPriceManually
	Scenario Outline: To validate the Manual Price Publish form with Null Data
		Given User should login to CRM application 
		And User Navigate to Spot Order and Verify the Page Title
		And User Click on Publish Price Manually and Verify the Page Title
		And Select a symbols form symbol Dropdown box in Publish price
		And User Click on Publish Price button
		Then User Verify the Error Message on the Manual price publish form
		And User close the Browser
		
	@PlaceOrder_NullValue
	Scenario: To validate the place Order form with null value
		Given User should login to CRM application 
		And User Navigate to Spot Order and Verify the Page Title
		And User Click on Place Order and Verify the Page Title
		And Click on the submit button
		Then User Verify the Error Message on the Place Oder form
		And User close the Browser
		
	@InvalidClient_TradeSpotOrder
	Scenario Outline: To validate the Trade spot Order form with invalid Client
		Given User should login to CRM application 
		And User Navigate to Spot Order and Verify the Page Title
		And User Click on Place Order and Verify the Page Title
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
		
	@InvalidSymbols_TradeSpotOrder
	Scenario Outline: To validate the Trade spot Order form with invalid symbols
		Given User should login to CRM application 
		And User Navigate to Spot Order and Verify the Page Title
		And User Click on Place Order and Verify the Page Title
		And User select client in Client DropDown Box in Spot order form
		And User enter "<Invalid>" Data in Trade spot Order form	
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
		
	@InvalidPairDropdown
	Scenario Outline: To validate the Pair Dropdown Functionality in Open Order Page
		Given User should login to CRM application
		When User Navigate to Spot Order and Verify the Page Title
		And User Search for  "<Invalid>" Data in Pair dropdown 
	
		
	