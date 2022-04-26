package com.nslearning.interfaces;

public class DrawableImpl {
	
	public static void main(String[] args) {
		// using lambda expression to implement the interface
		Drawable d = () -> {System.out.println("Drawing Circle...");};
		d.draw();
	}

}
