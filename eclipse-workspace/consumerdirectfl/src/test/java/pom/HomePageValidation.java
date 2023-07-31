package pom;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class HomePageValidation {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(xpath= "//a[@title='Direct My Care']")
	WebElement directMyCare;
	
	@CacheLookup
	@FindBy(xpath= "//a[@title='Forms']")
	WebElement forms;
	
	@CacheLookup
	@FindBy(xpath= "//a[@title='Training Materials']")
	WebElement trainingMaterials;
	
	@CacheLookup
	@FindBy(xpath= "//a[@title='Resources']")
	WebElement resources;
	
	@CacheLookup
	@FindBy(xpath= "//a[@title='About']")
	WebElement about;
	
	@CacheLookup
	@FindBy(xpath= "//a[@title='United Healthcare Forms']")
	WebElement uhc;
	
	@CacheLookup
	@FindBy(xpath= "//a[@title='Molina Healthcare Forms']")
	WebElement mhc;
	
	@CacheLookup
	@FindBy(xpath= "//span[contains(text(),'877-270-9580')]")
	WebElement tollFreeNumber;
	
	@CacheLookup
	@FindBy(xpath = "//a[@title = 'Direct My Care' and @href='https://directmycare.com/#/login']")
	WebElement directMyCareBtn;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Resources' and @href ='https://consumerdirectfl.com/resources/' ]")
	WebElement resourcesBtn;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Forms' and @href='https://consumerdirectfl.com/forms/']")
	WebElement formsBtn;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Training Materials' and @href='https://consumerdirectfl.com/training-materials/']")
	WebElement trainingMaterialsBtn;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Provider Directory']")
	WebElement providerDirectory;

	@CacheLookup
	@FindBy(xpath = "//a[@title='News']")
	WebElement news;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Work Injury Hotline']")
	WebElement workIHL;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Fraud Prevention']")
	WebElement fraudPrevention;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Careers']")
	WebElement careers;

	@CacheLookup
	@FindBy(xpath = "//a[@title='About' and @href = 'https://consumerdirectfl.com/about/']")
	WebElement aboutBtn;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Services']")
	WebElement services;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Who We Are']")
	WebElement whoWeAre;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Our Brand']")
	WebElement ourBrand;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Our Locations']")
	WebElement ourLocations;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Contact']")
	WebElement contact;
	
	@CacheLookup
	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement search;
	
	@CacheLookup
	@FindBy(xpath = "//input[@type='text']")
	WebElement searchSite;
	
	@CacheLookup
	@FindBy(xpath = "//img[@src='https://consumerdirectfl.com/wp-content/uploads/2023/01/CDFL_FULL_COLOR_Logo_350x105.png']")
	WebElement logo;
	
	@CacheLookup
	@FindBy(xpath = "//img[@alt='Direct My Care. Click here to log in.']")
	WebElement clickToLogin;
	
	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement logIn;
	
	@CacheLookup
	@FindBy(xpath = "//input [@id= 'email']")
	WebElement email;
	
	@CacheLookup
	@FindBy(id= "password")
	WebElement pswrd;
	
	@CacheLookup
	@FindBy(id= "next")
	WebElement signinBtn;
	
	
	@CacheLookup
	@FindBy(xpath = "//div[@class='error pageLevel']")
	WebElement errorMessage;
	

	public HomePageValidation(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void verifyPageTitle() {

		Reporter.log("title = " + driver.getTitle());

	}

	public void isTollFreeNumberDisplayed() {

		Reporter.log("Toll free number is displayed " + tollFreeNumber.isDisplayed());
	}

	public void tollFreeNumberText() {

		Reporter.log("Toll free number - " + tollFreeNumber.getText());
	}

	public void clickTollFreeNumber() {

		tollFreeNumber.click();
		Reporter.log("Toll free number clicked");

	}

	public void directMyCareIsDisplayed() {

		Reporter.log("Direct My Care is displayed =  " + directMyCare.isDisplayed());
	}

	public void clickDirectMyCare() {

		directMyCare.click();
		Reporter.log("Direct My Care clicked");
		Reporter.log("Direct my care button is displayed = " + directMyCareBtn.isDisplayed());

	}

	public void clickDirectMyCareBtn() {

		directMyCareBtn.click();
		Reporter.log("Direct My Care button is clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();

	}

	public void formsisDisplayed() {

		Reporter.log("Forms is displayed " + forms.isDisplayed());
	}

	public void clickForms() {

		forms.click();
		Reporter.log("Forms clicked");
		Reporter.log("Forms is displayed " + formsBtn.isDisplayed());
		Reporter.log("Unitde healthcare  forms is displayed " + uhc.isDisplayed());
		Reporter.log("Molina healthchare forms is displayed " + mhc.isDisplayed());
	}

	public void clickFormsBtn() {

		formsBtn.click();
		Reporter.log("Forms button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();
	}

	public void clickUHC() {

		forms.click();
		uhc.click();
		Reporter.log("United healthcare forms button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();
	}

	public void clickMHC() {

		forms.click();
		mhc.click();
		Reporter.log("Molina healthcare forms button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();
	}

	public void clickTrainingMaterials() {

		trainingMaterials.click();
		Reporter.log("Training Materials clicked");
		Reporter.log("Training Materials is diplayed = " + trainingMaterialsBtn.isDisplayed());
	}

	public void isDisplayedTrainingMaterials() {

		Reporter.log("Training Materials is displayed = " + trainingMaterials.isDisplayed());
	}

	public void clickTrainingMaterialsBtn() {

		trainingMaterialsBtn.click();
		Reporter.log("Training materials button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();
	}

	public void isDisplayedResources() {

		Reporter.log("Resources is displayed = " + resources.isDisplayed());
	}

	public void clickResources() {

		resources.click();
		Reporter.log("Resources clicked");
		Reporter.log("Resources is displayed = " + resourcesBtn.isDisplayed());
		Reporter.log("Provider Directory is displayed = " + providerDirectory.isDisplayed());
		Reporter.log("News is displayed = " + news.isDisplayed());
		Reporter.log("Work Injury Hotline is displayed = " + workIHL.isDisplayed());
		Reporter.log("Fraud Prevention is displayed = " + fraudPrevention.isDisplayed());
		Reporter.log("Careers is displayed = " + careers.isDisplayed());
	}

	public void clickResourcesBtn() {
		resourcesBtn.click();
		Reporter.log("Resources button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();
	}

	public void clickProviderDirectory() {

		resources.click();
		providerDirectory.click();
		Reporter.log("Provider Directory button clicked");

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Reporter.log("Page title = " + driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(0));

	}

	public void clickNews() {

		resources.click();
		news.click();
		Reporter.log("News button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();

	}

	public void clickWorkInjuryHotline() {

		resources.click();
		workIHL.click();
		Reporter.log("Work Injury Hotline button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();

	}

	public void clickFraudPrevention() {

		resources.click();
		fraudPrevention.click();
		Reporter.log("Fraud Prevention button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();

	}

	public void clickCareers() {

		resources.click();
		careers.click();
		Reporter.log("Careers button clicked");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Reporter.log("Page title = " + driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(0));

	}

	public void isDisplayedAbout() {

		Reporter.log("About is displayed = " + about.isDisplayed());
	}

	public void clickAbout() {

		about.click();
		Reporter.log("About is clicked");
		Reporter.log("About button is displayed = " + aboutBtn.isDisplayed());
		Reporter.log("Services is displayed = " + services.isDisplayed());
		Reporter.log("Who we are is displayed = " + whoWeAre.isDisplayed());
		Reporter.log("Our Brand is displayed = " + ourBrand.isDisplayed());
		Reporter.log("Our Locations is displayed = " + ourLocations.isDisplayed());
		Reporter.log("Contact is displayed = " + contact.isDisplayed());
	}

	public void clickAboutBTn() {

		aboutBtn.click();
		Reporter.log("About button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();
	}

	public void clickServices() {

		about.click();
		services.click();
		Reporter.log("Services button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();

	}

	public void clickWhoWeAre() {

		about.click();
		whoWeAre.click();
		Reporter.log("Who We Are button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();
	}

	public void clickOurBrand() {

		about.click();
		ourBrand.click();
		Reporter.log("Our Brand button clicked");
		Reporter.log("Page title = " + driver.getTitle());
		driver.navigate().back();
	}
	
	public void clickOurLocation() {
		
		about.click();
        ourLocations.click();
    	Reporter.log("Our Locations button clicked");
    	Reporter.log("Page title = " + driver.getTitle());
    	driver.navigate().back();
	}
	
    public void clickContact() {
    	
    	about.click();
        contact.click();
    	Reporter.log("Contact button clicked");
    	Reporter.log("Page title = " + driver.getTitle());
    	driver.navigate().back();
    }
    
    public void isDisplayedSearch() {
    	
    	Reporter.log("Search button is displayed = " + search.isDisplayed());
    }
    
    public void clickSearchBtn() {
    	
    	search.click();
    	Reporter.log("Search button clicked");
    	Reporter.log("Search site is displayed = " + searchSite.isDisplayed());
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(searchSite));
    	searchSite.click();
    	searchSite.sendKeys("Welcome aboard");
    	
    }
    
    public void isDisplayedLogo() {
    	
    	Reporter.log("Logo is displayed = " + logo.isDisplayed());
    }
    
    public void logoLocation() {
    	
    	Reporter.log("Logo location = " + logo.getLocation());
    }

    public void logoSize() {
    	
    	Reporter.log("Logo size = " + logo.getSize());
    }
    
    public void scrollDown() {
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,100)");
    }
    
    public void clickHereToLogin() {
    	
    	clickToLogin.click();
    }
    
    public void clickSignInBtn() {
    	
    	logIn.click();
    	
    }
    
    public void invalidLogin(String userEmail,String userPassword) {
    	
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(email));
    	
    	email.sendKeys(userEmail);
    	pswrd.sendKeys(userPassword);
    	signinBtn.click();
    	Reporter.log("Log in with invalid email and invalid password");
    	Reporter.log("Error message is displayed = " + errorMessage.isDisplayed());
    	
    }
}


















