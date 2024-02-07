package Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class EarnPages extends BaseClass {
	
	public EarnPages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//button[text()='Create']")
	WebElement CreateEarn;
	
	@FindBy (xpath ="//h1[text()='Create Earn Product']")
	WebElement CreateEarnTitle;
	
	@FindBy (xpath ="//label[text()='Asset']//parent::div//child::input")
	WebElement EarnAsset;
	
	@FindBy (xpath ="//label[text()='Type']//parent::div//child::select")
	WebElement TypeAsset;
	
	@FindBy (xpath ="//div[text()='Earn Product created successfully']")
	WebElement CreateEarnToast;
	
	@FindBy (xpath ="//div[text()='Earn Product deleted successfully']")
	WebElement DeleteEarnToast;
	
	@FindBy (xpath ="//button[text()='Flexible']")
	WebElement Flexible;
	
	@FindBy (xpath ="//button[text()='Locked']")
	WebElement Locked;

	public WebElement getFlexible() {
		return Flexible;
	}

	public WebElement getLocked() {
		return Locked;
	}

	public WebElement getCreateEarnToast() {
		return CreateEarnToast;
	}

	public WebElement getDeleteEarnToast() {
		return DeleteEarnToast;
	}

	public WebElement getTypeAsset() {
		return TypeAsset;
	}

	public WebElement getCreateEarn() {
		return CreateEarn;
	}

	public WebElement getCreateEarnTitle() {
		return CreateEarnTitle;
	}

	public WebElement getEarnAsset() {
		return EarnAsset;
	}
	
	public static void EarnSearch() throws InterruptedException {

		List<WebElement> NameColumn = driver.findElements(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[1]"));
		List<String> dr = new ArrayList<String>();
		for (WebElement Column : NameColumn) {
			String values = Column.getText();
			dr.add(values);
		}
		String[] stringArray = new String[dr.size()];
		for (int i = 0; i < dr.size(); i++) {
			stringArray[i] = String.valueOf(dr.get(i));
		}
		Random random = new Random();
		String Name = stringArray[random.nextInt(stringArray.length)];

		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		Search.sendKeys(Name);
		System.out.println(Name);
		Thread.sleep(2000);
		WebElement Actual = driver.findElement(By.xpath("//tr[@class='hover:bg-[#fbfbfb]']//td[1]"));
		String text = Actual.getText();
		System.out.println(text);

		if (text.equals(Name)) {
			System.out.println("Earn is listed on the page ");
		} else {
			throw new RuntimeException("Earn is not listed on the page ");
		}
	}

}
