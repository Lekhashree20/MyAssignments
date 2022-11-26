package week3.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMissingNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		
		int sum ;

		Set<Integer> missNum = new TreeSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			missNum.add(arr[i]);

		}

		System.out.println(missNum);

		List<Integer> list = new ArrayList<Integer>(missNum);

		for (int i = 0; i < list.size()-1; i++) {

			int num = list.get(i);

			sum=num+1;

			if (sum != list.get(i+1)) {

				System.out.println("Missing number is :" + sum);

			}

		}

	}

}
