package com.OrangeHRMApplicationwebpageTesting;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationwebpages.OrangeHRMApplication_Loginpage;

public class OrangeHRMApplication_LoginTest  extends BaseTest{
@Test(priority=1,description= "OrangeHRMApplicationLoginpage_Loginpaneltextvalidation")	
public void OrangeHRMApplicationLoginpage_LoginpaneltextvalidationTest()
{
	OrangeHRMApplication_Loginpage loginpage=new OrangeHRMApplication_Loginpage();
	loginpage.OrangeHRMApplicationLoginpage_Loginpanelvalidation();
	
}
@Test(priority=2,description= "OrangeHRMApplicationLoginpage_Loginpanellogotvalidation")	
public void OrangeHRMApplicationLoginpage_LoginpanellogovalidationTest()
{
	OrangeHRMApplication_Loginpage loginpage=new OrangeHRMApplication_Loginpage();
	loginpage.OrangeHRMApplicationLoginpage_Logovalidation();
}
	
	

}
	


