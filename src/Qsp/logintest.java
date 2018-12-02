package Qsp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logintest
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.actitime.com/login.do");
        LoginPage lp = new LoginPage(driver);
        		lp.enterusername("admin");
        		lp.enterpassword("manager");
        		lp.clickonlogin();
        
	}

}
