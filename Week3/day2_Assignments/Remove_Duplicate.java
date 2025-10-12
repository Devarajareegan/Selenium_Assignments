package week3.day2_Assignments;

public class Remove_Duplicate {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
//		Expected output = "We learn Java basics as part of sessions in week1"
		int count = 0;
		String[] words = text.split(" ");
		
		// Nested loops to compare words
		for (int i = 0; i < words.length; i++) {
			for (int j = i+ 1; j < words.length; j++) {
				// Use equalsIgnoreCase for case-insensitive comparison
				if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
					// Replace duplicate word with empty string
					words[j] = "";
					count++;
				}
			}
		}
		// Print array with duplicates replaced by empty strings
		if (count > 0) {
			for(String word:words) {
				if (!word.equals("")) {
					System.out.print(word+" ");
				}
			} 
			
		}
		else {
			System.out.println(text);
		}

	}

}
