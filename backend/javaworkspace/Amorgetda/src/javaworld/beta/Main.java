package javaworld.beta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Character adventurer = new Character("모험가", 50, 15, 5, 10);

        Character goblin = new Character("고블린", 20, 10, 5, 5);

        Character wolf = new Character("늑대", 30, 20, 3, 15);
        
        Character zombie = new Character("좀비", 40, 8, 10, 20);
        
        Character demonKing = new Character("마왕", 200, 50, 30, 150);

        Choice select = new Choice(adventurer, goblin, demonKing, wolf, zombie);

        while (true) {
            System.out.println("===== 선택 =====");
            System.out.println("1. 마을");
            System.out.println("2. 평야");
            System.out.println("3. 산림");
            System.out.println("4. 폐광");
            System.out.println("5. 마왕성");
            System.out.println("6. 종료하기");
            System.out.print("선택 > ");

            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();

            switch (c) {
                case 1:
                    select.vm();
                    break;
                case 2:
                    select.fm();
                    break;
                case 3:
                    select.forest(); // 산림 메서드 호출
                    break;
                case 4:
                    select.mine(); // 폐광 메서드 호출
                    break;
                case 5:
                    System.out.println("마왕성으로 이동합니다.");
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }
}