package org.Amorgetda.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical02 {

	public static void main(String[] args) {
		// < 연습 문제 2-1 >
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요!
		// 변수 num에 초기화
		// 1부터 100사이의 숫자인가? : true
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		boolean result1 = 1 <= num && num <=100;
		System.out.println("1부터 100사이의 숫자인가? ");
		System.out.println(result1);
		
		// < 연습 문제 2-2 >
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 true
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력해 주세요 : ");
		char word = scanner.next().charAt(0);		
		boolean result2= ( word >= 65 ) && ( word <= 90 );
		System.out.println("영어 대문자 확인 : " + result2);
	}

}