package com.raju.ds;

import java.util.LinkedList;
import java.util.Queue;

public class SortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1,2,3,4,5,6,7,8,9};
		Node3 root = formBinaryTree(array,0, array.length-1);
		System.out.println("Display all the nodes in tree");
		displayTree(root);
		
		System.out.println("Display level wise all the nodes in tree");
		displayNodesForEachLevel(root);

	}

	public static Node3 formBinaryTree(int array[], int start, int end){
		if(start>end){
			return null;
		}

		int middle = (start + end ) / 2;
		Node3 root = new Node3(array[middle]);
		root.left = formBinaryTree(array, start, middle-1);
		root.right = formBinaryTree(array, middle+1, end);
		return root;
	}
	// display all nodes
	public static void displayTree(Node3 root){
		if(root != null)  {
		  displayTree(root.left);
		  System.out.println(root.data);
		  displayTree(root.right);
		}
	}
	
	// display level at each level.using linkedList
	
	public static void displayNodesForEachLevel(Node3 root){
		int levelNodes = 0;
		Queue<Node3> queue = new LinkedList<Node3>();
		
		if(root != null){
			queue.add(root);
		}
		
		while(!queue.isEmpty()){
			
			levelNodes = queue.size();
			
			while(levelNodes > 0){
				Node3 node = queue.remove();
				System.out.print(node.data);
				
				if(node.left != null)queue.add(node.left);
				if(node.right !=null)queue.add(node.right);
				//displayNodesForEachLevel(node.left);
				//displayNodesForEachLevel(root.right);
				levelNodes --;
			}
			System.out.println("");
		}
	}
	
	
}

class Node3{
	int data ;
	Node3 left;
	Node3 right;
	
	public Node3(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		
	}
}