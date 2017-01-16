package test.java.com.task.sorting;

import java.com.task.sorting.Sorting;
import java.util.List;

import junit.framework.TestCase;

/**
 * 
 * @author prasanth.pillai
 *
 */
public class SortingTest extends TestCase {
	
	Sorting sortObj;
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	  @Override
	    protected void tearDown() throws Exception {
	        super.tearDown();
	    }

	  public void testAcceptance() throws Exception{
	        List<Integer> result = sortObj.addToDraw(1);
	        assertNotNull(result);
	        assertEquals(1, result.size());
	        assertEquals(1, (int)result.get(0));
	  }
}
