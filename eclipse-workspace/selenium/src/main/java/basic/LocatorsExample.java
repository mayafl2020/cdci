package basic;

import org.openqa.selenium.By;

public class LocatorsExample extends Base {
	
	public void locatorDemo() {
		
//		id
		
//		driver.findElement(By.id("email")).sendKeys("mayafl2020@gmail.com");
		
//		name
		
//		driver.findElement(By.name("email")).sendKeys("99999999");
		
//		classname
		
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("666666");
//		driver.findElement(By.className("inputtext")).sendKeys("666666");
//		driver.findElement(By.className("_55r1")).sendKeys("777777");
//		driver.findElement(By.className("_6luy")).sendKeys("3333333");
		
//		tagname
		
//		driver.findElement(By.tagName("button")).click();
		
//		linktext ==> hyperlinks> ===> 'a'
		
//		driver.findElement(By.linkText("Forgot password?")).click();
		
//		partialLinkText
		
//		driver.findElement(By.partialLinkText("Forgot password?")).click();
//		driver.findElement(By.partialLinkText("Forgot")).click();
//		driver.findElement(By.partialLinkText("password?")).click();
//		driver.findElement(By.partialLinkText("F")).click();
//		driver.findElement(By.partialLinkText("?")).click();
//		driver.findElement(By.partialLinkText("For")).click();
//		driver.findElement(By.partialLinkText("ord?")).click();
//		driver.findElement(By.partialLinkText("got")).click();
//		driver.findElement(By.partialLinkText("asswo")).click();
//		driver.findElement(By.partialLinkText("ot pas")).click();
//		driver.findElement(By.partialLinkText("ot password?")).click();
//		driver.findElement(By.partialLinkText("Forgot pass")).click();
		
//		xpath
		
//		$x("//input[@id='email']")
		
//		"//tagname[@attribute='value']"
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("111111111");
		
//		absolute path
//		
//		String path = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button";
		
//		driver.findElement(By.xpath(path)).click();
		
//		relative path
		
//		driver.findElement(By.xpath("//div[2]/button")).click();
		
//		tagname
		
//		$x("//button");
//		driver.findElement(By.xpath("//button")).click();
		
//		attribute (avoid it don't use it)
		
//		$x("//*[@id = 'email']")
		
//		driver.findElement(By.xpath("//*[@id = 'email']")).sendKeys("byxpath");
		

		
//		tagname + attribute
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tagname+attribute");
//		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("tagnameAttribute");
		
//		functions
//		starts with
		
//		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[starts-with(@id,'emai')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[starts-with(@id,'em')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[starts-with(@id,'e')]")).sendKeys("xpathFunctions");
		
//		contains
		
//		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[contains(@id,'emai')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[contains(@id,'ema')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[contains(@id,'em')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[contains(@id,'e')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[contains(@id,'l')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[contains(@id,'il')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[contains(@id,'ail')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[contains(@id,'ma')]")).sendKeys("xpathFunctions");
//		driver.findElement(By.xpath("//input[contains(@id,'i')]")).sendKeys("xpathFunctions");
		
//		text
		
//		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
//		text()+starts with
		
//		driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook')]"));
		
//		text()+ contains

//		driver.findElement(By.xpath("//input[contains(text(),'Facebook')]"));
//		driver.findElement(By.xpath("//input[contains(text(),'ebook')]"));
//		driver.findElement(By.xpath("//input[contains(text(),'ok')]"));
		
//		Advanced
		
//		and
//		driver.findElement(By.xpath("//input[contains(@class,'inputtext')and @id='email']")).sendKeys("Advanced");
//		driver.findElement(By.xpath("//input[@name = 'email' and @id='email']")).sendKeys("Advanced");
//		or
//		driver.findElement(By.xpath("//input[@name = 'email' or @id='email']")).sendKeys("Advanced");
		
//		index
//	    without siblings ==> numbers should be outside ==> index value starts from 0
//		driver.findElement(By.xpath("//input"))[2].sendKeys("YES");

	
//		without siblings ==> numbers should be inside ==> index value starts from 1
//		driver.findElement(By.xpath("//select[2]")) month
		
//		chained
//		driver.findElement(By.xpath("//span/select[2]"));
//		driver.findElement(By.xpath("//form//span//select[2])"));
		
//		axes
		
//		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		child
		
//		driver.findElement(By.xpath("//span[@class='_5k_4']/child::span")).click();
//		driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']/child::span/select[2]")).click();
		
		
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Maya");
	
//		parent
		
//		driver.findElement(By.xpath("//select[@id = 'day']/parent::span")).click();
		
//		following sibling
		
//		driver.findElement(By.xpath("//select[@id='day']/following-sibling::select[@id='year']")).click();
		
//		following
		
//		driver.findElement(By.xpath("//select[@id='day']/following::select[2]")).click();
//		driver.findElement(By.xpath("//input[@name='firstname']/following::select[2]")).click();
//		driver.findElement(By.xpath("//input[@name='firstname']/following::select[@id='month']")).click();	
		
//		preceding
//		driver.findElement(By.xpath("//select[@id='year']/preceding::select[1]")).click();
//		driver.findElement(By.xpath("//select[@id='year']/preceding::select[2]")).click();
//		driver.findElement(By.xpath("//select[@id='year']/preceding::input[@name='firstname']")).sendKeys("Maya");
		
//		ancestor
//		driver.findElement(By.xpath("//select[@id='year']/ancestor::form"));
//		driver.findElement(By.xpath("//select[@id='year']/ancestor::div"));
//		driver.findElement(By.xpath("//select[@id='year']/ancesotr::div[@id='birthday_wrapper']"));
//		driver.findElement(By.xpath("//select[@id='year']/ancestor::div[@id='birthday_wrapper']"));
//		driver.findElement(By.xpath("//select[@id='year']/ancestor::body//form//select[2]"));
	
//		descendant
//		driver.findElement(By.xpath("//body/descendant::form//select[2]"));
		
		
//		CSS
		
//		$$("#email)  # id, . class
//		css #=id .=class
		
//		driver.findElement(By.cssSelector("#email")).sendKeys("999");
		
//		css id attribute
		
//		driver.findElement(By.cssSelector("#email")).sendKeys("7777777");
		
//		css class attribute
		
//		driver.findElement(By.cssSelector(".inputtext")).sendKeys("66666666");
//		driver.findElement(By.cssSelector(".inputtext._55r1")).sendKeys("999999");
//		driver.findElement(By.cssSelector(".inputtext._55r1._6luy")).sendKeys("999999");
//		driver.findElement(By.cssSelector(".inputtext._6luy")).sendKeys("999999");
//		driver.findElement(By.cssSelector("._6luy")).sendKeys("999999");
//		driver.findElement(By.cssSelector("._55r1")).sendKeys("999999");
//		driver.findElement(By.cssSelector("._55r1._6luy")).sendKeys("999999");
		
//		css id and class attr (any combination)
		
//		driver.findElement(By.cssSelector("#email.inputtext._55r1._6luy")).sendKeys("111111");
//		driver.findElement(By.cssSelector("#email.inputtext._55r1")).sendKeys("111111");
//		driver.findElement(By.cssSelector("#email.inputtext")).sendKeys("111111");
//		driver.findElement(By.cssSelector("#email.inputtext._6luy")).sendKeys("111111");
//		driver.findElement(By.cssSelector("#email._55r1._6luy")).sendKeys("111111");
//		driver.findElement(By.cssSelector(".inputtext._55r1._6luy#email")).sendKeys("111111");
		
//		css tagname
		
//		driver.findElement(By.cssSelector("button")).click();
		
//		css html attribute avoid it
		
//		driver.findElement(By.cssSelector("[id='email']")).sendKeys("Mya");
		
//		css html tagname + html attribute
		
//		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Yes!");
		
//		css ==> css attribute (id+class) & html (tagname + attribute) any combination
		
//		driver.findElement(By.cssSelector("input#email.inputtext._55r1._6luy")).sendKeys("333333");
//		driver.findElement(By.cssSelector("input#email")).sendKeys("333333");
//		driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("333333");
//		driver.findElement(By.cssSelector("input._6luy")).sendKeys("333333");
//		driver.findElement(By.cssSelector("input._55r1")).sendKeys("333333");
//		driver.findElement(By.cssSelector("input[id='email']#email.inputtext._55r1._6luy")).sendKeys("333333");
		
//		css substring
//		starts-with or prefix ===> ^
//		driver.findElement(By.cssSelector("input[id^='email']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id^='emai']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id^='ema']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id^='em']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("99999");
		
//		ends-with or suffix ===> $
		
//		driver.findElement(By.cssSelector("input[id$='email']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id$='mail']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id$='ail']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id$='il']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id$='l']")).sendKeys("99999");
		
//		contains or suffix ==> *
//		
//		driver.findElement(By.cssSelector("input[id*='emai']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id*='ema']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id*='em']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id*='e']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id*='mai']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id*='ma']")).sendKeys("99999");
		driver.findElement(By.cssSelector("input[id*='a']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id*='il']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id*='mail']")).sendKeys("99999");
//		driver.findElement(By.cssSelector("input[id*='a']")).sendKeys("99999");
		
		
		
		
//		driver.close();
		
		
		
		
	}

	public static void main(String[] args) {
	
		LocatorsExample obj = new LocatorsExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.locatorDemo();

	}

}
