package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathLocators extends Base {
	public void XpathMechanicsm() 
	{
		WebElement xpathContains=driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
		WebElement xpathStarts=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement xpathText=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement xpathOR=driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-one']"));
		WebElement xpathAnd=driver.findElement(By.xpath("//button[text()='Show Message' and  @id='button-one']"));
	}
	
	public void navigateToRedBusSite()
	{
		driver.navigate().to("https://www.redbus.in/");
	}
	
	public void findElementsOnRedBusSite() 
	{
		WebElement xpathContainsRedBus1=driver.findElement(By.xpath("//button[contains(@class,'gebgsH')]"));
		WebElement xpathConatinsRedBus2=driver.findElement(By.xpath("//div[contains(@class,'-reshedule')]"));
		WebElement xpathContainsRedBus3=driver.findElement(By.xpath("//i[contains(@class,'-swaparrow')]"));
	    WebElement xpathStartsRedBus1=driver.findElement(By.xpath("//button[starts-with(@id,'search_')]"));
	    WebElement xpathStartsRedBus2=driver.findElement(By.xpath("//div[starts-with(@class,'sc-eNQ')]"));
	    WebElement xpathStartsRedBus3=driver.findElement(By.xpath("//div[starts-with(@id,'autoSuggest')]"));
	    WebElement xpathTextRedBus1=driver.findElement(By.xpath("//button[text()='Book now']"));
	    WebElement xpathTextRedBus2=driver.findElement(By.xpath("//span[text()='Account']")); 
	    WebElement xpathTextRedBus3=driver.findElement(By.xpath("//span[text()='Help']"));
	    WebElement xpathAndRedBus1=driver.findElement(By.xpath("//span[text()='Bus Tickets' and @class='name_rb_vertical' ]"));
	    WebElement xpathAndRedBus2=driver.findElement(By.xpath("//span[text()='Date' and @class='dateText' ]"));
	    WebElement xpathAndRedBus3=driver.findElement(By.xpath("//button[text()='SEARCH BUSES' and @id='search_button' ]"));
	    WebElement xpathOrRedBus1=driver.findElement(By.xpath("//h2[text()='BOOK BUS TICKETS ONLINE' or @class='aboutHeading' ]"));
	    WebElement xpathOrRedBus2=driver.findElement(By.xpath("//h2[text()='Bus Booking redDeals on redBus ' or @class='DC_254_heading' ]"));
	   
	    
	    
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		XpathLocators xpathlocators=new XpathLocators();
		xpathlocators.initializeBrowser();
		xpathlocators.XpathMechanicsm();
		xpathlocators.navigateToRedBusSite();
		xpathlocators.findElementsOnRedBusSite();
		xpathlocators.driverQuit();
		
				

	}

}
