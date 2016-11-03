package com.ceruti.davide.school;

public class RunningSum {

	public RunningSum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=1;
		int last=1000;
		int sumOdd=0,sumEven=0;
		for (int i = first; i <= last; i=i+1) {
			if (i%2==1)
				{
				sumOdd=sumOdd+i;
				}
			else
			{
				sumEven=sumEven+i;
			}
		}
		System.out.println(sumOdd);
		System.out.println(sumEven);
	}

}
