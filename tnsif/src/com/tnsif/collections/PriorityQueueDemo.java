package com.tnsif.collections;

import java.util.PriorityQueue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq =new PriorityQueue<>();
		
		pq.add("Sravya");
		
		pq.add("Rajasri");
		
		pq.add("Ashritha");
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		

	}

}