package org.Amorgetda.day08.oop.objectarray.student;

import java.util.Scanner;

public class StudentApp {

	static Student[] students = new Student[3];
	
	public static void main(String[] args) {
		
		
		while(true) {
			
			int input = printMenu();
			
			switch(input) {
			case 1 :
				inputInfo();
				break;
			case 2 :
				printInfo();
				break;
			case 3 :
				displayMsg("프로그램을 종료합니다.");
				break;
			default :
				displayMsg("1 ~ 3 사이의 숫자를 입력하세요.");
			}
		}
	}
	private static void printInfo() {
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
	}

	private static void inputInfo() {
		
		Scanner sc = new Scanner(System.in);
	
		for(int i = 0; i < students.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("첫번째 점수 : ");
			int firstScore = sc.nextInt();
			System.out.print("두번째 점수 : ");
			int secondScore = sc.nextInt();
			students[i] = new Student(name, firstScore, secondScore);
		}
	}
	private static void displayMsg(String msg) {
		System.out.println(msg);
	}
	private static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.println("선택 >>");

		int choice = sc.nextInt();
		return choice;
	}
}