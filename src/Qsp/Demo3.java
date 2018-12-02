package Qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the browser:");
	String browser = sc.nextLine();
	
	WebDriver driver=null;
	if(browser.equals("ff"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\cigniti\\automation\\drivers\\geckodriver.exe");
	    driver =new FirefoxDriver();
	}
	else if(browser.equals("gc"))
	{
	System.setProperty("webdriver.chrome.driver","C:\\cigniti\\automation\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	Thread.sleep(2000);
     driver.close();
}
	}
