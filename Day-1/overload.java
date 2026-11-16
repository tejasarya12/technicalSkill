package technical;

public class Overload {

	public static void main(String[] args) {
		int [] a = {20,30,40,50};
		
		add(a[0],a[1]);
		add(a[0],a[1],a[2]);
		add(a[0],a[1],a[2],a[3]);
	}
	static void add(int a,int b) {
		System.out.println(a+b);
	}
	static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	static void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
}
