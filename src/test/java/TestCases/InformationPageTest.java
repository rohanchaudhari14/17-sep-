package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InformationPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InformationPageTest extends TestBase {
	
	LoginPage login;//  = new LoginPage();
	InventoryPage invent;// = new InventoryPage();
    CartPage cart;//= new CartPage();
    
    InformationPage info;// = new InformationPage();
    
    @BeforeMethod
    public void setup() throws Throwable
    {
    	initialization();
    	login = new LoginPage();
		invent = new InventoryPage();
		login.verifyLoginToApp();
		invent.productCount();
		cart = new CartPage();
		cart.verifycheckout();
		info = new InformationPage();
    }
    @Test(enabled = false)
    public void verifyuserDetailsTest() throws Exception
    {
    	info.verifyuserDetails();
    }
    @Test
    public void verifyFinalBtnTest() throws Exception
    {
    	info.verifyFinalBtn();
    }
    
    @AfterMethod
    public void closeBrowser() throws Exception
    {
    	Thread.sleep(5000);
    	driver.close();
    }

}
