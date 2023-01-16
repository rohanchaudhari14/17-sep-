package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase{
	
	LoginPage login;//  = new LoginPage();
	InventoryPage invent;// = new InventoryPage();
    CartPage cart;//= new CartPage();
    
    @BeforeMethod
    public void setup() throws Throwable
    {
    	initialization();
    	login = new LoginPage();
		invent = new InventoryPage();
		login.verifyLoginToApp();
		invent.productCount();
		cart = new CartPage();
    }
	@Test
	public void verifycheckoutTest()
	{
		cart.verifycheckout();
		
	//	String expResult = "https://www.saucedemo.com/checkout-step-one.html";
//		String actResult = cart.verifycheckout();
	//	Assert.assertEquals(expResult, actResult);
		//Reporter.log(actResult);
	}
	
	@AfterMethod
	public void closeBroweser() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}

}
