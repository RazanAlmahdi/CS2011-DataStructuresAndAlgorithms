package lec15;

public class Test {

	public static void main(String[] args) {
		AVL avl = new AVL();
		
		avl.insert(7);
		avl.insert(20);
		avl.insert(25);
		avl.insert(9);
		avl.insert(2);
		avl.insert(4);
		
		Node a = avl.search(25);
		
		System.out.println(a.data);
	
		avl.inOrder();
	
	}

}
