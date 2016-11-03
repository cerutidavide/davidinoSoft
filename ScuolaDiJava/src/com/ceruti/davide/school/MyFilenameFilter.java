package com.ceruti.davide.school;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter {
	   private String filter;
	   public MyFilenameFilter(String filter){
		   this.filter=filter;		   
	   }	   
	   public boolean accept(File dir,String name){
		   return (name.equalsIgnoreCase(filter));
	   }
	   
	   
}