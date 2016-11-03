package com.example.test;
import com.example.Car;
public class CarTest {

	public CarTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar=new Car(2016,"Lamborghini","Huracan");
		Car yourCar=new Car();
		System.out.println("La mia automobile è una "+myCar.getMake()+" "+myCar.getModel()+" del "+myCar.getYear());
		System.out.println("La tua invece + un catorcio: "+yourCar.getMake()+" "+yourCar.getModel()+" del "+yourCar.getYear());
	}

}
