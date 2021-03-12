package assignments;
// Kishan Mistry

public class TestVacation
{
	public static void main (String[] args)
	{
		All_InclusiveVacation vacation1 = new All_InclusiveVacation("New York", 1500, "Delta Travel", 1000, 4);
		All_InclusiveVacation vacation2 = new All_InclusiveVacation("California", 500, "United Travel", 900, 1);
		String[] expenses3 = { "Hotel", "Meal", "Airfare"};
		double[] cost3 = { 500, 250, 1000};
		PiecemealVacation vacation3 = new PiecemealVacation("London", 3000, expenses3, cost3);
		String[] expenses4 = { "Hotel", "Meal", "Airfare", "Attractions"};
		double[] cost4 = { 800, 100, 1250, 2000};
		PiecemealVacation vacation4 = new PiecemealVacation("Paris", 3000, expenses4, cost4);
		Vacation vacation5 = new All_InclusiveVacation("Atlanta", 1500, "City Tour", 500, 5);
		String[] expenses6 = { "Hotel", "Meal", "Airfare", "Attractions", "Shopping"};
		double[] cost6 = { 500, 200, 1300, 1000, 2000};
		Vacation vacation6 = new PiecemealVacation("Paris", 7000, expenses6, cost6);

		System.out.println(vacation1);
		System.out.println(vacation2);
		System.out.println(vacation3);
		System.out.println(vacation4);
		System.out.println(vacation5);
		System.out.println(vacation6);
	}
}
