package org.Amorgetda.day04.array.practice;

import java.util.Scanner;

public class Exercise_Array06 {

	public static void main(String[] args) {
		// 요일 문자배열을 만들어서
		// 0을 입력하면 월요일, 4를 입력하면 금요일이 출력되도록하고
		// 0 ~ 6 이외의 숫자를 입력하면 잘못입력하였습니다를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이의 숫자를 입력 : ");
		int n = sc.nextInt();
		if( n < 0 || n >6 ) {
			System.out.print("잘못입력하였습니다.");
		}else {
			char[] weeks = {'월','화','수','목','금','토','일'};
			System.out.println(weeks[n]+"요일");
			
		}
		
		if(0 <= n && n <= 6) {
			char[] weeks = {'월','화','수','목','금','토','일'};
			System.out.println(weeks[n]+"요일");
		} else {
			System.out.print("잘못입력하였습니다.");
		}
	}
}
