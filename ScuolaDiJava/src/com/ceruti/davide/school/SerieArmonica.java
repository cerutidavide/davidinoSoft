package com.ceruti.davide.school;

public class SerieArmonica {

	public SerieArmonica() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=1;
		int last=1000;
		double sum=0;
		for (int i = first; i <= last; i++) {
			
				System.out.println(i);
				sum=sum+(1/(double)i);
			
			
			// 1+1/2+1/3+1/4
		System.out.println("La somma è "+sum);	
		}
	}

}
