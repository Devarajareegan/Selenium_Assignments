package week4.day1_Assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Second_Largest_Number {

	public static void main(String[] args) {
		Integer[] array1 = {3, 2, 11, 4, 6, 7};
		
		List<Integer> list = Arrays.asList(array1);
		Collections.sort(list);
		
		int size = list.size();
		
		Integer secondLargestNumber = list.get(size - 2);
		
		System.out.println(secondLargestNumber);
		
		
		
	}

}
