package com.tnsif.phone;

class JioPhone implements Phone {
	public void call(){
		System.out.println("Jio calls available");
	}
	public void sms(){
		System.out.println("Jio sms available");
	}
}