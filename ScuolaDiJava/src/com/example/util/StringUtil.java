package com.example.util;
// C:\DatiDavide\Giochi\Civilization 2\!!-README-!!.txt esempio filepath
public class StringUtil {

	private StringUtil() {
		// TODO Auto-generated constructor stub
	}
	public static String getFileName(String filepath){
		 
		//C:\\DatiDavide\\Giochi\\Civilization 2\\!!-README-!!.txt
		String[] list=filepath.split("\\\\");
		return list[list.length-1]; 
	}
	public static String getFileExtension(String filepath){
		String[] list=StringUtil.getFileName(filepath).split("\\.");
		if (list.length>1) {					
		return list[list.length-1];
		} else {
			return "";
		}
			
	}

}
