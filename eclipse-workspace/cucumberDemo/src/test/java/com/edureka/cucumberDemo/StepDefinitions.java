package com.edureka.cucumberDemo;

import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pom.Login;
import util.Common;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
	
	WebDriver driver;
    Common common;
    String browser = "chrome";
    String aapUrl = "https://www.facebook.com";
	
	@Before
	public void setup() {
		
		common = new Common();
		common.setupBrowser(browser, aapUrl);
		this.driver = common.getDriver();
		
		
		
	}
	
	@After
	public void tearDown() {
		
		common.quitBrowser();
		
	}
	
	@Given("I'm on login page")
	public void navToLoginPage() {
		
		driver.navigate().to(aapUrl);
	   
		
	}
	@When("I enter {string} and {string}")
	public void login(String username, String password) {
		
		Login obj = new Login(driver);
		obj.loginWithCredentials(username, password);
	  
		
	}
	@Then("I should get login success message")
	public void successfullLogin() {
		
		System.out.println("loged in successfully");
	  
		
	}
	
	@Then("I should get login failure message")
	public void loginFailure() {
		
		System.out.println("failured message validates successfully");
	 
	}
	
	@Then("Page title should be displayed")
	public void pageTitle() {
		
		String expTitle = "Facebook - login or sign up";
		String actTitle = driver.getTitle();
		if(expTitle.equals(actTitle)) {
			
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}
		
	}

	@Then("Page url should be displayed")
	public void pageUrl() {
		
		String expUrl = "Facebook - login or sign up";
		String actUrl = driver.getCurrentUrl();
		if(expUrl.equals(actUrl)) {
			System.out.println("test pass");
		} else {
			
			System.out.println("test failed");
		}

	    
	}

}
