package lec14;

class Node {
	 
	
    int data;
    Node left;
    Node right;
    Node(int v)
    {
        this.data = v;
        this.left = this.right = null;
    }
}
 
class BST {
	
	Node root;
    // Inorder Traversal
    public static void printInorder(Node node)
    {
        if (node == null)
            return;
 
        // Traverse left subtree
        printInorder(node.left);
 
        // Visit node
        System.out.print(node.data + " ");
 
        // Traverse right subtree
        printInorder(node.right);
    }
    
//    public void insert(int key)
//    {
//    	root = insertRecursive(root, key);
//    }
//    
//    public Node insertRecursive(Node n, int key)
//    {
//    	if ( n == null)
//    		return new Node(key);
//    	else if(n.data < key)
//    	{
//    		n.right = insertRecursive(n.right, key);
//    		return n;
//    	}
//    	else 
//    		n.left = insertRecursive(n.left, key);
//    		return n;
//    }
    
    static Node insert(Node node, int data)
    {
        /* 1. If the tree is empty, return a new,    
        single node */
        if (node == null)
            return new Node(data);
        else
        {
            /* 2. Otherwise, recur down the tree */
            if (data <= node.data)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
     
            /* return the (unchanged) node pointer */
            return node;
        }
    }
    
    static int maxValue(Node node)
    {
        /* loop down to find the rightmost leaf */
        Node current = node;
        while (current.right != null)
            current = current.right;
         
        return (current.data);
    }
     
    public Node search(int key)
    {
    	return search(root, key);
    }
    
    public static Node search(Node root, int key)
    {
    	if (root == null || root.data == key)
    		return root;
    	
    	if (root.data < key)
    		return search(root.right , key);
    	
    	return search(root.left ,key);
    }
    
    // Driver Code
    public static void main(String[] args)
    {
         //Build the tree
        Node root = new Node(5);
//        root.left = new Node(10);
//        root.right = new Node(20);
//        root.left.left = new Node(13);
//        root.left.right = new Node(15);
//        root.right.left = new Node(27);

    	    insert(root, 10);
    	    insert(root, 20);
    	    insert(root, 13);
    	    insert(root, 15);
    	    insert(root, 27);
    	
    	System.out.print("\n----------------------\n");
        System.out.print("\nInorder Traversal: \n\n ");
        printInorder(root);
        
        System.out.print("\n\n----------------------\n");
        System.out.println("Maximum value in BST is " + maxValue(root));
        System.out.print("\n\n----------------------\n");
    }
}
