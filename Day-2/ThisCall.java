
public class ThisCall {
	String col;
	String comp;
	float price;
	

	
	public ThisCall(String c,String co,float p) {
		this("CLASSMATE");
		this.col=c;
		this.comp=co;
		this.price=p;
		System.out.println("construtor with 3 values "+this.comp);
	}
	
	public ThisCall(String c) {
		
		this.comp=c;
		
		System.out.println("construtor with 1 values "+this.comp);
	}
	
	public static void main(String[] args) {
		
		ThisCall p1 = new ThisCall("blue","dell",20.0f);
		
		
		System.out.println(p1.comp);
		System.out.println(p1.col);
		System.out.println(p1.price);
		
		
	}
}
