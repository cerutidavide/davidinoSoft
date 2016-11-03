package com.example.test;
import java.util.Scanner;

import com.example.Tablet;

public class TabletTest {
	public void TableTest(){
		//do nothing
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperties());
		Tablet mioTablet=new Tablet();
		System.out.println("Tablet size: "+mioTablet.getScreenSize());
		System.out.println("Tablet weight: "+mioTablet.getWeight());
		System.out.println("Il tablet è solo wifi :"+mioTablet.isWifiOnly());
		mioTablet.setScreenSize(5F);
		mioTablet.setWeight(400);
		mioTablet.setWifiOnly(true);
		System.out.println("\n"+"ImpostoIlMioTablet"+"\n");
		System.out.println("Tablet size: "+mioTablet.getScreenSize());
		System.out.println("Tablet weight: "+mioTablet.getWeight());
		System.out.println("Il tablet è solo wifi :"+mioTablet.isWifiOnly());
		Scanner inputReader=new Scanner(System.in);		
		 	while (true) {
				 	System.out.println("Come ti chiami? ");
				 	String input=inputReader.nextLine();
				 	if (input.isEmpty()){
				 		break;				 				
				 	}
				 	System.out.println("Ti chiami "+input);
			
		}
		inputReader.close();
		System.out.println("ciao");
		
	}

}
