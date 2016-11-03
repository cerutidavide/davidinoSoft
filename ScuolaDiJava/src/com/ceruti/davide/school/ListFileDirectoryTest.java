package com.ceruti.davide.school;

import java.io.File;

public class ListFileDirectoryTest {

	public ListFileDirectoryTest() {
		// TODO Auto-generated constructor stub
	}
    public void fileList(){
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir =new File("c:\\temp");
		
		
		
		File[] items=null;
		
		System.out.println(dir.getPath());
		items=dir.listFiles();
		for (File item : items){
			System.out.println(item.getAbsolutePath());
		}
	}

}
