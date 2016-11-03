package com.ceruti.davide.school;

public class CircleCalculus {
	
	public CircleCalculus() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius =1;
		double perimeter = 0;
		double area = 0;
		area=radius*radius*Math.PI/2;
		perimeter=2*radius*Math.PI;
		System.out.print("L'area del cerchio di raggio ");
		System.out.print(radius);
		System.out.print(" è ");
		System.out.println(area);
		System.out.print("Il perimetro è "+perimeter);
		

	}

}
