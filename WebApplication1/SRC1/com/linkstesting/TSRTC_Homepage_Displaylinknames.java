package com.linkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.collect.Lists;
import java.util.List;

public class TSRTC_Homepage_Displaylinknames {

	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
System.setProperty("webdriver.chrome.driver", "./webDriverFiles/chromedriver.exe");
//automate the chromebrowser
driver=new ChromeDriver();
//navigating the Urlapplication
driver.get(applicationUrlAddress);/*
<div class="menu">
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

/*i inspected all this from clicking on each link
/*<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
Home</a>
<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>*/
// to check the   group of similartype of links we have to look for which is common property is existing among them 
//example we need  to know howmany links are  existing in entire page so we need to follow as below 

//<a :- here the anchor tag is same  for allmost all the links based on this  commom property we are going find how many links are existing in entire page
//href but this attribute avlues are different:- so we wont consider it as acommon property
//  in this case we will consider** locator as"tagName" ,selectoras"a" because this is acommon property
// for  finding  the list of existance of all the  links  in the entire page "driver.findelements (); and for this method return type isLists<weelement>
                                    By Linksproperty=By.tagName("a");
                             List<WebElement>  tsrtc_Homepagelinks =driver.findElements(Linksproperty);
                             
                             
                             System.out.println("tsrtc_Homepagelinks");
                             
                             int tsrtc_Homepagelinkscount=tsrtc_Homepagelinks.size(); 
                             System.out.println("The Number of links on the TSRTC Application Homepage is "+tsrtc_Homepagelinkscount);
                for(int index=0;index<tsrtc_Homepagelinkscount;index++)
                {
                	String linksName= tsrtc_Homepagelinks.get(index).getText();
                	System.out.println(index+""+linksName);
                }

driver.quit();



















}
}