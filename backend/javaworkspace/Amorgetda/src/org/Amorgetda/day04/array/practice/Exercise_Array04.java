package org.Amorgetda.day04.array.practice;

public class Exercise_Array04 {

	public static void main(String[] args) {
		// 길이가 5인 String 배열을 선언해서 배열을 생성하고 "사과","귤","포도","복숭아","참외"로 초기화 한 후
		// 배열에서 인덱스를 활용해서 귤을 출력하세요.
	
		String[] fruits = new String[5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		fruits = new String[7];
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(i + ":" +fruits[i]);
			if(fruits[i].equals("귤")) {
				System.out.print(fruits[i]);
			 break;
			 }
		}
	}
}
