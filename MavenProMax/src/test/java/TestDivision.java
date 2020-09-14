import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.DivisionArithmetic;

public class TestDivision {
     private DivisionArithmetic darc;
     
     @Before
     public void init()
     {
    	 darc =new DivisionArithmetic();
     }
     
     @Test
     public void testdivision()
     {
    	 assertEquals(2,darc.divide(6,3) );
     }
     
     @Test
     public void testmultiply()
     {
    	 assertEquals(22,darc.multiply(6,4)); 
     }
}
