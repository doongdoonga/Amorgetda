package org.Amorgetda.day04.array.practice;

public class Exercise_Array02 {

	public static void main(String[] args) {
		// 길이가 10인 배열을 선언하고
		// 1 ~ 10까지의 값을 역순으로 배열
		// 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] n = new int[10];
		for( int i = 9; i >= 0 ; i--) {
			n[i] = i+1;
			System.out.print(n[i]+" ");
		}

	}

}