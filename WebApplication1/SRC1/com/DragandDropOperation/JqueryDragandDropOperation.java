package com.DragandDropOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDragandDropOperation {
	WebDriver driver;
	String  applicationUrlAddress="https://jqueryui.com/dropable";
	public void applicationlaunch()
	{
		System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
		driver=new  ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
	}
	public void DragandOperation()
	{
	//property of the frame  of the webpage 
		//<iframe src="/resources/demos /droppable/default.html" class="demo-frame"></iframe>
		By webpageFrameproperty=By.className("demoframe");
		//Drag meTo my Target element property
		//id=draggable
		//thread.sleep(5000);
		By  dragmeToMyTargetproperty=By.id("draggable");
		WebElement dragmeToMyTarget=driver.findElement(dragmeToMyTargetproperty);
		String dragmetomyTarget_Text=dragmeToMyTarget.getText();
System.out.println("The text of the WebElement drag  to my targetis:"+dragmetomyTarget_Text);
//Drop Here element property
//id="droppable

By  dropHereproperty=By.id("droppable");
WebElement dropHere=driver.findElement(dropHereproperty);
//Drag and Drop operation
Actions  draganddropUsingMouse=new Actions(driver);

draganddropUsingMouse.dragAndDrop(   dragmeToMyTarget ,dropHere).build().perform();
//since  the driver focus is in the frame  of hte  webpage - driver  now should be 
// switched back  to the  actual  webpage 
driver. switchTo().defaultContent();
//automating  Resizable element
//<a href="https://jqueryui.com/resizeable </a>
By  resizableproperty=By.linkText("Resizable");
WebElement resizable=driver.findElement(dragmeToMyTargetproperty);

resizable.click();
System.out.println();
	

	}
	public void applicationclose()
	{
		driver.close();
	}
	public static void main(String[] args) {
		
		JqueryDragandDropOperation JQuery=new 	JqueryDragandDropOperation();
		JQuery.DragandOperation();
		JQuery.applicationlaunch();
		
		JQuery.DragandOperation();
		JQuery.applicationclose();
		
	}
}
