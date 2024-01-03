package com.applicationnavigation1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchBingHomepage {

	public static void main(String[] args) {
		//Automating chomebrowser
		System.setProperty("webdriver.chrome.driver","./webDriver/chromedriver.exe");
	    ChromeDriver ChromeBrowser = new ChromeDriver();
		
		
		System.setProperty("webdriver.gecko.driver","./webDriver/geckodriver.exe");
		FirefoxDriver firefoxBrowser = new FirefoxDriver();
		//navigating to an application Url address-Bing homepage
		ChromeBrowser.get("http://bing.com");
		

		firefoxBrowser.navigate().to("http://bing.com"); 
		
		//on the current Browser-in the              Will                           //same tab -webdriver

                         
		                                             //   Addre                      // open anotherUrl
		//chomebrowse.close();//the currentbrowser along with the Application opend is closedb
		//close()method will close the browser if it has only single tab is opened with an application
		//quit()method should be used to close the browsers along with
		//multiple tabs
		ChromeBrowser.quit();
		//quit() method work for single  tab as well as for multiple tabs 
		//firefoxbrowser
		firefoxBrowser.quit();
	}
}