/**
 * 
 */
package Stacks;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Mar 25, 2018
 */
public class ParsingAirthmeticExpressionUsingStackTest {

	@Test
	public void testDemlimeterTrue() {
		ParsingAirthmeticExpressionUsingStack stack = new ParsingAirthmeticExpressionUsingStack();
		String str = "[{a}]";
        boolean result = stack.isExpressionValid(str);
        assertEquals(true, result);
	}
	@Test
	public void testDemlimeterFalse() {
		ParsingAirthmeticExpressionUsingStack stack = new ParsingAirthmeticExpressionUsingStack();
		String str = "[[[[[{a}]}";
        boolean result = stack.isExpressionValid(str);
        assertEquals(false, result);
	}

}
