package org.Amorgetda.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop02 {

	public static void main(String[] args) {
		// 2번
		// 사용자로부터 한 개의 값을 입력 받아 
		// 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("정수 하나 입력 : ");
			n = scanner.nextInt();
		}while(n < 1);
		for(int i = n; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
}