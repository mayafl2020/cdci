package oops;

class Grandfather{
	public void bentley() {
		System.out.println("Grandfather's bentley");
	}
}
class Father extends Grandfather{
	public void ferrari() {
		System.out.println("Dad's Ferrari");
	}
}

class Son extends Father{
	
	
}

class Daughter extends Father{
	
}
public class InheritanceExample {

	public static void main(String[] args) {
		
		Son obj = new Son();
		Daughter obj1 = new Daughter();
		obj.ferrari();
		obj.ferrari();
		obj.bentley();
		obj1.bentley();

	}

}
