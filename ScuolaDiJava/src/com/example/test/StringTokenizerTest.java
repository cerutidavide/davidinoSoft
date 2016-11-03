package com.example.test;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public StringTokenizerTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer strTokenizer=new StringTokenizer("Questa è la stringa da tokenizzare");
		System.out.println("La stringa contiene "+strTokenizer.countTokens()+" elementi");
		int i=0;
		while (strTokenizer.hasMoreTokens()) {
			System.out.println("Elemento "+(i+1)+"  "+strTokenizer.nextToken());
			i++;
		}
	}

}
