package com.tnsif.hybrid_Inheritence;

public class Main {

	public static void main(String[] args) {
		
		    Hybrid hybrid = new Hybrid();
		    Hybrid.BB obj1 = hybrid.new BB();
		    Hybrid.DD obj2 = hybrid.new DD();
		    
		    obj1.a(); // Method from AA
		    obj1.b(); // Method from BB
		    
		    obj2.a(); // Method from AA (inherited by CC and then DD)
		    obj2.c(); // Method from CC
		    obj2.d(); // Method from DD
		}
	}


