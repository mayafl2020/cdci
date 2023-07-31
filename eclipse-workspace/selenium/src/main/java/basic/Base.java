package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {
	
	WebDriver driver;
	
	public void setupBrowser(String browser,String url){
		
		String currDir = System.getProperty("user.dir");
		String fs = System.getProperty("file.separator");
		String path = currDir + fs + "drivers" + fs;
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", path + "chromedriver");
		driver = new ChromeDriver();
		}
		
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		
		
		else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.geckodriver.driver", path + "geckodriver");
		driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edgedriver.driver", path + "edge");
		driver = new EdgeDriver();
		}
		
		else {
			
			System.out.println("Valid browser was not provided,hence quitting the automation run");
			System.exit(0);
		}
		
//		implicit wait
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		page load ===> pom
		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		
		if(url!="") 
		driver.get(url);
		
		
		else 
			
		  driver.get("about:blank");
		driver.manage().window().maximize();
		
	}
	
	

}
