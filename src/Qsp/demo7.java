package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo7 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[.='Ruby']/../td[4]")).click();
		
	}

}
