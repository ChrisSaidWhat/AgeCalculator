package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.AgeCalc;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class TestAgeCalc {
	AgeCalc calculator = new AgeCalc();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testCalculateAge() {
		assertEquals(25, calculator.calculateAge(1999));
	}
	
	@Test
	public void testIsMinor() {
		assertTrue(calculator.isMinor(17));
		assertFalse(calculator.isMinor(18));
	}
	
	@Test
	public void testIsSenior() {
		assertTrue(calculator.isSenior(65));
		assertFalse(calculator.isSenior(64));
	}

}