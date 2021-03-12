package assignments;
import java.util.Scanner;
import java.util.Random;

public class BubbleSortSizeN {
	
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
		
		System.out.println("Pre Bubble-Sort Array with Size: " + arraySize);
		for (int i = 0; i < randomArrayInt.length; i++) {
			System.out.print(randomArrayInt[i] + ", ");
		}
		bubbleSort(randomArrayInt);
		System.out.println("\nPost Bubble-Sort Array with Size: " + arraySize);
		for (int i = 0; i < randomArrayInt.length; i++) {
			System.out.print(randomArrayInt[i] + ", ");
		}
	}
	
	public static void bubbleSort(int[] randomArrayInt) {
		for (int i = 0; i < arraySize -1; i++)
		{
			for (int j = 0; j < arraySize-i-1; j++)
			{
				if (randomArrayInt[j] > randomArrayInt[j+1]) {
					int temp = randomArrayInt[j];
					randomArrayInt[j] = randomArrayInt[j+1];
					randomArrayInt[j+1] = temp;
				}
			}
		}
	}
	
}
