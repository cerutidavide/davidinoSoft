package com.ceruti.davide.school;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopiaFileByteAByte {

	public TestCopiaFileByteAByte() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	File path=new File("c:\\temp\\");
	File source=new File(path+"\\Sorgente.jpg");
	File destination=new File(path+"\\CopiaSorgente.jpg");
	byte[] inBuf=new byte[4096	];
	int read = 0;
	int loop = 0;
	
	//Scanner aScanner=new Scanner("ciao");
	long beginTime,endTime,elapsedTime;
/*	try {
		destination.createNewFile();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} */
	FileInputStream reader;
	FileOutputStream writer;
	try {
		reader = new FileInputStream(source);
		writer = new FileOutputStream(destination);
		BufferedInputStream bufInput =new BufferedInputStream(reader);
		BufferedOutputStream bufOutput=new BufferedOutputStream(writer);
		beginTime=System.nanoTime();
		try {
			System.out.println("Copia In corso");
			while (read >= 0){
				
				read=bufInput.read(inBuf);
				bufOutput.write(inBuf);
				//System.out.println(".");							
				System.out.print(".");
				if (loop%100==0){
					System.out.println("");
				}
				loop++;	
			}
			
			endTime=System.nanoTime();
			System.out.println("");			
			elapsedTime=(endTime-beginTime)/1000000;
			System.out.println("Elapsed Time msec: "+elapsedTime);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		finally {  // always close the I/O streams
	         try {
	            if (bufInput != null) bufInput.close();
	            if (reader != null) reader.close();
	            if (writer != null) writer.close();
	            if (bufOutput != null) bufOutput.close();
	         } catch (IOException ex) {
	            ex.printStackTrace();
	         }
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	

	
	
	
	

	
	}

}
