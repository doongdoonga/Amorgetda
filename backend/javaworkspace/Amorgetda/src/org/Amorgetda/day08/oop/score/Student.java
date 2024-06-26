package org.Amorgetda.day08.oop.score;

import java.util.Scanner;

public class Student {
	
	static Scanner sc = new Scanner(System.in);
	
	// 멤버코드
	static int kor;
	static int eng;
	static int math;

	// 생성자
	public Student() {}

	// 멤버 메소드
	// 메뉴출력

	public int printMenu() {

		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.println("선택 >>");

		int choice = sc.nextInt();
		return choice;
	}

	// 성적 입력

	public void inputScore() {
		
		System.out.println("=====성적 입력=====");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}

	// 성적 출력

	public void printScore() {
		
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor+eng+math));
		System.out.printf("평균 : %.2f\n", (kor+eng+math)/3.0);
	}
	public void displayMsg(String message) {
		System.out.println(message);
	}
}