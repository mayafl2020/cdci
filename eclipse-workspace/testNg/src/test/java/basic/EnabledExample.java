package basic;

import org.testng.annotations.Test;

public class EnabledExample {
	
  @Test(enabled =false)
  public void tc1() {
	  
	  System.out.println("from tc1");
  }
  
  @Test
  public void tc2() {
	  
	  System.out.println("from tc2");
  }
}
