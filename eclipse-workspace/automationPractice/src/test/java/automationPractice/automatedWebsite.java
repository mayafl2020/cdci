package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automatedWebsite {

	public static void main(String[] args) {
	
//		WebDriver driver;
//		
//		System.getProperty("webdriver.chrome,driver", "/Users/mayafarberov/eclipse-workspace/automationPractice/drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.get("https://www.marthastewart.com");
//		
//		JavascriptExecutor js =  (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,2000)");
//		
//		String name = "Maya";
//		for(int i =0;i <= name.length();i++) {
//		System.out.println(name);
//		}
//		int [] numbers = {1,2,3,4,5};
//		for(int i = 0 ; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//	
//	   String name = "racecar";
//	   String output ="";
//	   for(int i = name.length()-1; i >=0;i--) {
//		   output = output + name.charAt(i);
//		   }
//		   if(name.equals(output)) {
//		   System.out.print("name is palindrome");
//	   }else {
//		   System.out.println("not a palindrome");
//	   }

//		String str = "1234";
//		int number = Integer.parseInt(str);
//		System.out.println(str);
		
		
//		int sum =0;
//		for(int i = 1; i <=10;i++) {
//			if(i % 2 == 0) {
//			sum = sum + i;
//			}
//			}
//		
//		System.out.println(sum);
//			
//			
//		String[] name = {"apples","bananas","grapes","cherries"};
//		for(String a:name) {
//			System.out.println(a + ", ");
//		}
//		System.out.println(name.length);
//		
		
		
		
	    double income12 = 85000;
	    double income22 = 180700.5;
	    double income24 = 356000;
	    double income32= 450000;
	    double income35= 650000;
	    double income37= 1650000;
		double sum12 = 2200 + (income12 - 22000)* 0.12;
		double sum22 = 10294 + (income22 - 89450)* 0.22;
		double sum24 = 32580 + (income24 - 190750)* 0.24;
		double sum32 = 74208 + (income32 - 364200)* 0.32;
		double sum35 = 105664 + (income35 - 462500)* 0.35;
		double sum37 = 186601.50 + (income37 - 693750)* 0.37;
		System.out.println( "12 =" + sum12);
		System.out.println( "22 =" + sum22);
		System.out.println( "24 =" + sum24);
		System.out.println( "32 =" + sum32);
		System.out.println( "35 =" + sum35);
		System.out.println( "37 =" + sum37);
		
		}
	}
	
	


