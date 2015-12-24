package com.raju.ds;

/*
Bubble sort is also known as exchange sort.
 Bubble sort is a simplest sorting algorithm. 
 In bubble sort algorithm array is traversed from 0 to the length-1 
 index of the array and compared one element to the next element 
 and swap values in between if the next element is less than the
  previous element. In other words, bubble sorting algorithm 
  compare two values and put the largest value at largest index. 
  The algorithm follow the same steps repeatedly until 
  the values of array is sorted. In worst-case the complexity of 
  bubble sort is O(n2) and in  best-case the complexity of bubble 
  sort is Ω(n).
  */

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {30,40,5,4,6,6};
		display(a);
		bubbleSort(a);
		display(a);

	}

	public static void display(int a[]){
		for(int i : a){
			System.out.print(i +"|");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int a[]){
		
		int N = a.length;
		for(int i = 0; i < N; i++){
			
			for(int j = 1;  j < (N-i) ; j++){
				System.out.println(a[j] +" "+a[j-1]);
				if(a[j-1] > a[j] ){
				   
					swap(a, j, j-1);
					
				}
			}
			
		}
	}
	
	public static void swap(int a[], int greater, int lesser){
		int temp = a[lesser];
		a[lesser] =a [greater];
		a[greater] = temp;
		
	}
}
