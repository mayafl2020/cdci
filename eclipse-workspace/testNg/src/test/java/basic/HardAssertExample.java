package basic;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertExample {
  @Test
  public void tc1() {
	  
	  int a = 15;
	  Reporter.log("a = " + a);
	  assertTrue (a <=10,"The value of a is greater than 10,");
	  
	  System.out.println("from tc1");
  }
  
  @Test
  public void tc2(){
	  
	  System.out.println("from tc2");
	  
  }
}
