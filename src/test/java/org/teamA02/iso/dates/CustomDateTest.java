package org.teamA02.iso;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomDateTest {

	@Test
	public void TestIsLeap(){
		
		assertTrue(new CustomDate(15,5,1992).IsLeap());
		assertTrue(new CustomDate(28,6,1600).IsLeap());
		assertFalse(new CustomDate(29,2,1600).IsLeap());
		assertFalse(new CustomDate(30,5,2021).IsLeap());
		
		try{
			assertTrue(new CustomDate(-98, -8, -1712).IsLeap());
			fail("Se esperaba excepcion IllegalArgument");
		  } catch(IllegalArgumentException e) {}
		try {
			assertTrue(new CustomDate(200,6,300).IsLeap());
			fail("Se esperaba excepcion IllegalArgument");
		  } catch(IllegalArgumentException e) {}
	}
	
	@Test
	public void TestDayWithinMonth() {
		
	}
}
