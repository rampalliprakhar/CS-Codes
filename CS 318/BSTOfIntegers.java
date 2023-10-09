/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 1/28/23
 * Last Updated: 3/5/23
 *
 * Compilation: javac TestTree.java
 * Execution: java TestTree
 *
 * Description:
 * A program which implements Binary search tree of integers using array implementation.
 * The BSTOfIntegers class is tested in the main method.
 * Implements: default constructor, parameterized constructor, insert, delete, search and their recursive helper methods.
 * printPreOrder, printInOrder and printPostOrder traversal methods.
 *
 *  Sample Output:
 * Is the element present in the tree? true
 * 
 * Pre order traversal:
 * 8 --> 5 --> 3 --> 7 --> 9 --> 11 --> 
 * In order traversal:
 * 3 --> 5 --> 7 --> 8 --> 9 --> 11 --> 
 * Post order traversal:
 * 3 --> 7 --> 5 --> 11 --> 9 --> 8 --> 
 * After deleting element: 
 * 11 --> true
 * 8 --> 5 --> 3 --> 7 --> 11
 *
 *
 -------------------------------------------------*/
// class which implements binary search tree of integers
class BSTOfIntegers{
	int[] nodes;
	int root = 0;
	// private class node of BSTOfIntegers class
//	private class Node	{Node left;	Node right;	Node tree_root;}
	BSTOfIntegers()                       // default constructor creating an empty tree
	{
		nodes = new int[20];  // entering size as 20
		for(int i = 0; i < nodes.length; i++) // move towards indices
		{
			nodes[i] = -1; // considering root node as null
		}
	}

	BSTOfIntegers(int[] nodes, int size)  // parameterized constructor creating a tree using the numbers provided
	{
		nodes = new int [size]; // putting size in nodes array
	}

	// insert method of binary search tree using recursion
	public boolean insert(int e) 
	{
		return insert(e, 0);
	}
	// recursive helper method
	protected boolean insert(int e, int i)   // inserts a new element into a tree, 
	//if the tree already had e, prints an error
	{	
		if(i >= nodes.length)
		{
			System.out.println("Space not available");
			return false;
		}
		else if(nodes[i] == -1) // if element of node is empty
		{
			nodes[i] = e; // assume node[i] is e
		}
		else 
		{
			if(e < nodes[i]) // checking to see whether e is greater than the root node 
			{
				insert(e, 2 *i + 1); // inserting by moving left
			}
			else if(e == nodes[i]) // checking to see whether e is the same
			{
				System.out.println(e + " already exists."); // printing error if same
			}
			else 
			{
				insert(e, 2*i + 2); // inserting by moving right
			}
		}
		return true; // if insertion successfully done
	}

	public boolean delete(int e)  // if e exists in the tree, deletes it, otherwise prints an error 
	{
		return delete(e, 0);
	}
	protected boolean delete(int e, int i) 
	{
		int inorder_next = 0; // initializing inorder_next as 0
		while(nodes[i] != e && nodes[i] != -1) // nodes of element is not e and is not empty
		{
			if(e < nodes[i]) 
			{
				i = 2*i + 1; // element is in left position
			}
			else 
			{
				i = 2*i + 2; // element is in right position
			}
		}
		if(nodes[i] != -1) // if element of tree is not null
		{
				
			// Case 1: Delete leaf node
			if(nodes[2*i + 1] == -1 && nodes[2*i + 2] == -1)  // if left node is null and right node is null
			{
				nodes[i] = -1; // root node is null
			}
			// Case 2: Delete Node with one child
			else if(nodes[2*i + 1] == -1 || nodes[2*i + 2] == -1) // if left node is null or right node is null
			{
				if(nodes[2*i + 1] != -1) // if left node is not null
				{
					help_printPreOrder(2*i + 1); // call reursive pre-order helper method which goes to the left
					nodes[i] = -1;
				}
				else 
				{
					help_printPreOrder(2*i + 2); // call recursive pre-order helper method which goes to the right
					nodes[2*i + 2] = -1;
				}
			}
			//Case 3 - Delete nodes with two children
			else
			{
				inorder_next = 2*0 + 2; // inorder next targets parent node
				while(nodes[2*inorder_next] != -1) // while parent node is not null
				{
					inorder_next*=2; // doubles the parent node
				}
				nodes[i] = nodes[inorder_next]; // node element is inorder_next node
				if(nodes[2*inorder_next+1] == -1)  // if right node is null
				{
					nodes[inorder_next] = -1; // then inorder_next is null
				}
				else // inorder successor has one child
				{
					help_printPreOrder(2*inorder_next + 1); // recursively print pre-order of left nodes
				}
				return true; // if successful
			}
		}
		else // if element is not in binary search tree
		{
			System.out.println("element not found");
			return false;
		}
		return true; // if deletion successful return true
	}
	// recursive method search for searching element in the tree
	public boolean search(int e) 
	{
		return search(e, 0); // calling recursive helper method
	}
	// recursive helper method
	protected boolean search(int e, int i)  // returns true if e is in the tree, false otherwise 
	{
		if(nodes[i] == -1 || i > nodes.length-1) // if root node is empty or position is greater than tree size
		{
			return false; 
		}
		if(nodes[i] == e) // if element is found
		{
			return true;
		}
		else if(nodes[i] < e) // root node is less than e
		{
			return search(e, 2*i + 2); // go right
		}
		else if(nodes[i] > e) // root node is greater than e
		{
			return search(e, 2*i + 1); // go left
		}
		else 
		{
			System.out.println(e + " is not in tree.");
			return false; // element not present in the tree
		}
	}
	// recursive traversal method
	public void printPostOrder() 
	{
		help_printPostOrder(0);  // calling recursive helper method
	}
	// recursive helper method
	protected void help_printPostOrder(int i) // post-order traversal 
	{
	    if(i < nodes.length && nodes[i] != -1) // if i did not exceed the node length and nodes of i is not null
	    {
	        help_printPostOrder(2 * i + 1); 		// recursively move left
	        help_printPostOrder(2 * i + 2); 		// recursively move right
	        System.out.print(nodes[i] + " --> ");	// print the current node
	    }
	}
	// recursive traversal method
	public void printInOrder() 
	{
		help_printInOrder(0);  // calling recursive helper method
	}
	// recursive helper method
	protected void help_printInOrder(int i) // in-order traversal 
	{
	    if(i < nodes.length && nodes[i] != -1) // if i did not exceed the node length and nodes of i is not null
	    {
	        help_printInOrder(2*i + 1); 			// recursively move left
	        System.out.print(nodes[i] + " --> ");	// print the current node
	        help_printInOrder(2*i + 2);				// recursively move right
	    }
	}
	// recursive traversal method
	public void printPreOrder() 
	{
		help_printPreOrder(0); // calling recursive helper method
	}
	// recursive helper method
	protected void help_printPreOrder(int i) // pre-order traversal 
	{
	    if(i < nodes.length && nodes[i] != -1) // if i did not exceed the node length and nodes of i is not null
	    {
	        System.out.print(nodes[i] + " --> ");  // print the current node
	        help_printPreOrder(2 * i + 1);		   // recursively move left
	        help_printPreOrder(2 * i + 2);		   // recursively move right
	    }
	}
}