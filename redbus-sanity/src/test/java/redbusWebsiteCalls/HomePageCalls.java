package redbusWebsiteCalls;

import org.testng.annotations.Test;

public class HomePageCalls {
  @Test (priority=0)
  public void f() {
	  for (int i = 0 ; i < 10 ; i++) {
	  System.out.println("Hello World");
	  System.out.println("Additional code");
	  System.out.println("Third time");
	  }
  }
}
