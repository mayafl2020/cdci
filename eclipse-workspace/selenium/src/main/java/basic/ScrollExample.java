package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollExample extends Base{
	
	public void youtube() {
		
		setupBrowser("chrome","https://www.youtube.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
	}
	
	public void github() {
		
		setupBrowser("chrome","https://www.github.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public void amazon() {
		
		String url = "https://www.amazon.com/TAURI-iPhone-14-Protection-Transparent/dp/B0B5XDNXR6/ref=sr_1_1_sspa?"
				+ "crid=1ET6D2SNAMS4R&keywords=iphone+14+pro+case&qid=1683737397&sprefix=iphon%2Caps%2C128&sr=8-1-spons"
				+ "&psc=1&smid=A16PB3SJ2ZAVBM&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUE0N1BDMkNVU1hDNU4mZW5jcnlwdGVkSWQ9QTA1MzgyO"
				+ "TAySUY4TUozMk02VUY2JmVuY3J5cHRlZEFkSWQ9QTEwMjE4MDMyREM0S1dSVTZGNlpSJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1"
				+ "jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==";
		
		setupBrowser("chrome",url);
		WebElement techDetails = driver.findElement(By.xpath("//h2[contains(text(),'Product information')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",techDetails);
	}

	public static void main(String[] args) {
		
		ScrollExample obj = new ScrollExample();
//		obj.youtube();
//		obj.github();
		obj.amazon();
	}

}
