package org.Amorgetda.day07.oop.run;


import java.util.Scanner;

import org.Amorgetda.day05.dimarray.exercise.Exercise_DimArray;
import org.Amorgetda.day07.oop.Book;
import org.Amorgetda.day07.oop.Circle;
import org.Amorgetda.day07.oop.Member;
import org.Amorgetda.day07.oop.exercise.Rectangle;

//	실행용 클래스
public class Run {
//	public static void main(String[] args) {
		
//		Run ex = new Run();
//		Run.oopPractice1();
//		oopExercise();
//		Math.random();
	}
		
		public void constructorEx() {
			
//		Book book = new Book(); // 기본 생성자를 이용해서 객체 생성
			// title, author는 모두 비어있음
//		book.title = "춘향뎐";
//		boo.author = "작자미상";
			
			Book book = new Book("춘향뎐", "작자미상");
			Book emtyBook = new Book();
//		3줄 코드가 한줄 코드가 된다!!!!
			
			Circle bintz = new Circle();
			bintz.setRadius(10);
			
		}
//		Member member1 = new Member();
//		member1.name = "일용자";
//		member1.age = 33;
//		member1.job = "의사";
//		
//		Member member2 = new Member();
//		member2.name = "이용자";
//		member2.age = 22;
//		member2.job = "드라이버";
//		
//		System.out.println(member1.name);
//		System.out.println(member1.job);
//		System.out.println(member1.age);
//		
//		System.out.println(member2.name);
//		System.out.println(member2.job);
//		System.out.println(member2.age);
		
		//	Circle의 instance를 이용하여
		// 이름이 달덩이, 반지름은 5인
		// Circle의 넓이를 출력해보세요.
		
//		Circle c1 = new Circle();
//		c1.Name = "달덩이";
//		c1.radius = 5;
		
//		Circle donut = new Circle();
//		donut.Name = "던킨";
//		donut.radius = 2;
		
		
//		System.out.println(c1.Name);
//		System.out.println(c1.radius);
//		System.out.println(c1.getarea());
		
//		System.out.println(donut.Name);
//		System.out.println(donut.radius);
//		System.out.println(donut.getarea());
		
//		Scanner sc = new Scanner(System.in);
//		
//		public void oopPractice1() {
//		Rectangle sa = new Rectangle();
//		System.out.println(" 높이를 입력하세요 : ");
//		sa.w = sc.nextInt();
//		System.out.println(" 너비를 입력하세요 : ");
//		sa.h = sc.nextInt();
//		int result = sa.ga();
//		System.out.println(sa.ga());
//		System.out.println( "결과값은 " + result + " 입니다.");
//		sc.close();
//		}



}
