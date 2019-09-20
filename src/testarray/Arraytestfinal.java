/**
 * 
 */
package testarray;

import java.util.Arrays;

/**
 * @author sreedhar
 *
 */
public class Arraytestfinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array1 = {1,40,5,2,6,3,10,25};
		java.util.Arrays.sort(array1);
		System.out.println("The values of the sorted array are" + array1 );
		for(int i:array1) {
			
			System.out.println("the value of the element is" + i);
								
		}
		
		String[] array2 = {"Sreedhar","Parth","John","Dileep","Abhilash","Chris", "Bodhi"};
       Arrays.sort(array2);
       System.out.println(Arrays.toString(array2));
		
	}

}
