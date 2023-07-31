package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
	public void fetchingDetails() {
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement instaLink = driver.findElement(By.partialLinkText("Instagram"));
		WebElement welMsg = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		WebElement loginButton = driver.findElement(By.tagName("button"));
		
//		get Attribute
		
		System.out.println(email.getAttribute("placeholder"));
		
//		tooltip
		
		System.out.println("tooltip of instaLink = " + instaLink.getAttribute("title"));
		
//		get text
		
		System.out.println("Welcome message is " + welMsg.getText());
		System.out.println("Login button text is " + loginButton.getText());
		
//		css value
		
		System.out.println("Login button font size is " + loginButton.getCssValue("font-size"));
		
//		get location
		System.out.println("Location (Point) = " + loginButton.getLocation());
		System.out.println("Location (Point x) = " + loginButton.getLocation().x);
		System.out.println("Location (Point y) = " + loginButton.getLocation().y);
		
//		get size
        System.out.println("Size(Dimension) = " + loginButton.getSize());
        System.out.println("Size(Dimension width) = " + loginButton.getSize().width);
        System.out.println("Size(Dimension height) = " + loginButton.getSize().height);
        
//      get Tagname
        
        System.out.println("email id text box tagname = " + email.getTagName());
		
		
		
		
	}
	
	public void webElementActions() {
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement instaLink = driver.findElement(By.partialLinkText("Instagram"));
	    WebElement loginButton = driver.findElement(By.tagName("button"));
	    
	    
//	    type
	    email.sendKeys("999999");
	    
//	    clear
	    email.clear();
	    email.sendKeys("7777777");
	    
//	    click
//	    loginButton.click();
//	    instaLink.click();
	    
//	    submit
	    loginButton.submit();
	    
		}
	
	public void elementStateExample() {
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement hiddenElem = driver.findElement(By.name("jazoest"));
		
//		is displayed
		System.out.println("is email displayed " +email.isDisplayed());
		System.out.println("is hiddenElement displayed " + hiddenElem.isDisplayed());
		
//		is enabled
		System.out.println("is email enabled " +email.isEnabled());
		
		
//		is selected
//		go to sign up page
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		
		
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[starts-with(@id,'u_2_5_q5') or starts-with(@id,'u_2_5_ys']"));
		System.out.println("before clicking radio button " + maleRadioBtn.isSelected());
		
		maleRadioBtn.click();
		System.out.println("after clicking radio button " + maleRadioBtn.isSelected());
	}

	public static void main(String[] args) {
		
		WebElementCommands obj = new WebElementCommands();
		obj.setupBrowser("chrome", "https://www.fb.com");
//		obj.fetchingDetails();
//		obj.webElementActions();
		obj.elementStateExample();
	

	}

}
