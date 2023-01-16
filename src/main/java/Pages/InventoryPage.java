package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class InventoryPage extends TestBase {
	
	
	@FindBy(xpath="//span[@class='title']") private WebElement productLogo;
	@FindBy(xpath="//div[@class='peek']") private WebElement peakLogo; 
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement sourceLabbackPack;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement sourceLabBikeLight;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement sourceLabboltLogo;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement sourceLabfleeceLogo;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement sourcelabsOncsieLogo;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement testAllThingLogo;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement shoppingCart;
	
	// Constructor first line as a class name 
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifypeakLogo()
	{
		return peakLogo.isDisplayed();
	}
	
	public boolean sourceLabbackPack()
	{
		return sourceLabbackPack.isDisplayed();
	}
	public boolean sourceLabBikeLight()
	{
		return sourceLabBikeLight.isDisplayed();
	}
	public boolean sourceLabboltLogo()
	{
		return sourceLabboltLogo.isDisplayed();
	}
	public boolean sourceLabfleeceLogo()
	{
		return sourceLabfleeceLogo.isDisplayed();
	}
	public boolean sourcelabsOncsieLogo()
	{
		return sourcelabsOncsieLogo.isDisplayed();
	}
	public boolean testAllThingLogo()
	{
		return testAllThingLogo.isDisplayed();
	}
	
	public String productCount() throws Exception
	{
		sourceLabbackPack.click();
		sourceLabBikeLight.click();
		sourceLabboltLogo.click();
		sourceLabfleeceLogo.click();
		sourcelabsOncsieLogo.click();
		testAllThingLogo.click();
		Thread.sleep(3000);
		shoppingCart.click();
		return shoppingCart.getText();
	}
	public String shoppingCartUrl() throws Exception
	{
		productCount();
		return driver.getCurrentUrl();
	}
} 
