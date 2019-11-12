package com.vivek.javarocks;

public class Triangle {
	// Dependency Variable Injection
	public String type;
	private int height;

	public int getHeight() {
		return height;
	}

	public Triangle() {
		
	}
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Triangle is drawn with " + height +" is the height ");
	}
}
