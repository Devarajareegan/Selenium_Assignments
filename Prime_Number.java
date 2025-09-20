package assignments;
import java.util.Iterator;

public class Prime_Number {
	public static void main(String[] args) {
		System.out.println("Prime numbers upto 100");
		for (int i = 2; i <= 100; i++) {
			boolean prime = true;
			for (int j = 2; j <= i/2; j++) {
				if (i%j == 0) {
					prime = false;
					break;
				}
				
			}
			if (prime) {
				System.out.println(i);
			}
		}
		
	}
}
