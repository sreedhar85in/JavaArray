package testarray;

public class FindingIndex {
	
	public static int findindex(int array[], int t) {
		
		int len = array.length;
		int i = 0;
		for(int u : array) {
			
			if (u==t) {
				
				return i;
			}
			
			else {
				
				i= i+1;
			}
		}
		
		return i;
	}

	public static void main(String[] args) {
		int array1[] = {1,2,3,4,8,10};
		int index = findindex(array1,2);
		System.out.println("The index is " + index);

	}

}
