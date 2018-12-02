package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		 Thread.sleep(2000);
	
	 List<WebElement>allsuggestions = driver.findElements(By.xpath("//span[@class='_3Wn9Gb']"));
	 int count = allsuggestions.size();
	 System.out.println(count);
		 for(int i=0;i<count;i++)
		 {
			WebElement suggestion=allsuggestions.get(i);
			String text=suggestion.getText();
			System.out.println(text);
		 }
			 
		driver.close();	 
		 
	}
		 

}
