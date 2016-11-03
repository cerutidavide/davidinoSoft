package com.ceruti.davide.school;

public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {
		this.x=0;
		this.y=0;
		// TODO Auto-generated constructor stub
	}
	public MyPoint(int x,int y) {
		this.x=x;
		this.y=y;
		// TODO Auto-generated constructor stub
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
	public void setXY(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
	public double distance(int fromx,int fromy){
		return Math.sqrt((this.x-fromx)*(this.x-fromx)+(this.y-fromy)*(this.y-fromy));
	}
	public double distance(MyPoint pointfrom ){
		return Math.sqrt((this.x-pointfrom.x)*(this.x-pointfrom.x)+(this.y-pointfrom.y)*(this.y-pointfrom.y));
	}

}
