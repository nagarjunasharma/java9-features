package com.nslearning.interfaces;

public interface Drawable {
	
	default void draw() {
		System.out.println("Drawing...");
		shape();
		defaultDraw();
		staticDraw();
	}
	
	void shape();
	
	private void defaultDraw() {
		System.out.println("Drawing from private default draw...");
	}
	
	private static void staticDraw() {
		System.out.println("Drawing from private static default draw...");
	}

}
