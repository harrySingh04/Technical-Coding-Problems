package Problem1.source;



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
				if(myArray[j]<myArray[temp]) {
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
		
		int[] heapArray = buildMaxHeap(Arrays.copyOfRange(myArray, 0, k));   //Complexity for build max heap is O(k) where  k = number of elements in heap array
		int heapSize;
		heapSize = heapArray.length;

		//Going for n-k iterations
		for(int i=heapSize;i<myArray.length;i++) {
			if(heapArray[0]>myArray[i]) {
				heapArray[0] = myArray[i];
				maxHeapify(heapArray,0);// log(k)
				
			}
			
		}
		
		// Total complexity  = O(k+(n-k)logk) with the heap size of k
		return heapArray;
	}
	
	private int[] buildMaxHeap(int[] heapArray) {
		
		for(int i=heapArray.length/2-1;i>=0;i--) {
			maxHeapify(heapArray,i);  
		}
		
		return heapArray;
		
	}
	
	private void maxHeapify(int[] heapArray,int i) {
		
		int left=-1,right=-1,largest=i, swap;
		
		
	
		if(2*i+1<heapArray.length) {
			left = 2*i+1;
			if(2*i+2<heapArray.length) {
				right = 2*i+2;
			}
			
		}
		
		if(left!=-1) {
			if(heapArray[left]>heapArray[i]) {
				largest = left;
			}
		}
		if(right!=-1) {
			if(heapArray[right]>heapArray[largest]) {
				largest = right;
			}
		}
		
		if(largest!=i) {
			swap = heapArray[i];
			heapArray[i] = heapArray[largest];
			heapArray[largest] = swap;
			maxHeapify(heapArray,largest);
		}

		
	}
	
	
	}
