package testarray;

public class FindingDuplicate2 {
	
	public static void findingduplicatemethod(Integer array1[],int n){
		
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if (array1[j]==array1[i])
				{
					System.out.println("We found a duplicate element in the index" + j + "and the value of the element is" + array1[i]);
				}
			}			
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer array1[] = {1,3,5,1,5,6,7,8,9,7,11,15,11,1};
		findingduplicatemethod(array1,array1.length);
		

	}

}
