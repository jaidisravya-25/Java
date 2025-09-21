package com.tnsif.stringoperations;

public class StringOperations {
    public static void main(String[] args) {
        
        String str = "Hello World";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0 to 10): " + str.substring(0,11));
    }
}