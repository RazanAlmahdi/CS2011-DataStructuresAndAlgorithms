class BinaryTree
{

        Node root;
        
    public int size()
    {
        return size(root);
    }
    public int height()
    {
        return height(root);
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
    public void print(Node n)
    {
    	if (n != null)
        {
        	print(n.left);
        	System.out.println(n.data);
        	print(n.right);
        }
        	
    }
}
