package redbusWebsiteCalls;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import genericCalls.GenCalls;

public class HomePageCalls extends GenCalls {
	@Test(priority = 0)
	public void f() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World");
			System.out.println("Additional code");
			System.out.println("Third time");
		}
	}

	@Parameters("browser")
	@BeforeSuite
	public void before(String browser) { 
		switch (browser.toLowerCase()) {
		case "chrome":			  
			chrome();
			break;

		case "firefox":
			firefox();
			break;

		case "ie":
			iexplore();
			break;
			
		case "edge":
			edge();
			break;
		}

		driver.get("http://www.google.com");
	}

	@AfterSuite
	public void after() {
		driver.quit();
	}

}
