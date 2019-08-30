
public class SwapLargestAndSmallest
{
	public static class Arrays {
		
		
		public Arrays()
		{
			
		}

		public static void swapLargestAndSmallest(int[]arrays)
		{
		    int largeIndex = 0;
			int smallIndex = 0;
			int  smallest=arrays[0];
			int  largest= arrays[0];
			
			
				for(int i = 0; i< arrays.length; i++)
				{
					if(arrays[i]>=largest)
					{
						largest = arrays[i];
						largeIndex = i;
					}
					if(arrays[i]<smallest)
					{
						smallest = arrays[i];
						smallIndex = i;
					}	
					
				}
				int temp = smallest;
				arrays[smallIndex] = largest;
				arrays[largeIndex]= temp;
						
			}
		
	}

	
	
   public static void main(String[] args)
   {
      int[] a = new int[] { 5, 4, 1, 9, 2, 6 };
      Arrays.swapLargestAndSmallest(a);
      System.out.println(java.util.Arrays.toString(a));
      System.out.println("Expected: [5, 4, 9, 1, 2, 6]");
      a = new int[] {1, 4, 1, 9, 2, 6};
      Arrays.swapLargestAndSmallest(a);
      System.out.println(java.util.Arrays.toString(a));
      System.out.println("Expected: [9, 4, 1, 1, 2, 6]");
      a = new int[] {1, 4, 2, 9, 9, 6};
      Arrays.swapLargestAndSmallest(a);
      System.out.println(java.util.Arrays.toString(a));
      System.out.println("Expected: [9, 4, 2, 9, 1, 6]");
      a = new int[] {1};
      Arrays.swapLargestAndSmallest(a);
      System.out.println(java.util.Arrays.toString(a));
      System.out.println("Expected: [1]");      
   }
}