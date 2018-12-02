package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Monisha/Desktop/selenium/page1.html");
		driver.findElement(By.id("fn")).sendKeys("shiv");
		driver.switchTo().frame("frm");
		driver.findElement(By.id("mn")).sendKeys("raj");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("kumar");
		Thread.sleep(2000);
	
		driver.close();
		

	}

}
