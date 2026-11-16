
package oops;

public class C implements A,B {

	public void ai() {
		System.out.println("artificial intelligence");
	}
	
	public void content() {
		System.out.println("content creation");
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.ai();
		c.content();
	}
}
