package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement fradio = driver.findElement(By.xpath("//input[@value='1']"));
		WebElement mradio = driver.findElement(By.xpath("//input[@value='2']"));
		if(fradio.isSelected()||mradio.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
       driver.close();
	}

}
