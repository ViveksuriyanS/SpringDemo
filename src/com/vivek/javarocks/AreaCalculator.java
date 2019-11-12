package com.vivek.javarocks;

public class AreaCalculator {
	private Rectangle tinyarea;
	private Rectangle smallarea;
	private Rectangle bigarea;
	private Rectangle hugearea;

	public Rectangle getTinyarea() {
		return tinyarea;
	}

	public void setTinyarea(Rectangle tinyarea) {
		this.tinyarea = tinyarea;
	}

	public Rectangle getSmallarea() {
		return smallarea;
	}

	public void setSmallarea(Rectangle smallarea) {
		this.smallarea = smallarea;
	}

	public Rectangle getBigarea() {
		return bigarea;
	}

	public void setBigarea(Rectangle bigarea) {
		this.bigarea = bigarea;
	}

	public Rectangle getHugearea() {
		return hugearea;
	}

	public void setHugearea(Rectangle hugearea) {
		this.hugearea = hugearea;
	}

	public void area() {
		System.out.println(getTinyarea().getHeight() + "  " + getTinyarea().getWidth());
		System.out.println(getSmallarea().getHeight() + "  " + getSmallarea().getWidth());
		System.out.println(getBigarea().getHeight() + "  " + getBigarea().getWidth());
		System.out.println(getHugearea().getHeight() + "  " + getHugearea().getWidth());
	}
}
