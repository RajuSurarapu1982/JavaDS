package Stacks;


import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Mar 25, 2018
 */

public class StackUsingLinkedListTest {

	@Test
	public void testStack() {
		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<Integer>();
		for(int i = 0; i< 5; i++)
		stack.push(i);
		
		while(!stack.isEmpty()){
			assertNotNull(stack.pop());
		}
		
	}

}
