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
public class CustomHashMapTest {

	@Test
	public void testHashMapPut() {
		CustomHashMap<String, String> map = new CustomHashMap<String,String>();
		map.put("raju", "Surarapu");
		assertEquals("Surarapu", map.get("raju"));
		
	}

}
