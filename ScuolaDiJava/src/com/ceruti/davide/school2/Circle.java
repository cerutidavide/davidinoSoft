/**
 * 
 */
package com.ceruti.davide.school2;

/**
 * @author US01621
 *
 */
public class Circle {

	/**
	 * 
	 */
	private double radius;
	private String color;
	private int x;
	private int y;
	
	
	public Circle() {
		this.color="red";
		this.radius=1.0;
		this.setX(0);
		this.setY(0);
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		this.color="red";
		this.radius=radius;
		this.setX(0);
		this.setY(0);
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius, String color) {
		this.color=color;
		this.radius=radius;
		this.setX(0);
		this.setY(0);
		// TODO Auto-generated constructor stub
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
