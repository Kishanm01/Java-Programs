// Kishan Mistry
package assignments;

public class Bird {
	private String name;
	private int birdCount;
	private Bird nextBird;
	
	public Bird(String name)
	{
		this.name = name;
		birdCount = 1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getBirdCount()
	{
		return birdCount;
	}
	
	public Bird getNextBird()
	{
		return nextBird;
	}
	
	public void setNextBird(Bird bird)
	{
		nextBird = bird;
	}
	
	public void setBirdCount(int count)
	{
		birdCount = count;
	}
	
	public void addBirdCount()
	{
		birdCount++;
	}
	
//	public void addNumBirdCount(int num)
//	{
//		for (int i = 0; i < num; i++)
//		{
//			addBirdCount();
//		}
//	}
	public String displayBird()
	{
		return "Bird Name: " + getName() + "\tBird Count: " + getBirdCount();
	}
	
	public String toString()
	{
		return getName();
	}
}
