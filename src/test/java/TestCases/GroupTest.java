package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase{
	
	
LoginPage login;
	
	
@BeforeMethod (alwaysRun = true)
public void setup() throws Throwable
{
	initialization();
	login = new LoginPage();
}



 @Test (groups = "smoke")
 public void Test1()
 {
	boolean result =   login.verifyLoginLogo();
   Assert.assertEquals(result, true);
 }
 
 
 
 
 @Test (groups = "smoke")
 public void Test2()
 {
	boolean result =   login.verifyBotLogo();
   Assert.assertEquals(result, true);
 }
 
 

	@Test (groups = "sanity")
	public void Test3()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
	
		Assert.assertEquals(expTitle, actTitle);
		
	}
	
	
	
	@Test (groups = "smoke")
	public void Test4()
	{
		String expUrl = "https://www.saucedemo.com/";
		String actUrl = login.verifyUrl();
		Assert.assertEquals(expUrl, actUrl);
	}
	
	
   @Test (groups = "sanity")
   public void Test5() throws Exception
   {
   	String expResult = "https://www.saucedemo.com/inventory.html";
   	String actResult = login.verifyLoginToApp();
   	Assert.assertEquals(expResult, actResult);
   	Thread.sleep(5000);
   }
	
	
	@AfterMethod  (alwaysRun = true)
	public void closebrowser()
	{
	  driver.close();
	  }
}
   