package org.Amorgetda.day04.array.practice;

public class Exercise_Array04 {

	public static void main(String[] args) {
		// 길이가 5인 String 배열을 선언하고 "사과","귤","포도","복숭아","참외"로 초기화 한 후
		// 배열에서 인덱스를 활용해서 귤을 출력하세요.
	
		String[] fruits = { "사과", "귤", "포도", "복숭아", "참외"};
		for(int i = 0; i < fruits.length; i++) {
			if(fruits[i].equals("귤")) {
				System.out.print(fruits[i]);
			 break;
			 }
		}
	}
}
