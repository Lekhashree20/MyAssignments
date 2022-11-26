package week3.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MostDuplicateCharacter {

	public static void main(String[] args) {

		String str = "Lekhashree";

		char[] charArray = str.toCharArray();

		Map<Character, Integer> dup = new HashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {

			if (dup.containsKey(charArray[i])) {
				Integer value = dup.get(charArray[i]);

				dup.put(charArray[i], value + 1);
			} else
				dup.put(charArray[i], 1);

		}

		//System.out.println(dup);
		
Entry<Character, Integer> maxDuplicateEntrySet = null;
		
		for (Entry<Character, Integer> currentEntry : dup.entrySet()) {
			
			if (maxDuplicateEntrySet == null || currentEntry.getValue() > maxDuplicateEntrySet.getValue()) {
				maxDuplicateEntrySet = currentEntry;
			}
		}
				
		System.out.println(maxDuplicateEntrySet.getKey() + ":" + maxDuplicateEntrySet.getValue());
	}

}