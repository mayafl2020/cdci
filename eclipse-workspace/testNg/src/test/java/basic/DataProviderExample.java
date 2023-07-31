package basic;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
  @Test(dataProvider = "dp")
  public void login(String username, String password) {
	  
	  Reporter.log("username = " + username);
	  Reporter.log("password = " + password);
  }

  @DataProvider
  public String[][] dp() {
    return new String[][] {
      new String[] { "1mai@gmail.com", "test1234" },
      new String[] { "2mai@gmail.com", "btest1234" },
      new String[] {" ","invalidpass"},
      new String[] { "1mai@gmail.com", "" },		
    };
  }
}
