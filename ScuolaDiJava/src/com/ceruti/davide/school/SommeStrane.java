package com.ceruti.davide.school;

public class SommeStrane {

	public SommeStrane() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=1;
		int last=1000;
		int sum=0;
		for (int i = first; i <= last; i=i+1) {
			if (i%13==0 && (i%15==0 || i%17==0) && i%30!=0) 
				{
				System.out.println(i);
				sum=sum+i;
				}
		System.out.println("La somma è "+sum);	
		}
		
	}

}
