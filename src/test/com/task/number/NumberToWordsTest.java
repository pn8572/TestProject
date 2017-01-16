package test.com.task.number;

import org.junit.Test;

import com.task.number.NumberToWords;

import junit.framework.TestCase;

public class NumberToWordsTest  extends TestCase {

	NumberToWords NumberToWordsObj;
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
	public void testNotNullAcceptance() throws Exception {
	  
		String displayWords = NumberToWordsObj.convert(12);
        assertNotNull(displayWords);
        assertEquals("twelve", displayWords);
	}
	
	@Test
	public void testAcceptance() throws Exception {
	  
		String displayWords = NumberToWordsObj.convert(12);
        assertEquals("twelve", displayWords);
        
        displayWords = NumberToWordsObj.convert(1049875);
        assertEquals("one million forty nine thousand eight hundred seventy five", displayWords);
        
        displayWords = NumberToWordsObj.convert(23212);
        assertEquals("twenty three thousand two hundred twelve", displayWords);
	}
}
