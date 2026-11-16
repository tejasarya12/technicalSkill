package technical;


public class Construtor {
	String col;
	String comp;
	float price;
	
	public Construtor() {
		System.out.println("k");
		this.col="p";
		this.comp="e";
		this.price=10.0f;
		
	}
	
	public static void main(String[] args) {
		Construtor p1 = new Construtor();
		System.out.println(p1.col);
		System.out.println(p1.comp);
		System.out.println(p1.price);
	}
}
