package com.ceruti.davide.school;

public class Book {
	private String name;
	private double price;
	private int quantity;
	private Author author;
	public Book(String name,double price,int quantity,Author author) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Author getAuthor() {
		return author;
	}
/*	public void setAuthor(Author author) {
		this.author = author;
	}
*/	
	
	public String getAuthorName(){
		return this.author.getName();
	}
	public String toString(){
//		return "\""+this.name+"\""+" written by "+this.getAuthorName()+"("+this.author.getEmailAddress()+")"; 
		return "\""+this.name+"\""+" written by "+this.author.toString();
	}

}
