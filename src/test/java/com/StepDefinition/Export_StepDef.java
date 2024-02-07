package com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.Given;

public class Export_StepDef extends BaseClass{
	
	PageObjectManager dr = new PageObjectManager();

	@Given("User click the Export button and Verify the form")
	public void userClickTheExportButtonAndVerifyTheForm() throws InterruptedException {
		dr.getExport().getExport().click();
		Thread.sleep(1000);
		String text = dr.getExport().getExportForm().getText();
		Assert.assertEquals("Export Document", text);
	}

	@Given("User click on the Yes button")
	public void userClickOnTheYesButton() {
	    dr.getExport().getYes().click();
	}

	@Given("User verify the Exported Initiated form Title")
	public void userVerifyTheExportedInitiatedFormTitle() throws InterruptedException {
		WaitNotify(dr.getExport().getExportInitiatedForm());
		String text = dr.getExport().getExportInitiatedForm().getText();
		System.out.println(text);
		Assert.assertEquals("Export Initiated".toLowerCase(), text.toLowerCase());
	}
	
	@Given("User Verifty the Notification appear on the screen")
	public void userVeriftyTheNotificationAppearOnTheScreen() {
		WaitNotify(dr.getExport().getExportNotify());
	    String text = dr.getExport().getExportNotify().getText();
	    Assert.assertEquals("Exported Document".toLowerCase(), text.toLowerCase());
	}
	@Given("User click on the View button in the Notification form")
	public void userClickOnTheViewButtonInTheNotificationForm() {
	    dr.getExport().getViewButton().click();
	}
	
	@Given("User click on the Download button")
	public void userClickOnTheDownloadButton() {
	    dr.getExport().getDownload().click();
	}

}
