package assignments;

import java.util.Iterator;

public class Fibonacci_Series {
	public static void main(String[] args) {
		System.out.println("Fibanocci Series Upto 1000");
		int n1 = 0, n2 = 1, n3;
		for (int i = 0; i < 1000; i++) {
			n3 = n1 + n2;
			
			System.out.println(n1 + " ");
			if (n3 > 1000 ) {
				break;
			}
			 
			n1 = n2;
			n2 = n3;
			
			
		}
	}

}
