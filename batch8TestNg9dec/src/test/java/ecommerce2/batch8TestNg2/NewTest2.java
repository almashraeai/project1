package ecommerce2.batch8TestNg2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest3 {
	private RemoteWebDriver driver;

	
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
	    
 


