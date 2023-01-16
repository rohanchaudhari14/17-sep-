package UtiLity;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class UtilityMethod {
	
	private static final TakesScreenshot Driver = null;

	public static  void selectClass(WebElement ele,String option)  
	{
		Select s = new Select(ele);                                              
		s.selectByVisibleText(option);                                          
	}

	public static void CaptureScreenshot(String name) throws Exception
	{
        File source = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Expert 4\\eclipse-workspace\\Project17sep\\TestData\\Screenshot1\\photo.jpeg");
        FileHandler.copy(source, destination);
        
        

}
}