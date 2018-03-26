package Stacks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;

public class StackUsingArraysTest {

	@Test
	public void testStackPush() throws Exception{
		StackUsingArrays stack = new StackUsingArrays(5);
		for(int i = 0; i < 5; i++)
		stack.push(i);
		assertEquals(stack.size(),5);
		stack = null;
		
	}
	
	@Test
	public void testStackPop() throws Exception{
		StackUsingArrays stack = new StackUsingArrays(5);
		for(int i = 0; i < 5; i++)
		stack.push(i);
		while(!stack.isEmpty()){
			assertNotNull(stack.pop());
		}
		stack = null;
		
	}
	
	@Test(expected = StackOverFlowException.class)
	public void testStackOverFlow()throws Exception{
		StackUsingArrays stack = new StackUsingArrays(5);
		for(int i = 0; i < 6; i++)
		stack.push(i);
		stack = null;
		
	}
	
	@Test(expected = StackUnderFlowException.class)
	public void testStackUnderFlow()throws Exception{
		StackUsingArrays stack = new StackUsingArrays(5);
		stack.push(1);
		stack.pop();
		stack.pop();
		stack = null;
		
	}

}
