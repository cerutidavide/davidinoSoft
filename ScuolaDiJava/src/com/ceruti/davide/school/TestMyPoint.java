package com.ceruti.davide.school;
import com.ceruti.davide.school.MyPoint;
public class TestMyPoint {

	public TestMyPoint() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint puntoA=new MyPoint(2,3);
		MyPoint puntoB=new MyPoint(3,7);
		System.out.println(puntoB.distance(puntoA));
		System.out.println(puntoB.distance(2,3));
		MyPoint[] points=new MyPoint[10];
		for (int i = 0; i < points.length; i++) {
			points[i]=new MyPoint(i+1,i+1);
			System.out.println(points[i].toString());
		}
	}

}
