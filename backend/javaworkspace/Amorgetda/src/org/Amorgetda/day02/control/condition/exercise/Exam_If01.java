package org.Amorgetda.day02.control.condition.exercise;

import java.util.Scanner;

public class Exam_If01 {

	public static void main(String[] args) {
		// 문제 1
		// 점수와 학년을 정수로 입력받아 60점 이상이면 합격
		// 60점 미만이면 불합격으로 출력한다.
		// 단, 4학년의 경우 70점 이상이어야 합격을 출력하는
		// 프로그램을 작성하시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		int grade = scanner.nextInt();
		
		if(grade != 4) {
			if(score >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}
			else {
				if(score >=70) {
					System.out.println("합격");
				}else {
					System.out.println("불합격");
				}
			}
		}
}
