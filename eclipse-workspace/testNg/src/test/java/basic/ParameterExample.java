package basic;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	@Parameters({"validUsername","validPassword"})
  @Test
  public void validUserNameValidPassowrd(String username,String password) {
	  
	  Reporter.log("username = " + username);
	  Reporter.log("password = " + password);
	  
  }
	
	@Parameters({"invalidUsername","invalidPassword"})
	  @Test
	  public void invalidUserNameinValidPassowrd(String username,String password) {
		  
		  Reporter.log("username = " + username);
		  Reporter.log("password = " + password);
		  
	  }
}
