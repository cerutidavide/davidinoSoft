package com.ceruti.davide.school;

public class TestStudent {

	public TestStudent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student aStudent=new Student("Davide","via brodolini 44");
		String pippo=aStudent.getName();
		pippo="ciao";
		aStudent.setName("Davidino");
		System.out.println(pippo);
		System.out.println(aStudent.getName());
		
		
		
		
		
	}

}
