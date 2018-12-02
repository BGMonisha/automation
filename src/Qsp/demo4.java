package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
    
     System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     
     driver.get("https://www.google.co.in/");
     
     String title=driver.getTitle();
     System.out.println(title);
     
     String url=driver.getCurrentUrl();
     System.out.println(url);
     
     driver.manage().window().maximize();
     driver.get("https://www.google.co.in/");
     
     
     Thread.sleep(2000);
     driver.navigate().to("https://www.facebook.com/");
     Thread.sleep(1000);
     driver.navigate().back();
     Thread.sleep(2000);
     driver.navigate().forward();
     Thread.sleep(2000);
     driver.navigate().refresh();
     Thread.sleep(2000);
     
     
     driver.close();
     
     
	
	}

}
