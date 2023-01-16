package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DemoTest extends TestBase  {

LoginPage login;
	
	
	@BeforeMethod
	 public void setup() throws Throwable
	 {
		initialization();
		login = new LoginPage();
	 }
	
  	    
		@Test (invocationCount = 1,enabled = false)
		public void verifyTitleTest()
		{
			String expTitle = "Swag Labs";
			String actTitle = login.verifyTitle();
			Assert.assertEquals(expTitle, actTitle);
			
		}
		
		@Test (timeOut = 200)           // Perposfully faield test case
		public void verifyTitleTest1() throws Exception
		{
			String expTitle = "1Swag Labs";
	//		Thread.sleep(1000);
			String actTitle = login.verifyTitle();
			Assert.assertEquals(expTitle, actTitle);
			Assert.assertTrue(true);
			
		}
		
		
		@AfterMethod
		public void closebrowser()
		{
		  driver.close();
		}

	
}
