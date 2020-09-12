package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Arithmetic;

public class testArithmetic {
	    private Arithmetic arth;
		
		@Before
		public void init() {
			arth = new Arithmetic();
		}
		
		
		@Test
		public void testSum() {
			assertEquals(10,arth.multiply(4, 6));
		}
		
		@Test
		public void testSub() {
			assertEquals(5, arth.div(5, 10));
		}
	
	
}