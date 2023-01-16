package Base;
//// INITILIZATION OR PARENT CLASS
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import UtiLity.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;    //Global and public
	
	// This method 
	public   void initialization() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(ReadData.readPropertyFile("url"));
//		driver.get("https://www.saucedemo.com/");
	}
	
	
}