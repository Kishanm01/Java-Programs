package assignments;
// Kishan Mistry

public abstract class Vacation
{
	private String destination;
	private double cost;
	private double budget;

	public Vacation (String destination, double budget)
	{
		this.destination = destination;
		this.budget = budget;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public double getBudget()
	{
		return budget;
	}

	public abstract double keptToBudget();

	@Override
	public String toString()
	{
		return "Vacation Destination: " + destination +
				"\nBudget: " + budget +
				"\nTotal Cost: " + cost;
	}
}
