package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellelTest {
	@Test
	public void Test1() throws Exception
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test
	public void Test2() throws Exception
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void Test3() throws Exception
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/search?q=amazon&cvid=cb2bf06f13594a6fbf394ecb2ff839e0&aqs=edge.1.69i60j46j69i57j46j0j46j0l2j69i60.2962j0j4&FORM=ANAB01&PC=EDBBAN");
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void Test4() throws Exception
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.close();
	}


}
