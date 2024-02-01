public class Main
{
	public static void main(String[] args)
	{

		BST t = new BST();
		t.insert(5);
		t.insert(10);
		t.insert(20);
		t.insert(13);
		t.insert(15);
		t.insert(27);

		t.inOrder();

        System.out.println("\nmax = " + t.max());
        System.out.println("\nsecond largest = " + t.secondLargest());
        System.out.println("\nis BST? " + t.isValidBST());
        System.out.println("\nsearch: " + t.search(15));
        
	}
}
