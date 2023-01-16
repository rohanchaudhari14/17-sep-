package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class SoftAssertion extends TestBase{
	
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
	@Test 
	public void verifypeakLogoTest()
	{
		System.out.println("Execution start");
	   SoftAssertion soft = new SoftAssertion();
       boolean result = invent.verifypeakLogo();
       Assert.assertEquals(result,true);
        System.out.println("Execution ended");
       
      
    }
	
			
	
		
	
	@AfterMethod
	public void closeBroweser()
	{
		driver.close();
	}

}
