package testarray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElementStream {
	
	
	public static int[] removeElement(int array1[], int index) {
		
		return IntStream.range(0, array1.length)
				.filter(i -> i!=index)
				.map(i -> array1[i])
				.toArray();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array1[] = {5,10,15,20,25,30};
		int index = 2;
		int array3[] = removeElement(array1, index);
		System.out.println(" THe original array elements are" +" " + Arrays.toString(array1) );
		System.out.println(" THe  array elements after removing an element are" +" " + Arrays.toString(array3));
		IntStream stream = IntStream.range(6, 10);
		
		stream.forEach(System.out::println);
		
	}

}
