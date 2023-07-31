package basic;

import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test
  public void createUser() {
	  
	  System.out.println("create user");

  }
  
  @Test(dependsOnMethods = {"createUser"})
  public void updateUser() {
	  
	  System.out.println("update user");

  }
  
  @Test(dependsOnMethods = {"updateUser"})
  public void deleteUser() {
	  
	  System.out.println("delete user");

  }
}
