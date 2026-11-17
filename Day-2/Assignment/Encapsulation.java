
public class Encapsulation {
	
	private String name;
	private int age;
	
	public void setName(String n) {
		this.name=n;
	}
	
	public void setAge(int a) {
		this.age=a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		Encapsulation e1 = new Encapsulation();
		
		e1.setName("Rahul");
		e1.setAge(20);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		
	}
}
