/**
 * 
 */
package Stacks;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Mar 25, 2018
 */
public class Element<T> {
	
	private T data;
	private Element<T> next;
	
	public T getData(){
		return data;
	}
	
    public Element<T> getNext(){
    	return this.next;
    }
    
    public Element(T data, Element<T> next){
    	this.data = data;
    	this.next = next;
    }

}
