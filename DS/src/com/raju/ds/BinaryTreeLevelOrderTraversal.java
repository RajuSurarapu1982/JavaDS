package com.raju.ds;
//Given a Binary Tree, Print each level in separate line
public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node2 root = new Node2(1);
		root.left = new Node2(2);
		root.right = new Node2(3);
		root.left.left = new Node2(4);
		root.left.right = new Node2(5);
		root.right.left = new Node2(6);
		root.right.right = new Node2(7);
		
		levelOrderTraversal(root);
	}
	
	public static void levelOrderTraversal(Node2 root){
		int height = getHeight(root);
		for( int  i = 1; i<=height; i++){
			printEachLevel(root, i);
			System.out.println("");

		}
	}
	
	// get the height of the root
	public static int getHeight(Node2 root){
		if(root == null) return 0;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}
	
	
	public static void printEachLevel(Node2 root, int height){
		if(height == 1) {
			System.out.print(root.data);
		}else{
			printEachLevel(root.left, height -1);
			printEachLevel(root.right, height -1);
		}	
	}
}

class Node2{
	int data;
	Node2 left;
	Node2 right;
	
	public Node2(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	
}