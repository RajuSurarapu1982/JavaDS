/**
 * 
 */
package Stacks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Mar 25, 2018
 */
public class ParsingAirthmeticExpressionUsingStack {

	// Using 
	static Map<Character, Character> parentMap = new HashMap<Character,Character>();
	static Set<Character> openingSet = new HashSet<Character>();
	
	static{
		parentMap.put(']','[');
		parentMap.put('}', '{');
		parentMap.put('(', '(');
		openingSet.addAll(parentMap.values());
	}
	public boolean isExpressionValid(String str){
		StackUsingLinkedList<Character> stack = new StackUsingLinkedList<Character>();
		
		for(int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(openingSet.contains(ch)){
				stack.push(ch);
			}
			
			if(parentMap.containsKey(ch)){
				 char chx = stack.pop();
				 if(chx!=parentMap.get(ch)){
					 return false;
				 }
			}
			
		}
		
		if(!stack.isEmpty()) return false;
		
		
		return true;
		
	}
	
}
