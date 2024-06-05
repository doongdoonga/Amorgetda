package org.Amorgetda.day12.collection.student;

import java.util.List;

public class StudentRun {
	public static void main(String[] args) {

		ManageStudent mng = new ManageStudent();
		ViewStudent view = new ViewStudent();

		end :
		while(true) {
			int input = view.printMenu();
			switch(input) {
			case 1 :
				Student std = view.inputStudent();
				mng.registerStudent(std);
				break;
			case 2 : 
				String name = view.inputName();
				List<Student> sList = mng.searchOneByName(name);
				view.displayStudents(sList);
				break;
			case 3 : 
				List<Student> stdList = mng.selectAllStudents();
				view.displayStudents(stdList);
				break;
			case 4 : 
				break;
			case 5 : 
				break;
			case 6 : 
				break;
			case 0 :
				view.displayMsg("프로그램을 종료합니다");
				break end;
			default : 
				view.displayMsg("메뉴를 다시 선택해주세요.");
			
			}
		}
		// 재평가 기준 설명
		// 0. 재평가의 여부는 1차, 2차가 각각 다르다.
		// 1. 점수가 40점 미만인 경우 과락으로 재평가 대상자가 된다.
		// 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 통과한다.
		// 3. 1차 점수와 2차 점수의 평균이 60점 미만인 경우 60점 미만의
		// 과목은 재평가를 본다.
		// 1차 점수 : 60점, 2차 점수 : 60점
		// 1차 점수 : 100점, 2차 점수 : 20점(2차만 재평가)
		// 1차 점수 : 59점, 2차 점수 : 60점(1차만 재평가);
		// 결론 : 평균 60점이 넘어야함, 넘었는데 재평가보는 경우있음.
		// 평균 60점이 넘지 않으면 재평가(60점 미만만 재평가)
	}

}
