public class Test
{
	public static void main(String[] args)
	{
		BinaryTree t = new BinaryTree();
		Node root = new Node("Leen");
		t.root = root;
		t.root.left = new Node("Reem");
		t.root.right = new Node("Rayanah");
		t.root.right.right = new Node("Reem");
		t.root.right.left = new Node("Dina");
		t.root.right.left.left = new Node("Alex");
		System.out.println(t.size());
		System.out.println(t.height());
		t.print(root);
	}
}
