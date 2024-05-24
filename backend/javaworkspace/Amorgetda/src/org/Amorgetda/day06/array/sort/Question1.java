package org.Amorgetda.day06.array.sort;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "번째 정수를 입력하세요 : ");
			int input = sc.nextInt();
			a[i] = input;
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < 4 - i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("정렬된 결과 : ");
		for (int input : a) {
			System.out.print(input + " ");
		}
		System.out.print("\n정렬 후 첫번째 수와 마지막 수의 합 : ");
		System.out.println(a[0] + a[4]);
	}
}