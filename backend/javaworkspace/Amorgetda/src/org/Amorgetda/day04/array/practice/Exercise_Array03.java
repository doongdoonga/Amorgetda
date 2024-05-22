package org.Amorgetda.day04.array.practice;

import java.util.Scanner;

public class Exercise_Array03 {

	public static void main(String[] args) {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n[] = new int[sc.nextInt()];
		
			for(int i = 0; i < n.length; i++) {
				n[i] = i+1;
					System.out.print(n[i] + " ");
		}
		sc.close();
	}
}

//System.out.print("양의 정수 : ");
//Scanner scanner = new Scanner(System.in);
//int num[] = new int[scanner.nextInt()];
//for (int i = 0; i < num.length; i++) {
//	num[i] = i+1;
//	System.out.print(num[i] + " ");
//}
//scanner.close();