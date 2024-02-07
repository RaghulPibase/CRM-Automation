package com.StepDefinition;

import org.junit.Assert;

import BaseClass.BaseClass;
import PageManager.PageObjectManager;
import io.cucumber.java.en.*;

public class UserManagement_StepDef extends BaseClass{
	
	PageObjectManager dr = new PageObjectManager();
	
	@Given("User Verify the Page Title in Approvals page")
	public void userVerifyThePageTitleInApprovalsPage() {
	   String text = dr.getUserManagement().getEditApproval().getText();
	   System.out.println(text);
	   Assert.assertEquals("EDIT APPROVAL", dr.getUserManagement().getEditApproval().getText());
	}
	
	@Then("User select the approvers")
	public void userSelectTheApprovers() {
		dr.getUserManagement().Approvers();
	}
	
	@Given("User Click on More option in Withdraw fiat")
	public void userClickOnMoreOptionInWithdrawFiat() throws InterruptedException {
		Thread.sleep(2000);
	   dr.getUserManagement().getWithdrawFiatMore().click();
	}
	
	@Given("User Click on More option in Cryto Withdraw")
	public void userClickOnMoreOptionInCrytoWithdraw() throws InterruptedException {
		Thread.sleep(2000);
	    dr.getUserManagement().getCryptoWithdraw().click();
	}
	
	@Given("User Click on More option in Cryto Deposit")
	public void userClickOnMoreOptionInCrytoDeposit() throws InterruptedException {
		Thread.sleep(2000);
	    dr.getUserManagement().getDepositCrypto().click();
	}
	
	@Given("User Click on More option in Fiat Deposit")
	public void userClickOnMoreOptionInFiatDeposit() throws InterruptedException {
		Thread.sleep(2000);
	    dr.getUserManagement().getDepositFiat().click();
	}
	
	@Given("User enter the values in Name & Slug Field")
	public void userEnterTheValuesInNameSlugField() {
	    dr.getUserManagement().permissionentity();
	}
	
	@Given("User enter the values in Name, Slug and Entity field")
	public void userEnterTheValuesInNameSlugAndEntityField() {
	    dr.getUserManagement().Permission();
	}
	
	@Given("User enter the values in Name,Slug Field and select the roles")
	public void userEnterTheValuesInNameSlugFieldAndSelectTheRoles() throws InterruptedException {
	   dr.getUserManagement().Roles();
	}
	
	@Given("User select the Roles in the Dropdown field")
	public void userSelectTheRolesInTheDropdownField() throws InterruptedException {
	   dr.getUserManagement().Users();
	}

}
