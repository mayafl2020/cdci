package basic;

import org.testng.annotations.Test;

public class TestAttributesExample {
	
  @Test(description = "update password functionality",priority = 1,timeOut = 5000)
  public void tc1() {
	  
	  System.out.println("from tc1");
  }
}
