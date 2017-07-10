package genericCalls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class GenCalls {

	public static WebDriver driver;
	public static WebElement webelement;

	public static void chrome() {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		maximisebrowserindow();
	}

	public static  void firefox() {
		FirefoxDriverManager.getInstance().setup();
		driver = new FirefoxDriver();
		maximisebrowserindow();
	}

	public static void iexplore(){
		InternetExplorerDriverManager.getInstance().setup();
		driver = new InternetExplorerDriver();
		maximisebrowserindow();
	}

	public static void edge(){
		EdgeDriverManager.getInstance().setup();
		driver = new EdgeDriver();
		maximisebrowserindow();
	}

	public static void maximisebrowserindow() {
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

}
