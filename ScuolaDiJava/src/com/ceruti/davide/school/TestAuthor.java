package com.ceruti.davide.school;

public class TestAuthor {

	public TestAuthor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Author anAuthor=new Author("Andrea Camilleri","andrea.camilleri@me.com",'m');
	System.out.println("Il nome dell'autore è: "+anAuthor.getName());
	System.out.println("L'email dell'autore è: "+anAuthor.getEmailAddress());
	System.out.println("Il sesso dell'autore è: "+anAuthor.getSex());
	anAuthor.setEmailAddress("davide.ceruti@pluto.com");
	System.out.println("L'email dell'autore è: "+anAuthor.getEmailAddress());
	System.out.println(anAuthor.toString());
	System.out.println(anAuthor);
	
	Book aBook=new Book("La gita a Tindari",19.90,100,anAuthor);
	System.out.println("Il nome dell'autore del libro: "+aBook.getName()+" è "+aBook.getAuthor().getName());
	System.out.println("Il nome dell'autore del libro: "+aBook.getName()+" è "+aBook.getAuthorName());
	System.out.println(aBook.toString());
	}

}