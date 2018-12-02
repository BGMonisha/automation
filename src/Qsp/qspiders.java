package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qspiders 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("qspiders");
		 Thread.sleep(2000);
	
	 List<WebElement>allsuggestions = driver.findElements(By.xpath("//span[contains(.,'qspiders']"));
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
