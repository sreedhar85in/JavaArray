package testarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray2 {

	
	static void reverse(Integer array1[]) {
		
		/* Collections.reverse(Arrays.asList(array1));
		//System.out.println(Arrays.asList(array1).toString());
		
		//System.out.println(Arrays.toString(list.toArray()));
		
		System.out.println(Arrays.asList(array1));*/
		
        Collections.reverse(Arrays.asList(array1)); 
        System.out.println(Arrays.asList(array1)); 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array1 = {5,10,15,20,25,30,35,40,45,50};
		reverse(array1);

	}

}
