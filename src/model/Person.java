package model;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */

public class Person {
	
	//	instance variables
	private String name = "";
	private int age = 0;
	private int birthYear = 0;
	private boolean isMinor = false;
	private boolean isSenior = false;
	AgeCalc calculator = new AgeCalc();
	
	//	constructors
	public Person() {
		
	}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
		this.age = calculator.calculateAge(birthYear);
		this.isMinor = calculator.isMinor(age);
		this.isSenior = calculator.isSenior(age);
	}

	//	getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public boolean getIsMinor() {
		return isMinor;
	}
	
	public boolean getIsSenior() {
		return isSenior;
	}
	
	//	helper methods
	@Override
	public String toString() {
		return "Name: " + this.name + ", Year Of Birth: " + this.birthYear + ", Age: " + this.age + ", Minor Status: " + this.isMinor + 
				", Senior Status: " + this.isSenior;
	}
	
}