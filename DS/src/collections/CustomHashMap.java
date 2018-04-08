/**
 * 
 */
package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Apr 8, 2018
 */
public class CustomHashMap<K,V> {

	private final static int CAPACITY = 16;
	
	Entry<K,V>[] table; // array of entry
	
	static class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K key, V value, Entry<K,V> next ){
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public CustomHashMap(){
		table = new Entry[CAPACITY]; // K,V - cann't generate custom size of map.entry
	}
	
	
	
	public void put(K key, V value){
		if(key == null) return; // if key is null, dont insert
		
		// get hash code
		int hash = hash(key);
		
		Entry<K,V> entry = new Entry<K,V>(key,value, null);
		
		if(table[hash] == null){ // entry is not in the table , insert new entry in the hash table
			table[hash] = entry;
		}else{
			Entry<K,V> previous = null;
			Entry<K,V> current = table[hash];
			while(current != null){
				 if(current.key.equals(key)){
					 if(previous == null){ // node has to be inserted at first of the bucket
						 entry.next = current.next;
						 table[hash] = entry;
						 return;
					 }else{
						 entry.next = current.next;
						 previous.next = entry;
						 return;
					 }
				 }
				 current = current.next;
				 previous = current;
			}
			previous.next = entry;
			
		}
	}
	
	
	public V get(K key){
		int hash = hash(key);
		if(table[hash] == null){
			return null;
		}
		
		Entry<K,V> temp = table[hash];
		while(temp!=null){
			  if(temp.key.equals(key)){
				  return temp.value;
			  }
			  temp = temp.next;
		}
		
		
		return null;
	}
	
	
	public boolean remove(K key){
		int hash = hash(key);
		if(table[hash] == null){
			return false;
		}
		
		Entry<K,V> current = table[hash];
		Entry<K,V> previous = null;
		while(current != null){
			if(current.key.equals(key)){
				  if(previous == null){
				  table[hash] = table[hash].next;
			      return true;
			      }else{
				  previous.next = current.next;
			 	  return true;
			   }
			}  
		   previous = current;
		   current = current.next;
		  
		}
		return false;
	}
	
	public int hash(K key){
		return Math.abs(key.hashCode() % CAPACITY);
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CustomHashMap<Integer, String> map = new CustomHashMap<Integer,String>();
		
		//Map<Integer,String> hashMap = new HashMap<Integer,String>();
		
		map.put(1, "Sriram");
		map.put(2, "Sita");
		map.put(3, "Laxman");
		map.put(4,  "Hanuman");
		map.put(5, "Ravan");
		
		System.out.println(map.get(1));
		
	  
		
	}

}
