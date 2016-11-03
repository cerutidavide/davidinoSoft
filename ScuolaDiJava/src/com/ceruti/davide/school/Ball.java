package com.ceruti.davide.school;

public class Ball {
	private double x;
	private double y;
	private int radius;
	private double Dx;
	private double Dy;
	
	
	
	
	
	
	
	public Ball(double x, double y, int radius, double speed,double direction){
		this.x=x;
		this.y=y;
		this.radius=radius;
		this.Dx=(speed*Math.cos(direction));
		this.Dy=(-speed*Math.sin(direction));
		
	}
	public Ball() {
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return "The ball is in position"+"("+this.x+","+this.y+")";
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getDx() {
		return Dx;
	}
	public void setDx(double Dx) {
		this.Dx = Dx;
	}
	public double getDy() {
		return Dy;
	}
	public void setDy(double Dy) {
		this.Dy = Dy;
	}
	public void move(){
		this.x+=Dx;
		this.y+=Dy;
	}
	public void reflectHorizontal(){
		this.Dx=-this.Dx;
	}
	public void reflectVertical(){
		this.Dy=-this.Dy;
	}
}
