package com.ceruti.davide.school;
import com.ceruti.davide.school.Circle;
public class TestCircle {

	public TestCircle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(3.0,"rosso");
		System.out.println("L'area del cerchio è "+c1.getArea());
		System.out.println("Il cerchio è di colore "+c1.getColor());
	}

}
