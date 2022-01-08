package com.example.demo;

/**
 * {@link TreeTraversal} provides executable method to 
 * help understand tree traversal mechanism.  
 * @author [BN] sekarbala123@gmail.com
 *
 */
public class TreeTraversal {

	public static void main(String[] args) {
		/**
		 * The sample tree constructed below in code
		 * would be of this model
		 *  
		 * 			1
		 * 		 /	  \
		 * 		2		3
		 * 	  /   \
		 *   4     5
		 *  /
		 * 6
		 * 
		 */
		Node root = new Node("1");
		root.setLeft(new Node("2"));
		root.setRight(new Node("3"));
		
		root.getLeft().setLeft(new Node("4"));
		root.getLeft().setRight(new Node("5"));
		
		root.getLeft().getLeft().setLeft(new Node("6"));
		
		System.out.println("preOrderTraverseNode");
		preOrderTraverseNode(root);
		
		System.out.println("postOrderTraverseNode");
		postOrderTraverseNode(root);
		
		System.out.println("inOrderTraverseNode");
		inOrderTraverseNode(root);
	}
	
	/**
	 * Recursive way to traverse the way Tree Data structure 
	 * in a preOrder fashion.Typically <b>rootNode-leftNode-rightNode</b>
	 * order is followed.
	 * @param root {@link Node} from which the traversal operation 
	 * 				has to be followed
	 */
	public static void preOrderTraverseNode(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(String.format("Node: %s", root.getData()));
		preOrderTraverseNode(root.getLeft());
		preOrderTraverseNode(root.getRight());
	}
	
	/**
	 * Recursive way to traverse the way Tree Data structure 
	 * in a postOrder fashion. Typically <b>leftNode-RightNode-RootNode<b>
	 * order is followed
	 * @param root {@link Node} from which the traversal operation 
	 * 				has to be followed
	 */
	public static void postOrderTraverseNode(Node root) {
		if(root==null) {
			return;
		}
		postOrderTraverseNode(root.getLeft());
		postOrderTraverseNode(root.getRight());
		System.out.println(String.format("Node: %s", root.getData()));
	}

	/**
	 * Recursive way to traverse the way Tree Data structure 
	 * in a inOrder fashion. Typically leftNode-RootNode-RightNode
	 * order is followed
	 * @param root {@link Node} from which the traversal operation 
	 * 				has to be followed
	 */
	public static void inOrderTraverseNode(Node root) {
		if(root==null) {
			return;
		}
		inOrderTraverseNode(root.getLeft());
		System.out.println(String.format("Node: %s", root.getData()));
		inOrderTraverseNode(root.getRight());
	}
	
}

/**
 * 
 * {@link Node} is the core data model that hold the actually data
 * and the link to the child nodes. Here in our case, it only binary
 * tree is considered where only max of two child nodes can be linked
 * to any node.
 * 
 */
class Node{
	Node(String data){
		this.data = data;
	}
	private String data;
	private Node left;
	private Node right;
	public String getData() {
		return data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}
