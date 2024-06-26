package org.Amorgetda.day08.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray02 {

	public static void main(String[] args) {
		
		//	여러개의 책이 존재하는데 그 책의 정보를 저장하려고 한다.
		//	책은 3권까지 저장할 수 있도록 하고 제목과 저자만 입력받아 저장할 수 있는
		// 	프로그램을 작성하시오.
		
		//	(제목,저자)	어린왕자,풰리
		// 	(제목,저자)	춘향뎐, 미상
		// 	(제목,저자) 
		
		Book [] books = new Book[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < books.length; i++) {
			System.out.print(">> ");
			String title = sc.nextLine();
			System.out.print(">> ");
			String author = sc.nextLine();
			books[i] = new Book(title, author);
		}
		//	객체 배열 출력
		for(Book book : books) {
			System.out.println(book.toString());
		}
	}
}
