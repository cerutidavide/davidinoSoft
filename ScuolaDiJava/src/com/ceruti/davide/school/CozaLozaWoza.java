package com.ceruti.davide.school;



public class CozaLozaWoza {

	public CozaLozaWoza() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//coza=multiplo di 3 loza multiplo di 5 loza multiplo di 7
		int number =0;
		int first =1;
		int last =110;
		for (number=first;number<=last;number++) {
			if (number%3==0){
				System.out.print("Coza");
			}
			
			if (number%5==0){
				System.out.print("Loza");
			}
			if (number%7==0){
				System.out.print("Woza");
			}
			if (number%3==0 || number%5==0 || number%7==0) {
				System.out.print(" ");
			} else
				System.out.print(number+" ");
			if (number%11==0){
				System.out.print("\n");
			}
			//Scanner in = new Scanner(System.in);
			//in.next();
		}
		
	}

}
