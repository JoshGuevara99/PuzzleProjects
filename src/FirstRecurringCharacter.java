import java.util.*;
public class FirstRecurringCharacter {

	public FirstRecurringCharacter()
	{
		
	}
	//Takes in a string and finds the character which occurs more than once
	public char recurrenceSearch(String string)
	{ 
		char recurringChar = '0';
		
		//Arraylist tracker contains a list of characters already seen
		ArrayList<Character> tracker = new ArrayList<Character>();
		
		for(int i = 0; i< string.length(); i++)
		{
			//If character hasn't been seen yet, add it to the list
			if(!tracker.contains(string.charAt(i)))
				{
					tracker.add(string.charAt(i));
				}
			else
			//If the character has been seen already, then it is a recurring character
				if(tracker.contains(string.charAt(i)))
				{	
					recurringChar = string.charAt(i);
					
				}
			
			
			
		}
		System.out.println("The recurring character is: " + recurringChar);
		return recurringChar;
	}
	
	
	
	
	
	
	
	public static void main(String[]args)
	{
		FirstRecurringCharacter test = new FirstRecurringCharacter();
		String testString = "ABCDEFGA";
		test.recurrenceSearch(testString);
		
		
		
		
		
	}

}
