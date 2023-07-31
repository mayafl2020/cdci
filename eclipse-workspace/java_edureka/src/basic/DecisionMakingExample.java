package basic;

public class DecisionMakingExample {
	
	public void ifExample(int x) {
		
		System.out.println("number provided is - " + x);
		
		if(x%2==0)
		   System.out.println("it's an even number");
		System.out.println("done");
		
	}
	
	public void ifElseExample(int x) {
		
		System.out.println("number provided is - " + x);
		if(x%2==0)
			System.out.println("it's an even number");
		else 
			System.out.println("it's an odd number");
		System.out.println("done");
	}
	
	public void elseIfExample(int x) {
		
		System.out.println("number provided is - " + x);
		
		if(x==0)
			System.out.println("it's neither an even or an odd number");
		else if(x%2==0)
			System.out.println("it's an even number");
		else
			System.out.println("it's an odd number");
		System.out.println("done");
		
	}
	
	public void nestedIfElseExample(int x) {
		
		System.out.println("number provided is - " + x);
		
		
		    if(x<0)
		    	System.out.println("it's a negative number");
		    else {
			
			if(x==0)
				System.out.println("it's neither an even or an odd number");
			else if(x%2==0)	
				System.out.println("it's an even number");
			else
				System.out.println("it's an odd number");
			System.out.println("done");
		}
	}
	
	public void switchExample(String day) {
		
		switch(day) {
		case "mon":
			System.out.println("Monday Blues");
			break;
			
		case "tue":
			System.out.println("It's Tuesday");
			break;
			
		case "wed":
			System.out.println("Watchout for online shopping");
			break;
			
		case "thu":
			System.out.println("it's not firday yet");
			break;
			
		case "fri":
			System.out.println("it's finally friday!");
			break;
			
		case "sat":
			System.out.println("Finally it's weekend");
			break;
			
		case "sun":
		System.out.println("It's a beautiful Sunday!");
		break;
		
		}
	}

	public static void main(String[] args) {
	
		DecisionMakingExample obj = new DecisionMakingExample();
		obj.ifExample(9);
		obj.ifElseExample(14);
		obj.elseIfExample(0);
		obj.nestedIfElseExample(9);
		obj.switchExample("sun");
		

	}

}
