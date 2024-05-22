package org.Amorgetda.day04.control.loop.exercise;

public class Exercise_Fordouble02 {

	public static void main(String[] args) {
		// 0시 00분부터 23시 59분까지 출력하기

		for(int j = 0; j < 24; j++) {
			for(int i = 0; i < 60 ; i++) {
				System.out.println( j +"시" + i + "분" );
			}
			
		}
	}
}
