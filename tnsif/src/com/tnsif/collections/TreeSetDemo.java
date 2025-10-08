package com.tnsif.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
	TreeSet<String> ts =new TreeSet<>();
	
	
	ts.add("Sravya");
	ts.add("Rajasri");
	ts.add("52");
	ts.add("Ashritha");
	ts.add("Sravya");
	System.out.println(ts);
	
	System.out.println(ts.getFirst());
	
	System.out.println(ts.getLast());
	
	System.out.println(ts.removeFirst());
	System.out.println(ts.removeLast());
	
	System.out.println(ts);

	

	}

}