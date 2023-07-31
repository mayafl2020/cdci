package basic;

public class ThrowandThrows {
	
	public void divide(int a,int b) throws ArithmeticException{
		
		int c = a/b;
		System.out.println("result of division = " + c);
	}
	
	public void divide2(int a,int b) throws ArithmeticException{
		
		try {
			int c = a/b;
			System.out.println("result of division = " + c);
		}
		catch(ArithmeticException e) {
			throw new ArithmeticException("Divide by zero is not supported mathematically");
		}
		catch(Exception e) {
			throw new ArithmeticException("something is wrong while performing division operation");
		}
		
	}

	public static void main(String[] args) {
		
		ThrowandThrows obj = new ThrowandThrows();
		//calling method is going to handle
		
		try {
//			obj.divide(20, 0);
			obj.divide2(20, 0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	System.out.println("done");

	}
	


}
