package oops;

class Facebook{
	
	String username;
	private String passwd;
	
	public void login() {
		
//		login validation code comes here
		System.out.println("username = " + username);
		System.out.println("password = " + passwd);
	}
	
	public void setPassword(String pass) {
		
		this.passwd = pass;
	}
	
}

public class EncapsulationExample {

	public static void main(String[] args) {
		
		Facebook obj = new Facebook();
		obj.username = "maya@gmail.com";
//		obj.password = "test1234";
		obj.setPassword("test123");
		obj.login();
		
//		hacker
		System.out.println("*****from hacker *****");
		System.out.println("un = " + obj.username);
//		System.out.println("password = " + obj.passwrd);
		

	}

}
