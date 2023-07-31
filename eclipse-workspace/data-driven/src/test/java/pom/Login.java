package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(id = "email")
	WebElement email;
	
	@CacheLookup
	@FindBy(id = "pass")
	WebElement pswd;
	
	@CacheLookup
	@FindBy(tagName = "button")
	WebElement button;
	
	@CacheLookup
	@FindBy(partialLinkText = "Forgotten Password")
	WebElement forgotPasswordLink;
	
	public Login(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginWithCredentials(String username,String password) {
		
		email.clear();
		email.sendKeys(username);
		
		pswd.clear();
		pswd.sendKeys(password);
		
//		button.click();
	}
	
	public void resetPassword() {
		
		forgotPasswordLink.click();
//		rest of the forgot password link
	}

}
