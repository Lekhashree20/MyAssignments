package week1.assignments;

import java.util.Arrays;

public class SecondLargestArray {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		int size = data.length;
		
		int result = data[size-2];
		
		System.out.println("The Second largest element in the Array is "+result);
		
	}

}

