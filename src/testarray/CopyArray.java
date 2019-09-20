package testarray;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {1,5,10,15,18,22,32};
		int array2[] = new int[array1.length];
		int x;
		for(int i=0,k=0;i<array1.length;i++) {
			
			array2[i] = array1[i];
			
			
		}
System.out.println("THe array1 is" + Arrays.toString(array1));
System.out.println("The array 2 is " + Arrays.toString(array2));
	}

}
