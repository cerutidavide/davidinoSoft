package com.ceruti.davide.school2;

public class TestGeometry {

	public TestGeometry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle aCircle=new Circle();
		System.out.println("Il cerchio di default è "+aCircle.getColor()+" e ha raggio "+aCircle.getRadius());
		Circle anotherCircle=new Circle(100.0,"blu");
		System.out.println("L'altro cerchio è "+anotherCircle.getColor()+" e ha raggio "+anotherCircle.getRadius());
		System.out.println("La sua area di conseguenza è "+anotherCircle.getArea());
		System.out.println("Invece il suo perimetro è "+anotherCircle.getPerimeter());
		System.out.println("Facciamoli diventare tutti gialli!");
		aCircle.setColor("giallo");
		anotherCircle.setColor("giallo");
		System.out.println("Il cerchio di default adesso è "+aCircle.getColor()+" Anche l'altro è "+anotherCircle.getColor());
		System.out.println(anotherCircle.toString());
		anotherCircle.setRadius(3.0);
		System.out.println("Il secondo cerchio si è rimpicciolito, il suo raggio adesso è "+anotherCircle.getRadius());
		System.out.println(anotherCircle.toString());
		System.out.println("L'area del primo cerchio è: "+aCircle.getArea());
		//provare area cerchio, area cilindro e volume
		Cylinder cil1 =new Cylinder(10, 5, "red");
		for (int i=1;i<5;i++){
		cil1.moveUp();		
		System.out.println("Posizione cilindro: "+"("+cil1.getX()+", "+cil1.getY()+")");
		}

	}

}
