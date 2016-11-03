package com.ceruti.davide.school;
import java.util.Scanner;
public class CalcolaTabelline {

	public CalcolaTabelline() {
		// TODO Auto-generated constructor stub
	}
	private static final int MAX_INPUT_ARG=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ciao, come ti chiami? [Scrivi il tuo nome e premi Invio]");
		Scanner keyboard=new Scanner(System.in);
		int i=0;
		String inputLetto[]= new String[MAX_INPUT_ARG];
		while ( keyboard.hasNext() && i<(MAX_INPUT_ARG-1))  {
			inputLetto[i]=keyboard.next();
			System.out.println(inputLetto[i]);
			i++; 			
		}
		System.out.println("ciao");
		
		//String input=keyboard.toString();
		
		keyboard.close();
	}

}
