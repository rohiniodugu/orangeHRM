package com.linkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TSRTC_homepage_headerlinks {

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

  // getting elements from headerblock
  
  By headBlockProperty=By.className("menu");
  WebElement HeadBlock=driver.findElement(headBlockProperty);
  // identifying all the existig links  belongs to headerblock
	
  By HeadBlockLinks=By.tagName("a");
  List<WebElement>HeadBlockLink=HeadBlock.findElements(HeadBlockLinks);
  int HeadBlockCount=HeadBlockLink.size();
  System.out.println(HeadBlockCount);
  
  
  for(int index=0;index<HeadBlockCount;index++)
  {
   String Linkname=HeadBlockLink.get(index).getText();
   System.out.println(index+" "+Linkname);
  }


	}

}
