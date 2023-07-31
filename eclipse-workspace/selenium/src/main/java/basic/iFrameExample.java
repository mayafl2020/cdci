package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameExample extends Base {
	
	public void iframeDemo() {
		
//		index
//		driver.switchTo().frame(1);
		
//		id or name
//		driver.switchTo().frame("iframeResult");
		
//		webelement
		
		WebElement elem = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(elem);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
//		switching back to base page
		
		driver.switchTo().defaultContent();
		
//		parent switch frame
		
		driver.switchTo().parentFrame();
		
	}

	public static void main(String[] args) {
	
		iFrameExample obj = new iFrameExample();
		obj.setupBrowser("chrome", "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		obj.iframeDemo();

	}

}
