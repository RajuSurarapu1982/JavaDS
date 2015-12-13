package com.raju.ds;

import java.util.LinkedList;
import java.util.Queue;

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
		
		// print each level using for loop
		levelOrderTraversal(root);
		
		// print each level using LinkedList 
		
		printEachLevelUsingQueue(root);
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
	
	/*Bet­ter Solution : 
		◾Cre­ate a ArrayList of Linked List Nodes
		◾Do the level order tra­ver­sal using queue(Breadth First Search). 
		◾For get­ting all the nodes at each level, before you take out a node from queue, store the size of the queue in a vari­able, say you call it as levelNodes.
		◾Now while levelNodes>0, take out the nodes and print it and add their chil­dren into the queue.
		◾After this while loop put a line break.
      */
	
	public static void printEachLevelUsingQueue(Node2 root){
		int levelNodes = 0;
		Queue<Node2> queue = new LinkedList<Node2>();
		if(root != null){
			queue.add(root);
		}
		
		while(!queue.isEmpty()){
			levelNodes = queue.size();
			
			while(levelNodes > 0){
				
				Node2 node = queue.remove();
				System.out.print(node.data);
				
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
				
				levelNodes --;
			}
			System.out.println("");
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