package genericCalls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenCalls {

	public static WebDriver driver;
	public static WebElement webelement;

	public static void chrome() {
		System.setProperty("webdriver.chrome.driver", ".//Selenium WebDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		maximisebrowserwindow();
	}

	public static  void firefox() {
		System.setProperty("webdriver.gecko.driver",".//Selenium WebDrivers//geckodriver.exe");
		driver = new FirefoxDriver();
		maximisebrowserwindow();
	}

	public static void maximisebrowserwindow() {
		driver.manage().window().maximize();
	}

	public static void closebrowser() {
		driver.close();
	}

	public static WebElement elementbyxpath (String locator) {
		webelement = driver.findElement(By.xpath(locator));
		return webelement;
	}

	public static WebElement elementbyid (String locator) {
		webelement = driver.findElement(By.id(locator));
		return webelement;
	}

	public static WebElement elementbycss (String locator) {
		webelement = driver.findElement(By.cssSelector(locator));
		return webelement;
	}
	
	public static void elementwait (int a) throws InterruptedException {
		Thread.sleep(a*1000);
	}
 }
