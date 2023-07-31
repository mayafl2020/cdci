package basic;

public class Test extends Base {
	
	public void getPageTitle(){
		
		String title = driver.getTitle();
		System.out.println("page title = " + title);
		
	}

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.setupBrowser("safari", "https://www.facebook.com");
        obj.getPageTitle();
	}

}
