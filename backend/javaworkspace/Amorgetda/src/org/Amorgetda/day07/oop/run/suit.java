package org.Amorgetda.day07.oop.run;

public class suit {

	public static void main(String[] args) {
		suit s = new suit(100);
	}
	
	int size;
	String brand;
	int price;
	
	public Suit(int size) {
		this(size,"Hazzys");
		System.out.println("Suit(int) 호출");
	}
	
	public Suit(int size, String brand) {
		this(size, brand, 10000);
		System.out.println("Suit(int, String) 호출");
	}
	
	public Suit(int size, String brand, int price) {
		
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) g호출");
	}
}
