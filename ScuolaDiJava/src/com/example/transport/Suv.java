package com.example.transport;

public class Suv extends Car {

	public Suv() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run(){
		System.out.println(super.toString());
		System.out.println(this.toString());
	}
	@Override
	public String toString(){
		return "Questo è un SUV, può trasportare cose";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suv aSuv=new Suv();
		aSuv.run();
		
	}	
}
