package com.ceruti.davide.school;

public class TestGeometry {

	public TestGeometry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint c=new MyPoint(0,10);
		MyCircle aMyCircle=new MyCircle(10, c);
		System.out.println(aMyCircle.getCenter());
		System.out.println(aMyCircle.getColor());	
		aMyCircle.setRadius(10000);
		
		aMyCircle.setColor("rosso");
		System.out.println(aMyCircle.getRadius());	
		System.out.println(aMyCircle.getColor());
	}

}
