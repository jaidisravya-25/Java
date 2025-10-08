package com.tnsif.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list =new LinkedList<>();
		
		list.add(52);
		list.add("Sravya");
		
		list.add("25");
		list.add("Raji");
		
		list.addFirst(10);
		list.addLast("Ashritha");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);

	}

}