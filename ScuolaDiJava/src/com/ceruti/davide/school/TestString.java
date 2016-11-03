package com.ceruti.davide.school;

public class TestString {

	public TestString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString ="";
		String anotherString="";
		aString="Ciao";
		anotherString=new String("Ciao");
		//equals controlla il contenuto
		if (aString.equals(anotherString)){
			System.out.println("Uguali");
		} else{
		System.out.println("Diverse");			
	    }
		//== controlla il puntatore quindi se le inzializzo con metodi diversi le stringhe risultano diverse
		if (aString==anotherString){
			System.out.println("Uguali");
		} else{
		System.out.println("Diverse");			
	    }
	}
}
		


