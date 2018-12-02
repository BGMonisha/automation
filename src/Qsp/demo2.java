package Qsp;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class demo2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver","C:\\cigniti\\automation\\drivers\\IEDriverServer.exe");
		 InternetExplorerDriver ie = new InternetExplorerDriver();
		 Thread.sleep(1000);
		 ie.close();
	}

}
