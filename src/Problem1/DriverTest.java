package Problem1;

import java.util.Random;

public class DriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KSmallestNumber test = new KSmallestNumber();
		Random randNumGenerator = new Random();
        int[] myArray = new int[10000];
        for (int i=0; i<myArray.length; i++)
        {
        	myArray[i] = (randNumGenerator.nextInt(100)+1);
        	//System.out.println(myArray[i]);
         }
		
		
		int [] lowestElements = test.usingMaxHeap(myArray,1000);
		System.out.println("Testing using Max Heap\n");
		for(int i=0;i<lowestElements.length;i++) {
			System.out.print(lowestElements[i] +"  ");
		}
		
		lowestElements = test.sortingApproach(myArray, 1000);
		System.out.println("\n\nTesting using Sorting");
		for(int i=0;i<lowestElements.length;i++) {
			System.out.print(lowestElements[i] +"  ");
		}
		
		lowestElements = test.modifiedSelectionSort(myArray, 1000);
		System.out.println("\n\nTesting using Modified Selection Sort");
		for(int i=0;i<lowestElements.length;i++) {
			System.out.print(lowestElements[i] +"  ");
		}

	}

}
