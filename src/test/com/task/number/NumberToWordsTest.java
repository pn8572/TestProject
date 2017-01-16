package test.com.task.number;

import org.junit.Test;

import com.task.number.NumberToWords;

import junit.framework.TestCase;

public class NumberToWordsTest  extends TestCase {

	NumberToWords NumberToWordsObj;
	String displayWords;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		NumberToWordsObj = new NumberToWords();
	}
	
	@Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
	
	@Test
	public void testAcceptance() throws Exception {
	  
		displayWords = NumberToWordsObj.convert(12);
        assertNotNull(NumberToWordsObj.displayWords);
        assertEquals("twelve", displayWords);
	}
	
	
}
