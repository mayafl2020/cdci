package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenuExample extends Base{
	
	public void dropDownDemo() {
		
//		only works with select
		
		Select month = new Select(driver.findElement(By.id("month")));
		
//		select by index
		
//		month.selectByIndex(4);
		
//		select by value
		
//		month.selectByValue("6");
		
//		select by visible Text
		
//		month.selectByVisibleText("Sep");
		
//		is multiple
		
//		System.out.println("is month drop down multi select " + month.isMultiple());
		
//		first selected option
//        WebElement fso = month.getFirstSelectedOption();
//        System.out.println(fso.getText());
		
//		get all selected options
//		List<WebElement> allSelOpt = month.getAllSelectedOptions();
//		for ( WebElement elem : allSelOpt) {
//			
//			System.out.println(elem.getText());
		
		List<WebElement> allOPt = month.getOptions();
		for(WebElement elem : allOPt) {
			System.out.println(elem.getText());
		}
		
		
		
	}

	public static void main(String[] args) {
		
		DropDownMenuExample obj = new DropDownMenuExample();
		obj.setupBrowser("chrome", "https://www.facebook.com/reg/");
		obj.dropDownDemo();
		
		
		

	}

}
