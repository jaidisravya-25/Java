package com.tnsif.multilevel_Inheritence;


public class ClassA {

int a=10;
	

    void show1() {
        System.out.println("This is class A");
    }
}


class ClassB extends ClassA {
    void show2() {
        System.out.println("This is class B");
    }
}


class ClassC extends ClassB {
    void show3() {
        System.out.println("This is class C");
    }
}

			
			
		
	


