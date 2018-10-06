
public class QuickSort {

	public static void main(String[] args) {
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		
		quickSort(intArray,0,intArray.length);
		print(intArray);

	}

	public static void quickSort(int[] intArray, int start, int end) {
		
		//check if end - start is less than 2 then one element array 
		//doesnt need sorted
		
		if(end-start < 2)
			return;
		int pivotIndex = partition(intArray, start,end);
		quickSort(intArray, start, pivotIndex); //left side of pivot everything smaller than pivot
		quickSort(intArray,pivotIndex+1, end); //right side of pivot everything larger than pivot
			
	}
	
	public static int partition(int[] intArray, int start, int end) {
		//this is using the first index as pivot
		int pivot = intArray[start];
		int i = start; //traverse left to right
		int j= end; //traverses right to left
		
		
		while(i < j) {
			
			//NOTE: empty loop
			while(i <j && intArray[--j] >= pivot);
			if(i <j) {
			   intArray[i] = intArray[j]; //found first element less than pivot. move it to the left(position i)
			}
			// alternate to other side 
			//NOTE: empty loop just used to compare indexes
			while(i < j && intArray[++i] <= pivot) ;
			if( i < j) {
				intArray[j] = intArray[i]; // what was input j has already been moved previous iteration.
			}
		}
		intArray[j] = pivot;
		return j;	
	}
	public static void print(int[] intArray) {
		for(int i = 0; i < intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
}
