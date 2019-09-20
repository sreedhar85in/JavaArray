package testarray;

public class Arraysum {

	public static void main(String[] args) {
	
		int array1[] = {1,2,3,10,2,4};
		int sum = 0;
		for (int i:array1) {
			System.out.println(i);
			sum = sum + i;
		}
		
		System.out.println("The value of the final sum of the array is " + sum);
		
		//System.out.println("The value of the final sum of the array is " + sum);

	}

}
