package basic;

public class NavigationCommands extends Base{
	
	public void navCommands() {
		
//		to
		driver.navigate().to("https://www.youtube.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		back
		driver.navigate().back();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		forward
		driver.navigate().forward();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		refresh
		driver.navigate().refresh();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		NavigationCommands obj = new NavigationCommands();
		obj.setupBrowser("chrome", "https://www.google.com");
		obj.navCommands();

	}

}
