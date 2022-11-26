package week3.assignments;

import java.util.HashSet;
import java.util.Set;

public class CollectionsRemoveDuplicatesWords {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		Set<String> duplicate = new HashSet<String>();
		
		for (int i = 0; i < split.length; i++) {
			
			duplicate.add(split[i]);
			
			
		}
		
		System.out.println("Unique words are :" +duplicate);
		
	}

}
