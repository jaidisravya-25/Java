package com.tnsif.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hset= new HashSet<>();
		
		hset.add(52);
		hset.add("Sravya");
		
		hset.add(22);
		hset.add("Chinni");
		hset.add("Raji");
		
		System.out.println(hset);
		
		hset.remove(3);
		System.out.println("HashSet contains :"+hset.contains(hset));
		
	}

}