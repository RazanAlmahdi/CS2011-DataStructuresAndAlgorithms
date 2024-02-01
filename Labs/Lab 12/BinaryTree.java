//package lec12;
//
//import java.io.*;
//
////Class describing a node of tree
////class Node {
////
//// int data;
//// Node left;
//// Node right;
//// Node(int v)
//// {
////     this.data = v;
////     this.left = this.right = null;
//// }
////}
//
//class GFG {
// // Inorder Traversal
// public static void printInorder(Node node)
// {
//     if (node == null)
//         return;
//
//     // Traverse left subtree
//     printInorder(node.left);
//
//     // Visit node
//     System.out.print(node.data + " ");
//
//     // Traverse right subtree
//     printInorder(node.right);
// }
// // Driver Code
// 
//
// 
////class BinaryTree {
////    // Root of Binary Tree
////    Node root;
//// 
////    BinaryTree() { root = null; }
//// 
////    /* Given a binary tree, print its nodes in inorder*/
////    void printInorder(Node node)
////    {
////        if (node == null)
////            return;
//// 
////        /* first recur on left child */
////        printInorder(node.left);
//// 
////        /* then print the data of node */
////        System.out.print(node.key + " ");
//// 
////        /* now recur on right child */
////        printInorder(node.right);
////    }
//// 
////    // Wrappers over above recursive functions
////    void printInorder() { printInorder(root); }
//// 
////    // Driver code
////    public static void main(String[] args)
////    {
////        BinaryTree tree = new BinaryTree();
////        tree.root = new Node(1);
////        tree.root.left = new Node(2);
////        tree.root.right = new Node(3);
////        tree.root.left.left = new Node(4);
////        tree.root.left.right = new Node(5);
//// 
////          // Function call
////        System.out.println(
////            "\nInorder traversal of binary tree is ");
////        tree.printInorder();
////    }
////}
//// public class BinaryTree {
//
//	
//// 	Node root;
//	
//// 	public int size()
//// 	{
//// 		return size(root);
//// 	}
//	
//// 	public int size(Node n)
//// 	{
//// 		if (n == null) //if length is nothing, return 0
//// 			return 0;
//// 		else			//else return the size of lefts and rights both
//// 			return 1 + size(n.left)+size(n.right);
//// 	}
//	
//// 	public int height()
//// 	{
//// 		return height(root);
//// 	}
//	
//	
//// 	public int height(Node n)
//// 	{
//// 		if (n == null) //if the length is nothing return false
//// 			return -1;
//// 		else 			//else return the height of lefts and rights both
//// 			return 1 + Math.max(height(n.left), height(n.right));
//// 	}
//	
//// 	public void printNodes() {
//// 	    printNodes(root);
//// 	}
//
//// 	private void printNodes(Node node) {
//	 
//// 	    if(node != null) { //if the node is not nonexistent, print the left node first
//// 	        printNodes(node.left);   
//
//// 	        System.out.print(node.data + " ");
//
//// 	        printNodes(node.right);  //then print the right node
//// 	    }
//		
//// 	}
//// 	void printPostorder(Node node)
////     {
////         if (node == null)
////             return;
// 
////         // first recur on left subtree
////         printPostorder(node.left);
// 
////         // then recur on right subtree
////         printPostorder(node.right);
// 
////         // now deal with the node
////         System.out.print(node.key + " ");
////     }
//// 	void printPostorder() { printPostorder(root); }
//
//// 	void printInorder(Node node)
////     {
////         if (node == null)
////             return;
// 
////         /* first recur on left child */
////         printInorder(node.left);
// 
////         /* then print the data of node */
////         System.out.print(node.key + " ");
// 
////         /* now recur on right child */
////         printInorder(node.right);
////     }
// 
////     // Wrappers over above recursive functions
////     void printInorder() { printInorder(root); }
//	
//// 	void printPreorder(Node node)
////     {
////         if (node == null)
////             return;
// 
////         /* first print data of node */
////         System.out.print(node.key + " ");
// 
////         /* then recur on left subtree */
////         printPreorder(node.left);
// 
////         /* now recur on right subtree */
////         printPreorder(node.right);
////     }
// 
////     // Wrappers over above recursive functions
////     void printPreorder() { printPreorder(root); }
// 
//
//// 	public static void main(String[] args) {
//		
//// 		BinaryTree t = new BinaryTree();
//// 		Node n1 = new Node("Midnight");
//// 		t.root = n1;
//// 		t.root.left = new Node("Sunrise");
//// 		t.root.right = new Node("Sunset");
//// 		t.root.left.left = new Node("Twilight");
//// 		t.root.left.right = new Node("Dawn");
//		
//// 		System.out.println("------------------------- ");
//// 		System.out.println("\nBinary Tree size:\n ");
//// 		System.out.println(t.size());
//		
//// 		System.out.println("------------------------- ");
//// 		System.out.println("\nBinary Tree height:\n ");
//// 		System.out.println(t.height());
//		
//// 		System.out.println("------------------------- ");
//// 		System.out.println("\nBinary Tree nodes:\n ");
//// 		t.printNodes();
//// 		System.out.println("\n\n------------------------- ");
//
//// 		BinaryTree tree = new BinaryTree();
////         tree.root = new Node("A");
////         tree.root.left = new Node("B");
////         tree.root.right = new Node("C");
////         tree.root.left.left = new Node("D");
////         tree.root.left.right = new Node("E");
//
//// 		System.out.println(
////             "\nPostorder traversal of binary tree is ");
////         tree.printPostorder();
//// 		System.out.println("\n\n------------------------- ");
//
//// 		System.out.println(
////             "\nInorder traversal of binary tree is ");
////         tree.printInorder();
//
//// 		System.out.println("\n\n------------------------- ");
//// 		System.out.println(
////             "Preorder traversal of binary tree is ");
////         tree.printPreorder();
//// 	}
//// }
//
