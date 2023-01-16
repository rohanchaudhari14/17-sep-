package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//// DECLARATION
import Base.TestBase;
import UtiLity.ReadData;

public class LoginPage  extends TestBase{
       // Object Repository
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginbutton;
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement swaglablogo;
//COnstructor to initialize the elements of page
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyLoginLogo()
	{
		return loginLogo.isDisplayed();  
	}
	
	
	
	public boolean verifyBotLogo()
	{
		return botLogo.isDisplayed();  
	}
	
	
	
   public String verifyTitle()
   {
	 return  driver.getTitle();     // Return ; string type output
	   
   }
   
   
		public String  verifyUrl()
		{
		return driver.getCurrentUrl();
	}
		
		
		public String verifyLoginToApp() throws Exception
		{
			username.sendKeys(ReadData.readPropertyFile("username"));
			password.sendKeys(ReadData.readPropertyFile("password") );
		//	password.sendKeys(ReadData.readExcelFile(0, 0));
			loginbutton.click();
			return driver.getCurrentUrl();
		}
		
		
		public void verifyswaglablogo()
		{
			verifyBotLogo();
		}
   }

