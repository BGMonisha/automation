package Qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByIndex(1);
		Thread.sleep(1000);
		d.selectByValue("0");
		Thread.sleep(1000);
		WebElement mon=driver.findElement(By.id("month"));
		Select m = new Select(mon);
		m.selectByIndex(1);
		Thread.sleep(1000);
		m.selectByValue("0");
		Thread.sleep(1000);
		WebElement year=driver.findElement(By.id("year"));
		Select y =new Select(year);
		y.selectByIndex(1);
		y.selectByValue("0");
		y.selectByVisibleText("Dec");
		
		driver.close();
	}
	
		

}
