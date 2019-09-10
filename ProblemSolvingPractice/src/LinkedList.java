
public class LinkedList {
	private static Node head;
	private static Node tail;
	private static Node current;
	
	public LinkedList()
	{
		head = null;
		tail = null;
	}
	
	public void add(Node n)
	{
		if(head == null)
		{
			head = n;
			tail = n;
			tail.setNext(null);
		}
		else
		{
			n.setNext(head);
			head = n;
		}
		
		
	}
	
	public Node getHead()
	{
		head.getData();
		return head;
	}
	
	public Node getTail()
	{
		tail.getData();
		return tail;
	}
	
	
	public static void main (String[]args)
	{
		LinkedList list = new LinkedList();
		Node a = new Node(2);
		Node b = new Node (5);
		Node c = new Node(1);
		Node d = new Node(7);
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		boolean done = false;
		Node current = head;
		while(!done)
		{
			current.getData();
			if(current.getNext()== null)
			{
				done = true;
			}
			current = current.getNext();
		}
			
	}
	
	
	
	
	
}
