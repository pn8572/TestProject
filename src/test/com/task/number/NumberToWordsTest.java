package test.com.task.number;

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
	
	
}
