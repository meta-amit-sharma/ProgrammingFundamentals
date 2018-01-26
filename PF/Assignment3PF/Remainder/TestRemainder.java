package Session3.Remainder;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestRemainder {
  
	FindRemainder findRem=new FindRemainder();
	
	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	                 { 0,2,1 } , { 0,2,0 } , { 1,100,3 } 
	           });
	    }
	    
	    private int fInput1;
	    private int fInput2;
	    private int fExpected;

	    public TestRemainder(int expected, int input1, int input2) {
	        fInput1 = input1;
	        fInput2 = input2;
	        fExpected= expected;
	    }
	    
	    @Test
	    public void test() {
	        assertEquals(fExpected, findRem.rem(fInput1, fInput2));
	    }

}
