package com.ceruti.davide.school;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TestDate {

	public TestDate() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now=new Date();
		SimpleDateFormat dateFormatter=new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");;
		System.out.println(dateFormatter.format(now));
		
		
		
	}

}
