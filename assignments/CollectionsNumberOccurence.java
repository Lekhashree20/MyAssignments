package week3.assignments;

import java.util.HashMap;
import java.util.Map;

public class CollectionsNumberOccurence {

	public static void main(String[] args) {

		
		int arr[] = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		
		Map<Integer,Integer> occ = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(occ.containsKey(arr[i])) {
				Integer value = occ.get(arr[i]);
				
				occ.put(arr[i], value+1);
				
			}
			else
			occ.put(arr[i], 1);
			
		}
		System.out.println(occ);
		
	}

}
