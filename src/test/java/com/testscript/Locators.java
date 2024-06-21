package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locatorsMechanism()
	{
	WebElement showMessageButton=driver.findElement(By.id("button-one"));
	WebElement enterValueTextBoxA=driver.findElement(By.id("value-a"));
	WebElement enterValueTextBoxB=driver.findElement(By.id("value-b"));
	WebElement getTotalButton=driver.findElement(By.id("button-two"));
	
	WebElement clearFix=driver.findElement(By.className("clearfix"));
//	 System.out.println("Show Message Button found: " + (showMessageButton != null));
//     System.out.println("Enter Value Text Box A found: " + (enterValueTextBoxA != null));
//     System.out.println("Enter Value Text Box B found: " + (enterValueTextBoxB != null));
//     System.out.println("Get Total Button found: " + (getTotalButton != null));
//     System.out.println("Clear Fix Element found: " + (clearFix != null));
	}
	
	public void navigateToAnother()
	{
		driver.navigate().to("https://www.amazon.in/");
		System.out.println("Navigated to another page.");
		
		
	}
	
	public void findElementsOnNew()
	{
		
		WebElement allButton=driver.findElement(By.id("glow-ingress-line1"));
		//System.out.println(allButton);
		driver.navigate().back();
	}

	public static void main(String[] args) {
		Locators locators=new Locators();
		locators.initializeBrowser();
		locators.locatorsMechanism();
		locators.navigateToAnother();
		locators.findElementsOnNew();
		locators.driverQuit();
	}

}
