package week1.assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		
		int[] a = {1,2,3,4,7,6,8};
		
		Arrays.sort(a);
		
		int sum1 = 0;
		
		for (int i =0; i<a.length;i++)
		{
			
			sum1 = sum1 + a[i];
			
		}
		
		int sum2 = 0;
		
		for (int i = 1;i<=8; i++)
			
		{
			
			sum2 = sum2 + i;
			
		}
		
		System.out.println("Missing number in the Array is : " +(sum2 - sum1));
	}

}
