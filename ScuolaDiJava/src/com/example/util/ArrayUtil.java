package com.example.util;

public class ArrayUtil {

	public ArrayUtil() {
		// TODO Auto-generated constructor stub
	}
	public static int max(int intArray[]){
		int max=intArray[0];
		for (int i:intArray) {
			if (i>max) {
				max=i;
			}
		}
		return max;
	}
	
	public static int min(int intArray[]){
		int min=intArray[0];
		for (int i:intArray) {
			if (i<min) {
				min=i;
			}
		}
		return min;
	}


}
