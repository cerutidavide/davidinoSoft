package com.ceruti.davide.school;

public class Cylinder extends Circle {
	private double height;
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Cylinder(double radius,double height) {
		super(radius);
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double radius, String color) {
		super(radius, color);
		this.height=0.0;
		// TODO Auto-generated constructor stub
	}

}
