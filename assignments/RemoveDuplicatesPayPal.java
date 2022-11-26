package week3.assignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesPayPal {

	public static void main(String[] args) {

		String str = "PayPal India";

		String str2 = str.replace(" ", "");

		char[] charArray = str2.toCharArray();

		Set<Character> charSet = new HashSet<Character>();

		Set<Character> dupCharSet = new HashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {

			if (charSet.contains(charArray[i]))

				dupCharSet.add(charArray[i]);

			else
				charSet.add(charArray[i]);

		}

		System.out.println("Unique Letters " +charSet);
		System.out.println("Duplicate Letters " +dupCharSet);
	}

}
