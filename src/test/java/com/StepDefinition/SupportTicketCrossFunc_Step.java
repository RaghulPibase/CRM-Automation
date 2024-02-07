package com.StepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeOptions;

import BaseClass.BaseClass;
import Page.SmokeTestingPages;
import Page.SupportTicketPage;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;
import Utils.DataStore;

public class SupportTicketCrossFunc_Step extends BaseClass {

	PageObjectManager dr = new PageObjectManager();

	@Given("User Navigate to Support and Verify the page Title")
	public void userNavigateToSupportAndVerifyThePageTitle()
			throws FileNotFoundException, IOException, InterruptedException {
		LoginTrader();
		dr.getCrossFunc().getSupport().click();
		String text = dr.getCrossFunc().getSupportPageTitle().getText();
		Assert.assertEquals("Support Tickets", text);
		System.out.println(text);
	}

	@Given("Click on the Raise Ticket button and Verify the form Title")
	public void clickOnTheRaiseTicketButtonAndVerifyTheFormTitle() {
		dr.getCrossFunc().getRaiseTicketButton().click();
		String TicketForm = dr.getCrossFunc().getTicketFormTitle().getText();
		Assert.assertEquals("Raise Support Ticket", TicketForm);
		System.out.println(TicketForm);
	}

	@Given("Enter the Valid Data {string} in Title field")
	public void enterTheValidDataInTitleField(String Title) {
		dr.getCrossFunc().getTitlefield().sendKeys(Title);
	}

	@Given("Enter the Valid Data {string} in Description field")
	public void enterTheValidDataInDescriptionField(String Description) {
		dr.getCrossFunc().getDescription().sendKeys(Description);
	}

	@Given("Verify the Toast message for Raise Ticket")
	public void verifyTheToastMessageForRaiseTicket() throws InterruptedException {
		Thread.sleep(2000);
		String Toast = dr.getCrossFunc().getTicketcreatedsuccessfulToastmsg().getText();
		Assert.assertEquals("Support ticket created successfully", Toast);
		DataStore.setTicketId(dr.getCrossFunc().TicketID1());
//		System.out.print("datastore ticketId: " + DataStore.getTicketId());

	}

	@Given("Verify the client Support Ticket appear on the Tickets Page")
	public void verifyTheClientSupportTicketAppearOnTheTicketsPage() throws InterruptedException {
		dr.getCrossFunc().TicketVerify();
	}



}
