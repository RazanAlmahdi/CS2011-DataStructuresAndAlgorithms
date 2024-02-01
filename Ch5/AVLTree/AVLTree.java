class AVLTree
{

    Node root;
    public int height(Node n)
    {
        if (n == null)
            return -1;
        else
            return n.height;
    }
    public void updateHeight(Node n)
    {
    	n.height = 1+Math.max(height(n.right), height(n.left));
    }
    public int getBalance(Node n)
    {
    	if (n==null)
    		return -1;
    	else
    		return height(n.right) - height(n.left);
    }
    public Node rotateRight(Node y)
    {
    	Node x = y.left;
    	Node z = x.right;
    	x.right = y;
    	y.left = z;
    	updateHeight(y);
    	updateHeight(x);
    	return x;
    }
    public Node rotateLeft(Node y)
    {
    	Node x = y.right;
    	Node z = x.left;
    	x.left = y;
    	y.right = z;
    	updateHeight(y);
    	updateHeight(x);
    	return x;
    }
    /*
    // the code as in the slides
    public Node rebalance(Node z)
    {
    	updateHeight(z);
    	int balance = getBalance(z);
    	if (balance > 1)
    	{
    		if (height(z.right.right) > height(z.right.left))
    			z = rotateLeft(z);
    		else
    		{
    			z.right = rotateRight(z.right);
    			z = rotateLeft(z);
    		}
    	}
    	else if (balance < -1)
    	{
    		if(height(z.left.left) > height(z.left.right))
    			z = rotateRight(z);
    		else
    		{
    			z.left = rotateLeft(z.left);
    			z = rotateRight(z);
   			}
    	}
    	return z;
    }
    */
    // same code but easier to read
    public Node rebalance(Node z)
    {
    	updateHeight(z);
    	int balance = getBalance(z);
    	if (balance > 1)
    	{
    		if (height(z.right.left) > height(z.right.right))
    			z.right = rotateRight(z.right);
    		z = rotateLeft(z);
    	}
    	else if (balance < -1)
    	{
    		if(height(z.left.right) > height(z.left.left))
   				z.left = rotateLeft(z.left);
    		z = rotateRight(z);
    	}
    	return z;
    }
    
    public Node insertRecursive(Node n, int key)
    {
        if (n==null)
            return new Node(key);
        else if(n.data < key)
            n.right = insertRecursive(n.right, key);
        else if(n.data > key)
            n.left = insertRecursive(n.left, key);
        return rebalance(n);
    }
    
    public int max(Node n)
    {
        if (n==null)
            return -1;
        Node current = n;
        while (current.right != null)
            current = current.right;
        return current.data;
    }
    
    public Node search(Node n, int data)
    {
    	System.out.println("entered search");
        if (n==null || n.data == data)
        	return n;
        else if(n.data < data)
            return search(n.right, data);
        else
            return search(n.left, data);
    }
    
    public int size(Node n)
    {
        if (n == null)
            return 0;
        else
            return 1+size(n.left)+size(n.right);
    }

    public void inOrder(Node n)
    {
        if (n==null)
            return;
    	else
        {
        	inOrder(n.left);
        	System.out.print(n.data + " ");
        	inOrder(n.right);
        }
        	
    }
    
    public void preOrder(Node n)
    {
        if (n==null)
            return;
    	else
        {
        	System.out.print(n.data + " ");
        	preOrder(n.left);
        	preOrder(n.right);
        }
    }
    
    public void postOrder(Node n)
    {
        if (n==null)
            return;
    	else
        {
        	postOrder(n.left);
        	postOrder(n.right);
        	System.out.print(n.data + " ");
        }
    }
    
    public int sum(Node n)
    {
        int sum = 0;
        
        if (n==null)
            return sum;
        else
        {
            sum = sum+n.data;
            return sum + sum(n.left) + sum(n.right);

        }
    }
    
    public int size()
    {
        return size(root);
    }
    public int height()
    {
        return height(root);
    }
    public int sum()
    {
        return sum(root);
    }
    public void inOrder()
    {
        inOrder(root);
    }
    public void preOrder()
    {
        preOrder(root);
    }
    public void postOrder()
    {
        postOrder(root);
    }
    public Node search(int data)
    {
        return search(root, data);
    }
    public int max()
    {
        return max(root);
    }
    public void insert(int key)
    {
        root = insertRecursive(root, key);
    }
}
