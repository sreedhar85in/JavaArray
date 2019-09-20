package testarray;

import java.util.Arrays;

public class RemoveElement {
	
	public static int[] removeElement(int array2[], int t) {
	
		int array1length = array2.length;
		//int array2[] = new int [array.length-1];
		int array4[] = new int[array1length-1];
		for(int i=0,k=0;i<array1length;i++) {
			
			
			if (i == t) {
				
				continue;
			}
			
			array4[k++] = array2[i]; 
			
			
		}
		
		return array4;
		
	}

	public static void main(String[] args) {
		 int array2[] = {10,12,13,16,18,19};
		 System.out.println("Array value before removal of an element is " + " " + Arrays.toString(array2));
		 
	int array3[]=	removeElement(array2,3);
		System.out.println("Array value after removal of an element is " + " " + Arrays.toString(array3));
		 
	}

}
