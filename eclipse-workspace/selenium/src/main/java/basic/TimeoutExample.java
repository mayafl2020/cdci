package basic;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeoutExample extends Base{
	
	public void scriptLoadTimeoutExample() {
		
//		script load timeout
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.lenght-1], 5000");
	}
	
	public void explicitWaitExample() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
//		email
//		WebElement email =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
//		email.sendKeys("99999");
		
		WebElement hiddenElem = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("jazoest"))));
		hiddenElem.sendKeys("999");
		
		
	}
	
	public void fluentWaitExample() {
		
	    FluentWait<WebDriver> wait = new FluentWait <WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(10))
	    		.pollingEvery(Duration.ofSeconds(2))
	    		.ignoring(NoSuchElementException.class);
	    
	    
	    
	    
	    
	    
		
//		email
//		WebElement email =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
//		email.sendKeys("99999");
		
		WebElement hiddenElem = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("jazoest"))));
		hiddenElem.sendKeys("999");
		
		
	}

	public static void main(String[] args) {
		
		TimeoutExample obj = new TimeoutExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
//		obj.scriptLoadTimeoutExample();
//		obj.explicitWaitExample();
		obj.fluentWaitExample();

	}

}
