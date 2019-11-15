package cs146F19.Guevara.project2;

import java.util.Random;

public class bruteForceSubarray {
	private static int sum = 0;//the current sum between two indexes
	private static int[] theArray; //the inputArray from which the max subarray will be found
	private static int start;//starting index of the current subarray
	private static int finish;//finishing index of the current subarray
	private static int actualStart;//the starting index of the max subarray
	private static int actualFinish;// the finishing index of the max subarray 
	private static int theMax = 0;//the sum of the maximum subarray
	
	
	//Constructor that takes in the array to be analyzed
	public bruteForceSubarray(int[] n)
	{
		theArray = n;
	}
	
	//Has an outer loop that iterates through the array, and a secondary inner loop which finds the max subarray sum using the addBetween Method
	public static int findMax()
	{
		for(start = 0; start < theArray.length; start++)
		{
			for(finish = start; finish < theArray.length; finish++)
			{
				//if the sum between and including the start and finish indexes is bigger than the max, then that sum is the max
				if(addBetween(theArray,start,finish) > theMax)
				{
					theMax = addBetween(theArray,start,finish);
					actualStart = start;
					actualFinish = finish;
				}
			}
		}
		
		if(theMax == 0)
		{
			start = 0;
			finish = 0;
			
		}
		
		return  theMax;
	}
		
	
	//iterates from the starting value,and finds the max subarray sum 
	public static int addBetween(int[] n, int i, int j)
	{ 	
		int sum = 0;
		if(i == j)
		{
			sum = n[i];
			if(sum > theMax)
			{
				theMax = sum;
				actualStart = i;
				actualFinish = j;
			}
		}
		else
			
		for(int k = i; k <= j; k++)
		{
			sum = sum + n[k];
		}
		return sum;
	}
	
	public int getMax()
	{
		return theMax;
	}
	
	public int getStart()
	{
		return actualStart;
	}
	
	public int getFinish()
	{
		return actualFinish;
	}
	
	public static int[] randomArray(int n)
	{
		Random random = new Random();
		int number = random.nextInt(100+100)-100;
		
		int[] randomNumbers = new int[n];
		for(int i = 0; i < n; i++)
		{
			randomNumbers[i] = number;
		}
		
		return randomNumbers;
	}
	
	public static void main (String[]args)
	{
		
	
		
		RandomArray first = new RandomArray(100);
		Long bruteForceHundredStart = System.nanoTime();
		bruteForceSubarray sizeHundred = new bruteForceSubarray(first.getRandom());
		sizeHundred.findMax();
		Long bruteForceHundredEnd = System.nanoTime();
		System.out.println("n = 100 runtime is"+ " "+( bruteForceHundredEnd-bruteForceHundredStart) + " Nanoseconds");
		
		RandomArray second = new RandomArray(200);
		Long bruteForceTwoHundredStart = System.nanoTime();
		bruteForceSubarray sizeTwoHundred = new bruteForceSubarray(second.getRandom());
		sizeTwoHundred.findMax();
		Long bruteForceTwoHundredEnd = System.nanoTime();
		System.out.println("n = 200 runtime is" +" "+(bruteForceTwoHundredEnd - bruteForceTwoHundredStart + " Nanoseconds"));
			
		RandomArray third = new RandomArray(500);
		Long bruteForceFiveHundredStart = System.nanoTime();
		bruteForceSubarray sizeFiveHundred = new bruteForceSubarray(third.getRandom());
		sizeFiveHundred.findMax();
		Long bruteForceFiveHundredEnd = System.nanoTime();
		System.out.println("n = 500 runtime is" +" "+(bruteForceFiveHundredEnd - bruteForceFiveHundredStart) + " Nanoseconds");
		
		RandomArray fourth = new RandomArray(1000);
		Long bruteForceThousandStart = System.nanoTime();
		bruteForceSubarray sizeThousand = new bruteForceSubarray(fourth.getRandom());
		sizeThousand.findMax();
		Long bruteForceThousandEnd = System.nanoTime();
		System.out.println("n = 1000 runtime is" +" "+(bruteForceThousandEnd - bruteForceThousandStart) + " Nanoseconds");
	
		
	}
	
	
	
	
	
}
