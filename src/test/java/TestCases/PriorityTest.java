package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class PriorityTest extends TestBase {
	
	
	LoginPage login;
	
	
	@BeforeMethod
	 public void setup() throws Throwable
	 {
		initialization();
		login = new LoginPage();
	 }
	
	
	
	  @Test (priority = 3)
	  public void verifyLoginLogoTest()
	  {
		boolean result =   login.verifyLoginLogo();
	    Assert.assertEquals(result, true);
	  }
	  
	  
	  
	  
//	  @Test
//	  public void verifyBotLogoTest()
//	  {
//		boolean result =   login.verifyBotLogo();
//	    Assert.assertEquals(result, true);
//	  }
//	  
	  
	 
		@Test (priority = 1)
		public void verifyTitleTest()
		{
			String expTitle = "Swag Labs";
			String actTitle = login.verifyTitle();
		
			Assert.assertEquals(expTitle, actTitle);
			
		}
		
		
		
		@Test (priority = 2)
		public void verifycurrentUrl()
		{
			String expUrl = "https://www.saucedemo.com/";
			String actUrl = login.verifyUrl();
			Assert.assertEquals(expUrl, actUrl);
		}
		
		
	    @Test (priority = 4)
	    public void verifyLoginToAppTest() throws Exception
	    {
	    	String expResult = "https://www.saucedemo.com/inventory.html";
	    	String actResult = login.verifyLoginToApp();
	    	Assert.assertEquals(expResult, actResult);
	    	Thread.sleep(5000);
	    }
		
		
		@AfterMethod
		public void closebrowser()
		{
		  driver.close();
		}

}
