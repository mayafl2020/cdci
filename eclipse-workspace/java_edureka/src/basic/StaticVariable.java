package basic;

public class StaticVariable {
	
	int age = 23;
	static int cy = 2023;
	
	
	public void m1() {
		
		
		System.out.println("from m1 = " + cy);
		
	}
	
	
	
	public void m2() {
		
		
		System.out.println("from m1 = " + cy);
		
	}

	public static void main(String[] args) {
		
		StaticVariable obj = new StaticVariable();
		obj.m1();
		obj.m2();
	}

}
