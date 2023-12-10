package ecommerce2.batch8TestNg2;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class homeamazon {

	public static WebDriver driver;
	
	@FindBy(xpath="(//*[contains(text(),'Best Sellers')])[1]") WebElement BestSellers;
	@FindBy(xpath="(//*[contains(text(),'Amazom Basics')])[1]") WebElement  AmazonBasics;

	
	public homeamazon(WebDriver driver) {
		homeamazon.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void bestsellersClick() {
		BestSellers.click();	
	}
	public void AmazonBasicsClick() {
		AmazonBasics.click();
	


	}

}
