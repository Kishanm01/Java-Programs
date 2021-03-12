// Kishan Mistry
package assignments;

import java.util.Scanner;

public class SurveyData {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BirdSurvey birdList = new BirdSurvey();
		System.out.println("The initial List is Empty!: " + birdList.isEmpty());
		
		String addBird = "";
		System.out.println("Enter the name of Bird species:");
		addBird = scan.next();
		while(!(addBird.equalsIgnoreCase("done")))
		{
			birdList.add(addBird); 
			System.out.println("Enter the name of Bird species or done to finish.");
			addBird = scan.next();
		}
		scan.close();
		System.out.println();

		// Enter the Bird count number to find the bird in Survey Data
		int findCount = 2; 
		Bird foundBird = birdList.findByCount(findCount);
		if(foundBird == null)
			System.out.println("There is no Bird Species of the count: " + findCount);
		else
			System.out.println("Bird Species found of the count: " + findCount + " -- " + foundBird.displayBird());
		
		// Demonstrates use of append and prepend method.
		String findName = "Use of append method";
		birdList.append(findName);
		birdList.prepend("Use of prepend method");
		
		Bird foundName = birdList.findByName(findName);
		if(foundName == null)
			System.out.println("There is no Bird Species of the name: " + findName);
		else
			System.out.println("Bird Species found of the name: " + findName + " -- " + foundName.getName());
		
		System.out.println("Removed the first Bird from survey: " + birdList.removeFirstBird());
		
		Bird removeBird = birdList.removeBird(findName);
		if(removeBird == null)
			System.out.println("There is no such a Bird Species in Bird name: " + findName);
		else
			System.out.println("Bird Species removed: " + removeBird.getName());
		// End of demonstration of append, prepend and remove a bird and first bird in the list.
		
		// Demonstration of getting bird count from name of the bird.
		String birdName = "Parrot";
		System.out.println("The Bird count of bird species: " + birdName + " -- " + birdList.getCount(birdName));
		
		System.out.println("\nBird Report Based On Survey\n");
		birdList.getReport();		
	}

}
