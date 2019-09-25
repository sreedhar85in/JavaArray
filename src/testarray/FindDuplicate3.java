package testarray;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate3 {

	
	public static void findingduplicatemethods(int array1[]) {
		Set<Integer> s = new HashSet<Integer>();
		for(int n: array1) {
			
			
			
			
			if(s.add(n) == false) {
				
				System.out.println("this value of"+ n + "is a duplicate value");
			
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array1[]= {1,2,3,1,5,1,7,9,11,13,15,17,15,19,15,5,7,9,13,2};
		findingduplicatemethods(array1);
	}

}
