package com.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;//declared globally
	public void initializeBrowser()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/");//url get
		 driver.manage().window().maximize();//maximize window
		 //Thread.sleep(5000);
		 
	}
	
	
	public void driverQuit()
	{
		driver.quit();//close window
	}
	
            public static void main(String[] args) {
			Base base=new Base();
			base.initializeBrowser();
			base.driverQuit();
			
	}

}
