package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;
import util.Keyword;

public class LoginValidationTest extends BaseTest {
	
	Keyword kw;
	
	@BeforeClass
	public void beforeClass() {
		
		kw = new Keyword(driver);
	}
	
	
  @Parameters({"validUsername","validPassword"})
  @Test
  public void validUsernameValidPassword(String username,String password) {
	  
	 
	  kw.login(username, password);
  }
  
  @Parameters({"invalidUsername","validPassword"})
  @Test
  public void invalidUsernameValidPassword(String username,String password) {
	  

	  kw.login(username, password);
  }
  
  @Parameters({"validUsername","invalidPassword"})
  @Test
  public void validUsernameinvalidPassword(String username,String password) {
	  

	  kw.login(username, password);
  }
  
  @Parameters({"invalidUsername","invalidPassword"})
  @Test
  public void invalidUsernameinvalidPassword(String username,String password) {
	  

	  kw.login(username, password);
  }
  
  @Parameters("validPassword")
  @Test
  public void validPassword(String password) {
	  
	  String username = "";

	  kw.login(username, password);
  }
  
  @Parameters("validUsername")
  @Test
  public void validUsername(String username) {
	  
	  String password = "";

	  kw.login(username, password);
  }
  
  
  @Test
  public void blankUserNameblankPassword() {
	  
	  String username = "";
	  String password = "";

	  kw.login(username, password);
  }
}
