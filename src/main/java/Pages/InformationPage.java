package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import UtiLity.ReadData;

public class InformationPage extends TestBase{
	 
	@FindBy(xpath = "//input[@id='first-name']") private WebElement firstName;
	@FindBy(xpath = "//input[@id='last-name']") private WebElement lastName;
	@FindBy(xpath = "//input[@id='postal-code']") private WebElement PostalCode;
	@FindBy(xpath = "//input[@id='continue']") private WebElement ContuneBtn;
	@FindBy(xpath = "//button[@id='finish']") private WebElement finishBtn;  // FinalPage Webelement
	
	public InformationPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public void verifyuserDetails() throws Exception
	{
		firstName.sendKeys(ReadData.readExcelFile(0, 1));
		lastName.sendKeys(ReadData.readExcelFile(0, 2));
		PostalCode.sendKeys(ReadData.readExcelFile(0, 3));
		Thread.sleep(5000);
		ContuneBtn.click();
	}
	public void verifyFinalBtn() throws Exception 
	{
		verifyuserDetails();
		finishBtn.click();
		
	}
	

}
