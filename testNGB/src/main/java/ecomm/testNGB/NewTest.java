package ecomm.testNGB;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;


public class NewTest {
	private RemoteWebDriver driver;

	//change
	@BeforeTest
 public void beforeTest()  throws InterruptedException{
	 System.out.println("this is befor test");
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\16628\\eclipse-workspace\\.metadata\\.metadata\\protrainings\\src\\Drivers\\chromedriver.exe\\");
	
	 driver=new ChromeDriver(); //Opening browser

	 driver.get("https://www.amazon.com/");  //navigating to website
     driver.manage().window().maximize();
     Thread.sleep(5000);
     System.out.println("this is befor test");
	}
	
	@Test
	  public void test1() throws InterruptedException {
	  System.out.println("this is test1"); 
	 homeamazon ob= new homeamazon(driver);
	 ob.bestsellersClick();
	 Thread.sleep(5000);
	  }
	

	@Test
	  public void test2() throws InterruptedException {
	  System.out.println("this is test2");
	 homeamazon ob= new homeamazon(driver);
	 ob.bestsellersClick();
	 Thread.sleep(5000);
	  }
	
  @AfterMethod
  public void afterTest() throws InterruptedException {
 System.out.println("this is after test");
 Thread.sleep(5000);
 driver.close();
  }

}

  