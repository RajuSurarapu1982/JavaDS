package Stacks;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Mar 25, 2018
 */

public class StackUsingArrays {

	private int maxSize;
	private int[] array;
	private int top;
	
	public StackUsingArrays(int size){
		maxSize =  size;
		array = new int[maxSize];
		top = -1;
	}
	
	public void push(int data)throws StackOverFlowException{
		if(isFull()){
			throw new StackOverFlowException();
		}
		array[++top] = data;
	}
	
	public int pop()throws StackUnderFlowException{
		if(isEmpty()){
			throw new StackUnderFlowException();
		}
		return array[top--];
	}
	
	public boolean isEmpty(){
		return (top == 0);
	}
	public boolean isFull(){
		return (top+1 == maxSize);
	}
	
	public int size(){
		return top+1;
	}
	public int peek(){
		return array[top];
	}
	
	
	
}



