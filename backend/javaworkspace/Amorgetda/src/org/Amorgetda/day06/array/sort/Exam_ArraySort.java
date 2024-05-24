package org.Amorgetda.day06.array.sort;

public class Exam_ArraySort {

	public static void main(String[] args) {
		
		// 정렬 알고리즘
		// 알고리즘이란 문제해결을 하기 위한 절차나 방법,
		// 프로그래밍 언어로 어떻게 해결할 것인가를 고민해 가는 것
		
		// 02 . 정렬 알고리즘 종류
		// 1. 삽입 정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. 병합정렬
		// * 4,5번은 다루기 어려울 수 있다.
		
		// 정렬
		// 크기가 5인 배열이 있고 24 5 7 10 23
		// 7 24 5 23 10 ->5 7 10 23 24
		// -> 자리바꿈이 발생!
		// 1. 자리바꿈은 어떻게 해결할 것인가?
		// 2. 어떤 조건이 만족하면 바꿀 것인가?
		
//		int n1 = 5;
//		int n2 = 7;
//		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
//		
//		int temp = n1;
//		n1 = n2;
//		n2 = temp;
//		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		
//		int nums [] = {2, 1, 3};
//		int temp = 0;
//		// 3 2 1 이 되도록 바꿔보세요!
//		
//		temp = nums[0];
//		nums[0] = nums[2];
//		nums[2] = temp;
//		
//		temp = nums[1];
//		nums[1] = nums[2];
//		nums[2] = temp;
//		
//		for(int n : nums) {
//			System.out.print(n + "");
//		}
//	}
	
		int [] n = { 24, 5, 7 };
		// 5 7 24가 되도록 바꾸시오.
		int tn = 0;
		
		tn = n[0];
		n[0] = n[1];
		n[1] = tn;
		
		
		tn = n[1];
		n[1] = n[2];
		n[2] = tn;
		
		System.out.printf("%d %d %d\n", n[0], n[1], n[2]);
		
		int [] ns = {24, 5, 7};
		
		tn = ns[0];
		ns[0] = ns[2];
		ns[2] = tn;
		
		tn = ns[0];
		ns[0] = ns[1];
		ns[1] = tn;
	
		System.out.printf("%d %d %d\n", ns[0], ns[1], ns[2]);
	}		
}	