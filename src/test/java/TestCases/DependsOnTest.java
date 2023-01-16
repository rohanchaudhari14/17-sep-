package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DependsOnTest extends TestBase {
	
	

	LoginPage login;
	
	
	@BeforeMethod
	 public void setup() throws Throwable
	 {
		initialization();
		login = new LoginPage();
	 }
	
  	    
		@Test 
		public void verifyTitleTest()
		{
			String expTitle = "Swag Labs";
			String actTitle = login.verifyTitle();
		
			Assert.assertEquals(expTitle, actTitle);
			
		}
		
		
	    @Test (dependsOnMethods = "verifyTitleTest")
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
