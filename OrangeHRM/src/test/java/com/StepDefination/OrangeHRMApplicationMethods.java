package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.internal.org.jline.utils.Log;

public class OrangeHRMApplicationMethods {
    WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	public OrangeHRMApplicationMethods(Hooks hooks)//a class name similar  to method name -it is a constructor 
	{
		driver=hook.driver;
	}
	@Given("user should open the Browser in the system")
	public void user_should_open_the_browser_in_the_system() {
		/*System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		Log.info("****chromebrowser launched successfully******");*/

	  
	}

	@When("User enters Application Url Address")
	public void user_enters_application_url_address() {
		driver.get(applicationUrlAddress);
		Log.info("****Entered OrangeHRm Appliaction  url address******");
		driver.manage().window().maximize();
	
	}

	@Then("User should be navigated to OrangeHRM Application LogIn Page")
	public void user_should_be_navigated_to_orange_hrm_application_log_in_page() {
			// <div id="logInPanelHeading">LOGIN Panel</div>
		By logInPanelTextProperty=By.id("logInPanelHeading");
		WebElement OrangeHRMApplicationLogInPage_logInPanel=driver.findElement(logInPanelTextProperty);
	//  expected text - should be "LOGIN Panel"
			String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
			Log.info(" The Expected Text of the OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);



		String actual_OrangeHRMApplicationLogInPage_logInPanelText=OrangeHRMApplicationLogInPage_logInPanel.getText();
		Log.info(" The Actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPage_logInPanelText);

		if(actual_OrangeHRMApplicationLogInPage_logInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
	Log.info(" OrangeHRM Application LogIn Page Text existing - PASS");
		}
		else
		{
		System.out.println(" OrangeHRM Application LogIn Page Text NOT existing - FAIL");
		}

	  
	}
	@Then("user should close the browser along with OrangeHRM Application")
	public void user_should_close_the_browser_along_with_OrangeHRM_Application()
	{
		driver.quit();
		Log.info("successfully close the browser along with orangeHRM Application");
	}

	@Then("User should enter userName and password and click on login button")
	public void user_should_enter_user_name_and_password_and_click_on_login_button() {
		 String userNameTestData="rohini"; // Test data - which should be passed to sendKeys method
		By userNameProperty=By.id("txtUsername"); // idetifying the property of an element assigned to a variable
		// the property of the element should be identified in the WebPage
		WebElement userName=driver.findElement(userNameProperty); // WebElement is an interface of Selenium ( which can be treated as a dataType )
		// Performing an operation on the identified webElement
		userName.sendKeys(userNameTestData);
		Log.info(userName);
		
		// automating password element
		 String passwordTestData="Rohiniodugu@12345"; // TestData
		By passwordProperty=By.name("txtPassword"); // identify the Property
		WebElement password=driver.findElement(passwordProperty); // identify the WebElement
		password.sendKeys(passwordTestData); // Operation on WebElement
		Log.info( password);
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();

	}
	@Then("User should enter userName and password and click on login button")
	public void user_should_enter_user_name_and_password_and_click_on_login_button(String username,String password) {
		 String userNameTestData="rohini"; // Test data - which should be passed to sendKeys method
		By userNameProperty=By.id("txtUsername"); // idetifying the property of an element assigned to a variable
		// the property of the element should be identified in the WebPage
		WebElement loginpageuserName=driver.findElement(userNameProperty); // WebElement is an interface of Selenium ( which can be treated as a dataType )
		// Performing an operation on the identified webElement
		 loginpageuserName.sendKeys(userNameTestData);
		Log.info( loginpageuserName);
		
		// automating password element
		 String passwordTestData="Rohiniodugu@12345"; // TestData
		By passwordProperty=By.name("txtPassword"); // identify the Property
		WebElement loginpagepassword=driver.findElement(passwordProperty); // identify the WebElement
		loginpagepassword.sendKeys(passwordTestData); // Operation on WebElement
		Log.info(loginpagepassword);
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();

	}
	By welcomeAdminProperty;
	WebElement welcomeAdmin;

	@Then("User should be navigated to OrangeHRM Application HomePage")
	public void user_should_be_navigated_to_orange_hrm_application_home_page() {
		String expected_OrangeHRMApplicationHomePageText="Welcome";
		Log.info(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

		//By welComeAdminProperty=By.linkText("Welcome Admin");
		By welComeAdminProperty=By.id("welcome");
		welcomeAdmin=driver.findElement(welComeAdminProperty);

		String actual_OrangeHRMApplicationHomePageText=welcomeAdmin.getText();
		Log.info(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);


		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		Log.info(" Successfully Navigated to OrangeHRM Application HomePage - PASS");
		}


	}

	@Then("User should click on WelCome Admin")
	public void user_should_click_on_wel_come_admin() {
		welcomeAdmin.click();
		Log.info("performed click operation on welcome admin");
		
	   
	}

	@Then("User should click on logOut")
	public void user_should_click_on_log_out() throws InterruptedException {

		//Thread.sleep(5000);

		By logOutProperty=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();
		Log.info("successfully Logout from the application");
		
	}


}
