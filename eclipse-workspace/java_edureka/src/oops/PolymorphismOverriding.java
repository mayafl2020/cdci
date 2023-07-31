package oops;

class Mother{
	
	public void rangeRover() {
		
		System.out.println("Mom's Range Rover is silver");
	}
	
}

class Sons extends Mother{
	
	@Override
	public void rangeRover() {
		
		System.out.println("Sons Range Rovers are navy");
	}
}

public class PolymorphismOverriding {

	public static void main(String[] args) {
		
		
		
		Sons obj = new Sons();
		obj.rangeRover();

		Mother mom = new Mother();
		mom.rangeRover();
		
//		Mother moms = new Sons();
//		moms.rangeRover();
	}

}
