package test.com.task.sorting;

import java.util.List;

import org.junit.Test;

import com.task.sorting.Sorting;

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
		sortObj = new Sorting();
	}
	
	  @Override
	    protected void tearDown() throws Exception {
	        super.tearDown();
	    }
	  @Test
	  public void testAcceptance() throws Exception{
		  
	        List<Integer> result = sortObj.addToDraw(1);
	        assertNotNull(result);
	        assertEquals(1, result.size());
	        assertEquals(1, (int)result.get(0));
	        
	      //add to a higher position
	        result = sortObj.addToDraw(20);
	        assertEquals(20, (int)result.get(1));
	        
	        //add to a lower position
	        sortObj.addToDraw(3);
	        assertNotNull(sortObj.numbers);
	        assertEquals(3, sortObj.numbers.size());
	        assertEquals(3, (int)sortObj.numbers.get(1));
	        
	        // value 	 position
	        // ======================
	        //  1			0
	        //  3			1
	        //	20			2
	        
	        
	        // add in a sequence
	        sortObj.addToDraw(15);
	        sortObj.addToDraw(5);
	        sortObj.addToDraw(20);
	        sortObj.addToDraw(7);
	        sortObj.addToDraw(30);

	        assertEquals(5, (int)sortObj.numbers.get(2));
	        assertEquals(7, (int)sortObj.numbers.get(3));
	        assertEquals(15, (int)sortObj.numbers.get(4));
	        assertEquals(20, (int)sortObj.numbers.get(5));
	        assertEquals(20, (int)sortObj.numbers.get(6));
	        assertEquals(30, (int)sortObj.numbers.get(7));
	        
	        
	        
	  }
}
