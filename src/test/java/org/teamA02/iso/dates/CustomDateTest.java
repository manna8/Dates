package org.teamA02.iso;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomDateTest {

	/**
	 * Test method for {@link org.teamA02.iso.CustomDate#IsLeap()}.
	 * For this test method we have used the test suite using each use
	 */
	@Test
	public void TestIsLeap(){
		
		assertTrue(new CustomDate(15,5,1992).IsLeap());
		assertTrue(new CustomDate(28,6,1600).IsLeap());
		assertFalse(new CustomDate(29,2,1600).IsLeap());
		assertFalse(new CustomDate(29,1,2021).IsLeap());
		
		try{
			assertTrue(new CustomDate(-98, -8, -1712).IsLeap());
			fail("Se esperaba excepcion IllegalArgument");
		  } catch(IllegalArgumentException e) {}
		try {
			assertTrue(new CustomDate(200,6,300).IsLeap());
			fail("Se esperaba excepcion IllegalArgument");
		  } catch(IllegalArgumentException e) {}
	}
	
	/**
	 * Test method for {@link org.teamA02.iso.CustomDate#DayWithinMonth()}.
	 *  * For this test method we have used some test cases from the test suite using pairwise
	 */
	@Test
	public void TestDayWithinMonth() {
		
		assertTrue(new CustomDate(15,6,1992).DayWithinMonth());
		assertTrue(new CustomDate(28,2,1600).DayWithinMonth());
		try{
			assertTrue(new CustomDate(29,-8,-1712).DayWithinMonth());
			fail("Se esperaba excepcion IllegalArgument");
		  } catch(IllegalArgumentException e) {}
		try{
			assertTrue(new CustomDate(-98,-8,2021).DayWithinMonth());
			fail("Se esperaba excepcion IllegalArgument");
		  } catch(IllegalArgumentException e) {}
		try{
			assertTrue(new CustomDate(200,2,1992).DayWithinMonth());
			fail("Se esperaba excepcion IllegalArgument");
		  } catch(IllegalArgumentException e) {}
		try{
			assertTrue(new CustomDate(30,-8,300).DayWithinMonth());
			fail("Se esperaba excepcion IllegalArgument");
		  } catch(IllegalArgumentException e) {}
		try{
			assertTrue(new CustomDate(31,-8,1992).DayWithinMonth());
			fail("Se esperaba excepcion IllegalArgument");
		  } catch(IllegalArgumentException e) {}
		assertFalse(new CustomDate(31,2,300).DayWithinMonth());
		assertTrue(new CustomDate(30,6,2021).DayWithinMonth());
		assertTrue(new CustomDate(30,5,1992).DayWithinMonth());
		assertTrue(new CustomDate(28,6,300).DayWithinMonth());
		assertTrue(new CustomDate(29,2,2021).DayWithinMonth());
	}
}
