package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox4
{
	public static void main(String[] args) throws InterruptedException
	{
	
		
		
			System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Monisha/Desktop/selenium/checkbox.html");
			List<WebElement>allcb = driver.findElements(By.xpath("//input[@type='checkbox']"));
			int count = allcb.size();
			System.out.println(count);
			for(int i=0;i<count; i++)
			{
			if(i%2!=0)
				
			{
				WebElement cb = allcb.get(i);
			cb.click();
			Thread.sleep(1000);
			}
			
			}
			driver.close();
		}		

}
