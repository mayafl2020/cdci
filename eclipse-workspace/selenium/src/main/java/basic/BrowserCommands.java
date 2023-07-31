package basic;

public class BrowserCommands extends Base {

	
	public void browserCommandsDemo() {
		
//		get
		
//		driver.get("https://www.youtube.com");
		
//		title
		
		String title = driver.getTitle();
		System.out.println("page title = " + title);
		
//		layman's way of writing test cases
		
//		String expectedTitle = "YouTube";
//		String actualTitle = driver.getTitle();
//		
//		if (actualTitle.equals(expectedTitle)) {
//			
//			System.out.println("title test case passed");
//		}
//		else 
//			
//			System.out.println("title test case failed");
		
//		current url
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is " + currentUrl);
		
//		page source
		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);

//		thread.sleep is used for demo purpose
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		 close tab
//		driver.close();
		
//		close browser
		driver.close();
		
	}
	public static void main(String[] args) {
	
		BrowserCommands obj = new BrowserCommands();
		obj.setupBrowser("chrome", "https://www.fb.com");
		obj.browserCommandsDemo();

	}

}
