package basic;

public class ConstructorExample {
	
	ConstructorExample(String name){
		
		System.out.println("Hello " + name + ", Welcome to Java training.");
		
		
	}
	
	public void testMethod() {
		
	}
	

	public static void main(String[] args) {
		

		ConstructorExample obj1 = new ConstructorExample("Maya");
		ConstructorExample obj2 = new ConstructorExample("Arkady");
		obj1.testMethod();
		obj2.testMethod();
	}

}
