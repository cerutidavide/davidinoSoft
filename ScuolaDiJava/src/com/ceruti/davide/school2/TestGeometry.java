package com.ceruti.davide.school2;

public class TestGeometry {

	public TestGeometry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle aCircle=new Circle();
		System.out.println("Il cerchio di default � "+aCircle.getColor()+" e ha raggio "+aCircle.getRadius());
		Circle anotherCircle=new Circle(100.0,"blu");
		System.out.println("L'altro cerchio � "+anotherCircle.getColor()+" e ha raggio "+anotherCircle.getRadius());
		System.out.println("La sua area di conseguenza � "+anotherCircle.getArea());
		System.out.println("Invece il suo perimetro � "+anotherCircle.getPerimeter());
		System.out.println("Facciamoli diventare tutti gialli!");
		aCircle.setColor("giallo");
		anotherCircle.setColor("giallo");
		System.out.println("Il cerchio di default adesso � "+aCircle.getColor()+" Anche l'altro � "+anotherCircle.getColor());
		System.out.println(anotherCircle.toString());
		anotherCircle.setRadius(3.0);
		System.out.println("Il secondo cerchio si � rimpicciolito, il suo raggio adesso � "+anotherCircle.getRadius());
		System.out.println(anotherCircle.toString());
		System.out.println("L'area del primo cerchio �: "+aCircle.getArea());
		//provare area cerchio, area cilindro e volume
		Cylinder cil1 =new Cylinder(10, 5, "red");
		for (int i=1;i<5;i++){
		cil1.moveUp();		
		System.out.println("Posizione cilindro: "+"("+cil1.getX()+", "+cil1.getY()+")");
		}

	}

}
