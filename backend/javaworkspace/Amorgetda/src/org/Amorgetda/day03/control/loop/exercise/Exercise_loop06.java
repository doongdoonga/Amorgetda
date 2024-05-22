package org.Amorgetda.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop06 {

	public static void main(String[] args) {
		//6번  
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 
		//“9 이하의 숫자만 입력해주세요”를 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요. : ");
		int n = sc.nextInt();
		
		if( n>= 1 && n<=9) {
			for(int i = n; i <=9 ; i++) {
				for(int j=2; j <=9 ; j++ ) {
					System.out.println( i + "*" + j + "=" + i*j );
			}
				System.out.println();
			}
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요");
		}
	}

}
