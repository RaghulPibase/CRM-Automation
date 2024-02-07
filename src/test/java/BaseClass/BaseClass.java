package BaseClass;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page.SupportTicketCrossFunc_Pages;
import Page.SmokeTestingPages;
import Page.SupportTicketPage;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.internal.ThreadLocalRandom;
import junit.framework.Assert;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	/**
	 * @Description To get property file
	 * @param Key
	 * @return String
	 * @throws FileNotFoundException
	 * @throws IOException
	 *
	 */

	// for get propety file
	public static String getPropertyFileValue(String keys) throws FileNotFoundException, IOException {

		Properties properties = new Properties();

		// properties.load(new
		// FileInputStream("C:\\Users\\HP\\eclipse-workspace\\PIX_CRM\\Configuration\\crm.properties"));
		properties.load(new FileInputStream(System.getProperty("user.dir") + "\\Configuration\\crm.properties"));

		return (String) properties.get(keys);
	}

//	public static void getusername(String username) {
//		
//		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
//
//		email.sendKeys(username);
//
//	}
//	
//	public static void getpassword(String password2) {
//	
//	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//
//	password.sendKeys(password2);
//	
//	}

	/**
	 * @Description To take screen shot
	 * @return byte[]
	 */

	// get screen shot
	public byte[] getScreenShot() {

		TakesScreenshot screenShot = (TakesScreenshot) driver;
		byte[] b = screenShot.getScreenshotAs(OutputType.BYTES);

		return b;

	}

	/**
	 * @Decription To get the driver
	 * @param browserType
	 */

	// 1.getDriver
	public static void getDriver(String browserType) {
		switch (browserType) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options(""));

			break;

//		case "FireFox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//
//			break;

		// case "ie":
//			WebDriverManager.iedriver().setup();
//			driver = new InternetExplorerDriver();
//
//			break;
//
//		case "Edge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//
//			break;

		default:
			break;
		}

	}

	static ChromeOptions option;
	static Map<String, Integer> contentSettings = new HashMap<>();
	static Map<String, Object> profile = new HashMap<>();
	static Map<String, Object> prefs = new HashMap<>();

	private static ChromeOptions options(String headLess) {

	    option = new ChromeOptions();

	    if (headLess.equalsIgnoreCase("HeadLess")) {

	        option.addArguments("--headless=new");
	    }

	    contentSettings.put("media_stream", 2);
	    contentSettings.put("notifications", 1);
	    profile.put("managed_default_content_settings", contentSettings);
	    prefs.put("profile", profile);
	    option.setExperimentalOption("prefs", prefs);

	    return option;
	}

	// 2.loadUrl
	/**
	 * 
	 * @Description used to load url
	 * @param url
	 */
	public static void loadUrl(String Url) {
		driver.get(Url);
	}

	// Get Message
//	public static void getMessage() {
//	getMessage();
//	}
//		
//	}
//	

	// 3.maximize
	/**
	 * @Description used to maximize window
	 */
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// 4.getTitle
	/**
	 * @Description used to get title
	 * @return String
	 */
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 5.getCurrentUrl
	/**
	 * @Description used to get the current url
	 * @return String
	 */
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 6.sendKeys
	/**
	 * @Description used to send the keys
	 * @param inputPhoneNumber
	 * @param text
	 */
	public void sendkeys(WebElement inputPhoneNumber, String text) {
		inputPhoneNumber.sendKeys(text);
	}

	// 7.click
	/**
	 * @Description used to perform click
	 * @param element
	 */
	public void click(WebElement element) {
		element.click();
	}

	// 8.getText
	/**
	 * @Description used to get text from webpage
	 * @param object
	 * @return String
	 */
	public static String getText(WebElement webElement) {
		String text = webElement.getText();
		return text;
	}

	// 9.getAttribute
	/**
	 * @Description used to get value
	 * @param element
	 * @return String
	 */
	public String getAttribute(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}

	// 10.findLocatorById
	/**
	 * @Description used to find locator by id
	 * @param attributeValue
	 * @return WebElement
	 */
	public WebElement findLocatorById(String attributeValue) {
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}

	// 11.findLocatorByName
	/**
	 * @Description used to find locator by name
	 * @param attributeValue
	 * @return WebElement
	 */
	public WebElement findLocatorByName(String attributeValue) {
		WebElement findElement = driver.findElement(By.name(attributeValue));
		return findElement;
	}

	// 12.findLocatorByClassName
	/**
	 * @Description used to find locator by class name
	 * @param attributeValue
	 * @return WebElement
	 */
	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement findElement = driver.findElement(By.className(attributeValue));
		return findElement;
	}

	// 13.findLocatorByXpath
	/**
	 * @Description used to find locator by xpath
	 * @param attributeValue
	 * @return WebElement
	 */
	public WebElement findLocatorByXpath(String attributeValue) {
		WebElement findElement = driver.findElement(By.xpath(attributeValue));
		return findElement;
	}

	// 14.getAttribute other thanValue
	/**
	 * @Description used to get attribute
	 * @param attributeName
	 * @param element
	 * @return String
	 */
	public String getAttribute(String attributeName, WebElement element) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	// to get text from text box
	/**
	 * @Description used to get attribute text
	 * @param element
	 * @return String
	 */
	public String getAttributee(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// 15.Sleep
	/**
	 * @Description used to sleep
	 * @param milliseconds
	 * @throws InterruptedException
	 */

	public void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	// 16.moveToElement
	/**
	 * @Description used to move element
	 * @param target
	 */
	public void moveToElement(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
	}

	// 17.dragAndDrop
	/**
	 * @Description used to drag and drop
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target);
	}

	// 18.contextClick(rightclick)
	/**
	 * @Description used to perform click
	 * @param element
	 */
	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// 19.robot keyPress
	/**
	 * @Description used to press the key
	 * @param keycode
	 * @throws AWTException
	 */
	public void robotKeyPress(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keycode);
	}

	// 20.robot keyRelease
	/**
	 * @Description used to release the key
	 * @param keycode
	 * @throws AWTException
	 */
	public void robotKeyRelease(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(keycode);
	}

	// 21.KeyDown
	/**
	 * @Description used to move the key down
	 * @param key
	 */
	public void keyDown(CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyDown(key);
	}

	// 22.KeyUp
	/**
	 * @Description used to move the key up
	 * @param key
	 */
	public void keyUp(CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyUp(key);
	}

	// 23.SendKeys in Actions
	/**
	 * @Description used to send keys in action
	 * @param element
	 * @param keycode
	 * @param keysToSend
	 */
	public void sendkeysinactions(WebElement element, String keysToSend) {
		Actions actions = new Actions(driver);
		actions.sendKeys(element, keysToSend).perform();
	}

	// 24.double click
	/**
	 * @Description used to perform double click
	 * @param element
	 */
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	// 25.Accept Alert
	/**
	 * @Description used to accept the alert
	 */
	public void acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// 26.Dismiss Alert
	/**
	 * @Description used to dismiss the alert
	 */
	public void dismissAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	// 27.JavaScript insert text
	/**
	 * @Description used to insert text using js
	 * @param element
	 * @param text
	 */
	public void insertTextJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value'," + text + ")", element);
	}

	public void scrollBy(int x, int y) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(" + x + ", " + y + ")");

	}

	// 28.JavaScript print text
	/**
	 * @Description used to print text using js
	 * @param element
	 * @return Object
	 */
	public Object printTextJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("return arguemnt[0].getAttribute('value')", element);
		return executeScript;
	}

	// 29.JavaScript click
	/**
	 * @Description used to perform click using js
	 * @param element
	 */
	public void clickjs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	// 30.Scroll Down JavaScript
	/**
	 * @Description used scroll down using js
	 * @param driver2
	 */
	public void scrollDownJs(WebElement driver2) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].scrollIntoView(true)", driver2);
	}

	// 31.Scroll Up JavaScript
	/**
	 * @Description used to scroll up using js
	 * @param element
	 */
	public void scrolUpJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].scrollIntoView(true)", element);
	}

	// 32.Take Screenshot
	/**
	 * @Description used to take screenshot
	 * @return File
	 */
	public File screenShot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		return file;
	}

	// 33.Take ScreenShot for WebElement
	/**
	 * @Description used to take screenshot for webelement
	 * @param element
	 * @return File
	 */
	public File screenshotWebElement(WebElement element) {
		File file = element.getScreenshotAs(OutputType.FILE);
		return file;
	}

	// 34.Create new File
	/**
	 * @Description used to create new file
	 * @param location
	 * @return File
	 */
	public File newFile(String location) {
		File f = new File(location);
		return f;
	}

	// 35.Copy and Paste File
	/**
	 * @Description used to copy the pasted file
	 * @param sourcelocation
	 * @param destlocation
	 * @throws IOException
	 */
	public void copypastefile(String sourcelocation, String destlocation) throws IOException {
		File s = new File(sourcelocation);
		File d = new File(destlocation);
		FileUtils.copyFile(s, d);
	}

	// 36.Launch url using Navigation
	/**
	 * @Description used to navigate url
	 * @param url
	 */
	public void urlNavigation(String url) {
		driver.navigate().to(url);
	}

	// 37.To move Backward in Navigation
	/**
	 * @Description used to navigate back
	 */
	public void moveback() {
		driver.navigate().back();
	}

	// 38.To move Forward
	/**
	 * @Description used to navigate forward
	 */
	public void moveforward() {
		driver.navigate().forward();
	}

	// 39.To Refresh
	/**
	 * @Description used to navigate refresh
	 */
	public void refresh() {
		driver.navigate().refresh();
	}

	// 40.Select By Value in Drop Down
	/**
	 * @Description used to select value by dropdown
	 * @param value
	 * @param element
	 */
	// VIEW //select[@id="small"]
	public void selectByValue(String value, WebElement element) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// 41.Select By Index in Drop Down
	/**
	 * @Description used to select index by dropdown
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	// 42.Select By Text in Drop Down
	/**
	 * @Description used to select text by dropdown
	 * @param text
	 * @param element
	 */
	public void selectByText(String text, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 43.get Options in Drop Down
	/**
	 * @Description used to select options in dropdown
	 * @param element
	 * @return List<WebElement>
	 */
	public List<WebElement> getoptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	// 44.get all options in Drop down
	/**
	 * @Description used to select all options in dropdown
	 * @param element
	 */
	public void gettAllOptions(WebElement element) {
		Select select = new Select(element);
		select.getAllSelectedOptions();
	}

	// 45.get First option
	/**
	 * @Description used to select first option
	 * @param element
	 */
	public void getFirstOption(WebElement element) {
		Select select = new Select(element);
		select.getFirstSelectedOption();
	}

	// 46.is multiple
	/**
	 * @Description used to select multiple values
	 * @param element
	 * @return boolean
	 */

	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 47.deselectByIndex
	/**
	 * @Description used to deselect value by index
	 * @param element
	 * @param index
	 */
	public void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// 48.deselect all
	/**
	 * @Description used to deselect all values
	 * @param element
	 */
	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// 49.deselect By Value
	/**
	 * @Description used to deselect value
	 * @param element
	 * @param value
	 */
	public void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	// 50.deselectByText
	/**
	 * @Description used to deselect value by text
	 * @param element
	 * @param text
	 */
	public void deselectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// 51.SwitchToFrameById
	/**
	 * @Description used to switch frame by id
	 * @param NameOrId
	 */
	public void SwitchToFrameByNameOrId(String NameOrId) {
		driver.switchTo().frame(NameOrId);
	}

	// 52.SwitchToFrameByIndex
	/**
	 * @Description used to switch frame by index
	 * @param index
	 */
	public void SwitchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	// 53.switchToFrameByWebElement
	/**
	 * @Description used to switch frame by element
	 * @param frameElement
	 */
	public void switchToFrameByWebElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	// 54.defaultContent
	/**
	 * @Description used to switch default content
	 */
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// 55.getWindowHandle/get Parent Id
	/**
	 * @Description used to handle parent window
	 * @return String
	 */
	public String getWindowHandle() {
		String parentWinId = driver.getWindowHandle();
		return parentWinId;
	}

	// 56.getWindowHandles/get all windows id
	/**
	 * @Description used to get all window
	 * @return Set<String>
	 */
	public Set<String> getWindowHandles() {
		Set<String> allWinId = driver.getWindowHandles();
		return allWinId;
	}

	// 57.switch To Window
	/**
	 * @Description used to switch window
	 * @param nameOrHandle
	 */
	public void switchToWindow(String nameOrHandle) {
		driver.switchTo().window(nameOrHandle);
	}

	// 58.close
	/**
	 * @Description used to close all windows
	 */
	public void close() {
		driver.close();
	}

	// 59.quit
	/**
	 * @Description used to quit window
	 */
	public static void quit() {
		driver.quit();
	}

	// 60.wait
	/**
	 * @Description used to wait matheod
	 * @throws InterruptedException
	 */
	public void waitMethod() throws InterruptedException {
		driver.wait();

	}

	// 62.clear
	/**
	 * @Description used to clear method
	 * @param element
	 */
	public void clearMethod(WebElement element) {
		element.clear();
	}

	/*
	 * public void tearDown(Scenario scenario) {
	 * System.out.println("Scenario status ====>"+ scenario.getStatus()); if
	 * (scenario.isFailed()) { TakeScreenshot ts = (TakeScreenshot) driver; byte[]
	 * screenshot = ts.getScreenshotAs (OutputType.BYTES);
	 * scenario.attach(screenshot, "image/png", scenario.getName()); } }
	 */

//	Scrollup

	public void scrollUP() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-5000)");
//		jsExecuter.executeScript(window.scrollTo(0,document.body.scrollTop));
	}

	public void actionsClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.click(element).perform();
	}

	public void scrolUPJs(int i) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].scrollIntoView(false)", i);
	}

	public static void waitClick(WebElement e) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.elementToBeClickable(e)).click();
	}
	
	public static void WaitNotify(WebElement e) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMinutes(1));
		w.until(ExpectedConditions.elementToBeClickable(e));
	}
	
	public static void elementWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	public static void DownArrowPress() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		Thread.sleep(1500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void EnterKey() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(1500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void ImageCheck(WebElement i) {
		Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
		// verify if status is true
		if (p) {
			// System.out.println("Logo present");
			assertTrue(true);
		} else {
			// System.out.println("Logo not present");
			assertTrue(false);
		}
	}

	public static void LoginTrader() throws FileNotFoundException, IOException, InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		getDriver("Chrome");
		loadUrl(getPropertyFileValue("URL"));
		driver.manage().window().maximize();
		elementWait();
		SupportTicketCrossFunc_Pages st = new SupportTicketCrossFunc_Pages();
		st.getEmail().sendKeys(getPropertyFileValue("Username"));
		st.getPassword().sendKeys(getPropertyFileValue("Password"));
		Thread.sleep(2000);
		st.getLogin().click();
	}

	public void LoginCRM() throws FileNotFoundException, IOException, InterruptedException {
		getDriver("Chrome");
		loadUrl(getPropertyFileValue("Url"));
		driver.manage().window().maximize();
		elementWait();
		SmokeTestingPages st = new SmokeTestingPages();
		st.getEmail().sendKeys(getPropertyFileValue("Username"));
		st.getPassword().sendKeys(getPropertyFileValue("Password"));
		Thread.sleep(2000);
		st.getSignin().click();
//		waitClick(st.getExpand());

	}

	public static String RandomText() {
		String Text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 3;
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(Text.length());
			char randomchar = Text.charAt(index);
			sb.append(randomchar);
		}
		String randomString = sb.toString();
		return randomString;
	}

	public static String RandomGroupName() {
		String GroupName[] = { "Group100", "Group200", "Group300", "Group400", "Group500", "Group600", "Group700",
				"Group800", "Group900", "Group1000", "Group1100", "Group1200", "Group1300", "Group1400" };
		Random random = new Random();
		String Groupname = GroupName[random.nextInt(GroupName.length)];
		return Groupname;
	}

	public static String RandomDesc() {
		String Desc[] = { "Test", "24", "32", "Test QA", "42", "jack", "Group", "55", "Sparrow", "Testing", "Check",
				"500", "QA", "Trader" };
		Random random = new Random();
		String DescText = Desc[random.nextInt(Desc.length)];
		return DescText;
	}

//	String Memberoption;
	// div[@class=' css-13axmjk-control']
	public String AddMemberRandom() throws InterruptedException {
		WebElement drpdown = driver.findElement(By.xpath("//div[@class=' css-19bb58m']"));
		drpdown.click();
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class=' css-qr46ko']//div"));

		List<Integer> dr = new ArrayList<Integer>();
		for (WebElement option : options) {
			String Values = option.getText();
			int d = Integer.parseInt(Values.replaceAll("[^0-9.]", ""));
			dr.add(d);
		}
		String[] stringArray = new String[dr.size()];
		for (int i = 0; i < dr.size(); i++) {
			stringArray[i] = String.valueOf(dr.get(i));
		}
		Random random = new Random();
		String AddMember1 = stringArray[random.nextInt(stringArray.length)];
		return AddMember1;
	}

	public JavascriptExecutor javaScriptObj() {

		JavascriptExecutor obj = null;

		return obj == null ? (JavascriptExecutor) driver : obj;
	}

	public void scrollToElement(WebElement element) {

		javaScriptObj().executeScript("arguments[0].scrollIntoView();", element);

	}

}
