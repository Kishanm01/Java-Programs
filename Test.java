package assignments;
/**
 * @author Kishan Mistry
 *
 */
import java.text.DecimalFormat;
public class Test 
{
	private String firstName;
	private String lastName;
	private double[] testScores;
	private double avgGrd;
	private String letterGrd;

	public Test(String newFirstName, String newLastName, double[] newTestScore)
	{
		firstName = newFirstName;
		lastName = newLastName;
		testScores = newTestScore;
		avgGrd = calcAvgGrd();
		letterGrd = calcLtrGrd();
	}

	public double calcAvgGrd()
	{
		double sum = 0;
		for (double element : testScores)
			sum += element;
		return avgGrd = sum/5;
	}

	public String calcLtrGrd()
	{
		if (avgGrd > 89.49)
			return letterGrd = "A";
		else if (avgGrd > 79.49)
			return letterGrd = "B";
		else if (avgGrd > 69.49)
			return letterGrd = "C";
		else if (avgGrd > 59.49)
			return letterGrd = "D";
		else
			return letterGrd = "F";
	}

	public String getFirstName()
	{
		return firstName;
	}
	public void modTestScr(int testNum, double score)
	{
		testScores[testNum] = score;
		calcAvgGrd();
		calcLtrGrd();
	}

	/*
	 * public void stdntData()
	 * {
	 * 		DecimalFormat fmt = new DecimalFormat("0.00");
	 *		System.out.print(firstName + "\t" + lastName + "\t");
	 *		for (double element : testScores)
	 *		{
	 *			System.out.print(fmt.format(element) + "\t");
	 *		}
	 *		System.out.print(fmt.format(avgGrd) + "\t" + letterGrd + "\n");
	 * }
	 */
	@Override
	public String toString()
	{
		DecimalFormat fmt = new DecimalFormat("0.00");
		System.out.print(firstName + "\t\t" + lastName + "\t\t");
		for (double element : testScores)
			System.out.print(fmt.format(element) + "\t");
		return (fmt.format(avgGrd) + "\t\t" + letterGrd);
	}

}
