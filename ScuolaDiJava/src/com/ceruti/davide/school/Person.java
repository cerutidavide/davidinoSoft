package com.ceruti.davide.school;

public class Person {
	private String name;		
	private String address;
	
	public Person(String name,String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAddress(String address){
		this.address=address;
	}
}
