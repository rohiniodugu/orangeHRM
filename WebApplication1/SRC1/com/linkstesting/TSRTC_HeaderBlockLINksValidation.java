package com.linkstesting;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class TSRTC_HeaderBlockLINksValidation {

			private static String Expectedpageurl;

			public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver", "WebDriverFiles/chromedriver.exe");

				//automating chromebrowser
				  WebDriver driver=new ChromeDriver();
				  //navigating to the tsrtc url address
				  String URlAdress="https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";
				  driver.get(URlAdress);
				  
				/*  <div class="menu">
				  <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
				  		Home</a>
				  	<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
				  	<a class="tabcopy" href="/oprs-web/ticket/"" target="_top" title="Enquiry">Enquiry</a>
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
				   //performing  the operations on the  elelment 
				   
				   HeaderBlockLinks.get(index).click();
				   
				   //getting the title and url from  the current page
				   String  actualpagetitle=driver.getTitle();
				   String  actualpageUrl=driver.getCurrentUrl();
				   System.out.println("the  actualtitle of the current page is "+actualpagetitle);
				   System.out.println("the actual Url of the current page is "+actualpagetitle);
				   
				  

				   //the expected url of Home page  shoud contains"home.do?h=1"

				  // the expected url of BUS ON CONTRACT page should contains "specialHire.do"
				    // the expected url of ENQUIRY page should contains"waitlist.do"
				   // the expected url of CANCEL TICKETS should contains"Cancel.do"
				   // the expected url of CANCELLED SERVICES should contains""Cancel.do"
				   // the expected url of ABOUTUS page should contains "aboutus.do"
				   //the expected url of TOURISM page should contains " packagetours.do"
				   // the expected url of DRIVERINFO page should contain"driverInfo.do "
				   switch(index) {
				   case 0:
					   String  Expectedpageurl ="home.do?h=1";
					   System.out.println("the expected url should contains"+ Expectedpageurl);
					   
					   if(actualpageUrl.contains(Expectedpageurl))
					   {
						   System.out.println(" the page we landed is expected page _-pass");
					   
				   }
				   else
				   {
					   System.out.println(" the page we landed is expected page _fail");  
				   }
				   break;
				   case 1:
					   
					   
				   
					   Expectedpageurl="specialHire.do"; 
					System.out.println("the expected url should  contains"+Expectedpageurl);
					
					 if(actualpageUrl.contains(Expectedpageurl))
					   {
						   System.out.println(" the page we landed is expected page _-pass");
					   
				   }
				   else
				   {
					   System.out.println(" the page we landed is expected page _fail");  
				   }
				   break;
				   case 2:
				  
					Expectedpageurl="waitlist.do"; 
					System.out.println("the expected url should  contains"+Expectedpageurl);
					
					 if(actualpageUrl.contains(Expectedpageurl))
					   {
						   System.out.println(" the page we landed is expected page _-pass");
					   
				   }
				   else
				   {
					   System.out.println(" the page we landed is expected page _fail");  
				   }

					 break;
				   case 3:
				  
					Expectedpageurl="Cancel.do"; 
					System.out.println("the expected url should  contains"+Expectedpageurl);
					
					 if(actualpageUrl.contains(Expectedpageurl))
					   {
						   System.out.println(" the page we landed is expected page _-pass");
					   
				   }
				   else
				   {
					   System.out.println(" the page we landed is expected page _fail");  
				   }
					 break;
				   case 4:
				  
					Expectedpageurl="Cancel.do"; 
					System.out.println("the expected url should  contains"+Expectedpageurl);
					
					 if(actualpageUrl.contains(Expectedpageurl))
					   {
						   System.out.println(" the page we landed is expected page _-pass");
					   
				   }
				   else
				   {
					   System.out.println(" the page we landed is expected page _fail");  
				   }

					 break;
				   case 5:
				  
					Expectedpageurl="Cancel.do"; 
					System.out.println("the expected url should  contains"+Expectedpageurl);
					
					 if(actualpageUrl.contains(Expectedpageurl))
					   {
						   System.out.println(" the page we landed is expected page _-pass");
					   
				   }
				   else
				   {
					   System.out.println(" the page we landed is expected page _fail");  
				   }
                   break;
				   case 6:
				   
					   Expectedpageurl="aboutus.do"; 
						System.out.println("the expected url should  contains"+Expectedpageurl);
						
						 if(actualpageUrl.contains(Expectedpageurl))
						   {
							   System.out.println(" the page we landed is expected page _-pass");
						   
					   }
					   else
					   {
						   System.out.println(" the page we landed is expected page _fail");  
					   }
				   break;
				   
				   case 7:
					   
					   Expectedpageurl="packagetours.do"; 
						System.out.println("the expected url should  contains"+Expectedpageurl);
						
						 if(actualpageUrl.contains(Expectedpageurl))
						   {
							   System.out.println(" the page we landed is expected page _-pass");
						   
					   }
					   else
					   {
						   System.out.println(" the page we landed is expected page _fail");  
					   }
				   break;
	   
				   case 8:
					   
					   Expectedpageurl="driverInfo.do"; 
						System.out.println("the expected url should  contains"+Expectedpageurl);
						
						 if(actualpageUrl.contains(Expectedpageurl))
						   {
							   System.out.println(" the page we landed is expected page _-pass");
						   
					   }
					   else
					   {
						   System.out.println(" the page we landed is expected page _fail");  
					   }
				   break;
				   default:
					   System.out.println(" the page not exists");
					   break;
				   }
				   //navigating back to the homa
				   driver.navigate().back();
				   // re-initialize the array  list for remaining operators 
				   
				    
				    HeaderBlock=driver.findElement(HeaderBlockProperty);
					  HeaderBlockLinks=HeaderBlock.findElements(HeaderBlockLinksproperty);
					  System.out.println();
					   System.out.println();
					   index++;
				  }driver.quit();
					  
				   
			}
		}
				   
				   
				   
				   
				   
				   
				   
				   
				   

	
			

