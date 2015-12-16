package com.raju.ds;

public class StackImplementation {

	private Node6 first = null;
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void push(int item){
		
		Node6 oldFirst = first;
		first = new Node6();
		first.data = item;
		first.next   = oldFirst;
	}
	
	
	public int pop(){
		int item = first.data;
		first = first.next;
		return item;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackImplementation stack = new StackImplementation();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		
	}
	
//	public void display(Node first){
//		if(first != null){
//			System.out.println(first.data);
//		}
//		if(first.next != null)
//		 display(first.next);
//			
//		}
	
	
	
}
	class Node6{
		int data;
		Node6 next;
	}


