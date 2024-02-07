package com.StepDefinition;

import org.junit.Assert;

import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class Login_Stepdef extends BaseClass {

	PageObjectManager dr = new PageObjectManager();

	@Given("User should navigate to Login page of CRM application")
	public void userShouldNavigateToLoginPageOfCRMApplication() {
		String currentUrl = dr.getLogin().getCurrentUrl();
		Assert.assertEquals("https://pix-crm.pibase.info/login", currentUrl);
	}

	@Given("User enter the valid {string} in the email field")
	public void userEnterTheValidInTheEmailField(String Email) {
		dr.getLogin().getEmailField().sendKeys(Email);
	}

	@Given("User enter the valid {string} in the password field")
	public void userEnterTheValidInThePasswordField(String Password) {
		dr.getLogin().getPasswordField().sendKeys(Password);
	}

	@Given("User click on the Signin button")
	public void userClickOnTheSigninButton() {
		
		try {Thread.sleep(1000);}catch(Exception e){ System.out.println(e.getMessage());}
		
		dr.getLogin().getSignin().click();
	}

}
