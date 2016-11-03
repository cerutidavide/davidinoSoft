package com.ceruti.davide.school;

public class TestStringReverse {

	public TestStringReverse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="";
		long elapsedTime,beginTime;
		int size=4680;
		int count=0;
		int index=0;
		char c='a';
		String str2="";
		StringBuffer strBuffer1=new StringBuffer("");
		StringBuilder strBuilder1=new StringBuilder("");
		//Populate String
		beginTime=System.nanoTime();
		//System.out.println(beginTime);
		for (count=0;count<size;count++){
			str1=str1+c;
			c++;
			if (c>'z'){
				c='a';	
			}								
		}
		elapsedTime=System.nanoTime()-beginTime;
		System.out.println("ElapsedTime is: "+elapsedTime/1000+"us");
		System.out.println(str1);
		//int lenght=str1.lastIndexOf(str1);
		//str1.
		//System.out.println(lenght);
		beginTime=System.nanoTime();
		for (index=0;index < size;index++){
			strBuffer1=strBuffer1.append(str1.charAt(size-index-1));
			}		
		elapsedTime=System.nanoTime()-beginTime;
		System.out.println("ElapsedTime is: "+elapsedTime/1000+"us");
		System.out.println(strBuffer1);
		
				
		
		
		
		beginTime=System.nanoTime();
		for (index=0;index < size;index++){
			str2=str2+str1.charAt(size-index-1);
			}		
		elapsedTime=System.nanoTime()-beginTime;
		System.out.println("ElapsedTime is: "+elapsedTime/1000+"us");
		System.out.println(str2);

		beginTime=System.nanoTime();
		for (index=0;index < size;index++){
			strBuilder1=strBuilder1.append(str1.charAt(size-index-1));
			}		
		elapsedTime=System.nanoTime()-beginTime;
		System.out.println("ElapsedTime is: "+elapsedTime/1000+"us");
		System.out.println(strBuilder1);

		StringBuffer strBuffer2=new StringBuffer("");
		beginTime=System.nanoTime();
		for (index=0;index<size;index++){
			strBuffer2=strBuffer2.append(c);
			c++;
			if (c>'z'){
				c='a';
			}
			
		}
		strBuffer2=strBuffer2.reverse();
		elapsedTime=System.nanoTime()-beginTime;
		System.out.println(strBuffer2);
		
		
	}

}
