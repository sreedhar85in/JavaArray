package testarray;

import java.util.Arrays;

public class InsertElement {
	
	public static int[] InsertanElement(int array1[],int insertvaue,int index) {
		
		int array3[] = new int[array1.length+1];
		boolean entry1time = false;
		
		for (int i=0,k=0;i<(array1.length+1);i++) {
			
		
			
			if(i==index && !entry1time) {
				
				array3[i]=insertvaue;
				 entry1time = true;
				 i--;
				 k++;
				continue;
			}
			
			if(i==7) {
				
				continue;
			}
			array3[k++]=array1[i];
			
	
		
		}
		return array3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[] = {5,10,20,25,20,35,40};
		int insertvalue = 15;
		int index = 2;
		System.out.println("THe value of the array1 is " + Arrays.toString(array1));
		int array2[] = InsertanElement(array1,insertvalue,index);
		System.out.println("The value of the array2 is " + Arrays.toString(array2));
	}

}
