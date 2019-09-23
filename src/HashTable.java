
import java.util.LinkedList;
import java.util.*;

public class HashTable {
	List<Name> elementList;
	private LinkedList[] arrayElements = new LinkedList[20];
	private int listSize = 20;
	
	public HashTable()
	{
		for(int i = 0; i< arrayElements.length;i++)
		{
			LinkedList<String> listElements = new LinkedList<String>();
			arrayElements[i] = listElements;
		}
	}
	
	public void hashFunction(String string)
	{	
		int index;
		int ASCII;
		int asciiSum = 0;
		
		for(int i = 0; i < string.length();i++)
		{
			ASCII = (int)(string.charAt(i));
			asciiSum = +ASCII;
		}
		index = asciiSum%listSize;
		arrayElements[index].add(string);
	}

	public String getName(String string)
	{
		int index;
		int ASCII;
		int asciiSum = 0;
		for(int i = 0; i < string.length();i++)
		{
			ASCII = (int)(string.charAt(i));
			asciiSum = +ASCII;
		}
		index = asciiSum%listSize;
		System.out.println(listIterator(arrayElements[index], string));
		return listIterator(arrayElements[index], string);
		
	}
	
	public String listIterator(LinkedList<String> list, String name)
	{	String theName = "blank";
		int current = list.indexOf(list.getFirst());
		while(!(list.get(current)==name))
		{
			current = current+1;
			if(list.get(current) == name)
			{
				theName = list.get(current);
			}
		}
		
		return theName;
	}
	
	
	
	public static void main (String[]args)
	{
		
		HashTable test = new HashTable();
		Name n = new Name("Bob");
		test.hashFunction(n.getName());
		
		
	}
}
