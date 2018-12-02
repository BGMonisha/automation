package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo5 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.quit();
	}

}
