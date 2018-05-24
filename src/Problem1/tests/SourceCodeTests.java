package problem1.tests;

import java.util.Random;

import problem1.annotations.Test;
import problem1.source.KSmallestNumber;

public class SourceCodeTests {

	public static KSmallestNumber test = new KSmallestNumber();

	@Test
	public static boolean test1() {


		int[] myArray = {9,3,1,4,6,5,8,12,13,19,25,16,2,0};



		int [] lowestElements = test.usingMaxHeap(myArray,4);
		System.out.println("Testing using Max Heap");
		//System.out.println(lowestElements[0]);
		return lowestElements[0]==3 && lowestElements[1]==2 && lowestElements[2]==1 && lowestElements[3]==0;
	}
	@Test
	public static boolean test2() {


		int[] myArray = {9,3,1,4,6,5,8,12,13,19,25,16,2,0};

		int [] lowestElements = test.sortingApproach(myArray,4);
		lowestElements = test.sortingApproach(myArray, 1000);
		System.out.println("Testing using Sorting");

		return lowestElements[0]==0 && lowestElements[1]==1 && lowestElements[2]==2 && lowestElements[3]==3;
	}
	@Test	
	public static boolean test3() {


		int[] myArray = {9,3,1,4,6,5,8,12,13,19,25,16,2,0};

		int [] lowestElements = test.modifiedSelectionSort(myArray, 4);
		System.out.println("Testing using Modified Sorting");


		return lowestElements[0]==0 && lowestElements[1]==1 && lowestElements[2]==2 && lowestElements[3]==3;
	}
}
