package Page;

import java.lang.StackWalker.Option;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class UserManagementPages extends BaseClass {

	public UserManagementPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='Approvers']//parent::div/following::div[@class='relative flex items-center']//input")
	WebElement Options;

	@FindBy(xpath = "(//button[text()='More'])[2]")
	WebElement WithdrawFiatMore;

	@FindBy(xpath = "(//button[text()='More'])[3]")
	WebElement CryptoWithdraw;

	@FindBy(xpath = "(//button[text()='More'])[4]")
	WebElement DepositCrypto;

	@FindBy(xpath = "(//button[text()='More'])[5]")
	WebElement DepositFiat;

	@FindBy(xpath = "//div[@class='min-w-[80px] max-w-[200px] self-end ']//*[name()='svg']")
	WebElement DeleteButton;

	@FindBy(xpath = "//h1[text()='Edit Approval']")
	WebElement EditApproval;

	@FindBy(xpath = "(//label[text()='Approvers']//parent::div//following::button)[1]")
	WebElement OptionsDropdown;

	@FindBy(xpath = "//span[text()='Raghul R']")
	WebElement Value;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement submit;

	@FindBy(xpath = "(//label[text()='Name']//parent::div//following::input)[1]")
	WebElement Name;

	@FindBy(xpath = "(//label[text()='Name']//parent::div//following::input)[2]")
	WebElement Slug;

	@FindBy(xpath = "(//label[text()='Entity']//parent::div//following::button)[1]")
	WebElement Entity;

	@FindBy(xpath = "//label[text()='Entity']//parent::div//following::ul")
	WebElement EntityOptions;

	@FindBy(xpath = "//label[text()='Roles']//parent::div//child::button")
	WebElement RolesOptions;

	public WebElement getRolesOptions() {
		return RolesOptions;
	}

	public String getPerEntity_name() {
		return PerEntity_name;
	}

	public String getPerEntity_Slug() {
		return PerEntity_Slug;
	}

	public String getPer_name() {
		return per_name;
	}

	public String getPer_Slug() {
		return per_Slug;
	}

	public String getRoles_Name() {
		return Roles_Name;
	}

	public String getRoles_Slug() {
		return Roles_Slug;
	}

	public String getEntityvalue() {
		return Entityvalue;
	}

	public WebElement getWithdrawFiatMore() {
		return WithdrawFiatMore;
	}

	public WebElement getCryptoWithdraw() {
		return CryptoWithdraw;
	}

	public WebElement getDepositCrypto() {
		return DepositCrypto;
	}

	public WebElement getDepositFiat() {
		return DepositFiat;
	}

	public WebElement getEntityOptions() {
		return EntityOptions;
	}

	public WebElement getEntity() {
		return Entity;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getSlug() {
		return Slug;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getValue() {
		return Value;
	}

	public WebElement getOptionsDropdown() {
		return OptionsDropdown;
	}

	public WebElement getOptions() {
		return Options;
	}

	public WebElement getDeleteButton() {
		return DeleteButton;
	}

	public WebElement getEditApproval() {
		return EditApproval;
	}

	public void Approvers() {
		String expected = "Raghul R";
		if (Options.isDisplayed()) {
			if (Options.getAttribute("value").equals(expected)) {
				String text = Options.getText();
				System.out.println(text);
				System.out.println("Raghul Approver displayed ");
			} else {
				DeleteButton.click();
				OptionsDropdown.click();
				Value.click();
				System.out.println("Raghul Approver not displayed ");
			}
		} else {
			OptionsDropdown.click();
			Value.click();
			System.out.println("Approver is not displayed ");
		}
	}

	String PerEntity_name = "Technical Name 01";
	String PerEntity_Slug = "Technical Slug 02";
	String per_name = "Smoke 01";
	String per_Slug = "Smoke_Test 01";
	String Roles_Name = "Role Name 01";
	String Roles_Slug = "RoleSlug 01";
	String Entityvalue = "Entityvalue 01";

	public void permissionentity() {
		Name.sendKeys(PerEntity_name);
		Slug.sendKeys(PerEntity_Slug);
	}

	public void Permission() {
		Name.sendKeys(PerEntity_name);
		Slug.sendKeys(PerEntity_Slug);
		Entity.click();
		WebElement value = driver.findElement(By
				.xpath("//label[text()='Entity']//parent::div//following::li//span[text()='" + PerEntity_name + "']"));
		value.click();
	}

	public void Roles() throws InterruptedException {

		WebElement RolesTitle = driver.findElement(By.xpath(
				"//div[text()='Permissions']//parent::div//following::div//div[text()='" + PerEntity_name + "']"));
		scrollToElement(RolesTitle);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(By.xpath("//div[text()='Permissions']//parent::div//following::div//div[text()='"
				+ PerEntity_name + "']//parent::div//child::input")).click();
		/*
		 * RolesOptions.click(); WebElement value = driver.findElement(By.xpath(
		 * "//label[text()='Roles']//parent::div//child::ul//span[text()='\"+PerEntity_name+\"']"
		 * )); value.click(); Thread.sleep(2000);
		 */
		Name.sendKeys(Roles_Name);
		Slug.sendKeys(Roles_Slug);
	}

	public void Users() throws InterruptedException {
		RolesOptions.click();
		WebElement value = driver.findElement(By.xpath("//label[text()='Roles']//parent::div//child::ul//span[text()='"+Roles_Name+"']"));
		value.click();
		Thread.sleep(2000);

	}

}
