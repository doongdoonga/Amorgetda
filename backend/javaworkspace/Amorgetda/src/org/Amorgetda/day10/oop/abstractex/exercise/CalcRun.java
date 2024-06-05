package org.Amorgetda.day10.oop.abstractex.exercise;

public class CalcRun {

	public static void main(String[] args) {
		
//		Calculator calculator = new Calculator();
		
		Calculator calc = new GoodCalc();
		// 업캐스팅
		
		System.out.println("합 : " + calc.add(5, 7)); //	5 7
		System.out.println("차 : " + calc.substract(10, 23)); // 10 23	
		System.out.println("평 : " + calc.average(new int [] {5, 7 , 10, 23})); // 5 7 10 23
	}

}
