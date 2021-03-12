package assignments;
import java.util.Scanner;
import java.util.Random;

public class SelectionSortSizeN {
	private static int arraySize;
	private static int[] randomArrayInt;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random randNum = new Random();
		System.out.print("Enter a number for the array size: ");
		arraySize = scan.nextInt();
		randomArrayInt = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			randomArrayInt[i] = randNum.nextInt();
		}
		
		System.out.println("Pre Selection-Sort Array with Size: " + arraySize);
		for (int i = 0; i < randomArrayInt.length; i++) {
			System.out.print(randomArrayInt[i] + ", ");
		}
		selectionSort(randomArrayInt);
		System.out.println("\nPost Selection-Sort Array with Size: " + arraySize);
		for (int i = 0; i < randomArrayInt.length; i++) {
			System.out.print(randomArrayInt[i] + ", ");
		}
	}
	
	public static void selectionSort(int[] array) {
		for (int i = 0; i < arraySize -1; i++)
		{
			int min = i;
			for (int j = i+1; j < arraySize; j++)
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
}
