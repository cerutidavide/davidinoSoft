package com.ceruti.davide.school;

public class Circle {
	private double radius;
	private String color;

	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius=radius;
		color=null;
	}
	public Circle() {
		// TODO Auto-generated constructor stub
		this.radius=0;
		color=null;
	}
	public Circle(double radius, String color){
		this.radius=radius;
		this.color=color;
	}
	public double  getRadius(){
		 return radius;
	}
	public String getColor(){
		return color;
	}

	public void setColor(String color){
		 this.color=color;
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}

}
