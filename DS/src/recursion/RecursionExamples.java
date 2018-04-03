/**
 * 
 */
package recursion;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Apr 2, 2018
 */
public class RecursionExamples {

	// Given a string, compute recursively (no loops) the number of lowercase
	// 'x' chars in the string.
	/*
	 * countX("xxhixx") → 4 countX("xhixhix") → 3 countX("hi") → 0
	 * 
	 */
	public static int countX(String str) {
		if (str.length() == 0) {
			return 0;
		}
		if (str.charAt(0) == 'x') {
			return 1 + countX(str.substring(1));
		}
		return countX(str.substring(1));

	}

	/*
	 * Given a string, compute recursively (no loops) the number of times
	 * lowercase "hi" appears in the string. countHi("xxhixx") → 1
	 * countHi("xhixhix") → 2 
	 * countHi("hi") → 1
	 */

	public static int countHi(String str) {

		if (str.length() < 2) {
			return 0;
		}
		if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
			return 1 + countHi(str.substring(2));
		}
		return countHi(str.substring(1));
	}

	/*
	 * Given a string, compute recursively (no loops) a new string where all the
	 * lowercase 'x' chars have been changed to 'y' chars.
	 * 
	 * 
	 * changeXY("codex") → "codey"
	 *  changeXY("xxhixx") → "yyhiyy"
	 * changeXY("xhixhix") → "yhiyhiy"
	 */

	public static String changeXY(String str) {
		if (str.length() == 0) {
			return str;
		}

		char ch = str.charAt(0);

		if (ch == 'x') {
			return 'y' + changeXY(str.substring(1));
		}
		return ch + changeXY(str.substring(1));

	}

	/*
	 * Given a string, compute recursively (no loops) a new string where all
	 * appearances of "pi" have been replaced by "3.14".
	 * 
	 * 
	 * changePi("xpix") → "x3.14x" changePi("pipi") → "3.143.14" changePi("pip")
	 * → "3.14p"
	 */

	public static String changePi(String str) {
		if (str.length() < 2) {
			return str;
		}

		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			return "3.14" + changePi(str.substring(2));
		}

		return str.charAt(0) + changePi(str.substring(1));
	}

	/*
	 * Given a string, compute recursively a new string where all the 'x' chars
	 * have been removed.
	 * 
	 * 
	 * noX("xaxb") → "ab" noX("abc") → "abc" noX("xx") → ""
	 */

	public String noX(String str) {

		if (str.length() == 0) {
			return str;
		}

		char ch = str.charAt(0);
		if (ch == 'x') {
			return noX(str.substring(1));
		}
		return ch + noX(str.substring(1));
	}

	/*
	 * Given an array of ints, compute recursively if the array contains a 6.
	 * We'll use the convention of considering only the part of the array that
	 * begins at the given index. In this way, a recursive call can pass index+1
	 * to move down the array. The initial call will pass in index as 0.
	 * 
	 * 
	 * array6([1, 6, 4], 0) → true array6([1, 4], 0) → false array6([6], 0) →
	 * true
	 */

	public boolean array6(int[] nums, int index) {

		if (index == nums.length)
			return false;

		if (nums[index] == 6) {
			return true;
		} else {
			return array6(nums, index + 1);
		}
	}

	/*
	 * Given an array of ints, compute recursively the number of times that the
	 * value 11 appears in the array. We'll use the convention of considering
	 * only the part of the array that begins at the given index. In this way, a
	 * recursive call can pass index+1 to move down the array. The initial call
	 * will pass in index as 0.
	 * 
	 * array11([1, 2, 11], 0) → 1 
	 * array11([11, 11], 0) → 2
	 * array11([1, 2, 3, 4],0) → 0
	 * 
	 */
	public int array11(int[] nums, int index) {
		if (nums.length == index) {
			return 0;
		}
		if (nums[index] == 11) {
			return 1 + array11(nums, index + 1);
		}

		return array11(nums, index + 1);
	}
	
	/*
	 * Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.


array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false

	 */
	public boolean array220(int[] nums, int index) {
		  
	    if(nums.length <= index+1){
	      return false;
	    }
	    
	    if(nums[index] * 10 ==  nums[index +1]){
	      return true;
	    }
	    return array220(nums, index +1);
	  
	}

	
	/*
	 * Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".


allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
	 */
	
	public String allStar(String str) {
	    if(str.length() <= 1){
	      return str;
	    }
	    
	    char ch = (char)str.charAt(0);
	    return ch+"" + '*'+""+ allStar(str.substring(1));
	}
	
	/**
	 * Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".


pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
	 */

	public String pairStar(String str) {
	     if(str.length() < 2){
	       return str;
	     }
	     
	     if(str.charAt(0) == str.charAt(1)){
	       return str.charAt(0)+"*"+pairStar(str.substring(1));
	     }
	     return str.charAt(0)+pairStar(str.substring(1));
	}

	
	/*
	 * Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.


endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
	 */
	public String endX(String str) {
	      if(str.length() == 0){
	        return str;
	      }
	      char ch = str.charAt(0);
	      if(ch == 'x'){
	        return endX(str.substring(1)) + ch;
	      }
	      return ch + endX(str.substring(1)) ;
	}
	
	/*
	 * We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.


countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1

	 */
	
	public int countPairs(String str) {
	    if(str.length()<3){
	      return 0;
	    }
	    if(str.charAt(0) == str.charAt(2)){
	      return 1 + countPairs(str.substring(1));
	    }
	    return countPairs(str.substring(1));
	}

	
}