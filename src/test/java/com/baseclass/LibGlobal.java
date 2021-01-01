package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.List;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public WebDriver getDriver() {
	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	// 1
	public static void loadUrl(String url, WebDriver driver) {
		driver.navigate().to(url);
	}

	// 2
	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	// 3
	public static void getTitle(WebDriver driver) {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// 4
	public static void getUrl(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// 5
	public static void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	// 5
	public static String getText(WebElement element) {
		String text = element.getText();
		return text ;
	}

	// 6
	public static void toClick(WebElement element) {
		element.click();
	}

	// 7
	public static void attriute(WebElement element) {
		element.getAttribute("value");
	}

	// 8
	public static void findElementId(WebDriver driver, String id) {
		driver.findElement(By.id(id));
	}

	// 9
	public static void findElementxpath(WebDriver driver, String locator) {
		driver.findElement(By.xpath(locator));
	}

	// 10
	public static void findElementClass(WebDriver driver, String classname) {
		driver.findElement(By.className(classname));
	}

	// 11
	public static void findElementname(WebDriver driver, String name) {
		driver.findElement(By.name(name));
	}

	// 12
	public static void mouseOver(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	// 13
	public static void dragAndDrop(WebDriver driver, String source, String target) {
		Actions actions = new Actions(driver);
		WebElement src = driver.findElement(By.xpath(source));
		WebElement des = driver.findElement(By.xpath(target));
		actions.dragAndDrop(src, des).perform();
	}

	// 14
	public static void rightClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// 15
	public static void doubleClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	// 16
	public static void alertAccept(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// 17
	public static void alertgetText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.getText();
	}

	// 18
	public static void alertDismiss(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	// 19
	public static void alertSendKeys(WebDriver driver, String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);
	}

	// 20
	public static void screenshot(WebDriver driver, String location) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File target = new File(location);
		FileUtils.copyFile(source, target);
	}

	// 21
	public static void javaScriptSenkeys(WebDriver driver, WebElement element, String username) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value'," + username + ")", element);
	}

	// 22
	public static void javaScriptGetAttribute(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		String attribute = (String) executor.executeScript("arguments[0].getAttribute('value')", element);
		System.out.println(attribute);
	}

	// 23
	public static void javaScriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	// 24
	public static void javaScriptScrollDown(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// 25
	public static void javaScriptScrollUp(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// 26
	public static void SelectbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// 27
	public static void SelectbyValue(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByValue(data);
	}

	// 28
	public static void selectbyVisibletext(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	// 29
	public static void getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

	// 30
	public static void getFirstSelectedOptions(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

	// 31
	public static void deSelectbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// 32
	public static void deSelectbyValue(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByValue(data);
	}

	// 33
	public static void deSelectbyVisibletext(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByVisibleText(data);
	}

	// 34
	public static void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// 35
	public static void isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
	}

	// 36
	public static void Displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	// 37
	public static void selected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	// 38
	public static void enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	// 39
	public static void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}

	// 40
	public static void navigateBackrward(WebDriver driver) {
		driver.navigate().back();
	}

	// 41
	public static void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	// 42
	public static void frameIndex(WebDriver driver, int number) {
		driver.switchTo().frame(number);
	}

	// 43
	public static void frameIdorName(WebDriver driver, String idorName) {
		driver.switchTo().frame(idorName);
	}

	// 44
	public static void frameWebelement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	// 45
	public static void frameReturntoHomeWindow(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	// 46
	public static void frameParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	// 47
	public static void windowurl(WebDriver driver, String url) {
		driver.switchTo().window(url);
	}

	// 48
	public static void windowTitle(WebDriver driver, String title) {
		driver.switchTo().window(title);
	}

	// 49
	public static void windowId(WebDriver driver, String id) {
		driver.switchTo().window(id);
	}

	// 50
	public static void windowParentId(WebDriver driver) {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	// 51
	public static void windowAllId(WebDriver driver) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String data : windowHandles) {
			System.out.println(data);
		}
	
	}
	//52
	public static void clear(WebElement element) {
		element.clear();

	}
	
	//53
	public static void quit(WebDriver driver) {
		driver.quit();

	}

}
