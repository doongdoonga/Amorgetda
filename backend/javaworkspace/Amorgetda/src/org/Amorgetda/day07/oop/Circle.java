package org.Amorgetda.day07.oop;

public class Circle {
	//	반지름
	//	이름
	
	public double radius;
	public String Name;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//	넓이 구하기
	
	public double getarea () {
		
		//	return을 쓰면 public 옆에
		//	리턴값과 같은 데이터타입을 써야함.
		return 3.14*radius*radius;
	}
}
