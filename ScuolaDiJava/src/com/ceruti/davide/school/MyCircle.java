/**
 * 
 */
package com.ceruti.davide.school;

/**
 * @author us01621
 *
 */

public class MyCircle extends Circle {

	
	private MyPoint center;	
	/**
	 * @param radius
	 */
	public MyCircle(double radius, MyPoint center) {
		super(radius);
		this.center=center;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param radius
	 * @param color
	 */
	public MyCircle(double radius, String color) {
		super(radius, color);
		// TODO Auto-generated constructor stub
	}

	public MyPoint getCenter() {
		return center;
	}


	

}
