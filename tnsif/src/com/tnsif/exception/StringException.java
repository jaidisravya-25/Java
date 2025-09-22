package com.tnsif.exception;

public class StringException {

	public static void main(String[] args) {
		String str = "Sravya";
		try {
		 System.out.println(str.charAt(8));	
		 }catch(Exception e) {
			 System.out.println(e);
		 }

	}

}