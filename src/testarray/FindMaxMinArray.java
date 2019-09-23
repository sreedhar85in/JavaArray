package testarray;

public class FindMaxMinArray {
	
	public static int findmin(int array1[], int n) {
		
		
		int firstNumberofTheArray = array1[0];
		
		for(int i=1;i<n;i++) {
			
			firstNumberofTheArray = Math.min(firstNumberofTheArray, array1[i]);
		}
		
		return firstNumberofTheArray;
	}
	
	
	public static int findmax(int array1[], int n) {
		
		int firstnumberofthearray = array1[0];
		
		for (int i=1;i<n;i++) {
			
			firstnumberofthearray = Math.max(firstnumberofthearray, array1[i]);
			
		}
		
		
		return firstnumberofthearray;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[] = {5,6,10,3,15,20,25,77,33,35,55};
		
		int n = array1.length;
		
		int minumumNumber = findmin(array1,n);
		
		System.out.println("THe minumum number of the array is " + minumumNumber);
		
		int maximumnumber = findmax(array1,n);
			
		System.out.println("THe maximum number of the array is " + maximumnumber);
			}
			
		
	}

