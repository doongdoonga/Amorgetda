package org.Amorgetda.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop05 {

	public static void main(String[] args) {
		// 5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요. : ");
		int n = sc.nextInt();
		if(n >= 1 && n<=9) {
			for(int i = 1; i <10 ; i++) {
				System.out.println(""+n+" * "+i+" = "+ n*i);
				}
		}
	}
}


