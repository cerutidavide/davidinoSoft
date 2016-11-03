package com.ceruti.davide.school;

public class MathOperations {

	public MathOperations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=98,number2=5;
		int quotient, sum, remainder, product, difference;
		quotient=number1/number2;
		sum=number1+number2;
		remainder=number1%number2;
		product=number1*number2;		
		difference=number1-number2;
		System.out.println("Numbers are " + number1 + " and " +number2);
		System.out.println("Quotient is " + quotient );
		System.out.println("Sum is " + sum );
		System.out.println("Remainder is " + remainder );
		System.out.println("Product is " + product );
		System.out.println("Difference is " + difference );
		System.out.println("Increment of number1 is " + number1++ );
		System.out.println(number1);
		System.out.println("Increment of number1 is " + number1 );
		//decrement=number2--;
		
		
		
	}

}
