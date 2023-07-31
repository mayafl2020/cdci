package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends Base{
	
	public void mouseOverExample() {
		
		setupBrowser("chrome","https://www.amazon.com");
		WebElement navIcone = driver.findElement(By.xpath("//span[text()='Account & Lists']/span"));
		
		Actions act = new Actions(driver);
		act.moveToElement(navIcone).build().perform();
		
		driver.findElement(By.partialLinkText("Create")).click();
		
	}
	
	public void drugDropExample() {
		
		setupBrowser("firefox","https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.id("box101"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(oslo, norway).build().perform();
		
		
		
	}
	

	public static void main(String[] args) {
		ActionsClass obj = new ActionsClass();
//		obj.mouseOverExample();
		obj.drugDropExample();

	}

}
