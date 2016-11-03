package com.example.test;

import java.util.Arrays;

import com.example.util.ArrayUtil;

public class ArrayUtilTest {

	public ArrayUtilTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray={1,3,5,7,2,100,3,47,-2000};
		System.out.println("Gli elementi dell'array sono: ");
		for (int i:intArray){
			System.out.println(+i);	
		}		
		System.out.println("Il max è: "+ArrayUtil.max(intArray));
		System.out.println("Il min è: "+ArrayUtil.min(intArray));
		Arrays.sort(intArray);
		for (int i:intArray){
			System.out.println(+i);	
		}
		
	}

}
