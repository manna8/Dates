package org.teamA02.iso.dates;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class CustomDateTest {
	
	private CustomDate wrongDate;
	private CustomDate correctDate;
	
	@Before
	public void setUp() throws Exception {
//		wrongDate = new CustomDate('k', 'z', 'l');
		
		correctDate = new CustomDate(23, 8, 2011);
	}
	
	@Test
	public void testDayWithinMonth() {
		CustomDate date = new CustomDate(1, 12, 1998);
		assertEquals(true, date.DayWithinMonth());
		
		CustomDate date2 = new CustomDate(29, 2, 2021);
		assertEquals(false, date2.DayWithinMonth());
	}
	
	@Test
	public void testIsLeap() {
		CustomDate date = new CustomDate(18, 7, 2001);
		assertEquals(false, date.IsLeap());
		
		CustomDate date2 = new CustomDate(9, 6, 2024);
		assertEquals(true, date2.IsLeap());
	}

	
	
	

}
