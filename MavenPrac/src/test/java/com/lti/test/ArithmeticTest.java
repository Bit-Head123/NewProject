package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.ArithmeticDivide;

public class ArithmeticTest {
	private ArithmeticDivide darc;
    
    @Before
    public void init()
    {
   	 darc =new ArithmeticDivide();
    }
    
    @Test
    public void testdivision()
    {
   	 assertEquals(2,darc.divide(6,3) );
    }
    
    @Test
    public void testmultiply()
    {
   	 assertEquals(24,darc.multiply(6,4)); 
    }
}
