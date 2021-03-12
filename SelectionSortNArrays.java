package assignments;
import java.util.*;
public class SelectionSortNArrays {

	private static int aSize;
	
	public static void main(String[] args) {
		
		selectionSortNSizeArray();
		selectionSort500SizeArray();
		selectionSort2500SizeArray();
		selectionSort5000SizeArray();
	}
	
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++)
		{
			int min = i;
			for (int j = i+1; j < array.length; j++)
			{
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
	
	public static void selectionSortNSizeArray() {
		Scanner scan = new Scanner(System.in);
		Random rndInt = new Random();
		System.out.print("Enter a number of items in the array to be sort:");
		aSize = scan.nextInt();
		long runningTime = 0;
		
		for (int i = 0; i < 1000; i++) {
			int[] array = new int[aSize];
			for (int j = 0; j < array.length; j++) {
				array[j] = rndInt.nextInt();
			}
			long startTime = System.currentTimeMillis();
			selectionSort(array);
			long processTime = System.currentTimeMillis() - startTime;
			runningTime += processTime;
		}
		System.out.println("selection Sort with the array size of " + aSize + " that iterates 1000 times:\n" +
							"Total item sorted: " + (aSize * 1000));
		System.out.println("Avg Running Time for each Array: " + (runningTime / 1000.0) + "ms");
	}
	
	public static void selectionSort500SizeArray() {
		aSize = 500;
		Random rndInt = new Random();
		long runningTime = 0;
		System.out.println();
		for (int i = 0; i < 1000; i++) {
			int[] array = new int[aSize];
			for (int j = 0; j < array.length; j++) {
				array[j] = rndInt.nextInt();
			}
			long startTime = System.currentTimeMillis();
			selectionSort(array);
			long processTime = System.currentTimeMillis() - startTime;
			runningTime += processTime;
		}
		System.out.println("selection Sort with the array size of " + aSize + " that iterates 1000 times:\n" +
							"Total item sorted: " + (aSize * 1000));
		System.out.println("Avg Running Time for each Array: " + (runningTime / 1000.0) + "ms");
	}
	
	public static void selectionSort2500SizeArray() {
		aSize = 2500;
		Random rndInt = new Random();
		long runningTime = 0;
		System.out.println();
		for (int i = 0; i < 1000; i++) {
			int[] array = new int[aSize];
			for (int j = 0; j < array.length; j++) {
				array[j] = rndInt.nextInt();
			}
			long startTime = System.currentTimeMillis();
			selectionSort(array);
			long processTime = System.currentTimeMillis() - startTime;
			runningTime += processTime;
		}
		System.out.println("selection Sort with the array size of " + aSize + " that iterates 1000 times:\n" +
							"Total item sorted: " + (aSize * 1000));
		System.out.println("Avg Running Time for each Array: " + (runningTime / 1000.0) + "ms");
	}

	public static void selectionSort5000SizeArray() {
		aSize = 5000;
		Random rndInt = new Random();
		long runningTime = 0;
		System.out.println();
		for (int i = 0; i < 1000; i++) {
			int[] array = new int[aSize];
			for (int j = 0; j < array.length; j++) {
				array[j] = rndInt.nextInt();
			}
			long startTime = System.currentTimeMillis();
			selectionSort(array);
			long processTime = System.currentTimeMillis() - startTime;
			runningTime += processTime;
		}
		System.out.println("selection Sort with the array size of " + aSize + " that iterates 1000 times:\n" +
							"Total item sorted: " + (aSize * 1000));
		System.out.println("Avg Running Time for each Array: " + (runningTime / 1000.0) + "ms");
	}


}
