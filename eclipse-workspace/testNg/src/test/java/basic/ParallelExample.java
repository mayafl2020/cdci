package basic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExample {
  @Parameters({"browser"})
  @Test
  public void tc1(String browser) {
	  
	  System.out.println("Browser = " + browser);
  }
}
