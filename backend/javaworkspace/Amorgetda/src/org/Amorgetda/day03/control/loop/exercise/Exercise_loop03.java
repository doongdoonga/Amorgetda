package org.Amorgetda.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop03 {

	public static void main(String[] args) {
		//3번
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 
		//for문을 이용하여 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int n = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("총합 : " + sum);
		System.out.println("1부터" + n + "까지의 합 : " + sum);
		System.out.printf("1부터 %d 까지의 합 : %d\n", n , sum);
	}

}
