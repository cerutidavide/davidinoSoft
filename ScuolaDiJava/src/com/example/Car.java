/**
 * 
 */
package com.example;

/**
 * @author us01621
 *
 */
public class Car {

	/**
	 * 
	 */
	public Car(int year, String make, String model) {
		this.year=year;
		this.make=make;
		this.model=model;
		
		// TODO Auto-generated constructor stub
	}
	public Car() {
		this.year=0;
		this.make=null;
		this.model=null;
		
		// TODO Auto-generated constructor stub
	}
	private int year;
	private String make;
	private String model;
	
	public int getYear() {
		return year;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	
}
