package com.ceruti.davide.school;

public class TestBall {

	public TestBall() {
		// TODO Auto-generated constructor stub
	}
// capire arrotondamento
// angoli in gradi e capire orientamento ma dovrebbe essere 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball aBall=new Ball(0,0,2,4,-3.14/2);
		System.out.println(aBall.toString());
		aBall.move();
		aBall.setDx(0.0);
		aBall.setDy(0.0);
		System.out.println(aBall.toString());		
		aBall.move();
		System.out.println(aBall.toString());		
	}

}
