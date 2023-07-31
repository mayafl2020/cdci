package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {

	private WebDriver driver;

	public void setupBrowser(String browser, String url) {

		String curDir = System.getProperty("user.dir");
		String fs = System.getProperty("file.separator");
		String path = curDir + fs + "drivers" + fs;

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", path + "chromedriver");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("safari")) {

			System.setProperty("webdriver.safari.driver", "usr/bin/safaridriver");
			driver = new SafariDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", path + "geckodriver");
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edgedriver.driver", path + "edge");
			driver = new EdgeDriver();
		} else {
			System.out.println("Valid browser was not provided,hence quiting the automation run");
		}

		if (url != "") {

			driver.get(url);
		} else

			driver.get("about:blank");
		driver.manage().window().maximize();

	}
	
	public WebDriver getDriver() {
		
		return driver;
	}
	public void closeTab() {
		driver.close();
	}

}
