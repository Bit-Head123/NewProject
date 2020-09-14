package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Arithmetic;

public class TestArithmetic {
	    private Arithmetic arth;
		
		@Before
		public void init() {
			arth = new Arithmetic();
		}
		
		
		@Test
		public void testSum() {
			assertEquals(10,arth.sum(4, 6));
		}
		
		@Test
		public void testSub() {
			assertEquals(50, arth.sub(90, 100));
		}
		
		@Test
		public void testMul() {
			assertEquals(50, arth.mul(5, 10));
		}
		
		@Test
		public void testRem() {
			assertEquals(6, arth.mul(50, 8));
		}
		
	
	
}