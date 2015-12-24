package com.raju.ds;

/*
Known for its simplicity, the selection sort algorithm 
starts by finding the minimum value in the array and moving 
it to the first position. This step is then repeated for the
 second lowest value, then the third, and so on until the array 
 is sorted. The selection sort's computational complexity is O(n2).
 Although selection sort, bubble sort, insertion sort,
 and gnome sort all have the same computational complexity,
 selection sort typically performs better than bubble sort
 and gnome sort, but not as well as insertion sort. Heapsort 
 greatly improves on the selection sort algorithm by using an 
 implicit heap data structure to speed up finding and removing
 the next lowest value. This enhancement has the potential to 
 change the computational complexity to O(n log n).
     
*/

public class SelectionSort {

	public static void main(String[] args) {
		 int a [] = {1,9, 5, 3};
         display(a);
         sort(a);
         display(a);
         
	}

	public static void display(int a[]){
		for (int i = 0 ; i < a.length; i ++){
			System.out.print(a[i] +"|");
		}
	}
	public static void sort(int a[]){
		int N = a.length;
		
		for(int i = 0; i < N; i++){
			int min = i;
			
			for(int j = i+1; j < N; j++){
		         System.out.println("element "+a[i]);
		         if(a[j] < a[min]){
		        	 swap(a, min, j);
					
				}
			}
		}
	}
	
	public static void swap(int a[], int min, int j){
		int temp = a[j];
		 a[j] = a[min];
		 a[min] = temp; 
		
	}
}
