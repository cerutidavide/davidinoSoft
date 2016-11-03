package com.ceruti.davide.school;

public class Author {
	
//da eclipse a github
	private String name;
	private String emailAddress;
	private char sex;
	public Author(String name,String emailAddress,char sex) {
		this.name=name;
		this.emailAddress=emailAddress;
		if ((sex=='m')||(sex=='M')||(sex=='f')||(sex=='F')) {
			this.sex=sex;
		}
		else {
			this.sex=0000;
		}
	}
		// TODO Auto-generated constructor stub
	 public String getName() {	
		return this.name;
	}
	 public String getEmailAddress() {	
			return this.emailAddress;
		}
	 public char getSex() {	
			return this.sex;
		}
	 public void setEmailAddress(String emailAddress) {	
			this.emailAddress=emailAddress;
		}
	 public String toString(){
		 return this.name+"("+this.emailAddress+")";
				 
	 }
	 
}
