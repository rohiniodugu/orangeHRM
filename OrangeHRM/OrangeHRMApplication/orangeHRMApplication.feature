 Feature: OrangeHRM Applicatin Functionalities Testing
 Background:
 Given user should open the Browser in the system 
 @SmokeTest
 Scenario: Validating OrangeHRM Application LogIn Page Test


 When User enters Application Url Address
 Then User should be navigated to OrangeHRM Application LogIn Page
#Then User should close the browser along with OrangeHRM Application


@ReTesting
 Scenario: Validating OrangeHRM Application LogIn Funcationality Test

#Given user should open the Browser in the system 
 When User enters Application Url Address
 Then User should be navigated to OrangeHRM Application LogIn Page
 Then User should enter userName and password and click on login button
 Then User should be navigated to OrangeHRM Application HomePage
 Then User should click on WelCome Admin
 Then User should click on logOut
 Then User should be navigated to OrangeHRM Application LogIn Page
 #Then User should close the browser along with OrangeHRM Application
 
