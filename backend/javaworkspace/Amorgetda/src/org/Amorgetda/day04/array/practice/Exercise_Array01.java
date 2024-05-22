package org.Amorgetda.day04.array.practice;

public class Exercise_Array01 {

	public static void main(String[] args) {
		// 길이가 10인 배열을 선언하고
		// 1 ~ 10까지의 값을 순서대로 배열
		// 인덱스에 넣은 후 그 값을 출력하세요
		
		int[] n = new int[10];
		for( int i = 0; i <10 ; i++) {
			n[i] = i+1;
			System.out.print(n[i]+" ");
		}
//		for(int i = 0; i < 10; i++) {
//			System.out.print(n[i]+" ");
//		}
	}
}