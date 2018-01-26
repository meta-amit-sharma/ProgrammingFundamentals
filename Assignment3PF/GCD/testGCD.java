package Session3.GCD;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testGCD {
  
	FindGCD findGCD=new FindGCD();
	
	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	                 { 1,2,1 } , { 2,2,0 } , { 1,100,3 } , { 0,0,0 }
	           });
	    }
	    
	    private int fInput1;
	    private int fInput2;
	    private int fExpected;

	    public testGCD(int expected, int input1, int input2) {
	        fInput1 = input1;
	        fInput2 = input2;
	        fExpected= expected;
	    }
	    
	    @Test
	    public void test() {
	        assertEquals(fExpected, findGCD.gcd(fInput1, fInput2));
	    }

}
