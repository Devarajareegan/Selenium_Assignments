package week3.day2_Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "Reegan";
		String text2 = "eganRe";
		if (text1.length() != text2.length()) {
			System.out.println("Lengths mismatch, therefire the Strings are not an Anagram");
		}
		char[] name1 = text1.toCharArray();
		char[] name2 = text2.toCharArray();
		Arrays.sort(name1);
		Arrays.sort(name2);
		
		if (Arrays.equals(name1, name2)) {
			System.out.println("The given Strings are Anagram");
		}else {
			System.out.println("The Given Strings are not Anagram");
		}
		
		
	}

}
