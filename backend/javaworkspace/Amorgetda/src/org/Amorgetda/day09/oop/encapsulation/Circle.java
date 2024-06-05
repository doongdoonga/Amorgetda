package org.Amorgetda.day09.oop.encapsulation;

public class Circle {
	//	반지름
	//	이름
	
	private double radius;
	private String name;
	

	//	setter() 메소드
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	//	getter() 메소드
	public double getRadius() {
		return radius;
	}

	public String getname() {
		return name;
	}

	//	넓이 구하기
	public double getarea () {
		
		//	return을 쓰면 public 옆에
		//	리턴값과 같은 데이터타입을 써야함.
		return 3.14*radius*radius;
	}
}