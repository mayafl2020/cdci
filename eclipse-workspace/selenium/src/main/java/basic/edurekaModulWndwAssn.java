package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class edurekaModulWndwAssn extends Base {
	
	public void loginEdureka() {
		
		driver.findElement(By.xpath("//span[@data-button-name='Login']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement email = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='email']"))));
		email.sendKeys("999999");
	}

	public static void main(String[] args) {
		
		
		edurekaModulWndwAssn obj = new edurekaModulWndwAssn();
		obj.setupBrowser("chrome", "https://www.edureka.co");
		obj.loginEdureka();

	}

}
