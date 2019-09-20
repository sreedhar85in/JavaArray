package testarray;

import java.util.Arrays;

public class CopyArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,10,15,20,25,30,38};
		int b[] = new int[a.length];
		
		System.arraycopy(a, 0, b, 0, 7);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
