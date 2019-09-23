import java.util.*;
public class FirstRecurringCharacter {

	public FirstRecurringCharacter()
	{
		
	}
	
	public char recurrenceSearch(String string)
	{ 
		char recurringChar = '0';
		ArrayList<Character> tracker = new ArrayList<Character>();
		
		for(int i = 0; i< string.length(); i++)
		{
			if(!tracker.contains(string.charAt(i)))
				{
					tracker.add(string.charAt(i));
				}
			else
			
				if(tracker.contains(string.charAt(i)))
				{	
					recurringChar = string.charAt(i);
					
				}
			
			
			
		}
		System.out.println(recurringChar);
		return recurringChar;
	}
	
	
	
	
	
	
	
	public static void main(String[]args)
	{
		FirstRecurringCharacter test = new FirstRecurringCharacter();
		String testString = "ABCDEFGA";
		test.recurrenceSearch(testString);
		
		
		
		
		
	}

}
