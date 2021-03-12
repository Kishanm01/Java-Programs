package assignments;
/**
 * @author Kishan Mistry
 *
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class UserTest {
	static Test[] students;
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");
		students = new Test[2];
		for (int i = 0; i < students.length; i++)
		{
			System.out.print("Please enter student " + (i+1) + " first and last name (separated by space): ");
			String firstName = scan.next();
			String lastName = scan.next();
			System.out.print("Please enter student's 5 test scores (separated by space): ");
			double[] testScore = new double[5];
			for (int j = 0; j < testScore.length; j++)
				testScore[j] = scan.nextDouble();
			students[i] = new Test(firstName, lastName, testScore);
		}
		printData();
		String modifyAgain;
		System.out.print("\nWhould you like to modify test scores?(yes or no): ");
		modifyAgain = scan.next();
		while (modifyAgain.equalsIgnoreCase("yes"))
		{
			modify();
			printData();
			System.out.print("Whould you like to modify test scores?(yes or no): ");
			modifyAgain = scan.next();
		}
		System.out.println("\n==============================================" +
				"===============================================");
		printData();
		double totalAvg = 0;
		for (Test elements : students)
			totalAvg += elements.calcAvgGrd();
		System.out.println("\nClass Average: " + fmt.format(totalAvg/students.length));
		System.out.println("\n==============================================" +
				"===============================================");
		scan.close();
	}
	public static void modify()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first name of the student that needs to change test score: ");
		String stuFirst = scan.nextLine();
		System.out.print("Enter the test number(1 to 5) and the test score: ");
		int stuTestNum = (scan.nextInt() - 1);
		double stuTestScore = scan.nextDouble();
		modifyTestScr(stuFirst, stuTestNum, stuTestScore);
		scan.close();
	}
	public static void modifyTestScr(String firstName, int testNum, double testScore)
	{
		for (int i = 0; i < students.length; i++)
			if ((students[i].getFirstName()).equals(firstName))
				students[i].modTestScr( testNum, testScore);
	}
	public static void printData()
	{
		System.out.println("\nFirst Name\tLast Name\tTest1\tTest2\tTest3\tTest4\tTest5\tAverage \tGrade");
		for (Test elements : students)
			System.out.println(elements);
	}

}
