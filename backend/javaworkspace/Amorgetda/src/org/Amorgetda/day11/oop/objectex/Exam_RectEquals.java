package org.Amorgetda.day11.oop.objectex;

class Rectangle {
	
	int width, height;
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	public boolean equals(Object obj) {
		Rectangle rect = (Rectangle)obj;
		if(width == rect.width && height == rect.height) {
//		if(width *height == rect.width*rect.height) {
			return true;
		}else {
			return false;
		}
	}
}

public class Exam_RectEquals {
	
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(5, 7);
		Rectangle rect2 = new Rectangle(5, 7);
	}
}