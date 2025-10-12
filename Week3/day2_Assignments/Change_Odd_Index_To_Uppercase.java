package week3.day2_Assignments;

public class Change_Odd_Index_To_Uppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] upperCase = test.toCharArray();
		for (int i = 0; i < upperCase.length; i++) {
			if (i  %2 != 0) {
				upperCase[i] = Character.toUpperCase(upperCase[i]);
			}
		}
		String oddToUppercase = new String(upperCase);
		System.out.println(" The Changed Odd Index to Uppercase is "+oddToUppercase);
	}

}
