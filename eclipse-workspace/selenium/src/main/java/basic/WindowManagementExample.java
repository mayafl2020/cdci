package basic;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class WindowManagementExample extends Base {
	
	public void winMgtDemo() {
		
		/*driver.getWindowHandle();
		driver.getWindowHandles();
		driver.switchTo().window("window_id");
		
		driver.close();
		driver.quit();
		*/
		
		System.out.println("*****before clicking insta****");
		System.out.println("current window control = " + driver.getWindowHandle());
		System.out.println("total tabs = " + driver.getWindowHandles());
		
//		click on insta link
		driver.findElement(By.partialLinkText("Instagram")).click();
		
		System.out.println("*****after clicking insta****");
		System.out.println("current window control = " + driver.getWindowHandle());
		System.out.println("total tabs = " + driver.getWindowHandles());
		System.out.println("page title = " + driver.getTitle());
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println("*****after switching to insta****");
		System.out.println("current window control = " + driver.getWindowHandle());
		System.out.println("total tabs = " + driver.getWindowHandles());
		System.out.println("page title = " + driver.getCurrentUrl());
		

		
		System.out.println("closing instapage");
		driver.close();
//		System.out.println("page title = " + driver.getTitle());
		System.out.println("total tabs = " + driver.getWindowHandles());
		
		
		
		System.out.println("*****switching back to fb page****");
		driver.switchTo().window(tabs.get(0));
		System.out.println("page title = " + driver.getTitle());
		
		
		System.out.println("closing browser");
		driver.quit();
		driver.getTitle();
	}
	

	public static void main(String[] args) {
		
		WindowManagementExample obj = new WindowManagementExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.winMgtDemo();

	}

}
