package menu;

import java.util.Random;
import java.util.Scanner;

public class lunch_menu_jh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int input2 = 0;
        
        while (true) {
            System.out.println("점심메뉴 ('추천' or '종료') : ");
            input = sc.nextLine();

            if (input.equals("추천")) {
                String[] cuisines = {"라면", "떡 라면", "만두 라면", "치즈 라면", "돈까스", "치즈 돈까스", "등심 돈까스", "우동", "어묵 우동",
                        "유부 우동","볶음 우동", "김치 우동", "김밥", "야채김밥","소고기김밥" ,"돈까스김밥" , "김치찌개", "된장찌개", "부대찌개", "오므라이스", "짜장면", "짬뽕",
                        "쌀국수", "볶음밥", "잡채밥", "샌드위치",
                        "우육면", "잔치국수", "비빔밥", "파스타", "샐러드", "주먹밥", "짬뽕", "쫄면", "곰탕", "해장국", "육개장"};

                Random random = new Random();

//                for(int i =0; i <= input2; i++) {
                do {
                	int randomIndex = random.nextInt(cuisines.length);
                	String selectedCuisine = cuisines[randomIndex];
                	System.out.println("\n오늘은 " + selectedCuisine + " 을(를) 드세요!\n\n");
                	System.out.println("다시 추천 받기 ( Enter를 누르세요)");
                	input = sc.nextLine();
                }while(input=="");
                	if(input.equals("종료")) {
                	System.out.println("프로그램을 종료합니다.");
                	break;
                };
                
//                }
            } else if (input.equals("종료")) {
                System.out.println("\n프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 입력이 아닙니다. '추천'을 입력하세요.");
            }
        }
    }
}