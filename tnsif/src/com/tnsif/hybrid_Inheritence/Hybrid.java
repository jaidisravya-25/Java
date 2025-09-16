package com.tnsif.hybrid_Inheritence;

public class Hybrid {
	class AA{
		String A = "This is variable of A";
		void a() {
			System.out.println("This is Classs A");
		}
		
		}
	class BB extends AA{
		void b() {
			
			System.out.println("This is Classs B");
			
		}
	}
	class CC extends AA{
		void c() {
			
			System.out.println("This is Classs C");
			
		}
	}
	class DD extends CC{
		void d() {
			
			System.out.println("This is Classs D");
			
		}
	}
}
