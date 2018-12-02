package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\cigniti\\automation\\drivers\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		Thread.sleep(1000);
		c.close();
	}
	

}

