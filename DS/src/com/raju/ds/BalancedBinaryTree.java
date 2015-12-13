package com.raju.ds;

//check whether given binary tree as balanced or not


public class BalancedBinaryTree {

	public static void main(String[] args) {
		 Node1 root = new Node1(1);
		 root.left = new Node1(2);
		 root.right = new Node1(3);
		 root.left.left = new Node1(4);
		 root.left.right = new Node1(5);
		 root.right.left = new Node1(6);
		 root.right.right = new Node1(7);
		 root.right.right.left = new Node1(8);
		 root.right.right.left.left = new Node1(9);
		 
		 System.out.println(getHeight(root));
		 
		 System.out.println(isBalancedTree(root));
	}
    
	//for each node of the tree, get the height of left sub­tree
	//and right sub­tree and check the dif­fer­ence ,
	//if it is greater than 1, return false. 
	
	static int getHeight(Node1 root){
		if(root == null) return 0;
		
		return (Math.max(getHeight(root.left), getHeight(root.right))+1);
	}
	
	static boolean isBalancedTree(Node1 root){
		if(root == null) return true;
		
		int differenceHeight = getHeight(root.left)- getHeight(root.right);
		
		if(differenceHeight > 1){
			return false;
		}else {
			return isBalancedTree(root.left) && isBalancedTree(root.right);
		}
		
	}
}


class Node1{
	Node1 root;
	Node1 left;
	Node1 right;
	int data;
	
	public Node1(int data){
		this.data = data;
		 
		this.left = null;
		this.right = null;
	}
}