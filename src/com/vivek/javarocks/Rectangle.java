package com.vivek.javarocks;

public class Rectangle {
	private int height;
	private int width;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void draw() {
		System.out.println("Height : " + height + " and Width :" + width);
	}
}
