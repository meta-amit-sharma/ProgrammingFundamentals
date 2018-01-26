package Session3.LargestDigit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testLargestDigit {
  
	LargestDigit largDigt=new LargestDigit();
	
	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	                 { 9,1257369 } , { 4,444 } , { 2,2 }
	           });
	    }
	    
	    private int fInput;
	   
	    private int fExpected;

	    public testLargestDigit(int expected, int input) {
	        fInput = input;
	        fExpected= expected;
	    }
	    
	    @Test
	    public void test() {
	        assertEquals(fExpected, largDigt.largestdigit(fInput));
	    }

}
