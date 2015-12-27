package com.raju.ds;



public class MergeSort {

	private static int[] array = {9,4,3,2};
	private static int[] aux  ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       aux = new int [array.length];
		display(array);
		sort(0, array.length -1);
		
		
		System.out.println("Final display after sort");
		display(array);

	}
	
	public static void sort(int low, int heigh){
		for(int i= 0; i <= array.length-1; i++){
        	aux[i] = array[i];
        	
        }
		
		System.out.println("sort " + low + ": " +heigh);
		if(low < heigh){
			
			int mid = low + ((heigh - low )) / 2;
			System.out.println("mid >> "+mid);
	        sort(low, mid);
	        sort(mid +1, heigh);
			//merge(low, mid, heigh);
	        mergeSortUsingAlterPrimaryAuxArray(array,aux, low, mid, heigh);
			
		}
	}
 /*
	Using Aux­il­iary Array with copy­ing data – In 
	this approach you wont cre­ate new array every­time
	for merg­ing instead you cre­ate Aux­il­iary array.
	This will save mem­ory for you.
	*/
	public static void merge(int low, int mid, int heigh){
		System.out.println("low>> "+ low+": mid >> "+mid + "heigh >> "+heigh);
		        for(int i= low; i <= heigh; i++){
		        	aux[i] = array[i];
		        	
		        }
		        System.out.println("Aux array >>>");
		        display(aux);
		        System.out.println("Aux array END >>>");
		        int i = low; // start index of aux array
		        int j = mid+1; // mid +1 index of aux array
		        int k = low; // start index of actual array
		        
		        while(i <= mid && j <= heigh){
		        	System.out.println(aux[i] + " : "+aux[j]);
		        	if(aux[i] <= aux[j]){
		        		array[k] = aux[i];
		        		i++;
		        	}else{
		                array[k] = aux[j];
		                j++;
		        	}
		        	k++;
		        }
		        
		       
			      display(array);
			       
			      System.out.println("Before next while "); 
				   
		        while(i <=mid){
		        	array[k] = aux[i];
		        	i++;
		        	k++;
		        }
		      System.out.println("Actual array K>>> "+k); 
		      display(array);
		      System.out.println("Actual array end >>> "+k); 
		      
	}
	
	/*
	Alter­nate Merg­ing Between Pri­mary and Aux­il­iary Array:
	 This is the best approach for merg­ing. You don’t copy the 
	 entire array to aux­il­iary array for merg­ing instead you 
	 do alter­nate merg­ing between main array and aux­il­iary array
	 */
	
	public static void mergeSortUsingAlterPrimaryAuxArray(int actual[], int aux[], int low, int mid, int heigh){
		int i = low;
		int j = mid+1;
		int k = low;
		
		while(i <= mid && j <= heigh){
			if(aux[i] <= aux[j]){
				actual[k] = aux[i];
				i++;
			}else {
				actual[k] = aux[j];
				j++;
			}
			k++;
		}
		
		while(i <= mid){
			actual[k] = aux[i];
			k++;
			i++;
		}
		
		while(j<=heigh){
			actual[k] = aux[j];
			k++;
			j++;
		}
		display(actual);
		
		display(aux);
	}
	
	
	
	public static void display(int a[]){
		for(int i : a){
			System.out.print(i +"|");
		}
		System.out.println();
	}
}
