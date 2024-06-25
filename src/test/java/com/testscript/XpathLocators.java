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
		
	    //Following
		
		WebElement xpathFollowing=driver.findElement(By.xpath("//div[@id='message-one']//following::button[@id='button-two']"));
		WebElement xpathFollowing1=driver.findElement(By.xpath("//div[@class='form-group']//following::input[@id='value-a']"));
		WebElement xpathFollowing2=driver.findElement(By.xpath("//div[@class='form-group']//following::input[@id='value-b']"));
		
		//Preceding
		
		WebElement xpathPreceding=driver.findElement(By.xpath("//div[@id='message-one']//preceding::button[@class='btn btn-primary']"));
		WebElement xpathPreceding1=driver.findElement(By.xpath("//button[@id='button-one' ]//preceding::label[@for='inputEmail4']"));
	    
		//To identify Parent shortcut
		
		WebElement xpathParent=driver.findElement(By.xpath("//button[@id='button-one']/.."));// to identify parent shortcut method
	    
		//Child
		WebElement xpathChild=driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']"));
		WebElement xpathChild1=driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-two']"));
		
		//Parent
		WebElement xPathParent=driver.findElement(By.xpath("//button[@id='button-one']//parent::form[@method='POST']"));
		
	}
	
	
	public void navigateToRedBusSite()
	{
		driver.navigate().to("https://www.redbus.in/");
	}
	
	public void findElementsOnRedBusSite() 
	{
		//contains
		
		WebElement xpathContainsRedBus1=driver.findElement(By.xpath("//button[contains(@class,'gebgsH')]"));
		WebElement xpathConatinsRedBus2=driver.findElement(By.xpath("//div[contains(@class,'-reshedule')]"));
		WebElement xpathContainsRedBus3=driver.findElement(By.xpath("//i[contains(@class,'-swaparrow')]"));
	    
		//starts-with
		
		WebElement xpathStartsRedBus1=driver.findElement(By.xpath("//button[starts-with(@id,'search_')]"));
	    WebElement xpathStartsRedBus2=driver.findElement(By.xpath("//div[starts-with(@class,'sc-eNQ')]"));
	    WebElement xpathStartsRedBus3=driver.findElement(By.xpath("//div[starts-with(@id,'autoSuggest')]"));
	    
	    //text()
	    
	    WebElement xpathTextRedBus1=driver.findElement(By.xpath("//button[text()='Book now']"));
	    WebElement xpathTextRedBus2=driver.findElement(By.xpath("//span[text()='Account']")); 
	    WebElement xpathTextRedBus3=driver.findElement(By.xpath("//span[text()='Help']"));
	   
	    //and
	    
	    WebElement xpathAndRedBus1=driver.findElement(By.xpath("//span[text()='Bus Tickets' and @class='name_rb_vertical' ]"));
	    WebElement xpathAndRedBus2=driver.findElement(By.xpath("//span[text()='Date' and @class='dateText' ]"));
	    WebElement xpathAndRedBus3=driver.findElement(By.xpath("//button[text()='SEARCH BUSES' and @id='search_button' ]"));
	    
	    //or
	    
	    WebElement xpathOrRedBus1=driver.findElement(By.xpath("//h2[text()='BOOK BUS TICKETS ONLINE' or @class='aboutHeading' ]"));
	    WebElement xpathOrRedBus2=driver.findElement(By.xpath("//h2[text()='Bus Booking redDeals on redBus ' or @class='DC_254_heading' ]"));
	    
	    //following
	    
	    WebElement xpathFollowingRedBus1=driver.findElement(By.xpath("//div[@class='sc-ckVGcZ ikHMPa']//following::button[@id='search_button']"));
	    WebElement xpathFollowingRedBus2=driver.findElement(By.xpath("//div[@class='DC_254_redDealsOffer_container']//following::button[@class='DC_254_btn scrollTopButton']"));
	   
	    
	    //preceding
	    
	    
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
