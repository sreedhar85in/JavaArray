package testarray;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array2[] = {1,5,10,25};
		int search= 11;
		boolean output = false;
		
		for(int i: array2) {
		
			if(i==search) {
				output = true;
			}
			
		}

		if (output) {System.out.println("I am able to find the value of searching the specific value in the array");}
		
		else {
			
			System.out.println("I am not able to find the value of the search integer in this array");
		}
	}

}
