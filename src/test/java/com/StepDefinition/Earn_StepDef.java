package com.StepDefinition;

import java.awt.AWTException;

import org.junit.Assert;

import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.Given;

public class Earn_StepDef extends BaseClass{
	
	PageObjectManager dr = new PageObjectManager();
	
	@Given("Click on the Create button and Verify the Form Title in Create Earn Product")
	public void clickOnTheCreateButtonAndVerifyTheFormTitleInCreateEarnProduct() {
	    dr.getClientGroup().getCreatebutton().click();
	} 
	
	@Given("User select Asset in Asset Dropdown")
	public void userSelectAssetInAssetDropdown() throws AWTException, InterruptedException {
	    dr.getEarn().getEarnAsset().sendKeys("ZIL");
	    EnterKey();
	}
	
	@Given("User select Simple Earn in Type dropdown")
	public void userSelectSimpleEarnInTypeDropdown() throws InterruptedException {
	    Thread.sleep(1000);
	    selectByValue("SIMPLE_EARN", dr.getEarn().getTypeAsset());
	}
	
	@Given("User verify the Toast message for create Earn")
	public void userVerifyTheToastMessageForCreateEarn() {
		String text = dr.getEarn().getCreateEarnToast().getText();
	    Assert.assertEquals("Earn Product created successfully", text);
	}
	
	@Given("User search for Earn and Verify Search data is appear on the page")
	public void userSearchForEarnAndVerifySearchDataIsAppearOnThePage() throws InterruptedException {
	    dr.getEarn().EarnSearch();
	}
	
	@Given("User click on the Flexible button")
	public void userClickOnTheFlexibleButton() {
	    dr.getEarn().getFlexible().click();
	}
	
	@Given("User click on the Locked button")
	public void userClickOnTheLockedButton() {
	    dr.getEarn().getLocked().click();
	}

}
