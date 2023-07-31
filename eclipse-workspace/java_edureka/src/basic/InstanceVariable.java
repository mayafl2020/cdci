package basic;

public class InstanceVariable {
	
	String name;
	
	public void  welcomeMessage() {
		
		System.out.println("Hello " + name + ", Welcome to Harward University");
	}

	public static void main(String[] args) {
		
		InstanceVariable s1 = new InstanceVariable();
		s1.name = "Maya";
		s1.welcomeMessage();

	}

}
