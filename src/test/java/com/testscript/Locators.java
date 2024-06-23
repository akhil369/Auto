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
	WebElement checkBoxText=driver.findElement(By.linkText("Checkbox Demo"));
	WebElement partialCheckBox=driver.findElement(By.partialLinkText("Checkbox"));
	WebElement nameCheck=driver.findElement(By.name("viewport"));
	WebElement tagCheck=driver.findElement(By.tagName("title"));
	WebElement cssCheck=driver.findElement(By.cssSelector("button#button-one"));
	WebElement cssChecker=driver.findElement(By.cssSelector("section.clearfix"));
	WebElement cssChecke=driver.findElement(By.cssSelector("button[data-target='#collapsibleNavbar']"));
	WebElement xpathCheck=driver.findElement(By.xpath("//button[@id='button-one']"));
//	 System.out.println("Show Message Button found: " + (showMessageButton != null));
//     System.out.println("Enter Value Text Box A found: " + (enterValueTextBoxA != null));
//     System.out.println("Enter Value Text Box B found: " + (enterValueTextBoxB != null));
//     System.out.println("Get Total Button found: " + (getTotalButton != null));
//     System.out.println("Clear Fix Element found: " + (clearFix != null));
	}
	
	public void navigateToAnother()
	{
		driver.navigate().to("https://www.amazon.in/");
		
		
		
	}
	
	public void findElementsOnNew()
	{
		
		WebElement allButton=driver.findElement(By.id("glow-ingress-line1"));
		
		
		
	}
	public void navigateToAjio()
	{
		driver.navigate().to("https://www.ajio.com/");
	}
	public void findElementsOnAjio()
	{
		WebElement nameAjio=driver.findElement(By.className("scb"));	
		WebElement nameAjio1=driver.findElement(By.className("guest-header"));
		
	}
    public void navigateToRedBus()
    {
    	driver.navigate().to("https://www.redbus.in/");
    }
    public void findElementsOnRedBus() {
    	WebElement nameRedbus3=driver.findElement(By.className("vertical_seperator"));
    	WebElement nameRedBus4=driver.findElement(By.className("msg-header"));
    	WebElement nameRedBus5=driver.findElement(By.className("img_tag"));
    	WebElement linkedRedBus1=driver.findElement(By.linkText("Mobile version"));
    	WebElement linkedRedBus2=driver.findElement(By.linkText("T&C"));
    	WebElement linkedRedBus3=driver.findElement(By.linkText("Privacy policy"));
    	WebElement linkedRedBus4 =driver.findElement(By.linkText("Sitemap"));
    	WebElement linkedRedBus5=driver.findElement(By.linkText("Insurance partner"));
    	WebElement nameRedBus1=driver.findElement(By.name("Keywords"));
    	WebElement nameRedBus2=driver.findElement(By.name("robots"));
    	WebElement cssSelectorRedBus1=driver.findElement(By.cssSelector("div#sticky_phantom"));
    	WebElement cssSelectorRedBus2=driver.findElement(By.cssSelector("div#Carousel"));
    	WebElement cssSelectorRedBus3=driver.findElement(By.cssSelector("li#cancel_ticket"));
    	WebElement cssSelectorClassRedBus1=driver.findElement(By.cssSelector("ul.rb_verticals"));
    	WebElement cssSelectorClassRedBus2=driver.findElement(By.cssSelector("div.img_rb_vertical_wrap"));
    	WebElement cssSelectorClassRedBus3=driver.findElement(By.cssSelector("div.rb_header"));
    	WebElement xpathRedBus1=driver.findElement(By.xpath("//button[@id='search_button']"));
    	WebElement xpathRedBus2=driver.findElement(By.xpath("//div[@class='loaderHeading']"));
    	WebElement xpathRedBus3=driver.findElement(By.xpath("//div[@class='AboutUs__BusinessText-w9osof-6 WKmnh']"));
    	
    	
    	
    }
    
    public void navigateToFlipkart() 
    {
    	driver.navigate().to("https://www.flipkart.com/");
    }
    
    public void findElementsOnFlipkart()
    {
    	WebElement partialFlipkart1=driver.findElement(By.partialLinkText("EPR"));
    	WebElement partialFlipkart2=driver.findElement(By.partialLinkText("Corporate"));
    	WebElement partialFlipkart3=driver.findElement(By.partialLinkText("Redressal"));
    	WebElement partialFlipkart4=driver.findElement(By.partialLinkText("Infringement"));
    }
    
    
    
    
	
	
		
	

	public static void main(String[] args) {
		Locators locators=new Locators();
		locators.initializeBrowser();
		locators.locatorsMechanism();
		locators.navigateToAnother();
		locators.findElementsOnNew();
		locators.navigateToAjio();
		locators.findElementsOnAjio();
		locators.navigateToRedBus();
		locators.findElementsOnRedBus();
		locators.navigateToFlipkart();
		locators.findElementsOnFlipkart();
		locators.driverQuit();
	}

}
