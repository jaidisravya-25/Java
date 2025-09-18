package com.tnsif.polymorphism;

public class MethodOverloading {

	    public void mdemo(String a, int b) {
	        System.out.println("This is method with a String and int parameters");
	        String res = a + b;
	        System.out.println(res);
	    }

	    public void mdemo(int a, String b) {
	        System.out.println("This is method with a int and String parameters");
	        String res = a + b;
	        System.out.println(res);
	    }

	    public static void main(String[] args) {
	        MethodOverloading obj = new MethodOverloading();
	        
	        obj.mdemo(1, "2");
	        obj.mdemo("2", 1);
	        obj.mdemo("Sravya", 252);
	        obj.mdemo(252, "Sravya");
	    }
	}