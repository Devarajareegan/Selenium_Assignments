package week4.day1_Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_String {
	static String[] companyNames = {"HCL","Wipro", "Aspire Systems", "CTS"};
	public static void main(String[] args) {
//		Declare a String array and add the values
		List<String> company = new ArrayList<>(Arrays.asList(companyNames));
		Collections.sort(company);
		System.out.println("The Company names are:-");
		for (int i = 3; i >= 0; i--) {
			System.out.print(company.get(i)+",");
		}
	}

}
