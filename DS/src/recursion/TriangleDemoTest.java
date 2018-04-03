/**
 * 
 */
package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Apr 2, 2018
 */
public class TriangleDemoTest {

	@Test
	public void testTriangleIteration() {
		/*
		    *
		    * *
		    * * *
		    * * * *
		    * * * * *
		 */
		int a = TriangleDemo.triangeUsingColumnBasedIteration(5);
		assertEquals(a, 15);
		
	}

	@Test
	public void testTriangleRecursion() {
		/*
		    *
		    * *
		    * * *
		    * * * *
		    * * * * *
		 */
		int a = TriangleDemo.triangleUsingRecursion(5);
		assertEquals(a, 15);
		
	}
}
