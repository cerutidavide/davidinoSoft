package com.ceruti.davide.school;

import java.io.File;


public class TestFile {
	  
	   
	   public static void main(String[] args) {
		  
		  File dir = new File("c:\\temp\\");   // current working directory
	      MyFilenameFilter filter=new MyFilenameFilter("*"); 		  
	      if (dir.isDirectory()) {
	         // List only files that meet the filtering criteria
	         //  programmed in accept() method of FilenameFilter.
	    	 String[] files = dir.list(filter);  	 
	    	 for (String item : files){
	        	 System.out.println(item);	        	 
	         }
	 	  }
	   } 
		   
}

	