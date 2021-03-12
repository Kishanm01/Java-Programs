package assignments;
import java.util.*;
public class BubbleSortNArrays {
	
	private static int aSize;
	
	public static void main(String[] args) {
		
		bubbleSortNSizeArray();
		bubbleSort500SizeArray();
		bubbleSort2500SizeArray();
		bubbleSort5000SizeArray();
	}
	
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length -1; i++)
		{
			for (int j = 0; j < array.length-i-1; j++)
			{
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSortNSizeArray() {
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
			bubbleSort(array);
			long processTime = System.currentTimeMillis() - startTime;
			runningTime += processTime;
		}
		System.out.println("Bubble Sort with the array size of " + aSize + " that iterates 1000 times:\n" +
							"Total item sorted: " + (aSize * 1000));
		System.out.println("Avg Running Time for each Array: " + (runningTime / 1000.0) + "ms");
	}
	
	public static void bubbleSort500SizeArray() {
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
			bubbleSort(array);
			long processTime = System.currentTimeMillis() - startTime;
			runningTime += processTime;
		}
		System.out.println("Bubble Sort with the array size of " + aSize + " that iterates 1000 times:\n" +
							"Total item sorted: " + (aSize * 1000));
		System.out.println("Avg Running Time for each Array: " + (runningTime / 1000.0) + "ms");
	}
	
	public static void bubbleSort2500SizeArray() {
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
			bubbleSort(array);
			long processTime = System.currentTimeMillis() - startTime;
			runningTime += processTime;
		}
		System.out.println("Bubble Sort with the array size of " + aSize + " that iterates 1000 times:\n" +
							"Total item sorted: " + (aSize * 1000));
		System.out.println("Avg Running Time for each Array: " + (runningTime / 1000.0) + "ms");
	}

	public static void bubbleSort5000SizeArray() {
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
			bubbleSort(array);
			long processTime = System.currentTimeMillis() - startTime;
			runningTime += processTime;
		}
		System.out.println("Bubble Sort with the array size of " + aSize + " that iterates 1000 times:\n" +
							"Total item sorted: " + (aSize * 1000));
		System.out.println("Avg Running Time for each Array: " + (runningTime / 1000.0) + "ms");
	}


}
