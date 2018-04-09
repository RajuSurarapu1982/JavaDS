/**
 * 
 */
package collections;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Apr 8, 2018
 */
public class CustomArrayListTest {

	@Test
	public void testCustomArrayList() {
		CustomArrayList<Integer> arrayList = new CustomArrayList<Integer>(Integer.class);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		assertEquals(3, arrayList.size());
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void testCustomArrayListException() {
		CustomArrayList<Integer> arrayList = new CustomArrayList<Integer>(Integer.class);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.get(4);
	}
}
