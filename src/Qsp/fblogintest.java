package Qsp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fblogintest
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        fbloginpage fb = new fbloginpage(driver);
        		fb.enterusername("8867788604");
        		fb.enterpassword("");
        		fb.clickonlogin();
        
	}


}
