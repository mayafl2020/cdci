package basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {    //check drivers in grid folder
	
	WebDriver driver;
	String hubUrl ="http://192.168.12.235:4444";
	String appUrl ="https://www.facebook.com";

	public void setupGrid() {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("safari");
		
		try {
			driver = new RemoteWebDriver(new URL(hubUrl),cap);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		driver.get(appUrl);
	}
		
//		add if else conditions for browser and url the same as in Base class
		
		public void tc1() {
			
			System.out.println("page title = " + driver.getTitle());
		}
		
	
	public static void main(String[] args) {
		
		GridExample obj = new GridExample();
		obj.setupGrid();
	}

}
