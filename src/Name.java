
public class Name {
	private String name;
	private Name next;
	
	public Name(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Name getNext()
	{
		return next;
	}

	public void setNext(Name name)
	{
		next = name;
	}
}
