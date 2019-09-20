package testarray;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array1[] = {1,5,10,2};

double average = 0;

int sum  = 0 ; 

for (int i : array1) {
	
	sum = sum + i;
	
}

average = sum/array1.length;
System.out.println("The value of average is " + average);
	}

}
