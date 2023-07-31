package util;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;

import pom.Login;

public class Keyword {
	
	private WebDriver driver;
	
	public Keyword(WebDriver driver) {
		
		this.driver = driver;
	}

	public String getCurrentPageTitle() {
		
		return driver.getTitle();
	}
	
public String getCurrentPageUrl() {
		
		return driver.getCurrentUrl();
	}
	
	public void compareStrings(String expString, String actString, String FailrMsg) {
		
		Reporter.log("Expected Result = " + expString);
		  Reporter.log("Actual Result = " + actString);
		  
		  
		  assertTrue(actString.equals(expString),FailrMsg + ",");
	}
	
	public void login(String username,String password) {
		
		Reporter.log("From Keyword class");
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
		
	}
	
	
}
