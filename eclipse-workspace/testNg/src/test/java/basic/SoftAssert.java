package basic;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert {
  @Test
  public void tc1() {
	  
	  SoftAssert sa = new SoftAssert();
	  int a = 5;
	  Reporter.log("a = " + a);
	  
//	  sa.assertTrue (a<=10,"int a is greater than 10,");
	  System.out.println("from tc1");
	  
  }
  
  @Test
  public void tc2() {
	  
	  System.out.println("from tc2");
	  
  }
  
}
