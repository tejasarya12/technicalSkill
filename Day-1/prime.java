package technical;
//import java.util.*;

public class prime {

	public static void main(String[] args) {
		
		int n=10;
		int count =0;
		for (int i=1;i<=15;i++) {
			if (i%n == 0) {
				count++;
			}
			
			}
		if(count==2) {
			
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
	}
}
}
