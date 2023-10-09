public class TestTree
{
	public static void main(String[]args) {
		BSTOfIntegers t = new BSTOfIntegers(); // calls the BSTOfIntegers class

        	t.insert(8);
        	t.insert(5);
        	t.insert(9);
        	t.insert(3);
        	t.insert(7);
        	t.insert(11);
		
		// searching to see whether element present in the tree
		System.out.println("\nIs the element present in the tree? " + t.search(8));
		
		// printing the traversals
		System.out.println("\nPre order traversal:");
		t.printPreOrder();
		
		System.out.println("\nIn order traversal:");
		t.printInOrder();
		
		System.out.println("\nPost order traversal:");
		t.printPostOrder();
		
		System.out.println("\nAfter deleting element: ");
		System.out.println(t.delete(9));
		t.printPreOrder();
	}
}
