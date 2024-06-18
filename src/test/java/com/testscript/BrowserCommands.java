package com.testscript;

public class BrowserCommands extends Base {
public void browserCommands()
{
	
	String title=driver.getTitle();//to get title of google
	String Url=driver.getCurrentUrl();//to get current url of google
	String pageSource=driver.getPageSource();//to get page source of google
}
public void navigationCommands()
{
driver.navigate().to("https://www.amazon.in/");//navigate from google to amazon.in
driver.navigate().back();//navigate back to google
driver.navigate().forward();//navigate again to amazon.in
}
	public static void main(String[] args) {
		
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initializeBrowser();
		
		browsercommands.navigationCommands();
		browsercommands.driverQuit();
		
  
	}

}
