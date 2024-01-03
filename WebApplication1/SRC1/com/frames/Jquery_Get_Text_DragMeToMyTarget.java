package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Jquery_Get_Text_DragMeToMyTarget {
	WebDriver driver;
	String applicationUrlAddress="https://jqueryui.com/droppable/";
	


		public void applicationLaunch()
		{
		
		System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();

		System.out.println(" ********* Chrome Browser Launched Successfully *********");

		// Navigating to OrangeHRM Application Url Address
		driver.get(applicationUrlAddress);
		System.out.println(" Navigated to JQuery Application ");

		driver.manage().window().maximize();

		}

		public void dragMeToMyTarget_GetText() throws InterruptedException
		{

		// Property of the Frame of the WEbPage
		// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>

		By webPageFrameProperty=By.className("demo-frame");
		WebElement webPageFrame=driver.findElement(webPageFrameProperty);

		driver.switchTo().frame(webPageFrame);

		// Drag Me To My Targert element Property
		// id="draggable"
		// id="draggable"

		//Thread.sleep(5000);

		By dragMeToMyTragetProperty=By.id("draggable");
		WebElement dragMeToMyTraget=driver.findElement(dragMeToMyTragetProperty);

		String dragMeToMyTraget_Text=dragMeToMyTraget.getText();
		System.out.println(" The text of the WebElement Drag Me To My Targer is :- "+dragMeToMyTraget_Text);

		}

		public void applicationClose()
		{
		driver.quit();
		}


		public static void main(String[] args) throws InterruptedException {


			Jquery_Get_Text_DragMeToMyTarget  jQuery = new  Jquery_Get_Text_DragMeToMyTarget();

		jQuery.applicationLaunch();
		jQuery.dragMeToMyTarget_GetText();
		jQuery.applicationClose();
		}



		}


	


