package testarray;

import java.util.Arrays;

public class CopyArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {1,5,10,20,30,40,50};
		int array2[] = new int[array1.length];
		int k =0;
		
		for(int i: array1) {
			
			array2[k] = i;
			k++;
			
		}
System.out.println("THe value of the array1 is" + Arrays.toString(array1));
System.out.println("THe value of the array2 is" + Arrays.toString(array2));
	}

}
