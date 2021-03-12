// Kishan Mistry
package assignments;

import java.util.Arrays;
import java.util.Random;

public class ParallelArraySort {
	
	public static void main(String[] args) {
		Random rand = new Random();
		final int ARRAY_SIZE = 10000;
		
		int[] bubbleSort = new int[ARRAY_SIZE];
		int[] parallelSort = new int[ARRAY_SIZE];
		
		for(int i = 0; i < ARRAY_SIZE; i++) {
			int nextInt = rand.nextInt();
			bubbleSort[i] = nextInt;
			parallelSort[i] = nextInt;
		}
		
		long strtTime = System.currentTimeMillis();
		bubbleSort(bubbleSort);
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken to sort the array by Bubble Sort is " + (endTime - strtTime) + "ms");
		strtTime = System.currentTimeMillis();
		Arrays.parallelSort(parallelSort);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken to sort the array by Parallelism is " + (endTime - strtTime) + "ms");
	}
	
	public static void bubbleSort(int[] sortArray)
	{
		for(int i = 0; i < sortArray.length - 1; i++) {
			for(int j = 0; j < sortArray.length - i - 1; j++) {
				if(sortArray[j] > sortArray[j + 1]) {
					int temp = sortArray[j];
					sortArray[j] = sortArray[j + 1];
					sortArray[j + 1] = temp;
				}
			}
		}
	}
}
