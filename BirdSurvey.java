// Kishan Mistry
package assignments;

public class BirdSurvey {
	
	private Bird head;
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public void prepend(String bird)
	{
		if (head == null)
		{
			head = new Bird(bird);
			return;
		}
		Bird newBird = new Bird(bird);
		newBird.setNextBird(head);
		head = newBird;
	}
	
	public void append(String bird)
	{
		if (head == null)
		{
			head = new Bird(bird);
			return;
		}
		Bird currBird = head;
		while(currBird.getNextBird() != null)
		{
			currBird = currBird.getNextBird();
		}
		currBird.setNextBird(new Bird(bird));
	}
	
	public Bird findByName(String bird)
	{
		Bird nextBird = head;
		if (isEmpty())
			System.out.println("The Bird List is Empty!");
		else
		{
			while (!(nextBird.getName().equalsIgnoreCase(bird)))
			{
				if (nextBird.getNextBird() == null)
					return null;
				else
					nextBird = nextBird.getNextBird();
			}
		}
		return nextBird;
	}

	public Bird findByCount(int count)
	{
		Bird nextBird = head;
		if (isEmpty())
			System.out.println("The Bird List is Empty!");
		else
		{
			while (nextBird.getBirdCount() != count)
			{
				if (nextBird.getNextBird() == null)
					return null;
				else
					nextBird = nextBird.getNextBird();
			}
		}
		return nextBird;
	}

	public Bird removeFirstBird()
	{
		Bird removedBird = head;
		if (isEmpty())
			System.out.println("The Bird List is Empty!");
		else
			head = head.getNextBird();
		return removedBird;
	}
	
	public Bird removeBird(String bird)
	{
		Bird currBird = head;
		Bird prevBird = head;
		if (currBird.getName() == bird)
		{
			head = currBird.getNextBird();
			return currBird;
		}
		while(!(currBird.getName().equalsIgnoreCase(bird)))
		{
			prevBird = currBird;
			currBird = currBird.getNextBird();
			if(currBird == null)
				return currBird;
		}
		prevBird.setNextBird(currBird.getNextBird());
		return currBird;
	}
	
	
	public void add(String bird)
	{
		Bird currBird = head;
		if (isEmpty())
		{
			head = new Bird(bird);
			return;
		}
		Bird prevBirdEntry = findByName(bird);
		if (prevBirdEntry != null)
			prevBirdEntry.addBirdCount();
		else
		{
			while(currBird.getNextBird() != null)
			{
				currBird = currBird.getNextBird();
			}
			currBird.setNextBird(new Bird(bird));
		}
	}
	
	public int getCount(String bird)
	{
		Bird avian = findByName(bird);
		if (avian == null)
			return 0;
		else
			return avian.getBirdCount();
	}
	
	public void getReport()
	{
		if (isEmpty())
		{
			System.out.println("Bird List is Empty!");
			return;
		}
		Bird currBird = head;
		while(currBird != null)
		{
			System.out.println(currBird.displayBird());
			currBird = currBird.getNextBird();
		}
	}
}
