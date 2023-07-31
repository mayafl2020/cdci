package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest {
  @Test
  public void pageTitleValidation() {
	  
	  String expectedTitle = "Facebook - log in or sign up";
	  String actualTitle = driver.getTitle();
	  System.out.println("page title = " + driver.getTitle());
	  
	  Reporter.log("Expected title = " + expectedTitle);
	  Reporter.log("Actual title = " + actualTitle);
	  
	 assertTrue(actualTitle.equals(expectedTitle),"Mismatch page title ");
  }
  
  @Test
  public void pageUrlValidation() {
	  
	  String expectedUrl = "https://www.facebook.com/";
	  String actualUrl = driver.getCurrentUrl();
	  System.out.println("page url = " + driver.getCurrentUrl());
	  
	  Reporter.log("Expected url = " + expectedUrl);
	  Reporter.log("Actual url = " + actualUrl);
	  
	 assertTrue(actualUrl.equals(expectedUrl),"Mismatch page url");
  }
}
