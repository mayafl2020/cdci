package oops;

abstract class Car{
	
	public abstract void CarName();
	public abstract void manufacturer();
	public abstract void cost();
}

class Nexon extends Car{

	@Override
	public void CarName() {
	System.out.println("Carname = Nexxon");
		
	}

	@Override
	public void manufacturer() {
		System.out.println("Manufacturer = Tata");
		
	}

	@Override
	public void cost() {
		System.out.println("Cost = $25000");
		
	}
	
}

class Kiger extends Car{
	

	@Override
	public void CarName() {
	System.out.println("Carname = Kiger");
		
	}

	@Override
	public void manufacturer() {
		System.out.println("Manufacturer = Renault");
		
	}

	@Override
	public void cost() {
		System.out.println("Cost = $25000");
		
	}
}



public class AbstractionExample {

	public static void main(String[] args) {
		
		Car c1 = new Kiger();
		c1.CarName();
		c1.cost();
		c1.manufacturer();

	}

}
