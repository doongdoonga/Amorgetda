package org.Amorgetda.day04.array.practice;

import java.util.Scanner;

/*
 * 자바의 변수에는 무엇이 있냐?
 * 정적변수:
 * 멤버변수:
 * ...
 * 지역변수: 메서드 안에 선언된 모든 변수, for문에 선언할 때, 메서드 매개변수
 */
public class Exercise_Array07 {
	private static int num;
	public static void main(String[] args) {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스의 합을 출력하세요.
	
		Scanner sc = new Scanner(System.in);
		System.out.print("길이를 입력하세요 : ");
		int[] n = new int[sc.nextInt()];
		// 배열 길이만큼 입력 받는다
		for(int i=0;i<n.length;i++) {
			int input = sc.nextInt();
			n[i] = input;
		}
		
		// 배열 길이만큼 출력한다
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i] + " ");
		}
		
		int sum = 0;
		// sum을 계산한다
		for(int i=0;i<n.length;i++) {
			sum += n[i];
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}
}
