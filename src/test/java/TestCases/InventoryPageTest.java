package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase{

	LoginPage login;// = new LoginPage();
	InventoryPage invent;// = new InventoryPage();
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		login.verifyLoginToApp();
	}
	
	@Test (enabled = false)
	public void verifypeakLogoTest()
	{
       boolean result = invent.verifypeakLogo();
       Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void sourceLabbackPackTest()
	{
		boolean result = invent.sourceLabbackPack();
		Assert.assertEquals(result, true);
	}
	
	@Test( enabled = false)
	public void sourceLabBikeLightTest()
	{
		boolean result = invent.sourceLabBikeLight();
		Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void sourceLabboltLogoTest()
	{
		boolean result = invent.sourceLabboltLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test (enabled = false)
	public void sourceLabfleeceLogoTest()
	{
		boolean result = invent.sourceLabfleeceLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test (enabled = false)
	public void sourcelabsOncsieLogoTest()
	{
		boolean result = invent.sourcelabsOncsieLogo();
		Assert.assertEquals(result, true);
	}
	@Test (enabled = false)
	public void testAllThingLogoTest()
	{
		boolean result = invent.testAllThingLogo();
		Assert.assertEquals(result, true);
	}
	@Test  (enabled = true)
	public void productCountTest() throws Exception
	{
		String result = invent.productCount();
		Assert.assertEquals(result, "6");
		Reporter.log("total product added" +result);
		
	}
	
	@Test
	public void shoppingCartUrlTest() throws Exception
	{
		String expUrl = "https://www.saucedemo.com/cart.html";
		String actUrl = invent.shoppingCartUrl();
		Assert.assertEquals(actUrl, expUrl);
		Reporter.log("shoppingCart Url = "+ actUrl);	
	}
	
	@AfterMethod
	public void closeBroweser()
	{
		driver.close();
	}
	
	
	
	
}
