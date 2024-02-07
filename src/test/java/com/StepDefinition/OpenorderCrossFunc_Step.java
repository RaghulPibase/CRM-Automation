package com.StepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class OpenorderCrossFunc_Step extends BaseClass {

	public static PageObjectManager dr;

	@Given("User should login to Trader application")
	public void userShouldLoginToTraderApplication() throws FileNotFoundException, IOException, InterruptedException {
		dr = new PageObjectManager();
		LoginTrader();
	}

	@Given("User Navigate to Trader page")
	public void userNavigateToTraderPage() {
		dr.getOpenOrder().getTrade().click();

	}

	@Given("User search for Symbol and verify the title")
	public void userSearchForSymbolAndVerifyTheTitle() throws InterruptedException {
		dr.getOpenOrder().Symbols();
	}

	@Given("User Click on Buy Limit order")
	public void userClickOnBuyLimitOrder() {
		dr.getOpenOrder().getBuy().click();
		dr.getOpenOrder().getLimit().click();
	}

	@Given("User Enter the Limit Price")
	public void userEnterTheLimitPrice() {
		dr.getOpenOrder().getPriceField().clear();
		dr.getOpenOrder().getPriceField().sendKeys("26500");
	}

	@Given("User Enter the Limit Amount")
	public void userEnterTheLimitAmount() {
		dr.getOpenOrder().getAmountField().clear();
		dr.getOpenOrder().getAmountField().sendKeys("0.000084");
	}

	@Given("User Click On Buy button and Verify the Toast message")
	public void userClickOnBuyButtonAndVerifyTheToastMessage() throws InterruptedException {
		dr.getOpenOrder().getBuyButton().click();
		Thread.sleep(1000);
		String text = dr.getOpenOrder().getOpenOrderToastmsg().getText();
		Assert.assertEquals("Order placed successfully", text);
	}

	@Given("Verify the Order is appear on the Open order page")
	public void verifyTheOrderIsAppearOnTheOpenOrderPage() {
//		scrollDownJs(null);
		dr.getOpenOrder().getOpenOrder().click();
	}
}
