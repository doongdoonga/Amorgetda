package org.Amorgetda.day03.control.loop.exercise;

public class Exercise_for02 {

	public static void main(String[] args) {
		// 1부터 10까지의 덧셈을 표시하고  합도구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		
		int sum = 0;
		for(int i= 1; i <= 10; i++) {
			sum += i; // '+='는 누적합을 의미 
			System.out.print(i);
			if(i <= 9 ) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
		}
		System.out.print(sum);
	}
}
