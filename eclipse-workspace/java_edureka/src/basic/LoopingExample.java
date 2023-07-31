package basic;

public class LoopingExample {
	
	public void whileExample() {
		int i = 1;
		
		while(i<=10) {
			
			System.out.println("i = " + i);
//			break;
			
			i++;
		}
		
		System.out.println("while loop completed");
	}
	
	public void doWhileExample() {
		
		int i =1;
		
		do {
			System.out.println("i = " + i);
			i++;
		} while ( i<=10);
		
		System.out.println("do while loop completed");
	}

	public void forLoopExample() {
		
		for(int i = 1; i<=10;i++) {
			System.out.println("i = " + i);
		}
		System.out.println("for loop completed");
	}
	
	public static void main(String[] args) {
	
		LoopingExample obj = new LoopingExample();
		obj.whileExample();
		obj.doWhileExample();
		obj.forLoopExample();
	}

}
