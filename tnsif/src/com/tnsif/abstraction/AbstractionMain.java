package com.tnsif.abstraction;

public class AbstractionMain {

	public static void main(String[] args) {
		Square s = new Square(5);
		Rectangle r = new Rectangle(8, 9);
		s.calArea();
		s.show();
		r.calArea();
		r.show();

	}

}
