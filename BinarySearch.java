

public class BinarySearch {
	
	public static int bSearch(int[] arr,int target){
		
		//Start and end indexes that mark the current section of array being searched for.
		int start =0;
		int end = arr.length-1;
		int midpoint = arr.length/2;
		
		if(arr[0]>target||arr[end]<target){
			return -1;
		}
		
		//Loop to search through the array.
		while(start<=end){
			System.out.println("The index being examined :"+midpoint);
			
		if(target<=arr[midpoint]){
			
			if(target==arr[midpoint]){
				
				return midpoint;}
			else{
				
				end = midpoint-1;
				midpoint =midpoint/2;
				
							
			}
		}
		else {
			
			  start=midpoint+1;
			  midpoint=(start+end)/2;
			}
	
		}
		
		return -1;
	}
	public static void main(String[] args) {
	
	int[] arr= {3,4,5,7,9,11,13,16,17,25,26};
	System.out.println("The index of the value being searched for is : "+bSearch(arr,27));

	}

}
