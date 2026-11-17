
class Animal {
	
	void display() {
		System.out.println("Animal class");
	}
}

class Dog extends Animal {
	
	void show() {
		System.out.println("Dog class");
	}
}

public class DownCasting {
	
	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		
		Dog d1 = (Dog)a1;
		
		d1.display();
		d1.show();
		
	}
}
