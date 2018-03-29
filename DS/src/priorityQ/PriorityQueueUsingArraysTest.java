/**
 * 
 */
package priorityQ;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Raju Surarapu
 *
 * github:https://github.com/RajuSurarapu1982
   Mar 29, 2018
 */
public class PriorityQueueUsingArraysTest {

	@Test
	public void testPQInsert() {
		PriorityQueueUsingArrays pq = new PriorityQueueUsingArrays(5);
		pq.insert(50);
		pq.insert(60);
		pq.insert(10);
		pq.insert(20);
		pq.insert(40);
		
	   assertEquals(pq.isFull(), true);
	}

	@Test
	public void testPQMin() {
		PriorityQueueUsingArrays pq = new PriorityQueueUsingArrays(5);
		pq.insert(50);
		pq.insert(60);
		pq.insert(10);
		pq.insert(20);
		pq.insert(40);
		
	   assertEquals(pq.peekMin(), 10);
	}

}
