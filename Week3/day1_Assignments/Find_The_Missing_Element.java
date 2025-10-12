package week3.day1_Assignments;

import java.util.Arrays;
import java.util.Iterator;

public class Find_The_Missing_Element {

	public static void main(String[] args) {
		int array [] = {1,4,3,2,8,6,7};
		Arrays.sort(array);
		for (int i = 1; i < array.length; i++) {
			if (array[i] - array[i-1] == 1) {
			}
			else {
				System.out.println(" The Missing number is " + (array[i-1]+1));
			}
		}

	}

}
