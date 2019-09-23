import java.util.HashSet;
import java.util.Set;

public class IsUnique2 {
	
	/*
	 * Determines if a string has all unique characters
	 */
	
	public static boolean isUnique(String string)
	{
		boolean answer = true;
		Set<Character> uniqueSet= new HashSet<Character>();
		for(int i = 0; i < string.length();i++)
		{
			if(uniqueSet.add(string.charAt(i)) == false)
			{
				answer = false;
			}
			uniqueSet.add(string.charAt(i));
		}
		return answer;
	}
	
	
	
	public static void main(String[]args)
	{
		String duplicates = "Mississippi";
		String unique = "abcdefghijk";	
		System.out.println(isUnique(duplicates));
		System.out.println(isUnique(unique));
		
	}

}
