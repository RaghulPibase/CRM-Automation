package Page;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class OpenorderCrossFunc_Pages extends BaseClass {
	
	public OpenorderCrossFunc_Pages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Trade']")
	WebElement Trade;

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement SearchSymbols;

	@FindBy(xpath = "(//p[@class='text-slate-500'])[1]")
	WebElement ListedSymbols;

	@FindBy(xpath = "//span[@class='font-semi-bold text-sm md:text-2xl']")
	WebElement SymbolTitle;

	@FindBy(xpath = "//p[@class='text-xs md:text-base']")
	WebElement LastPrice;

	@FindBy(xpath = "//div[@class='mb-3 flex']//a[1]")
	WebElement Buy;

	@FindBy(xpath = "//a[text()='LIMIT']")
	WebElement Limit;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[1]")
	WebElement PriceField;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[2]")
	WebElement AmountField;

	@FindBy(xpath = "//span[text()='BUY']")
	WebElement BuyButton;

	@FindBy(xpath = "//div[text()='Order placed successfully']")
	WebElement OpenOrderToastmsg;

	@FindBy(xpath="(//*[local-name()='svg' and @class='h-6 w-6 shrink-0'])[4]")
	WebElement buttonTrade;
	
	@FindBy( xpath ="//button[text()='Open Orders']")
	WebElement OpenOrder;
	
	public WebElement getOpenOrder() {
		return OpenOrder;
	}

	public WebElement getButtonTrade() {
		return buttonTrade;
	}

	public WebElement getTrade() {
		return Trade;
	}

	public WebElement getSearchSymbols() {
		return SearchSymbols;
	}

	public WebElement getSymbolTitle() {
		return SymbolTitle;
	}

	public WebElement getListedSymbols() {
		return ListedSymbols;
	}

	public WebElement getLastPrice() {
		return LastPrice;
	}

	public WebElement getBuy() {
		return Buy;
	}

	public WebElement getLimit() {
		return Limit;
	}

	public WebElement getPriceField() {
		return PriceField;
	}

	public WebElement getAmountField() {
		return AmountField;
	}

	public WebElement getBuyButton() {
		return BuyButton;
	}

	public WebElement getOpenOrderToastmsg() {
		return OpenOrderToastmsg;
	}

	public void Symbols() throws InterruptedException {
		getSearchSymbols().sendKeys("BTCUSD");
		Thread.sleep(1000);
			ListedSymbols.click();
		String Actual = getSymbolTitle().getText();
		/*
		 * if ("BTCUSD".contains(Actual)) { System.out.println(Actual); }
		 */
	}
	
	

}
