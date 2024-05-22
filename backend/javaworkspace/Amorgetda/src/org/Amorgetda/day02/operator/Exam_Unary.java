package org.Amorgetda.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단항 연사자
		//a++, ++a -> a = a + 1;
		int a1 = 1;
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		// 연습 문제 1
		// a가 10, b는 20, c는 30입니다.
		// a++;
		// b = (--a) + b;
		// c = (a++) + (--b);
		// a, b, c의 값은 얼마일까요?
		// a = ?, b = ?, c = ?
		// 11 , 29 , 39
		int a = 10;
		int b = 20;
		int c = 30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a: " + a + ", b : " + b + ", c : " + c);
		//System.out.println(b);
		//System.out.println(c);
		
		// 연습 문제 2
		// 논리형 변수 flag를 true초기화 하고 
		// 다음 연산을 수행하고 결과값을 확인해보세요.
		boolean flag = true;
		System.out.println(flag);
		
		// 연습 문제 3
		// 정수형 변수 x = 100, y = 33, z = 0
		// 초기화후에 다음 연산진행후 x,y,z를 출력하세요
		// x--;
		// z = x-- + --y;
		// x = 99 + x++ + x;
		// y = y++ + y + ++y;
		
		//int x = 100;
		//int y = 33;
		//int z = 0;
		//x--; // 99
		//z = x-- + --y; // 131
		//x = 99 + x++ + x; // 296 ( 99 + 98 + 99 ) 
		//y = y++ + y + ++y; // 95 ( 32 + 31 + 32 )
		
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		
		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
		
	}
}