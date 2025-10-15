package week4.day1_Assignments;

import java.util.ArrayList;
import java.util.List;

public class Find_Intersection {
	
	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
	
	List<Integer> list1 = new ArrayList<>();
	 for(int num : arr1) {
		 list1.add(num);
	 }
	 List<Integer> list2 = new ArrayList<>();
	 for(int num : arr2) {
		 list2.add(num);
	 }
	 System.out.println("The Intersection Number is:-");
	 for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if (list1.get(i).equals(list2.get(j))) {
				System.out.println(list1.get(i));
			}
		}
	}
	 
	

}}

