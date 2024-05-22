package org.Amorgetda.day02.operator.exercise;

public class Exercise_Logical01 {

	public static void main(String[] args) {
		//70, 55을 a,b로 입력받아 다음과 같은 식을 작성 하였을 때
				//결과값을 예상해보고 출력해보자.
				boolean result1, result2, result3, result4;
				int a = 70;
				int b = 55;
				result1 = (a == b) || (a++ < 100);
				System.out.println( "결과 값1 : " + result1 );
				result2 = (a < b) && (--b <55);
				System.out.println( "결과 값2 : " + result2 );
				result3 = (a != b) && (b-- < a++);
				System.out.println( "결과 값3 : " + result3 );
				result4 = (a++ != b) || (b++ >= 85);
				System.out.println( "결과 값4 : " + result4 );
				System.out.println("a : " + a + ", b : " + b);
	}

}
