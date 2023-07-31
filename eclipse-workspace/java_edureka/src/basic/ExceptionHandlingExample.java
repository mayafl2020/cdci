package basic;

public class ExceptionHandlingExample {
	
	public void divide(int a,int b) {
		try {
			int c = a/b;
			System.out.println("return of division " + c);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Divide by zero is  not mathematically supported");
		}
		finally {
			System.out.println("from  finally");
		}
	}

	public static void main(String[] args) {
		
		ExceptionHandlingExample obj = new ExceptionHandlingExample();
		obj.divide(20, 0);
		System.out.println("done");
		

	}

}
