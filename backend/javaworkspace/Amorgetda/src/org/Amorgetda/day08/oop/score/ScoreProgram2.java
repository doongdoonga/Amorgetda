package org.Amorgetda.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {
	
	static int kor = 0; 
	static int eng = 0; 
	static int math = 0;	//	ScoreProgram2 클래스의 멤버코드!!

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		finish:

		while (true) {

			int choice = printMenu();

			switch (choice) {

			case 1:
				
				inputScore();
				break;
			
			case 2:
				printScore();
				break;
			case 3:
				displayMsg("프로그램을 종료합니다.");
				break finish;
			default:
				displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
	
	private static void displayMsg(String message) {
		System.out.println(message);
	}

	
	private static void printScore() {
		
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor+eng+math));
		System.out.println("평균 : " + (kor+eng+math)/3.0);
	}
	
	private static void inputScore() {
		
		System.out.println("=====성적 입력=====");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public static int printMenu() {

		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.println("선택 >>");

		int choice = sc.nextInt();
		return choice;
	}
}