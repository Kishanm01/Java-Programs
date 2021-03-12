package assignments;
// Kishan Mistry

public class PiecemealVacation extends Vacation
{
	private String[] listExpense;
	private double[] listCost;

	public PiecemealVacation (String destination, double budget, String[] listExpense, double[] listCost)
	{
		super(destination, budget);
		this.listExpense = listExpense;
		this.listCost = listCost;
		super.setCost(getTotalCost(listCost));
	}

	private double getTotalCost(double[] listCost)
	{
		double totalCost = 0;
		for (double cost : listCost)
			totalCost += cost;
		return totalCost;
	}

	private String printList(String[] listExpense, double[] listCost)
	{
		String total = "";
		for (int i = 0; i < listExpense.length; i++)
			total = total + "\t" + listExpense[i] + ":\t" + listCost[i] + "\n";
		return total;
	}

	@Override
	public double keptToBudget() {
		return super.getBudget() - getTotalCost(listCost);
	}

	@Override
	public String toString()
	{
		return "Vacation: Piecemeal Vacation\n" +
				super.toString() +
				"\nList of Expenses:\n" + printList(listExpense, listCost) +
				"Kept To Budget: " + keptToBudget() +
				"\n";
	}
}
