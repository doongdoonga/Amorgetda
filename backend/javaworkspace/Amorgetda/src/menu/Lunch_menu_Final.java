package menu;

import java.util.Random;
import java.util.Scanner;

public class Lunch_menu_Final {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		boolean check = false;

		String[] cuisines = { "라면", "떡 라면", "만두 라면", "치즈 라면", "돈까스", "치즈 돈까스", "등심 돈까스", "우동", "어묵 우동", "유부 우동",
				"볶음 우동", "김치 우동", "김밥", "야채김밥", "소고기김밥", "돈까스김밥", "김치찌개", "된장찌개", "부대찌개", "오므라이스", "짜장면", "짬뽕", "쌀국수",
				"볶음밥", "잡채밥", "샌드위치", "우육면", "잔치국수", "비빔밥", "파스타", "샐러드", "주먹밥", "짬뽕", "쫄면", "곰탕", "해장국", "육개장" };

		Random random = new Random();

		while (true) {
			if (check == true) {
				break;
			}
			System.out.print("점심메뉴 ('추천' or '종료') : ");
			input = scanner.next();
			if (input.equals("추천")) {
				input = scanner.nextLine();
				if (input == "") {
					while (true) {
						if (check == false) {
							int randomIndex = random.nextInt(cuisines.length);
							String selectedCuisine = cuisines[randomIndex];
							randomIndex = random.nextInt(cuisines.length);
							selectedCuisine = cuisines[randomIndex];
							System.out.println("\n오늘은 " + selectedCuisine + "을(를) 드세요!\n");
							System.out.println("\n다시 추천 받기(Enter를 누르세요)\n");
						}
						check = false;
						input = scanner.nextLine();
						if (input.equals("종료")) {
							check = true;
							System.out.println("\n프로그램을 종료합니다.");
							break;
						} else if (input.equals("") == false) {
							check = true;
							System.out.println("\n올바른 입력이 아닙니다. Enter를 누르세요.\n");
						}
					}
				}
			} else if (input.equals("종료")) {
				System.out.println("\n프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("\n올바른 입력이 아닙니다. '추천'을 입력하세요.\n");
			}
		}
		scanner.close();
	}
}