package com.tnsif.primenot;

public class PrimeNot {

	public  static void main(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0);
			count++;
		}
		if(count==2) {
			System.out.println(num);
			System.out.println("is a prime number");
			
		}
		else {
			System.out.println(num);
			System.out.println("is not a prime number");
			
		}
	}
	public static void main(String [] args) {
		PrimeNot p= new PrimeNot();
		p.main(8);
	}
		
		
		
	}


