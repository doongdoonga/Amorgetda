package org.Amorgetda.day02.operator;

public class Exam_Logical {

	public static void main(String[] args) {
		// 논리연산자 예제
		// 남자이면서 평균평점 4.3이상인 사람 -> and
		// 컴퓨터공학과 또는 경영학과인 사람 -> or
//		boolean result1, result2, result3, result4;
//		boolean result1;
//		boolean result1;
//		boolean result1;
		// AND -> &&, OR -> ||
		// AND : 조건1, 조건2 모두 true면 true
		//       조건1이 false일 경우 조건2는 계산하지 않는다.
		// OR : 조건1, 조건2 둘중 하나라도 true이면 true
		//int num1 = 50;
		//int num2 = 30;
		//result1 = (num1 == num2) && (num1 < num2);
		//System.out.println( "결과 값1 : " + result1 );
		//result2 = (num1 < num2) || (num1 == num2);
		//System.out.println( "결과 값2 : " + result2 );
		//result3 = (num1 > num2) && (num1 != num2);
		//System.out.println( "결과 값3 : " + result3 );
		//result4 = (num1 > num2) || (num1 == num2);
		//System.out.println( "결과 값4 : " + result4 );
		
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
