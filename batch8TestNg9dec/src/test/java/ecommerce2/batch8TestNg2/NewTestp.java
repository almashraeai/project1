package ecommerce2.batch8TestNg2;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class NewTestp {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  WebDriver driver = null;
	homeamazon ob= new homeamazon(driver);
	ob.enterEmail(email);
	 Thread.sleep(5000); 
	 ob=
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aaaa" },
      new Object[] { "def@yahoo.com", "b" },
    };
  }
}
