package week4.day1_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Missing_Element {
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,10,6,8};
	System.out.println("The Missing Numbers are:-");
//	add the element to the List
	List<Integer> list = new ArrayList();
	
	for(int number: arr) {
		list.add(number);
	}
	Collections.sort(list);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i)-list.get(i-1)==1) {	
			}
			else {
				System.out.println(list.get(i-1)+1);
			}
		}
	

}
}

