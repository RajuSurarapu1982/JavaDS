/**
 * 
 */
package recursion;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Mar 31, 2018
 */
public class TriangleDemo {

	// There are 2 approaches to find the nth term of a Triangle
	// 1. Column based approach using iteration to find the triangular number
	// 2. Finding the nth term using Recursion
	
	//1. 

	public static  int  triangeUsingColumnBasedIteration(int cols){
		
		int total = 0;
		while(cols > 0){
			total += cols;
			cols--;
		}
		return total;
		
	}
	
	public static int triangleUsingRecursion(int n){
		if(n == 1){
			return 1;
		}
		
		return n + triangleUsingRecursion(n -1);
	}
	
	public static void main(String[] args){
		int a = triangeUsingColumnBasedIteration(5);
		int b = triangleUsingRecursion(5);
		System.out.println(a);
		System.out.println(b);
	}
	
}
