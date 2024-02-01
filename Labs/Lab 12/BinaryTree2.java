 package lec12;


 BinaryTree2()
 {{root = null;}

 public void postOrder(Node n){
    if (n == null)
    return;
    else{
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.data + " ");
    }

 }

 public void preorder (Node n){
    if (n == null)
    return;
    else{
        System.out.print(n.data + " ");
        preOrder(n.left);
        preOrder(n.right);
    }
 }
 
	public static void main(String[] args) {
		
		BinaryTree t = new BinaryTree();
		Node n1 = new Node("Midnight");
		t.root = n1;
		t.root.left = new Node("Sunrise");
		t.root.right = new Node("Sunset");
		t.root.left.left = new Node("Twilight");
		t.root.left.right = new Node("Dawn");
		
		System.out.println("------------------------- ");
		System.out.println("\nBinary Tree size:\n ");
		System.out.println(t.size());
		
		System.out.println("------------------------- ");
		System.out.println("\nBinary Tree height:\n ");
		System.out.println(t.height());
		
		System.out.println("------------------------- ");
		System.out.println("\nBinary Tree nodes:\n ");
		t.printNodes();
		System.out.println("\n\n------------------------- ");}}
 
 