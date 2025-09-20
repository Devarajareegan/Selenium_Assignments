package assignments;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter any 3 digits number");
		int num = scanner.nextInt();
		int realNumber = num;
		int reversedNum = 0;
		while (num>0) {
			int digit = num%10;
			reversedNum = reversedNum * 10 +digit;
			num /= 10;
		}
		if (realNumber == reversedNum) {
			System.out.println(realNumber+ " is a Palindrome Number");
		}
		else {
			System.out.println(realNumber + " Is not a Palindrome Number");
		}
	}
}
