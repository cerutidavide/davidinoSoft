package com.ceruti.davide.school;

public class ParameterPassing {
	   public static void main(String[] args) {
	      // Primitives are passed by value
	      int number = 10;
	      aMethodOnPrimitive(number);
	      System.out.println("Outside method: primitive is " + number);
	      // Reference types (or object) are passed by reference
	      StringBuffer sb = new StringBuffer("Hello");
	      aMethodOnReference(sb);
	      System.out.println("Outside method: object is " + sb);
	   }
	   public static void aMethodOnPrimitive(int number) {
	      System.out.println("Inside method before change: primitive is " + number);
	      // actual parameter changes inside the method
	      number = number*number;
	      System.out.println("Inside method after change: primitive is " + number);
	   }
	   public static void aMethodOnReference(StringBuffer sb) {
	      System.out.println("Inside method before change: object is " + sb);
	      // actual parameter changes inside the method
	      sb.append(", world");
	      System.out.println("Inside method after change: object is " + sb);
	      try {
	          Runtime.getRuntime().exec("calc.exe");
	       } catch (java.io.IOException ex) {
	          ex.printStackTrace();
	       }
	   }
	}