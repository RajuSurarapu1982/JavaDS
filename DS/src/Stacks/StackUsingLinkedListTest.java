package Stacks;

import static org.junit.Assert.*;

import org.junit.Test;

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
