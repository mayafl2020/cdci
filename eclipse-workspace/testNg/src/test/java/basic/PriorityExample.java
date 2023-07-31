package basic;

import org.testng.annotations.Test;

public class PriorityExample {
  @Test(priority = 2)
  public void tc1() {
	  
	  System.out.println("from tc1");
  }
  
  @Test(priority = 1)
  public void tc2() {
	  
	  System.out.println("from tc2");
  }
  
  @Test(priority = 2)
  public void tc3() {
	  
	  System.out.println("from tc3");
  }
  
  @Test(priority = 1)
  public void tc4() {
	  
	  System.out.println("from tc4");
  }
  
  @Test(priority = 3)
  public void tc5() {
	  
	  System.out.println("from tc5");
  }
}
