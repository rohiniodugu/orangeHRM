package com.linkstesting;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import com.google.common.collect.Lists;
		import java.util.List;

public class TSRTC_Homepage_Display_HeaderblockLInks {
			public static void main(String[] args) {
				WebDriver driver;
				String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./webDriverFiles/chromedriver.exe");
		//automating the chromebrowser
		driver=new ChromeDriver();
		//navigating to the Urlapplication
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
		//idetifying the  headersection of the currentUrl page 
		//<div class="menu">
		
		
                        By headerblocklinksproperty =By.className("menu");
                        List<WebElement>  headerblocklinks =driver.findElements(headerblocklinksproperty);
                        
          //getting the elements from the header section
                        
                        
                    	/*<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
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
                        
                        
                        
             By HeaderLinkproperty=By.tagName("a");
             
                                    
            List<WebElement>  headerblocklinks1 = driver.findElements(HeaderLinkproperty);
            int TSRTCHeaderLinkcount=  headerblocklinks1.size();
            System.out.println(TSRTCHeaderLinkcount);
            int index=0;
             
               
			while(index<TSRTCHeaderLinkcount)
               {
            	 
				WebDriver tsrc_homepageHeaderLinks;
				String linkName=headerblocklinks1.get(index).getText() ; 
				System.out.println(index+""+linkName);
				index++;
               }
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        System.out.println("TSRTC_headrblocklinks");
                       int headerblocklinkscount=headerblocklinks1.size();
                       System.out.println("TSRTC_headerblocklinks"+headerblocklinkscount);
	}

}
