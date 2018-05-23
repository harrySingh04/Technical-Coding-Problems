package Problem1;



import java.util.Arrays;

public class KSmallestNumber {
	
	
	public int[] sortingApproach(int[] myArray,int k) {
		
		Arrays.sort(myArray);// O(nlogn)
	
		return Arrays.copyOfRange(myArray, 0, k); //O(n)

		//Overall complexity will be O(nlogn)
		
		}
	
	public int[] modifiedSelectionSort(int[] myArray,int k) {
		
		int temp,swap;
		
		//Complexity is O(kn), worst case is O(n^2) when k==n
		for(int i=0;i<k;i++) {
			temp = i;
			for(int j=i+1;j<myArray.length;j++) {
				if(myArray[j]<temp) {
					temp = j;
				}
			}
			
			if(temp!=i) {
				swap = myArray[temp];
				myArray[temp] = myArray[i];
				myArray[i] = swap;
			}
		}
		return Arrays.copyOfRange(myArray, 0, k);   //O(n)
	}
	
	public int[] usingMaxHeap(int[] myArray,int k) {
		return null;
	}
	}
