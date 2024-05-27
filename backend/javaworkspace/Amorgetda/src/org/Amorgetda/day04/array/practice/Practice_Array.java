package org.Amorgetda.day04.array.practice;

import java.util.Scanner;

public class Practice_Array {
	public void practice1() {
		int[] n = new int[10];
		for (int i = 0; i < 10; i++) {
			n[i] = i + 1;
			System.out.print(n[i] + " ");
		}
	}

	public void practice2() {
		int[] n = new int[10];
		for (int i = 9; i >= 0; i--) {
			n[i] = i + 1;
			System.out.print(n[i] + " ");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n[] = new int[sc.nextInt()];

		for (int i = 0; i < n.length; i++) {
			n[i] = i + 1;
			System.out.print(n[i] + " ");
		}
		sc.close();
	}

	public void practice4() {
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

	public void practice5() {
		// 문자열 입력받고 문자 하나하나를 배열에 넣고
		// 검색할 문자를 입력받고
		// 해당 문자가 몇개 들어가 있고
		// 어디에 위치하는지를 구하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String oj = sc.next();

		int count = 0;
		int size = oj.length();
		char[] word = new char[size];
		for (int i = 0; i < oj.length(); i++) {
			word[i] = oj.charAt(i);
			System.out.print(word[i]);
		}
		System.out.print("검색할 문자 : ");
		char search = sc.next().charAt(0);
		System.out.println(oj + "에" + search + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < word.length; i++) {
			if (word[i] == search) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println();
		System.out.println(search + " 개수 : " + count);
	}

	public void practice6() {
		// 요일 문자배열을 만들어서
		// 0을 입력하면 월요일, 4를 입력하면 금요일이 출력되도록하고
		// 0 ~ 6 이외의 숫자를 입력하면 잘못입력하였습니다를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이의 숫자를 입력 : ");
		int n = sc.nextInt();
		if( n < 0 || n >6 ) {
			System.out.print("잘못입력하였습니다.");
		}else {
			char[] weeks = {'월','화','수','목','금','토','일'};
			System.out.println(weeks[n]+"요일");
			
		}
	}

	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스의 합을 출력하세요.
	
		Scanner sc = new Scanner(System.in);
		System.out.print("길이를 입력하세요 : ");
		int[] n = new int[sc.nextInt()];
	}

	public void practice8() {
	}

	public void practice9() {
	}

	public void practice10() {
	}

	public void practice11() {
	}

	public void practice12() {
	}
}
