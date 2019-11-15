package cs146F19.Guevara.project2;

public class DivideAndConquerSubArray {
	
	private int[] theArray;//the input array from which the max subarray will be found
	
	private int theMax;
	
	
	private static int leftSum = 0;//Current sum of left half
	private static int leftMax = 0;//Current Max sum of left half
	private static int leftStart;
	private static int leftFinish;//Index of left subarray end
	
	private static int rightSum = 0;//Current sum of right half
	private static int rightMax = 0;//Current max sum of right half
	private static int rightStart;//Index of right subarray start
	private static int rightFinish;//Index of right subarray end
	
	private static int midMax = 0;//Max sum of the middle, right max plus left max
	private static int midStart;
	private static int midFinish;
	
	
	
	private static int start;//starting index of the max subarray
	private static int finish;//finishing index of the max subarray
	
	//takes in an array
	public DivideAndConquerSubArray(int[] n)
	{
		theArray = n;
	}
	
	// Returns the left max subarray sum by recursively iterating and adding to the sum
	public int DivideAndConquerLeft(int n)
	{
		 leftStart = (theArray.length/2)-1;
		
		//If the end of the left half is reached then we are at base case
		if(n == 0)
		{
			leftSum = leftSum + theArray[n];
			if(leftSum > leftMax)
			{
				leftMax = leftSum;
				leftFinish = 0;
			}
		}
		else
		{
			
			leftSum = leftSum + theArray[n];
			if(leftSum > leftMax)
			{
				leftMax = leftSum;
				leftFinish = n;
				
			}
			DivideAndConquerLeft(n-1);
			
		}
		return leftMax;
		
	}
	//Returns the right max subarray sum after recursively iterating and adding to the sum
	public int DivideAndConquerRight(int n)
	{
		
		
		int rightStart= theArray.length/2;
		
		if(n == theArray.length-1)
		{
			rightSum = rightSum + theArray[n];
			if(rightSum > rightMax)
			{
				rightMax = rightSum;
				rightFinish = n;
			}
		}
		else
		{
			rightSum = rightSum +theArray[n];
			if(rightSum > rightMax)
			{
				rightMax = rightSum;
				rightFinish = n;
			}
			DivideAndConquerRight(n+1);
			
		}
		
		return rightMax;
	}
	//Compares left right and mid max and returns the greatest of the three
	public int findMax()
	{
		//Mid max is computed by adding left and right max
		midMax = leftMax + rightMax;
		
				
		
		int maxOfBothHalves = Math.max(leftMax, rightMax);
		int FinalMax = Math.max(maxOfBothHalves, midMax);	
		if(FinalMax == leftMax)
		{
			
			start = leftStart;
			
			finish = leftFinish;
			
		}
		else
			
		if(FinalMax == rightMax)
		{
			start = rightStart;
			
			finish = rightFinish;
		}
		else
			
		if(FinalMax == midMax)
		{
			start = leftFinish;
			
			finish = rightFinish;
		}
		theMax = FinalMax;
		
		return theMax;
		
	}
	
	public int getMax()
	{
		return theMax;
	}
	
	public int getStart()
	{
		return start;
	}
	
	public int getFinish()
	{
		return finish;
	}
	
	
	public static void main (String[]args)
	{
		RandomArray first = new RandomArray(100);
		Long DivideAndConquerHundredStart = System.nanoTime();
		DivideAndConquerSubArray sizeHundred = new DivideAndConquerSubArray(first.getRandom());
		sizeHundred.DivideAndConquerLeft((first.getRandom().length/2)-1);
		sizeHundred.DivideAndConquerRight((first.getRandom().length)/2);
		sizeHundred.findMax();
		Long DivideAndConquerHundredEnd = System.nanoTime();
		System.out.println("n = 100 runtime is"+ " "+( DivideAndConquerHundredEnd-DivideAndConquerHundredStart) + " Nanoseconds");
		
		
		
		RandomArray second = new RandomArray(200);
		Long DivideAndConquerTwoHundredStart = System.nanoTime();
		DivideAndConquerSubArray sizeTwoHundred = new DivideAndConquerSubArray(second.getRandom());
		sizeTwoHundred.DivideAndConquerLeft((second.getRandom().length/2)-1);
		sizeTwoHundred.DivideAndConquerRight((second.getRandom().length)/2);
		sizeTwoHundred.findMax();
		Long DivideAndConquerTwoHundredEnd = System.nanoTime();
		System.out.println("n = 200 runtime is"+ " "+( DivideAndConquerTwoHundredEnd-DivideAndConquerTwoHundredStart) + " Nanoseconds");
		
		RandomArray third = new RandomArray(500);
		Long DivideAndConquerFiveHundredStart = System.nanoTime();
		DivideAndConquerSubArray sizeFiveHundred = new DivideAndConquerSubArray(third.getRandom());
		sizeFiveHundred.DivideAndConquerLeft((third.getRandom().length/2)-1);
		sizeFiveHundred.DivideAndConquerRight((third.getRandom().length)/2);
		sizeFiveHundred.findMax();
		Long DivideAndConquerFiveHundredEnd = System.nanoTime();
		System.out.println("n = 500 runtime is"+ " "+( DivideAndConquerFiveHundredEnd-DivideAndConquerFiveHundredStart) + " Nanoseconds");
		
		RandomArray fourth = new RandomArray(1000);
		Long DivideAndConquerThousandStart = System.nanoTime();
		DivideAndConquerSubArray sizeThousand = new DivideAndConquerSubArray(fourth.getRandom());
		sizeThousand.DivideAndConquerLeft((fourth.getRandom().length/2)-1);
		sizeThousand.DivideAndConquerRight((fourth.getRandom().length)/2);
		sizeThousand.findMax();
		Long DivideAndConquerThousandEnd = System.nanoTime();
		System.out.println("n = 1000 runtime is"+ " "+( DivideAndConquerThousandEnd-DivideAndConquerThousandStart) + " Nanoseconds");
		
		RandomArray fifth = new RandomArray(2000);
		Long DivideAndConquerTwoThousandStart = System.nanoTime();
		DivideAndConquerSubArray sizeTwoThousand = new DivideAndConquerSubArray(fifth.getRandom());
		sizeTwoThousand.DivideAndConquerLeft((fifth.getRandom().length/2)-1);
		sizeTwoThousand.DivideAndConquerRight((fifth.getRandom().length)/2);
		sizeTwoThousand.findMax();
		Long DivideAndConquerTwoThousandEnd = System.nanoTime();
		System.out.println("n = 2000 runtime is"+ " "+( DivideAndConquerTwoThousandEnd-DivideAndConquerTwoThousandStart) + " Nanoseconds");
//	
		RandomArray sixth = new RandomArray(5000);
		Long DivideAndConquerFiveThousandStart = System.nanoTime();
		DivideAndConquerSubArray sizeFiveThousand = new DivideAndConquerSubArray(sixth.getRandom());
		sizeFiveThousand.DivideAndConquerLeft((sixth.getRandom().length/2)-1);
		sizeFiveThousand.DivideAndConquerRight((sixth.getRandom().length)/2);
		sizeFiveThousand.findMax();
		Long DivideAndConquerFiveThousandEnd = System.nanoTime();
		System.out.println("n = 5000 runtime is"+ " "+( DivideAndConquerFiveThousandEnd-DivideAndConquerFiveThousandStart) + " Nanoseconds");
		
		RandomArray seventh = new RandomArray(10000);
		Long DivideAndConquerTenThousandStart = System.nanoTime();
		DivideAndConquerSubArray sizeTenThousand = new DivideAndConquerSubArray(seventh.getRandom());
		sizeTenThousand.DivideAndConquerLeft((seventh.getRandom().length/2)-1);
		sizeTenThousand.DivideAndConquerRight((seventh.getRandom().length)/2);
		sizeTenThousand.findMax();
		Long DivideAndConquerTenThousandEnd = System.nanoTime();
		System.out.println("n = 10000 runtime is"+ " "+( DivideAndConquerTenThousandEnd-DivideAndConquerTenThousandStart) + " Nanoseconds");
		
	}
}
