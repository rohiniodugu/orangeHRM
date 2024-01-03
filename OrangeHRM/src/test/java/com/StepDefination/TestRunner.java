package com.StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRm",glue="com.StepDefination",//will connect the feature  file with the 
//the cucumber class in which  the user defined
//methods  are created and implimented with 
//the steps to be performed
monochrome=true,// removes the junk data from the eclipse console - related to test results
//dryRun=true,//will compare the feature  file with  cucumber class and   for the newly  defined  scenario step- it will create 
//  user  defined methods  without  executing  the scenarios 
//tags="@ReTesting"
//will executute only respected  scenario 
//tags="@SmokeTest,ReTesting"
//tags="LoginTestWithTestData"
tags="@SmokeTest,ReTesting,LoginTestWithTestData"
)

public class TestRunner {

}
