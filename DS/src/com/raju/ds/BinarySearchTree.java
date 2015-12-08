package com.raju.ds;

public class BinarySearchTree {

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(15);
		root.right = new Node(25);
		root.left.left = new Node(10);
		root.left.right = new Node(16);
		root.right.left = new Node(22);
		root.right.right = new Node(35);

		BinarySearchTree tree = new BinarySearchTree();

		System.out.println("Height Of a Binary Tree "+
		tree.heightOfTree(root));
		//
		// System.out.println("Height Of a Left Binary Tree "+
		// tree.heightOfTree(root.left));
		//
		// System.out.println("Height Of a Right Binary Tree "+
		// tree.heightOfTree(root.right));
		//
		// Find element
		System.out.println("BEFORE INSERTION ... ");
		tree.display(root);
		// System.out.println(tree.findElement(35, root));

		tree.insertElement(45, root);
		System.out.println("AFTER INSERTION ... ");
		// System.out.println(tree.findElement(45, root));

		tree.display(root);
	}

	private int heightOfTree(Node root) {
		if (root == null) {
			return -1;
		}
		int height = Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
		return height;
	}

	/*
	 * Very much sim­i­lar to find() operation. To insert a node our first
	 * task is to find the place to insert the node. Take cur­rent = root .
	 * start from the cur­rent and com­pare root.data with n if current.data
	 * is greater than n that means we need to go to the left of the root. if
	 * current.data is smaller than n that means we need to go to the right of
	 * the root. if any point of time cur­rent is null that means we have
	 * reached to the leaf node, insert your node here with the help of par­ent
	 * node. (See code) BST Insert() BST Insert()
	 */

	private boolean findElement(int element, Node root) {
		// System.out.println(root);
		while (root != null) {
			if (root != null && root.data == element) {
				return true;
			} else if (root.data > element) {
				root = root.left;
			} else if (root.data < element) {
				root = root.right;
			}
		}
		return false;
	}

	/**
	 * Very much sim­i­lar to find() operation. To insert a node our first
	 * task is to find the place to insert the node. Take cur­rent = root .
	 * start from the cur­rent and com­pare root.data with n if current.data
	 * is greater than n that means we need to go to the left of the root. if
	 * current.data is smaller than n that means we need to go to the right of
	 * the root. if any point of time cur­rent is null that means we have
	 * reached to the leaf node, insert your node here with the help of par­ent
	 * node. (See code)
	 */

	public void insertElement(int element, Node root) {
		Node newNode = new Node(element);
		if (root == null) {
			root = newNode;
			return;
		}

		Node parent = null;
		Node current = root;

		while (true) {
			parent = current;
			System.out.println();
			if (current.data < element) {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			} else if (current.data > element) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			}
		}
	}

	public void display(Node root) {
		if (root != null) {
			System.out.print(" " + root.data);
			display(root.left);
			display(root.right);

		}

	}
}
class Node{
	Node left;
	Node right;
	int data;
	
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

