// Kishan Mistry
package assignments;

public class Module4AB {
	
	private static String printStr (String str)
	{
		if (str.length() == 0)
			return "";
		return str.charAt(0) + printStr(str.substring(1));
	}

	private static String printRevStr (String str)
	{
		if (str.length() == 0)
			return "";
		return printRevStr(str.substring(1)) + str.substring(0, 1);
	}

	private static int sumOfSums(int[] intArray, int count)
	{
		int sum = 0;
		if (intArray.length == count)
			return 0;
		for (int i = count; i < intArray.length; i++)
		{
			sum += intArray[i];
		}
		return sum + sumOfSums(intArray, count+1);
	}

	public static void main (String[] args)
	{
		// Problem #1
		String str = "Hello World!";
		System.out.println(printStr(str));
		System.out.println(printRevStr(str));
		
		// Problem #2
		int arrayL = (int) (Math.random() * 11); // Array size of random number from 0 to 10.
		int[] intArray = new int[arrayL];
		System.out.println("Array content:");
		for (int i = 0; i < intArray.length; i++)
		{
			intArray[i] = (int) (Math.random() * 201 - 100); // Array content of random number from -100 to 100;
			
			System.out.print(intArray[i] + "\t");
		}
		System.out.println();
		if (intArray.length == 0)
			System.out.println("The array is empty!\nSum of sums of the array is: " + sumOfSums(intArray, 0));
		else
			System.out.println("Sum of sums of the array is: " + sumOfSums(intArray, 0));
	}

}
