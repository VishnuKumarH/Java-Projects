package com.vishnu;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class Test2 {

Mathematics2 aut;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Before: setUp method is called");
		aut=new Mathematics2();
		aut.setNo1(3);
		aut.setNo2(3);
	}

	@After
	public void tearDown() throws Exception {
		aut=null;
		System.out.println("THis is after");
	}

	@Test
	public void testAdd() {		
		int actual = aut.add();
		assertEquals(6, actual);
	}

	@Test
	public void testSubtract() {		
		int actual = aut.subtract();
		assertEquals(0, actual);
	}

	@Test
	public void testProduct() {
		int actual = aut.product();
		assertEquals(9, actual);
	}

}
