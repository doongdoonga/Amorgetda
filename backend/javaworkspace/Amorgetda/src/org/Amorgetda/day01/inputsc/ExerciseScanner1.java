package org.Amorgetda.day01.inputsc;

import java.util.Scanner;

public class ExerciseScanner1 {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
//		boolean soloYn = sc.nextBoolean();
		String soloYn = sc.next();
		System.out.println("이름은 "+name+", 도시는 "+city+", 나이는 "+age+", 체중은 "+weight+", 독신 여부는"+soloYn);
		sc.close();
	}

}