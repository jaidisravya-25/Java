package com.tnsif.primenumbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		
	        System.out.println("Prime numbers from 1 to 100 are:");

	        for (int num = 2; num <= 100; num++) {
	            boolean isPrime = true;

	            // Check divisibility
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	

	}


