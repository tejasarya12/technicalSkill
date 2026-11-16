
package technical;

public class Constructor {
	String col;
	String comp;
	float price;
	
	public Constructor() {
		this.col="red";
		this.comp="hp";
		this.price=10.0f;
	}
	
	public Constructor(String c,String co,float p) {
		this.col=c;
		this.comp=co;
		this.price=p;
	}
	
	public static void main(String[] args) {
		Constructor p1 = new Constructor();
		Constructor p2 = new Constructor("blue","dell",20.0f);
		
		System.out.println(p1.col);
		System.out.println(p1.comp);
		System.out.println(p1.price);
		
		System.out.println(p2.col);
		System.out.println(p2.comp);
		System.out.println(p2.price);
	}
}
