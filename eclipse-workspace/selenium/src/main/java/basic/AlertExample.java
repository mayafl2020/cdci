package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertExample extends Base {
	
	public void alertDemo() {
		
		WebElement elem = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		
		elem.click();
		
//		get text
		
         String text = driver.switchTo().alert().getText();
         System.out.println(text);
         
//         ok or submit or confirm
         driver.switchTo().alert().accept();
         
//         cancel or dismiss or close or keyboard escape key
//         driver.switchTo().alert().dismiss();
         
//         prompt
//         driver.switchTo().alert().sendKeys("myemail");
	}

	public static void main(String[] args) {
		
		AlertExample obj = new AlertExample();
		obj.setupBrowser("chrome", "https://www.the-internet.herokuapp.com/javascript_alerts");
		obj.alertDemo();
		
	}

}
