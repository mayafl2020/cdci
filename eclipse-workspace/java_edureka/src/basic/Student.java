package basic;

public class Student {
	

	String name;
		
		
	
	
	
	public void welcomeMessage() {
		
		System.out.println("Welcome to the new world of network " + name);
		
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name ="Maya";
		s2.name = "Arkady";
		
		s1.welcomeMessage();
		s2.welcomeMessage();
		

	}

}
