
public class Node {
	
	private int data;
	private Node next;
	
	public Node(int data)
	{
		this.data = data;
		
	}
	
	
	public int getData()
	{
		System.out.println(data);
		return data;
	}
	
	public Node getNext()
	{
		
		return next;
	}
	
	
	public void setNext(Node n)
	{
		next = n;
	}
	
	
}
