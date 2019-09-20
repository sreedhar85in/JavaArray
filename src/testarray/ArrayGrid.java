package testarray;

public class ArrayGrid {

	public static void main(String[] args) {
 String design = "-";
 String space = " ";
 
 int array1[][] = new int [10][10];
 
 for(int i = 0; i < 10; i++) {
	 
	 for (int j = 0; j<10; j++) {
		 
		 System.out.printf("%2d ", array1[i][j]);
		 
	 }
	 
	 System.out.println();
 }
 

	}

}
