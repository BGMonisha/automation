package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy (id = "username") 
	private WebElement unTB;
	@FindBy(name = "pwd")
	private WebElement pwTB;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginBTN ;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void enterusername (String un )
	{
		unTB.sendKeys(un);
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
