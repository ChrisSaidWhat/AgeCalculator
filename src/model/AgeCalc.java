package model;

import java.time.LocalDateTime;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class AgeCalc {
	
	//	constructors
	public AgeCalc() {
		
	}
	
	//	helper methods
	public int calculateAge(int birthYearIn) {
		//	setup the proper dates for calculation
		int birthYear = birthYearIn;
		LocalDateTime calendar = LocalDateTime.now();
		int currentYear = calendar.getYear();
		
		//	calculate the age
		int age = currentYear - birthYear;
		
		//	output the result
		return age;
	}
	
	public boolean isSenior(int age) {
		//	decision logic
		if(age >= 65) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isMinor(int age) {
		//	decision logic
		if(age < 18) {
			return true;
		}
		else {
			return false;
		}
	}
	
}