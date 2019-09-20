package testarray;

import java.util.Arrays;

public class CopyArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[] = {1,5,10,15,20,40,20,50};
		int array2[] = array1.clone();
		array2[0]++;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
