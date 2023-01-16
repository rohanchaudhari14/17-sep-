package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath = "//button[@id='checkout']") private WebElement checOut;
	
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  verifycheckout()
	{
	   checOut.click();
	 //  return driver.getCurrentUrl();
	}

}
