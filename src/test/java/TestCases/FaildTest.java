package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class FaildTest extends TestBase {

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
	public void Test1()
	{
       boolean result = invent.verifypeakLogo();
       Assert.assertEquals(result, true);
	}
	
	@Test 
	public void Test2()
	{
       boolean result = invent.verifypeakLogo();
       Assert.assertEquals(result, false);
	}
	
	@Test 
	public void Test3()
	{
       boolean result = invent.verifypeakLogo();
       Assert.assertEquals(result, true);
	}
	
	@Test 
	public void Test4()
	{
       boolean result = invent.verifypeakLogo();
       Assert.assertEquals(result, true);
	}
	
	@Test 
	public void Test5()
	{
       boolean result = invent.verifypeakLogo();
       Assert.assertEquals(result, true);
	}
	


	@AfterMethod
	public void closeBroweser()
	{
		driver.close();
	}
	
	
	
	
}
