package test;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.HomePageValidation;

public class HomePageValidationTest extends BaseTest{
	
  @Test
  public void HPTC100() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.verifyPageTitle();
  }
  
  @Test
  public void HPTC101() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.isDisplayedLogo();
  }
  
  @Test
  public void HPTC102() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.logoLocation();
  }
  
  @Test
  public void HPTC103() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.logoSize();
  }
  @Test
  public void HPTC104() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.isTollFreeNumberDisplayed();
  }
  @Test
  public void HPTC105() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.tollFreeNumberText();
  }
  
  @Test(enabled =false)
  public void HPTC106() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickTollFreeNumber();
}
  @Test
  public void HPTC107() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.directMyCareIsDisplayed();
}
  @Test
  public void HPTC108() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickDirectMyCare();
	  Reporter.log("Direct My Care drop down clicked");
	  
}
  @Test
  public void HPTC109() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickDirectMyCareBtn();
	  
}

  @Test
  public void HPTC110() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.formsisDisplayed();
	  
	  }

  @Test
  public void HPTC111() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickForms();
	  
	  }
  

  @Test
  public void HPTC112() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickFormsBtn();
	  
	  }
  

  @Test
  public void HPTC113() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickUHC();
	  
	  }

  @Test
  public void HPTC114() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickMHC();
	  
	  }


  @Test
  public void HPTC115() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.isDisplayedTrainingMaterials();
	  
	  }
  @Test
  public void HPTC116() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickTrainingMaterials();
	  
	  }
  @Test
  public void HPTC117() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	 hp.clickTrainingMaterialsBtn();
	  
	  }
  
  @Test
  public void HPTC118() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	 hp.isDisplayedResources();
	  
	  }
  @Test
  public void HPTC119() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	 hp.clickResources();
	  
	  }
  
  @Test
  public void HPTC120() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickResourcesBtn();
	  
	  
	  }
  
  @Test 
  public void HPTC121() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickProviderDirectory();
	  
	  
	  }
  
  @Test
  public void HPTC122() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickNews();
	  
	  
	  }
  
  @Test
  public void HPTC123() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickWorkInjuryHotline();
	  
	  
	  }
  
  @Test
  public void HPTC124() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickFraudPrevention();
	  
	  
	  }
  
  @Test 
  public void HPTC125() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickCareers();
	  
	  
	  }
  
  @Test 
  public void HPTC126() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.isDisplayedAbout();
	  
	  
	  }
  
  @Test 
  public void HPTC127() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickAbout();
	  
	  
	  }
  @Test 
  public void HPTC128() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickAboutBTn();
	  
	  
	  }
  @Test 
  public void HPTC129() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickServices();
	  
	  
	  }
  @Test 
  public void HPTC130() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickWhoWeAre();
	  
	  
	  }
  @Test 
  public void HPTC131() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickOurBrand();
	  
	  
	  }
  @Test 
  public void HPTC132() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickOurLocation();
	  
	  
	  }
  @Test 
  public void HPTC133() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickContact();
	  
	  
	  }
  
  
  @Test 
  public void HPTC134() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.isDisplayedSearch();
	  
	  
	  }
  @Test 
  public void HPTC135() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickSearchBtn();
	  
	  
	  
	  }
  @Test 
  public void HPTC136() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.scrollDown();
	  Reporter.log("Scrolled down");
	  
	  
	  
	  }
  
  @Test 
  public void HPTC137() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickHereToLogin();
	  Reporter.log("Click here to login clicked");
	  
	  
	  }
  
  @Test 
  public void HPTC138() {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.clickSignInBtn();
	  Reporter.log("Sign in button clicked");
	  
	  
	  
	  }
  @Parameters ({"invalidEmail","invalidPassword"})
  @Test 
  public void HPTC139(String userEmail,String userPassword) {
	  
	  HomePageValidation hp = new HomePageValidation(driver);
	  hp.invalidLogin(userEmail,userPassword);
	
	  
	  
	  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}