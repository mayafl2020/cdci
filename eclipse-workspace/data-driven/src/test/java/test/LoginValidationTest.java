package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;

public class LoginValidationTest extends BaseTest {
	
	
  @Parameters({"validUsername","validPassword"})
  @Test
  public void validUsernameValidPassword(String username,String password) {
	  
	  Login login = new Login(driver);
	  login.loginWithCredentials(username, password);
  }
  
  @Parameters({"invalidUsername","validPassword"})
  @Test
  public void invalidUsernameValidPassword(String username,String password) {
	  
	  Login login = new Login(driver);
	  login.loginWithCredentials(username, password);
  }
  
  @Parameters({"validUsername","invalidPassword"})
  @Test
  public void validUsernameinvalidPassword(String username,String password) {
	  
	  Login login = new Login(driver);
	  login.loginWithCredentials(username, password);
  }
  
  @Parameters({"invalidUsername","invalidPassword"})
  @Test
  public void invalidUsernameinvalidPassword(String username,String password) {
	  
	  Login login = new Login(driver);
	  login.loginWithCredentials(username, password);
  }
  
  @Parameters("validPassword")
  @Test
  public void validPassword(String password) {
	  
	  String username = "";
	  Login login = new Login(driver);
	  login.loginWithCredentials(username,password);
  }
  
  @Parameters("validUsername")
  @Test
  public void validUsername(String username) {
	  
	  String password = "";
	  Login login = new Login(driver);
	  login.loginWithCredentials(username,password);
  }
  
  
  @Test
  public void blankUserNameblankPassword() {
	  
	  String username = "";
	  String password = "";
	  Login login = new Login(driver);
	  login.loginWithCredentials(username ,password);
  }
}
