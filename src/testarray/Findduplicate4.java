package testarray;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Findduplicate4 {
	
	
	public static void findduplicatevalues(Integer array1[]) {
		
		Map<Integer,Integer> valueandcount = new HashMap<>();
		for(int n: array1) {
			
		Integer countval = valueandcount.get(n);
		
		if(countval==null) {
			
			valueandcount.put(n, 1);
		}
		
		else {
			valueandcount.put(n, ++countval);
		}
		
		
	}
		
		Set<Entry<Integer,Integer>> entrySet = valueandcount.entrySet(); 
		
		for(Entry<Integer, Integer> entry : entrySet) {
			
			if(entry.getValue() > 1) {
				System.out.println("Duplicate element from array " + entry.getKey());
			}
			
		}
		
	}

	public static void main(String[] args) {


		Integer array1[] = {1,3,5,7,9,1,3,1,5,9,11,13,15,17,19,13,19,21,23,25,23};
		findduplicatevalues(array1);
	}

}
