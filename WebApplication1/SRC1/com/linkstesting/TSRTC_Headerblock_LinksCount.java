package com.linkstesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Headerblock_LinksCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "WebDriverFiles/chromedriver.exe");

		//automating chromebrowser
		  WebDriver driver=new ChromeDriver();
		  //navigating to the tsrtc url address
		  String URlAdress="https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";
		  driver.get(URlAdress);
		  
		 /* <div class="menu">
		  <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		  		Home</a>
		  	<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		  	<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		  	<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
		  	<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
		  	<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
		  	<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
		  	<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
		  	<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
		  </div>*/
		 // <div class="menu">
		  // property of header blockof TSRTC APPLICATION home page
		  
		  By HeaderBlockProperty=By.className("menu");
		  WebElement HeaderBlock=driver.findElement(HeaderBlockProperty);
		  // identifying all the existig links  belongs to headerblock
			
		  By HeaderBlockLinksproperty=By.tagName("a");
		  //going to the headerblock and finding all the elements of the Headerblock
		  List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(HeaderBlockLinksproperty);
		  //finding the number of links  in the header block
		  
		  int HeadBlocklinksCount=HeaderBlockLinks.size();
		  System.out.println("the number of links  in the Header Block of TSRTC Allication  home page is "+HeadBlocklinksCount);
		  
		  
		  for(int index=0;index<HeadBlocklinksCount;index++)
		  {
			  //getting the names  of the identified  elements of the Header block
		   String headblockLinkname=HeaderBlockLinks.get(index).getText();
		   System.out.println(index+"_ "+headblockLinkname);
		   HeaderBlockLinks.get(index).click();
		   System.out.println(driver.getTitle());
		   System.out.println(driver.getCurrentUrl());
		   System.out.println();
		   //since the driver focus  is shifted to the  next back making   the 
		   //driver to come previous  webpage  driver.navigate ().back();
		   //Re creating the  array list 
		   // once the  driver focus is shifted  to the  next webpage  all the  elements
		   //information stored  of the  previous  page gets  deleted ... so identifying 
		   // identifying  the elements  of the  header  block  for one more time 
		   // Thread.sleep(5000)
		   HeaderBlock=driver.findElement(HeaderBlockProperty);
		   HeaderBlockLinks=HeaderBlock.findElements(HeaderBlockLinksproperty);
		   HeadBlocklinksCount=HeaderBlockLinks.size();
			  System.out.println("the number of links  in the Header Block of TSRTC Allication  home page is "+HeadBlocklinksCount);
		   
		   
		   
		  }
driver.quit();

			}

		
 		

	}


