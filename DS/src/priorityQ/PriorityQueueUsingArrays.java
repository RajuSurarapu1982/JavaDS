/**
 * 
 */
package priorityQ;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Mar 27, 2018
 */
public class PriorityQueueUsingArrays {

	int maxSize;
	int[] array;
	int nItems;
	
	public PriorityQueueUsingArrays(int size){
		this.maxSize = size;
		this.array = new int[maxSize];
		this.nItems = 0;
	}
	
	
	public void insert(int item){
		
		if(nItems == 0){ // no items 
			array[nItems++]= item;
		}else{ // compare item with existing array elements and move one level up if required.
			int j;
			for( j = nItems -1; j >= 0; j--){
				  if(item > array[j]){
					  array[j+1] = array[j]; 
				  }else{
					 break; 
				  }
			}
			
			array[j+1] = item;
			nItems++;
				
			}
			
		}
	
	public int remove(){  // remove minimum item
		return array[--nItems];
	}
	
	public int peekMin(){
		return array[nItems - 1];
	}
	
	public boolean isFull(){
		return (maxSize == nItems);
	}
	
	public boolean isEmpt(){
		return (nItems == 0);
	}
	
	
	public static void main(String[] args){
		PriorityQueueUsingArrays pq = new PriorityQueueUsingArrays(5);
		pq.insert(30);
		pq.insert(40);
		pq.insert(10);
		pq.insert(80);
		pq.insert(50);
		
		while(!pq.isEmpt()){
			System.out.println(pq.remove());
		}
		
		
		
		
	}
	
}
