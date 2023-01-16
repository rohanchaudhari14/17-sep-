package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import UtiLity.UtilityMethod;

public class CaptureScreenshotTest extends TestBase{
	LoginPage login;//	= new LoginPage();
	
	@BeforeMethod  (alwaysRun	= true)
	 public void setup() throws Throwable
	 {
		initialization();
		login = new LoginPage();
	 }
	
	
	
	  @Test (enabled = false)
	  public void verifyLoginLogoTest()
	  {
		boolean result =   login.verifyLoginLogo();
	    Assert.assertEquals(result, true);
	  }
	  
	  
	  
	  
	  @Test(enabled = false)
	  public void verifyBotLogoTest()
	  {
		boolean result =   login.verifyBotLogo();
	    Assert.assertEquals(result, true);
	  }
	  
	  
	 
		@Test (enabled = true)
		public void verifyTitleTest()
		{
			String expTitle = "Swag1 Labs";
			String actTitle = login.verifyTitle();
		
			Assert.assertEquals(expTitle, actTitle);
			
		}
		
		
		
		@Test (enabled =false)
		public void verifycurrentUrl()
		{
			String expUrl = "https://www.saucedemo.com/";
			String actUrl = login.verifyUrl();
			Assert.assertEquals(expUrl, actUrl);
		}
		
		
	    @Test (enabled = false)
	    public void verifyLoginToAppTest() throws Exception
	    {
	    	String expResult = "https://www.saucedemo.com/inventory.html";
	    	String actResult = login.verifyLoginToApp();
	    	Assert.assertEquals(expResult, actResult);
	    	Thread.sleep(5000);
	    }
	    @AfterMethod (alwaysRun	= true)
		public	void closeBrowser(ITestResult a) throws Exception
		{
			if(ITestResult.FAILURE == a.getStatus())                                    
			{
				System.out.println(ITestResult.FAILURE);     
				System.out.println(a.getStatus());             
				UtilityMethod.CaptureScreenshot(a.getName());                 
			}
			driver.close();
		}
			
	
}
		
