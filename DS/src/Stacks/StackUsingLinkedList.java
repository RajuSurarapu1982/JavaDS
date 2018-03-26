package Stacks;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Mar 25, 2018
 */

public class StackUsingLinkedList<T> {

	private Element<T> top;
	int nItems = 0;
	
	public void push(T data){
		Element<T> e = new Element<T>(data, top);
		top = e;
		nItems++;
	}
	
	public T pop(){
		T data = top.getData();
		top = top.getNext();
		nItems--;
		return data;
	}
	
	 public T peek(){
		 return top.getData();
	 }
	
	public boolean isEmpty(){
		return (nItems == 0);
	}


}

//class Element<T>{
//	
//	private T data;
//	private Element<T> next;
//	
//	public T getData(){
//		return data;
//	}
//	
//    public Element<T> getNext(){
//    	return this.next;
//    }
//    
//    public Element(T data, Element<T> next){
//    	this.data = data;
//    	this.next = next;
//    }
//}
    

    
