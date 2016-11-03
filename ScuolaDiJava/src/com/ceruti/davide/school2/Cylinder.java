package com.ceruti.davide.school2;

public class Cylinder extends Circle implements Moveable {
	private double height;
	public Cylinder() {
		// TODO Auto-generated constructor stub
		setHeight(0.0);
	}

	public Cylinder(double radius) {
		super(radius);
		setHeight(0.0);
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double radius, String color) {
		super(radius, color);
		setHeight(0.0);
		// TODO Auto-generated constructor stub
	}
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		setHeight(height);
		// TODO Auto-generated constructor stub
	}
	public double getHeight() {
		return height;
	}

	public double getTotalArea(){
		return super.getArea()*2+getPerimeter()*getHeight();
	}
	public double getBaseArea(){
		return super.getArea();
	}
	public double getLateralArea(){
		return super.getPerimeter()*this.getHeight();
	}
	public double getVolume(){
		return super.getArea()*this.getHeight();
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString(){   //SISTEMARE
		return "Cylinder [radius=" + this.getRadius() + ", color=" + this.getColor()+", "+ "height=" + this.getHeight()+"]";
	}

	@Override
	public void moveUp() {
	this.setY(this.getY()+1);// TODO Auto-generated method stub
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}

}
