package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginpage
{
	@FindBy (xpath = "//input[@tabindex='1']") 
	private WebElement phTB;
	@FindBy(xpath = "//input[@tabindex='2']")
	private WebElement pwTB;
	@FindBy(id = "loginbutton")
	private WebElement loginBTN ;
	
	public fbloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void enterusername (String ph )
	{
		phTB.sendKeys(ph);
	}
	public void enterpassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickonlogin()
	{
		loginBTN.click();
	}
}
