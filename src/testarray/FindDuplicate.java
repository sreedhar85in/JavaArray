package testarray;

public class FindDuplicate {
	
	public static int[] Findingduplicate(int array1[], int n) {
		
		int array2[] = new int[n];
		
		for(int i=0,k=0;i<n;i++) {
			
			
			int tempelementstorer = array1[0];
			if (i==0) {
				continue;
				}
			if (tempelementstorer==array1[i]) {
				
				array2[k++] = array1[i];
			}
			
		}
		for(int k : array1) {
		}
		
		return array1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {3,3,5,3,7,9,11,13,11,15,17};
		Findingduplicate(array1, array1.length);

	}

}
