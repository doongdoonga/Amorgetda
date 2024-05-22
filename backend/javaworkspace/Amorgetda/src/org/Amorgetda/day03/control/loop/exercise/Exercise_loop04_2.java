package org.Amorgetda.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop04_2 {

	public static void main(String[] args) {
		// 4번 문제

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 입력 : ");
		int n2 = sc.nextInt();
		if(n1 < 1 || n2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			// 입력된 두개의 값중 작은값은 초기식에 큰값은 조건식에 입력되도록 만들어보세요.(숙제)
			// 힌트 : min, max를 사용하는 방법도 있음.
			for(int i = n1; i <= n2; i++) { // n1 이 무조건 n2보다 작다고 가정!
				System.out.print(i + " ");
			}
		}
	}

}
