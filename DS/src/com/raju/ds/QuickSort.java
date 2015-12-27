package com.raju.ds;

/*
Approach:
◾Choose any ele­ment from the array and call it as pivot ele­ment, Exam­ple here we have selected mid­dle ele­ment as pivot
◾Place all the ele­ments smaller than pivot in the left side of pivot.
◾Place all the ele­ments greater than pivot in the right side of pivot.
◾Sort left side and right side recursively
*/
public class QuickSort {
	
	private static int[] array = {9,5,3,5,6};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(0, array.length-1);
		display(array);

	}
	
	public static void quickSort(int low, int heigh){
		
		int left =  low;
		int right = heigh;
		int mid =  (heigh + low) / 2;
		
		int pvot = array[mid];
		
		while(left <= right){
			
			while(array[left] < pvot){
				left ++;
			}
		
			while(array[right] > pvot){
				right --;
			}
		
		
			if(left <= right){
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left ++;
				right --;
			}
		
			
	    }
		if(low < right){
			quickSort(low, right);
		}
	    if(left < heigh){
	    	quickSort(left, heigh);
	    }
	}
	
	public static void display(int[] a){
		for(int i : a){
			System.out.print(i +"|");
		}
	}
}
