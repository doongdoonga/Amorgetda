package org.Amorgetda.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop04 {

	public static void main(String[] args) {
		// 4번  
		// 사용자로부터 두 개의 값을 입력 받아 
		// 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 
		// “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 값을 입력 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if( n1 > 0 && n2 > 0) {
			if ( n2 - n1 > 1 ) {
				for (int i = n1; i <= n2; i++) {
					if (i != n1 && i != n2) {
						System.out.println(i);
					}
				}
			} else if( n1 - n2 > 1) {
				for (int j = n1; j >= n2; j--) {
					if (j != n1 && j != n2) {
						System.out.println(j);
					}
				}
			}else {
				System.out.println("사이값이 없습니다.");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
}
