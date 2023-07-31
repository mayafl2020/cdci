package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.Keyword;

public class BasicValidations extends BaseTest {

	Keyword kw;

	@BeforeClass
	public void beforeClass() {

		kw = new Keyword(driver);
	}

	@Test
	public void pageTitleValidation() {

		String expectedTitle = "Facebook - log in or sign up";
		String actualTitle = kw.getCurrentPageTitle();
		System.out.println("page title = " + driver.getTitle());
		String failureMsg = "Mismatch in page title";
		kw.compareStrings(expectedTitle, actualTitle, failureMsg);

	}

	@Test
	public void pageUrlValidation() {

		String expectedUrl = "https://www.facebook.com/";
		String actualUrl = kw.getCurrentPageUrl();
		System.out.println("page url = " + driver.getCurrentUrl());
		String failureMsg = "Mismatch page url";
		kw.compareStrings(expectedUrl, actualUrl, failureMsg);

	}
}
