package testarray;

import java.util.Arrays;

public class RemoveElement2 {
	
	public static int[] removeelement(int array1[], int value) {
		
		int array2[] = new int[array1.length-1];
		int k=0;
		for(int i: array1) {
			
			if (i==value) {

				continue;
			}
			
			
			array2[k] = i;
			k++;
		}
		
		return array2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {5,10,15,20};
		int array3[] = removeelement(array1,20);
		System.out.println(" THe original array elements are" +" " + Arrays.toString(array1) );
		System.out.println(" THe  array elements after removing an element are" +" " + Arrays.toString(array3));
		
		
	}

}
