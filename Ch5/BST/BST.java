class BST
{

    Node root;
    
    public void insert(int key)
    {
        root = insertRecursive(root, key);
    }
    public Node insertRecursive(Node n, int key)
    {
        if (n==null)
            return new Node(key);
        else if(n.data < key)
        {
            n.right = insertRecursive(n.right, key);
            return n;
        }
        else
        {
            n.left = insertRecursive(n.left, key);
            return n;
        }
    }
    public boolean isValidBST()
    {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean validate(Node root, long left, long right)
    {
        if (root == null)
            return true;
        if (!(root.data < right && root.data > left))
            return false;
        return validate(root.left, left, root.data) 
        && validate(root.right, root.data, right);

    }
    public int max()
    {
        return max(root);
    }
    public int secondLargest(Node root)
    {
    	if (root == null)
    		return -1;
    	Node current = root;
    	int secondL = current.data;
        while (current.right != null)
        {
        	secondL = current.data;
        	current = current.right;
        }
    	return secondL;
    }
    public int secondLargest()
    {
    	return secondLargest(root);
    }
    public int max(Node n)
    {
    	/*
        if (n==null)
            return -1;
        
        Node current = n;
        while (current.right != null)
            current = current.right;
        
        return current.data;
        */
    	if (n == null)
    		return -1;
        else
        {
        	int max = n.data;
        	int left = max(n.left);
            int right = max(n.right);
         
            if (left > max)
            	max = left;
            if (right > max)
            	max = right;

        	return max;
        }
    }
    public Node search(int data)
    {
        return search(root, data);
    }
    public Node search(Node n, int data)
    {
        if (n==null || n.data == data)
            return n;
        else if(n.data < data)
            return search(n.right, data);
        else
            return search(n.left, data);
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
    public int size(Node n)
    {
        if (n == null)
            return 0;
        else
            return 1+size(n.left)+size(n.right);
    }
    public int height(Node n)
    {
        if (n == null)
            return -1;
        else
            return 1 + Math.max(height(n.left), height(n.right));
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
}
