
public class binaryNode {
	
	private binaryNode right;
	private binaryNode left;
	private int number;
	
	public binaryNode(int number)
	{
		this.number = number;
	}
	
	public void setLeft(binaryNode left)
	{
		this.left = left;
	}
	
	public void setRight(binaryNode right)
	{
		this.right = right;
	}
	
	public binaryNode getLeft()
	{
		
		return left;
	}
	
	public binaryNode getRight()
	{
		
		return right;
	}

	public int getNumber()
	{
		return number;
	}
}
