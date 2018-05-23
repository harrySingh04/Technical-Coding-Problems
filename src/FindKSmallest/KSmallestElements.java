package FindKSmallest;


import java.util.Arrays;

public class KSmallestElements {
	
	
	public int[] sortingApproach(int[] myArray,int k) {
		
		Arrays.sort(myArray);// O(nlogn)
	
		return Arrays.copyOfRange(myArray, 0, k); //O(n)

		//Overall complexity will be O(nlogn)
		
		}
	
	public int[] modifiedSelectionSort(int[] myArray,int k) {
		
		return null;
	}
	
	public int[] usingMaxHeap(int[] myArray,int k) {
		return null;
	}
	}
