package com.tnsif.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet<>();
		
		lhs.add(52);
		lhs.add("Sravya");
		
		lhs.add(25);
		lhs.add("Chinni");
		System.out.println(lhs);
		
		lhs.add("Raji");
		lhs.add("Ashritha");

	}

}