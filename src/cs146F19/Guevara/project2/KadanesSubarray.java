package cs146F19.Guevara.project2;

class KadanesSubarray {
	
	private int[] theArray;//Input array
	
	private int startIndex;//Starting index of max subarray
	private int finishIndex;//Finishing index of max subarray
	
	public KadanesSubarray(int[] n)
	{
		
		theArray = n;
	}
	
	public int KadaneFind()
	{
		int theMax = 0;
		int sum = 0;
		 startIndex = -1;
		 finishIndex = -1;
		int tempStart = 0;
		
		for(int i = 0; i < theArray.length-1; i++)
		{
			sum = sum + theArray[i];
			if(sum < 0)
			{
				sum = 0;
				startIndex = i+1;
			}
			if(theMax < sum)
			{
				theMax = sum;
				finishIndex = i;
				tempStart = startIndex;
			}
		}
		startIndex = tempStart;
		return theMax;
	}
	
	public int getStart()
	{
		return startIndex;
	}
	
	public int getFinish()
	{
		return finishIndex;
	}
	
	public static void main (String[]args)
	{
		int[] zero = new int[3];
		zero[0] = -2;
		zero[1] = -3;
		zero[2] = -1;
		
		KadanesSubarray tett = new KadanesSubarray(zero);
		System.out.println(tett.KadaneFind());
		System.out.println();
		RandomArray first = new RandomArray(100);
		Long KadaneHundredStart = System.nanoTime();
		KadanesSubarray sizeHundred = new KadanesSubarray(first.getRandom());
		sizeHundred.KadaneFind();
		Long KadaneHundredEnd = System.nanoTime();
		System.out.println("n = 100 runtime is"+ " "+(KadaneHundredEnd-KadaneHundredStart) + " Nanoseconds");
		
		RandomArray second = new RandomArray(200);
		Long KadaneTwoHundredStart = System.nanoTime();
		KadanesSubarray sizeTwoHundred = new KadanesSubarray(second.getRandom());
		sizeTwoHundred.KadaneFind();
		Long KadaneTwoHundredEnd = System.nanoTime();
		System.out.println("n = 200 runtime is"+ " "+(KadaneTwoHundredEnd-KadaneTwoHundredStart) + " Nanoseconds");
		
		RandomArray third = new RandomArray(500);
		Long KadaneFiveHundredStart = System.nanoTime();
		KadanesSubarray sizeFiveHundred = new KadanesSubarray(third.getRandom());
		sizeFiveHundred.KadaneFind();
		Long KadaneFiveHundredEnd = System.nanoTime();
		System.out.println("n = 500 runtime is"+ " "+(KadaneFiveHundredEnd-KadaneFiveHundredStart) + " Nanoseconds");
		
		RandomArray fourth = new RandomArray(1000);
		Long KadaneThousandStart = System.nanoTime();
		KadanesSubarray sizeThousand = new KadanesSubarray(fourth.getRandom());
		sizeThousand.KadaneFind();
		Long KadaneThousandEnd = System.nanoTime();
		System.out.println("n = 1000 runtime is"+ " "+(KadaneThousandEnd-KadaneThousandStart) + " Nanoseconds");
		
		RandomArray fifth = new RandomArray(2000);
		Long KadaneTwoThousandStart = System.nanoTime();
		KadanesSubarray sizeTwoThousand = new KadanesSubarray(fifth.getRandom());
		sizeTwoThousand.KadaneFind();
		Long KadaneTwoThousandEnd = System.nanoTime();
		System.out.println("n = 2000 runtime is"+ " "+(KadaneTwoThousandEnd-KadaneTwoThousandStart) + " Nanoseconds");
		
		RandomArray sixth = new RandomArray(5000);
		Long KadaneFiveThousandStart = System.nanoTime();
		KadanesSubarray sizeFiveThousand = new KadanesSubarray(sixth.getRandom());
		sizeFiveThousand.KadaneFind();
		Long KadaneFiveThousandEnd = System.nanoTime();
		System.out.println("n = 5000 runtime is"+ " "+(KadaneFiveThousandEnd-KadaneFiveThousandStart) + " Nanoseconds");
		
		RandomArray seventh = new RandomArray(10000);
		Long KadaneTenThousandStart = System.nanoTime();
		KadanesSubarray sizeTenThousand = new KadanesSubarray(seventh.getRandom());
		sizeTenThousand.KadaneFind();
		Long KadaneTenThousandEnd = System.nanoTime();
		System.out.println("n = 10000 runtime is"+ " "+(KadaneTenThousandEnd-KadaneTenThousandStart) + " Nanoseconds");
//		
		
		
		
	}
	
	
	
	
}
