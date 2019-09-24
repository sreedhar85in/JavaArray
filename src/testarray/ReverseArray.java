package testarray;

import java.util.Arrays;

public class ReverseArray {
	
	public static int[] reversearray(int array1[], int n) {
		
		int array2[] = new int[n];
		
		for (int i=0,k=1;i<n;i++) {
			
			array2[i]=array1[n-k];
			k++;
			
		
		}
		
		
		return array2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {5,10,15,20,25,30,40,50};
		
		int n = array1.length;
		System.out.println(Arrays.toString(array1));
	int array3[] =	reversearray(array1, n);
		System.out.println(Arrays.toString(array3));
		

	}

}
