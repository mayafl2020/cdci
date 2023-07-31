package basic;

public class MethodsExample {
	
//	method without parameters and without return type
	public void m1() {
		

//		variable declaration, value storage
		int a = 5;
		int b = 10;
		
//		calculation
		int result = a + b;
		
//		displaying the result
		System.out.println("Sum of two numbers is = " + result );
		
	}
	
//	method with parameters and without return type
	public void m2(int a, int b) {
		


//		calculation
		int result = a + b;
		
//		displaying the result
		System.out.println("Sum of two numbers is = " + result );
		
	}
	
//	method with parameters and with return type
	public int m3(int a, int b) {
		


//		calculation
		int result = a + b;
		
//		displaying the result
		return result;
		
//		return a+b
		
	}
	
//	method without parameters and with return type
	public int m4 () {
		


//		calculation
		int cy = 2023;
		
//		displaying the result
		return cy;
		
//		return a+b
		
	}

	public static void main(String[] args) {
	
		MethodsExample obj = new MethodsExample();
		obj.m1();
		obj.m2(10, 9);
		int result = obj.m3(21, 6);
		System.out.println("From main method.Result is = " + result);
		int cy = obj.m4();
		System.out.println("Current year = " + cy);

	}

}
