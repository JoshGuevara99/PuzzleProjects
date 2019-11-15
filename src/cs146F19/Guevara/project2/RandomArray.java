package cs146F19.Guevara.project2;

import java.util.Random;

public class RandomArray
{
	
	private int size;
	
	public RandomArray(int n)
	{
		size = n;
	}
	
	public int[] getRandom()
	{
		Random random = new Random();
		
		int[] randomArray = new int[size];
		
		for(int i = 0; i<size; i++)
		{
			randomArray[i] = random.nextInt(50+50)-50;
		}
	
		return randomArray;
	}

	
}
