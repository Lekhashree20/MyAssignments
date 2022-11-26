package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionsRemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		Set<String> duplicate = new LinkedHashSet<String>();
		
		for (int i = 0; i < split.length; i++) {
			
			duplicate.add(split[i]);
			
			
		}
		
		System.out.println(duplicate);
		
	}

}
