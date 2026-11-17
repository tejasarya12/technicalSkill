
abstract class Vehicle {
	
	abstract void start();
	
	void stop() {
		System.out.println("Vehicle stopped");
	}
}

public class Abstraction extends Vehicle {
	
	void start() {
		System.out.println("Bike started");
	}
	
	public static void main(String[] args) {
		
		Abstraction a1 = new Abstraction();
		
		a1.start();
		a1.stop();
		
	}
}
