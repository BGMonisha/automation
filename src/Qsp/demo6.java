package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo6 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Monisha/Desktop/selenium/Sample1.html");
		String css = "input[type='text']";
		driver.findElement(By.cssSelector(css)).sendKeys("monisha");
		String cs = "input[type = 'password']";
		driver.findElement(By.cssSelector(cs)).sendKeys("abcd");
		
	}	
}
