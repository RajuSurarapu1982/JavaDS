/**
 * 
 */
package collections;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Apr 8, 2018
 */
public class CustomArrayList<T> {

	private final int CAPACITY  = 16;
	private T[] elementData;
	private int size;
	
	
	public CustomArrayList(Class<T> clazz){
		elementData = (T[])Array.newInstance(clazz, CAPACITY);
		size = 0;
	}
	
	public void add(T data){
		if(size == elementData.length)
			ensureCapacity();
		elementData[size] = data;
		size++;
	}
	
	
	public T get(int index){
		if(index > size ) throw new IndexOutOfBoundsException("Exception");
		return elementData[index];
	}
	
	
	public T remove(int index){
		 if( index > size || index < 0) throw new IndexOutOfBoundsException("Index out of bounds error");
		 
		  T element = elementData[index];
		  for(int i = index; i < size -1; i++){
			  elementData[i] = elementData[i+1];
		  }
		  size--;
		 return element; 
		 }
	
	
	public int size(){
		return size;
	}
	
	private void ensureCapacity(){
		elementData = Arrays.copyOf(elementData, size *2);
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomArrayList<Integer> arrayList = new CustomArrayList<Integer>(Integer.class);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
	   System.out.println(arrayList.size());
		
	}
	
	

}
