package com.example.test;

import com.example.util.StringUtil;

public class StringUtilTest {

	public StringUtilTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		String testFile="C:\\DatiDavide\\Giochi\\Civilization 2\\provafile.txt";		
		System.out.println("Il nome del file è: "+StringUtil.getFileName(testFile));
		System.out.println("L'estensione è: "+StringUtil.getFileExtension(testFile));
		
	}
}
