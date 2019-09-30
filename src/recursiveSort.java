
public class recursiveSort {
	
	private int[] theArray;
	public insertionSort(int[] n)
	{
		theArray = n;
		sort(theArray);
	}
	
	public static void sort(int[] n)
	{
		boolean done = false;
		while(!done)
		{
			for(int i = 1; i < n.length;i++)
			{
				//If we are at the end of the array and the previous element is smaller, then the array is sorted
				if(i == n.length-1 && (n[i-1] < n[i]))
				{
					done = true;
				}
				else
				{
					//Recursively swaps elements until sorted
					if(n[i-1] > n[i])
					{
						int temp = n[i];
						n[i] = n[i-1];
						n[i-1] = temp;
						sort(n);
					}
					
				}
			}
			
		}
			
	}
	
	public static void main(String[]args)
	{
		int[] test = new int[5];
		test[0] = 27;
		test[1] = 35;
		test[2] = 14;
		test[3] = 55;
		test[4] = 66;
		sort(test);
		
		for(int i = 0; i < test.length; i++)
		{
			System.out.println(test[i]);
		}
		
		
	}

}
