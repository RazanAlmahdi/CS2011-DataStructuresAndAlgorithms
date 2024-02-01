package lec15;


public class AVL {

	Node root;
	
	public void updateHeight(Node n)
	{
		n.height = 1+Math.max(height(n.left), height(n.right));
	}

	public int height(Node n)
	{
		if (n == null)
			return -1;
		else 
			return n.height;
	}
	
	public int getBalance(Node n)
	{
		if (n == null)
			return -1;
		else 
			return height(n.right) - height(n.left);
	}
	
	public Node rotateRight(Node y)
	{
		Node x = y.left;
		Node z = y.right;
		x.right = y;
		y.left = z;
		updateHeight(y);
		updateHeight(x);
		return x;
	}
	
	public Node rotateLeft(Node y)
	{
		Node x = y.right;
		Node z= x.left;
		x.left = y;
		y.right = z;
		updateHeight(y);
		updateHeight(x);
		return x;
	}
	
	
	public Node rebalance(Node z)
	
	{
		updateHeight(z);
		int balance = getBalance(z);
		if (balance > 1)
		{
			if (height(z.right.right)> height(z.right.left)) {
				z = rotateLeft(z);}
			else {
				z.right = rotateRight(z.right);
				z= rotateLeft(z);
			}
		}
		else if (balance < -1) {
			if (height(z.left.left)> height(z.left.right))
				z = rotateRight(z);
			else {
				z.left = rotateLeft(z.left);
				z = rotateRight(z);
			}
		}
		return z;
	}
	
	public Node insert(Node node, int key) {
		if (node == null) {
			return new Node(key);
		} else if (node.data > key) {
			node.left = insert(node.left, key);
		} else if (node.data < key) {
			node.right = insert(node.right , key);
		}
		return rebalance(node);
	}
	
	public void insert(int key)
	{
		root = insert(root, key);
	}
	
	public Node search(int data)
	{
		return search(root,data);
	}
	
	public Node search(Node n, int data) {
		if(n.data == data || n == null) {
			return n;}
		else if (n.data > data) {
			return search(n.left,data);}
		else {
			return search(n.right, data);
		}
	}
	
	public void inOrder() {
	    inOrder(root);
	  }  
	  
	  private void inOrder(Node node) {
	    if (node == null) {
	      return;
	    }   
	    
	    inOrder(node.left);
	    System.out.printf("%s ", node.data);
	    inOrder(node.right);
	  }  
}
