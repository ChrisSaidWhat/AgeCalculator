package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Person;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class TestPerson {
	Person chris = new Person("Chris", 1999);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testToString() {
		assertEquals("Name: Chris, Year Of Birth: 1999, Age: 25, Minor Status: false, Senior Status: false", chris.toString());
	}

}