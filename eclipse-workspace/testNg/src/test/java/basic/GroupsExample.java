package basic;

import org.testng.annotations.Test;

@Test(groups = {"regression"})//default group or partial group
public class GroupsExample {
	
  @Test
  public void tc1() {
	  
	  System.out.println("from tc1");
  }
  @Test(groups = {"bug"})
  public void tc2() {
	  
	  System.out.println("from tc2");
  }
  @Test
  public void tc3() {
	  
	  System.out.println("from tc3");
  }
  @Test(groups = {"smoke"})
  public void tc4() {
	  
	  System.out.println("from tc4");
  }
  @Test
  public void tc5() {
	  
	  System.out.println("from tc5");
  }
}
