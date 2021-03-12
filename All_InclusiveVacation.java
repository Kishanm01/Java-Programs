package assignments;
// Kishan Mistry

public class All_InclusiveVacation extends Vacation
{
	private String brand;
	private int rating;
	private double totalCost;

	public All_InclusiveVacation(String destination, double budget, String brand, double cost, int rating)
	{
		super(destination, budget);
		this.brand = brand;
		this.rating = rating;
		totalCost = cost;
		super.setCost(totalCost);
	}

	@Override
	public double keptToBudget()
	{
		return super.getBudget() - totalCost;
	}

	@Override
	public String toString()
	{
		return "Vacation: All-Inclusive\n" +
				super.toString() +
				"\nBrand: " + brand +
				"\nRating: " + rating +
				"\nKept To Budget: " + keptToBudget() + "\n";
	}

}
