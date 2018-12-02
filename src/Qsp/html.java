package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class html
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Monisha/Desktop/Sample1.html");
		driver.findElement(By.id("fp")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.name("forgot passwod")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.className("pass")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.linkText("forgot password???")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("inbox")).click();
		driver.quit();
		
		}
	

}
