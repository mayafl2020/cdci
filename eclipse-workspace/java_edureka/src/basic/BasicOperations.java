package basic;

public class BasicOperations {
	
	
	public void testMethod() {

//		arithmetic
		int a = 5;
		int b = 10;
//		add
		int c = a + b;
		System.out.println("result = " + c);
		
//		relational
		
		int d = 5;
		System.out.println(d <= 10);
		
//		logical
		int e = 5;
		System.out.println(e > 0 && e > 4);
		
//		conditional
		int f = 15;
		int g = (f<=10) ? 2:3;
		System.out.println(g);
		
//		instance
		String name = "Maya";
		System.out.println(name instanceof String);
		
		
	}

	public static void main(String[] args) {
	
		BasicOperations obj = new BasicOperations();
		obj.testMethod();
	}

}
