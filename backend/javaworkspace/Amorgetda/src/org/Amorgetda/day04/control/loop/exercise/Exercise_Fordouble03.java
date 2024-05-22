package org.Amorgetda.day04.control.loop.exercise;

public class Exercise_Fordouble03 {

	public static void main(String[] args) {
		// 2단을 세로로 출력, 그 옆에 3단을 세로로 출력
		// 그 옆에 4단을 세로로 출력
		
		for(int j = 2; j <= 9; j++) {
			for(int i = 2; i <= 4 ; i++) {
				System.out.print( i +" * " + j + " = " + i*j);
				System.out.print("\t");
				// \t는 탭을 의미, 가속성이 좋음!
				// 탭인지 스페이스바 스페이스바인지 구분하기 좋음
			}
			System.out.println();
		}
	}
}
