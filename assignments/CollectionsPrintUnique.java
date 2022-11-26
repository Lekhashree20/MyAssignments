package week3.assignments;

import java.util.HashSet;
import java.util.Set;

public class CollectionsPrintUnique {

	public static void main(String[] args) {

		String str = "Lekhashree";
		
		char[] charArray = str.toCharArray();
		
		Set<Character> unique = new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			
			unique.add(charArray[i]);
			
		}
		System.out.println("Unique Characters are : " +unique);
		
	}

}
