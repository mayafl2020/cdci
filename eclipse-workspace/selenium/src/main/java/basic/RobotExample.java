package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;

public class RobotExample extends Base{
	
	public void robotExample() throws AWTException, InterruptedException{
		
		driver.findElement(By.xpath("//section[@class='target']//figure")).click();
		
		Robot robot = new Robot();
		
//		String fileName ="flowers.jpeg";
//		StringSelection stringSelection = new StringSelection(fileName);
//		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		clipboard.setContents(stringSelection, stringSelection);
		
//		practice more
		Thread.sleep(5000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.keyPress(KeyEvent.KEY_LOCATION_RIGHT);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(5000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(5000);
//		robot.keyPress(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		
		RobotExample obj = new RobotExample();
		obj.setupBrowser("chrome", "https://tinypng.com");
		
		try {
			obj.robotExample();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("exception occured while performing the file upload operation.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
