package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		Set<Integer> secLargest = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {

			secLargest.add(data[i]);

		}

		System.out.println(secLargest);

		List<Integer> list = new ArrayList<Integer>();

		//list .add all(set)-->Adds the set value to list
		list.addAll(secLargest);

		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("Second Largest number is " +list.get(1));

	}

}
