import java.util.ArrayList;

public class binaryTree {
	
private static binaryNode root;
	
	//Construcs an empty binaryTree
	public binaryTree()
	{
		root = null;
		
	}
	
	
	public static void insert(binaryNode n)
	{
		if(root == null)
		{
			root = n;
			
			
		}
		
		else
		{
			
			insertHelp(root,n);
		}
	}
	
	private static void insertHelp(binaryNode current, binaryNode n)
	{		
			
			//Cases where we need to move down to the next node
			 if(n.getNumber() > current.getNumber() && !(current.getRight() == null))
			{	
				current = current.getRight();
				insertHelp(current,n);
			}
			
			else if(n.getNumber()< current.getNumber() && !(current.getLeft() == null))
			{
				
				current = current.getLeft();
				insertHelp(current,n);
			}
			 
			// Cases where we are at the leaf
			else {
					if(n.getNumber() > current.getNumber())
					{
						current.setRight(n);
					}
					else 
					{
						current.setLeft(n);
					}
				
				}
			}
			
			
		
			
		
		
	
	
	public binaryNode getRoot()
	{
		return this.root;
	}
	
	
	public static void main (String[]args)
	{
		binaryTree test = new binaryTree();
		
		binaryNode first = new binaryNode(15);
		binaryNode second = new binaryNode(10);
		binaryNode third = new binaryNode(19);
		binaryNode fourth = new binaryNode(12);
		binaryNode fifth = new binaryNode(28);
		test.insert(first);
		test.insert(second);
		test.insert(third);
		test.insert(fourth);
		test.insert(fifth);
		
	
		
		System.out.println(test.getRoot().getNumber());
		System.out.println(test.getRoot().getLeft().getNumber());
		System.out.println(test.getRoot().getRight().getNumber());
		System.out.println(test.getRoot().getLeft().getRight().getNumber());
		System.out.println(test.getRoot().getRight().getRight().getNumber());
	}
	
	
	
	
	
	
	
	
	

}
