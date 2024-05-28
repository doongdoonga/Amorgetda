package org.Amorgetda.day08.oop.student;

import java.util.Scanner;

public class ViewStudent {
	
	public int printMenu() {

		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.println("선택 >>");

		int choice = sc.nextInt();
		return choice;
	}
	
	public void displayMsg(String message) {
		System.out.println(message);
	}
}
