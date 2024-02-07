package Page;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic;

import BaseClass.BaseClass;

public class SpotOrderPages extends BaseClass {

	public SpotOrderPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Publish Price Manually']")
	WebElement PublishPriceButton;

	@FindBy(xpath = "//h1[text()='Manual Price Publish']")
	WebElement PublishPriceTitle;

	@FindBy(xpath = "//input[@name='best_bid_price']")
	WebElement BitPrice;

	@FindBy(xpath = "//input[@name='best_ask_price']")
	WebElement AskPrice;

	@FindBy(xpath = "//span[text()='Publish Price']")
	WebElement PublishPriceSubmitButton;

	@FindBy(xpath = "//div[text()='Price Published successfully']")
	WebElement PublishPriceToastmsg;

	@FindBy(xpath = "//h1[text()='Trade Spot Order']")
	WebElement PlaceOderTitle;

	@FindBy(xpath = "(//span[text()='All'])[1]")
	WebElement TypeDropDown;

//	@FindBy(xpath = "//button[text()='Limit']")
//	WebElement LimitTypeDropDown;
//
//	@FindBy(xpath = "//button[text()='Market']")
//	WebElement MarketTypeDropDown;
//
//	@FindBy(xpath = "//button[text()='Market Maker']")
//	WebElement MarketMakerTypeDropDown;

	@FindBy(xpath = "//button[text()='Reset']")
	WebElement ResetButton;

	@FindBy(xpath = "//div[@class='relative flex min-h-[300px] items-center p-8 text-center ']")
	WebElement MarketTypePage;

	@FindBy(xpath = "//h1[text()='View Order']")
	WebElement ViewOrderTitle;

	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement CancelButton;

	@FindBy(xpath = "//h1[text()='Open Orders']")
	WebElement OpenOrderTitle;

	@FindBy(xpath = "(//tr[@class='hover:bg-[#fbfbfb] undefined']//td[3])[1]")
	WebElement ClientIDOpenOrder;

	@FindBy(xpath = "(//h1[text()='Client Management'])[1]")
	WebElement ClientManagementTitle;

	@FindBy(xpath = "//span[text()='Order History']")
	WebElement OrderHistory;

	@FindBy(xpath = "//h1[text()='Order History']")
	WebElement OrderHistoryTitle;

	@FindBy(xpath = "//span[text()='Trade History']")
	WebElement TradeHistory;

	@FindBy(xpath = "//h1[text()='Trade History']")
	WebElement TradeHistoryTitle;

	@FindBy(xpath = "//span[text()='Order Executions']")
	WebElement OrderExecution;

	@FindBy(xpath = "//h1[text()='Order Executions']")
	WebElement OrderExecutionsTitle;

	@FindBy(xpath = "//span[text()='Settled Orders']")
	WebElement SettledOrder;

	@FindBy(xpath = "//h1[text()='Settled Orders']")
	WebElement SetteledOrdersTitle;

	@FindBy(xpath = "//span[text()='Order Summary']")
	WebElement OrderSummary;

	@FindBy(xpath = "//h1[text()='Order Summary - Net Obligation report']")
	WebElement OrderSummaryTitle;

	@FindBy(xpath = "//span[text()='Markets']")
	WebElement Markets;

	@FindBy(xpath = "//h1[text()='Markets']")
	WebElement MarketsTitle;

	@FindBy(xpath = "//h1[text()='View Trade']")
	WebElement ViewTradeForm;

	@FindBy(xpath = "//h1[text()='View Order Execution']")
	WebElement ViewOrderExecutionForm;

	@FindBy(xpath = "//dt[text()='USER']//following-sibling::dd")
	WebElement ViewOrderUser;

	@FindBy(xpath = "//dt[text()='USER SEQ ID']//following-sibling::dd")
	WebElement ViewOrderSeqID;

	@FindBy(xpath = "//dt[text()='DATE']//following-sibling::dd")
	WebElement ViewOrderDate;

	@FindBy(xpath = "//dt[text()='TYPE']//following-sibling::dd")
	WebElement ViewOrderType;

	@FindBy(xpath = "//dt[text()='SIDE']//following-sibling::dd")
	WebElement ViewOrderSide;

	@FindBy(xpath = "//dt[text()='SYMBOL']//following-sibling::dd")
	WebElement ViewOrderSymbol;

	@FindBy(xpath = "//dt[text()='ORDER PRICE']//following-sibling::dd")
	WebElement ViewOrderPrice;

	@FindBy(xpath = "//dt[text()='AVG PRICE']//following-sibling::dd")
	WebElement ViewOrderAvgPrice;

	@FindBy(xpath = "//dt[text()='QTY']//following-sibling::dd")
	WebElement ViewOrderQty;

	@FindBy(xpath = "//dt[text()='TOTAL']//following-sibling::dd")
	WebElement ViewOrderTotal;

	@FindBy(xpath = "//dt[text()='Status']//following-sibling::dd")
	WebElement ViewOrderStatus;

	@FindBy(xpath = "//dt[text()='FILLED QTY']//following-sibling::dd")
	WebElement ViewOrderFilledQty;

	@FindBy(xpath = "(//span[text()='User Seq Id']//parent::th//ancestor::thead//following-sibling::tbody//td)[3]")
	WebElement OrderSeqID;

	@FindBy(xpath = "(//span[text()='Date']//parent::th//ancestor::thead//following-sibling::tbody//td)[4]")
	WebElement OrderDate;

	@FindBy(xpath = "(//span[text()='Pair']//parent::th//ancestor::thead//following-sibling::tbody//td)[5]")
	WebElement OrderPair;

	@FindBy(xpath = "(//span[text()='Type']//parent::th//ancestor::thead//following-sibling::tbody//td)[6]")
	WebElement OrderType;

	@FindBy(xpath = "(//span[text()='Side']//parent::th//ancestor::thead//following-sibling::tbody//td)[7]")
	WebElement OrderSide;

	@FindBy(xpath = "(//span[text()='Order Price']//parent::th//ancestor::thead//following-sibling::tbody//td)[8]")
	WebElement OrderPrice;

	@FindBy(xpath = "(//span[text()='Qty']//parent::th//ancestor::thead//following-sibling::tbody//td)[9]")
	WebElement OrderQty;

	@FindBy(xpath = "(//span[text()='Filled Qty']//parent::th//ancestor::thead//following-sibling::tbody//td)[10]")
	WebElement OrderFilledQty;

	@FindBy(xpath = "(//span[text()='Remaining Qty']//parent::th//ancestor::thead//following-sibling::tbody//td)[11]")
	WebElement OrderRemainingQty;

	@FindBy(xpath = "(//span[text()='Total']//parent::th//ancestor::thead//following-sibling::tbody//td)[12]")
	WebElement OrderTotal;

	@FindBy(xpath = "(//span[text()='Status']//parent::th//ancestor::thead//following-sibling::tbody//td)[13]")
	WebElement OrderStatus;

	@FindBy(xpath = "//dt[text()='ID']//following-sibling::dd")
	WebElement ViewOrderID;

	@FindBy(xpath = "(//span[text()='ID']//parent::th//ancestor::thead//following-sibling::tbody//td)[1]")
	WebElement OrderID;

	@FindBy(xpath = "//div[text()='Cancel']")
	WebElement CancelOption;

	@FindBy(xpath = "//h3[text()='Cancel Order']")
	WebElement CancelFormTitle;

	@FindBy(xpath = "//span[text()='Pair']//parent::div//child::input[@role='combobox']")
	WebElement PairDropdown;

	@FindBy(xpath = "//button[text()='Reset']")
	WebElement Reset;

	/*
	 * @FindBy (xpath ="(//div[@class=' css-19bb58m']//input)[3]") WebElement
	 * SymbolsDropOD;
	 */

	@FindBy(xpath = "//div[text()='Select...']//following::input")
	WebElement symbolDDManualPrice;

	@FindBy(xpath = "//p[text()='Symbol is required']")
	WebElement ErrManualPrice;

	@FindBy(xpath = "//p[text()='Best Bid Pirce must be a number']")
	WebElement ErrBidPrice;

	@FindBy(xpath = "//p[text()='Best Ask Price must be a number']")
	WebElement ErrAskPrice;

	@FindBy(xpath = "//div[text()='Basic Information']")
	WebElement BasicInfo;

	@FindBy(xpath = "//h1[text()='Basic Information']")
	WebElement BasicInfoTitle;

	@FindBy(xpath = "//div[text()='Login Activities']")
	WebElement LoginAct;

	@FindBy(xpath = "//h1[text()='Login Activities']")
	WebElement LoginActTitle;

	@FindBy(xpath = "//div[text()='Security Activities']")
	WebElement SecurityAct;

	@FindBy(xpath = "//h1[text()='Security Activities']")
	WebElement SecurityActTitle;

	@FindBy(xpath = "//div[text()='Wallet Balances']")
	WebElement WalletBal;

	@FindBy(xpath = "//h1[text()='Wallet Balances']")
	WebElement WalletBalTitle;

	@FindBy(xpath = "//div[text()='Wallet Histories']")
	WebElement WalletHist;

	@FindBy(xpath = "//h1[text()='Wallet Histories']")
	WebElement WalletHistTitle;

	@FindBy(xpath = "//div[text()='Crypto Transactions History']")
	WebElement CryptoTrans;

	@FindBy(xpath = "//h1[text()='Crypto Transactions History']")
	WebElement CryptoTransTitle;

	@FindBy(xpath = "//div[text()='Fiat Transactions History']")
	WebElement FiatTrans;

	@FindBy(xpath = "//h1[text()='Fiat Transactions History']")
	WebElement FiatTransTitle;

	@FindBy(xpath = "//div[text()='Spot Open Orders']")
	WebElement SpotOpen;

	@FindBy(xpath = "//h1[text()='Spot Open Orders']")
	WebElement SpotOpenTitle;

	@FindBy(xpath = "//div[text()='Spot Order History']")
	WebElement SpotHistory;

	@FindBy(xpath = "//h1[text()='Spot Order History']")
	WebElement SpotHistoryTitle;

	@FindBy(xpath = "//div[text()='Spot Trade History']")
	WebElement SpotTradeHist;

	@FindBy(xpath = "//h1[text()='Spot Trade History']")
	WebElement SpotTradeHistTitle;

	@FindBy(xpath = "//div[text()='Deposit Fiat']")
	WebElement DepositeFiat;

	@FindBy(xpath = "//p[text()='Deposit Fiat']")
	WebElement DepositeFiatTitle;

	@FindBy(xpath = "//div[text()='Deposit Crypto']")
	WebElement DepositeCrypto;

	@FindBy(xpath = "//p[text()='Deposit Crypto']")
	WebElement DepositeCryptoTitle;

	@FindBy(xpath = "//div[text()='KYC']")
	WebElement KYC;

	@FindBy(xpath = "//h1[text()='KYC Details']")
	WebElement KYCTitle;

	@FindBy(xpath = "//div[text()='KYC Status History']")
	WebElement KYCStatus;

	@FindBy(xpath = "//h1[text()='KYC Status History']")
	WebElement KYCStatusTitle;

	@FindBy(xpath = "//div[text()='Spot Fees']")
	WebElement SpotFee;

	@FindBy(xpath = "//div[text()='Spot Fees']")
	WebElement SpotFeeTitle;

	@FindBy(xpath = "//div[text()='Level Limits']")
	WebElement LevelLimit;

	@FindBy(xpath = "//h1[text()='Level Limits']")
	WebElement LevelLimitTitle;

	@FindBy(xpath = "//div[text()='Symbols']")
	WebElement Symbols;

	@FindBy(xpath = "//h1[text()='Symbols']")
	WebElement SymbolsTitle;

	@FindBy(xpath = "(//span[text()='Side']//parent::div//following::div[@class='relative'])[1]")
	WebElement Side;

	@FindBy(xpath = "//span[text()='Buy User Id']//parent::div//child::input")
	WebElement BuyUsrID;

	@FindBy(xpath = "//span[text()='Sell User Id']//parent::div//child::input")
	WebElement SellUsrID;

	@FindBy(xpath = "//span[text()='Buy Order Type']//parent::div//child::button")
	WebElement BuyOrdrType;

	@FindBy(xpath = "//span[text()='Sell Order Type']//parent::div//child::button")
	WebElement SellOrdrType;

	@FindBy(xpath = "//button[text()='All']")
	WebElement AllOrderType;

	@FindBy(xpath = "//button[text()='Limit']")
	WebElement LimitOrderType;

	@FindBy(xpath = "//button[text()='Market']")
	WebElement MarketOrderType;

	@FindBy(xpath = "//button[text()='Market Maker']")
	WebElement MarketMakerOrderType;
	
	@FindBy (xpath ="//*[local-name()='svg' and @class='h-[25px] w-[25px] cursor-pointer']")
	WebElement Crossbutton;

	public WebElement getCrossbutton() {
		return Crossbutton;
	}

	public WebElement getAllOrderType() {
		return AllOrderType;
	}

	public WebElement getLimitOrderType() {
		return LimitOrderType;
	}

	public WebElement getMarketOrderType() {
		return MarketOrderType;
	}

	public WebElement getMarketMakerOrderType() {
		return MarketMakerOrderType;
	}

	public WebElement getBuyUsrID() {
		return BuyUsrID;
	}

	public WebElement getSellUsrID() {
		return SellUsrID;
	}

	public WebElement getBuyOrdrType() {
		return BuyOrdrType;
	}

	public WebElement getSellOrdrType() {
		return SellOrdrType;
	}

	public WebElement getSide() {
		return Side;
	}

	@FindBy(xpath = "//button[normalize-space()='Buy']")
	WebElement SideBuy;

	public WebElement getSideBuy() {
		return SideBuy;
	}

	public WebElement getSideSell() {
		return SideSell;
	}

	@FindBy(xpath = "//button[normalize-space()='Sell']")
	WebElement SideSell;

	public WebElement getBasicInfo() {
		return BasicInfo;
	}

	public WebElement getBasicInfoTitle() {
		return BasicInfoTitle;
	}

	public WebElement getLoginAct() {
		return LoginAct;
	}

	public WebElement getLoginActTitle() {
		return LoginActTitle;
	}

	public WebElement getSecurityAct() {
		return SecurityAct;
	}

	public WebElement getSecurityActTitle() {
		return SecurityActTitle;
	}

	public WebElement getWalletBal() {
		return WalletBal;
	}

	public WebElement getWalletBalTitle() {
		return WalletBalTitle;
	}

	public WebElement getWalletHist() {
		return WalletHist;
	}

	public WebElement getWalletHistTitle() {
		return WalletHistTitle;
	}

	public WebElement getCryptoTrans() {
		return CryptoTrans;
	}

	public WebElement getCryptoTransTitle() {
		return CryptoTransTitle;
	}

	public WebElement getFiatTrans() {
		return FiatTrans;
	}

	public WebElement getFiatTransTitle() {
		return FiatTransTitle;
	}

	public WebElement getSpotOpen() {
		return SpotOpen;
	}

	public WebElement getSpotOpenTitle() {
		return SpotOpenTitle;
	}

	public WebElement getSpotHistory() {
		return SpotHistory;
	}

	public WebElement getSpotHistoryTitle() {
		return SpotHistoryTitle;
	}

	public WebElement getSpotTradeHist() {
		return SpotTradeHist;
	}

	public WebElement getSpotTradeHistTitle() {
		return SpotTradeHistTitle;
	}

	public WebElement getDepositeFiat() {
		return DepositeFiat;
	}

	public WebElement getDepositeFiatTitle() {
		return DepositeFiatTitle;
	}

	public WebElement getDepositeCrypto() {
		return DepositeCrypto;
	}

	public WebElement getDepositeCryptoTitle() {
		return DepositeCryptoTitle;
	}

	public WebElement getKYC() {
		return KYC;
	}

	public WebElement getKYCTitle() {
		return KYCTitle;
	}

	public WebElement getKYCStatus() {
		return KYCStatus;
	}

	public WebElement getKYCStatusTitle() {
		return KYCStatusTitle;
	}

	public WebElement getSpotFee() {
		return SpotFee;
	}

	public WebElement getSpotFeeTitle() {
		return SpotFeeTitle;
	}

	public WebElement getLevelLimit() {
		return LevelLimit;
	}

	public WebElement getLevelLimitTitle() {
		return LevelLimitTitle;
	}

	public WebElement getSymbols() {
		return Symbols;
	}

	public WebElement getSymbolsTitle() {
		return SymbolsTitle;
	}

	public void ClientManagementNav() {
		BasicInfo.click();
		LoginAct.click();
		SecurityAct.click();
		WalletBal.click();
		WalletHist.click();
//		CryptoTrans.click(); 
//		FiatTrans.click(); 
//		SpotOpen.click();
		/*
		 * SpotHistory.click(); SpotTradeHist.click(); DepositeFiat.click();
		 * DepositeCrypto.click(); KYC.click(); KYCStatus.click(); SpotFee.click();
		 * LevelLimit.click(); Symbols.click();
		 */
	}

	public WebElement getErrBidPrice() {
		return ErrBidPrice;
	}

	public WebElement getErrAskPrice() {
		return ErrAskPrice;
	}

	public WebElement getErrManualPrice() {
		return ErrManualPrice;
	}

	public WebElement getSymbolDDManualPrice() {
		return symbolDDManualPrice;
	}

	/*
	 * public WebElement getSymbolsDropOD() { return SymbolsDropOD; }
	 */

	public WebElement getReset() {
		return Reset;
	}

	public WebElement getPairDropdown() {
		return PairDropdown;
	}

	public WebElement getPublishPriceButton() {
		return PublishPriceButton;
	}

	public WebElement getPublishPriceTitle() {
		return PublishPriceTitle;
	}

	public WebElement getBitPrice() {
		return BitPrice;
	}

	public WebElement getAskPrice() {
		return AskPrice;
	}

	public WebElement getPublishPriceSubmitButton() {
		return PublishPriceSubmitButton;
	}

	public WebElement getPublishPriceToastmsg() {
		return PublishPriceToastmsg;
	}

	@FindBy(xpath = "//button[text()='Place Order']")
	WebElement PlaceOrderButton;

	public WebElement getPlaceOrderButton() {
		return PlaceOrderButton;
	}

	public WebElement getPlaceOderTitle() {
		return PlaceOderTitle;
	}

	public WebElement getViewOrderExecutionForm() {
		return ViewOrderExecutionForm;
	}

	public WebElement getViewTradeForm() {
		return ViewTradeForm;
	}

	public WebElement getOrderHistory() {
		return OrderHistory;
	}

	public WebElement getOrderHistoryTitle() {
		return OrderHistoryTitle;
	}

	public WebElement getTradeHistory() {
		return TradeHistory;
	}

	public WebElement getTradeHistoryTitle() {
		return TradeHistoryTitle;
	}

	public WebElement getOrderExecution() {
		return OrderExecution;
	}

	public WebElement getOrderExecutionsTitle() {
		return OrderExecutionsTitle;
	}

	public WebElement getSettledOrder() {
		return SettledOrder;
	}

	public WebElement getSetteledOrdersTitle() {
		return SetteledOrdersTitle;
	}

	public WebElement getOrderSummary() {
		return OrderSummary;
	}

	public WebElement getOrderSummaryTitle() {
		return OrderSummaryTitle;
	}

	public WebElement getMarkets() {
		return Markets;
	}

	public WebElement getMarketsTitle() {
		return MarketsTitle;
	}

	public WebElement getClientManagementTitle() {
		return ClientManagementTitle;
	}

	public WebElement getClientIDOpenOrder() {
		return ClientIDOpenOrder;
	}

	public WebElement getOpenOrderTitle() {
		return OpenOrderTitle;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}

	public WebElement getViewOrderTitle() {
		return ViewOrderTitle;
	}

	public WebElement getMarketTypePage() {
		return MarketTypePage;
	}

	public WebElement getResetButton() {
		return ResetButton;
	}

	public WebElement getTypeDropDown() {
		return TypeDropDown;
	}

//	public WebElement getLimitTypeDropDown() {
//		return LimitTypeDropDown;
//	}
//
//	public WebElement getMarketTypeDropDown() {
//		return MarketTypeDropDown;
//	}
//
//	public WebElement getMarketMakerTypeDropDown() {
//		return MarketMakerTypeDropDown;
//	}

	public WebElement getViewOrderUser() {
		return ViewOrderUser;
	}

	public WebElement getViewOrderSeqID() {
		return ViewOrderSeqID;
	}

	public WebElement getViewOrderDate() {
		return ViewOrderDate;
	}

	public WebElement getViewOrderType() {
		return ViewOrderType;
	}

	public WebElement getViewOrderSide() {
		return ViewOrderSide;
	}

	public WebElement getViewOrderSymbol() {
		return ViewOrderSymbol;
	}

	public WebElement getViewOrderPrice() {
		return ViewOrderPrice;
	}

	public WebElement getViewOrderAvgPrice() {
		return ViewOrderAvgPrice;
	}

	public WebElement getViewOrderQty() {
		return ViewOrderQty;
	}

	public WebElement getViewOrderTotal() {
		return ViewOrderTotal;
	}

	public WebElement getViewOrderStatus() {
		return ViewOrderStatus;
	}

	public WebElement getViewOrderFilledQty() {
		return ViewOrderFilledQty;
	}

	public WebElement getOrderSeqID() {
		return OrderSeqID;
	}

	public WebElement getOrderDate() {
		return OrderDate;
	}

	public WebElement getOrderPair() {
		return OrderPair;
	}

	public WebElement getOrderType() {
		return OrderType;
	}

	public WebElement getOrderSide() {
		return OrderSide;
	}

	public WebElement getOrderPrice() {
		return OrderPrice;
	}

	public WebElement getOrderQty() {
		return OrderQty;
	}

	public WebElement getOrderFilledQty() {
		return OrderFilledQty;
	}

	public WebElement getOrderRemainingQty() {
		return OrderRemainingQty;
	}

	public WebElement getOrderTotal() {
		return OrderTotal;
	}

	public WebElement getOrderStatus() {
		return OrderStatus;
	}

	public WebElement getViewOrderID() {
		return ViewOrderID;
	}

	public WebElement getOrderID() {
		return OrderID;
	}

	public WebElement getCancelOption() {
		return CancelOption;
	}

	public WebElement getCancelFormTitle() {
		return CancelFormTitle;
	}

	public void OpenOrderandViewOrderForm() throws InterruptedException {

		try {
			Assert.assertEquals(OrderID.getText(), ViewOrderID.getText());
			Assert.assertEquals(OrderSeqID.getText(), ViewOrderSeqID.getText());
			Assert.assertEquals(OrderDate.getText(), ViewOrderDate.getText());
			Assert.assertEquals(OrderPair.getText(), ViewOrderSymbol.getText());
			Assert.assertEquals(OrderType.getText(), ViewOrderType.getText());
			Assert.assertEquals(OrderSide.getText(), ViewOrderSide.getText());
			Assert.assertEquals(OrderPrice.getText(), ViewOrderPrice.getText());
			Assert.assertEquals(OrderQty.getText(), ViewOrderQty.getText());
//			Assert.assertEquals(OrderFilledQty.getText(), ViewOrderFilledQty.getText());
			Assert.assertEquals(OrderTotal.getText(), ViewOrderTotal.getText());
			Assert.assertEquals(OrderStatus.getText(), ViewOrderStatus.getText());
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	public void OrderHistoryandViewOrderForm() throws InterruptedException {

		try {
			Assert.assertEquals(OrderID.getText(), ViewOrderID.getText());
			Assert.assertEquals(OrderSeqID.getText(), ViewOrderSeqID.getText());
			Assert.assertEquals(OrderDate.getText(), ViewOrderDate.getText());
			Assert.assertEquals(OrderPair.getText(), ViewOrderSymbol.getText());
			Assert.assertEquals(OrderType.getText(), ViewOrderType.getText());
			Assert.assertEquals(OrderSide.getText(), ViewOrderSide.getText());
			Assert.assertEquals(OrderPrice.getText(), ViewOrderPrice.getText());
			Assert.assertEquals(OrderQty.getText(), ViewOrderQty.getText());
//			Assert.assertEquals(OrderFilledQty.getText(), ViewOrderFilledQty.getText());
			Assert.assertEquals(OrderTotal.getText(), ViewOrderTotal.getText());
			Assert.assertEquals(OrderStatus.getText(), ViewOrderStatus.getText());
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	private WebElement typedrpdwn(String status) {
		
		return driver.findElement(By.xpath("//button[text()='"+status+"']"));
	}
	
	public WebElement gettypedrpdwn(String status) {
		
		return typedrpdwn(status);
	}
	
	public void TypeDropdown(String status) {

		WebElement TypeDropdowwn = driver.findElement(By.xpath("(//span[text()='All'])[1]"));
		TypeDropdowwn.click();
		
		gettypedrpdwn(status).click();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver
					.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb] undefined']//td[6]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().equals(status)) {

						System.out.println("Expected => " + status + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	}

	
	private WebElement pairdrpdwn(String status) {
		
		return driver.findElement(By.xpath("//div[@class=' css-qr46ko']//div[text()='"+ status +"']"));
	}
	
	public WebElement getpairdrpdwn(String status) {
		
		return pairdrpdwn(status);
	}
	
	
	
	public void Pairdrpdown(String status) {
		WebElement PairDropdown = driver.findElement(By.xpath("//span[text()='Pair']//parent::div//child::input[@role='combobox']"));
		PairDropdown.click();

		getpairdrpdwn(status).click();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver
					.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb] undefined']//td[6]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().equals(status)) {

						System.out.println("Expected => " + status + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	
	}
	
	public void TradeHistoryPair(String status) {
		WebElement PairDropdown = driver.findElement(By.xpath("//span[text()='Pair']//parent::div//child::input[@role='combobox']"));
		PairDropdown.click();

		getpairdrpdwn(status).click();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[7]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().equals(status)) {

						System.out.println("Expected => " + status + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	
	}
	
	private WebElement sidedropdwn(String status) {
		
		return driver.findElement(By.xpath("//div[@class='py-1']//button[text()='"+ status +"']"));
	}
	
	public WebElement getsidedropdwn(String status) {
		
		return sidedropdwn(status);
	}
	
	public void SideDropdown(String status) {
		WebElement Side = driver.findElement(By.xpath("//span[text()='Side']//parent::div//child::button"));
		Side.click();

		getsidedropdwn(status).click();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[8]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().equals(status)) {

						System.out.println("Expected => " + status + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	
	}
	
	public void BuyuserID(String BuyID) throws InterruptedException, AWTException {
		BuyUsrID.sendKeys(BuyID);
		EnterKey();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb] undefined']//td[5]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().equals(BuyID)) {

						System.out.println("Expected => " + BuyID + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	
	}
	
	public void SelluserID(String SellID) throws InterruptedException, AWTException {
		SellUsrID.sendKeys(SellID);
		EnterKey();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb] undefined']//td[7]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().equals(SellID)) {

						System.out.println("Expected => " + SellID + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	
	}
	
	public void BuyOrderType(String status) {

		WebElement TypeDropdowwn = driver.findElement(By.xpath("(//span[text()='All'])[1]"));
		TypeDropdowwn.click();
		
		gettypedrpdwn(status).click();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver
					.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb] undefined']//td[10]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().equals(status)) {

						System.out.println("Expected => " + status + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	}
	
	public void SellOrderType(String status) {

		WebElement TypeDropdowwn = driver.findElement(By.xpath("(//span[text()='All'])[2]"));
		TypeDropdowwn.click();
		
		gettypedrpdwn(status).click();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver
					.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb] undefined']//td[13]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().equals(status)) {

						System.out.println("Expected => " + status + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	}	
	
	public void SettledOrderPair(String status) {
		WebElement PairDropdown = driver.findElement(By.xpath("//span[text()='Pair']//parent::div//child::input[@role='combobox']"));
		PairDropdown.click();

		getpairdrpdwn(status).click();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[3]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().equals(status)) {

						System.out.println("Expected => " + status + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	
	}
	
	public void SettledOrderClient(String status) throws InterruptedException, AWTException {

		WebElement ClientDropdown = driver.findElement(By.xpath("//div[text()='Search Client']//parent::div//child::input"));
		ClientDropdown.sendKeys("2200");
		EnterKey();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver
					.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[2]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().contains(status)) {

						System.out.println("Expected => " + status + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	}
	
	private WebElement marketsymbol(String symbol) {
		return driver.findElement(By.xpath("//div[@class=' css-1nmdiq5-menu']//div[text()='"+ symbol +"']"));
	}
	
	public WebElement getmarketsymbol(String symbol) {
		
		return marketsymbol(symbol);
	}
	
	public void MarketSymbols(String symbol) throws InterruptedException, AWTException {

		WebElement Symbols = driver.findElement(By.xpath("//div[text()='Search Symbol']//parent::div//child::input"));
		Symbols.click();

		getmarketsymbol(symbol).click();

		try {
			Thread.sleep(5000);
			List<WebElement> options = driver
					.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[2]"));

			if (options.size() != 0) {

				for (WebElement option : options) {

					if (!option.getText().equals(symbol)) {

						System.out.println("Expected => " + symbol + "  Actual => " + option.getText());
					}
				}
			} else {
				System.out.println("No records found");
			}

		} catch (Exception e) {
			System.out.println("No records found");
		}
	}

//	public void PairDropDwn() {
//		String expected = OrderPair.getText();
//		PairDropdown.sendKeys(expected);
//		List<WebElement> options = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[5]"));
//		List<String> dr = new ArrayList<String>();
//		for (WebElement List : options) {
//			String values = List.getText();
//			dr.add(values);
//		}
////		String expected = "LIMIT";
//		boolean allMatch = false;
//		for (String actual : dr) {
//			if (actual.contains(expected)) {
//				allMatch = true;
//				break;
//			}
//		}
//		if (allMatch) {
//			System.out.println("All cell contents match the expected content: " + expected);
//		} else {
//			throw new RuntimeException("Limit Type needs to be validated");
//		}
//	}
//
//	public void Resetmultiple() throws InterruptedException {
//		for (int i = 1; i <= 10; i++) {
//			getResetButton().click();
//			Thread.sleep(1000);
//		}
//	}

	@FindBy(xpath = "//p[text()='Client is required']")
	WebElement ErrClientPlaceOrderForm;

	public WebElement getErrClientPlaceOrderForm() {
		return ErrClientPlaceOrderForm;
	}

	@FindBy(xpath = "(//div[text()='Select Client']//parent::div//following::input)[1]")
	WebElement ClientDDPlaceOrder;

	@FindBy(xpath = "//div[text()='Select Symbol']//parent::div//following::input")
	WebElement SymbolDDPLaceOrder;

	public WebElement getClientDDPlaceOrder() {
		return ClientDDPlaceOrder;
	}

	public WebElement getSymbolDDPLaceOrder() {
		return SymbolDDPLaceOrder;
	}

}
