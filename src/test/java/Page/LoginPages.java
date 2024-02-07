package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class LoginPages extends BaseClass{
	
	public LoginPages() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//label[text()='Email']//parent::div//child::input")
	WebElement EmailField;
	
	@FindBy (xpath ="//label[text()='Password']//parent::div//child::input")
	WebElement PasswordField;
	
	@FindBy (xpath ="//span[text()='Sign in']")
	WebElement Signin;

	public WebElement getEmailField() {
		return EmailField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getSignin() {
		return Signin;
	}

}
