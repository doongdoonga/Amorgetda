package javaworld.beta;

import java.util.Scanner;

public class Battle {
    private Character adventurer;
    private Character goblin;
    private Choice choice;

    public Battle(Character adventurer, Character goblin, Choice choice) {
        this.adventurer = adventurer;
        this.goblin = goblin;
        this.choice = choice;
    }

    public boolean start() {
        Scanner sc = new Scanner(System.in);
        while (adventurer.getHealth() > 0 && goblin.getHealth() > 0) {
            System.out.println("===== 전투 중 =====");
            System.out.println("1. 공격한다");
            System.out.println("2. 방어한다");
            System.out.println("3. 가방");
            System.out.println("4. 도망간다");
            System.out.print("선택 > ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    adventurer.attack(goblin);
                    if (goblin.getHealth() > 0) {
                        goblin.attack(adventurer);
                    }
                    break;
                case 2:
                    System.out.println("방어 자세를 취합니다. 다음 공격에 받는 데미지가 감소합니다.");
                    break;
                case 3:
                    System.out.println("가방을 엽니다.");
                    displayInventory(adventurer);
                    break;
                case 4:
                    System.out.println("도망갑니다.");
                    return false;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }

            if (adventurer.getHealth() <= 0) {
                System.out.println("모험가가 쓰러졌습니다. 게임 오버.");
                return false;
            } else if (goblin.getHealth() <= 0) {
                System.out.println("고블린을 쓰러뜨렸습니다!");
                return true;
            }
        }
        return false;
    }

    // 가방 표시 메서드 추가
    private void displayInventory(Character character) {
        System.out.println("가방 안의 아이템:");
        for(int i=0;i<character.getInventory().size();i++) {
        	 System.out.println((i+1) + ". " +character.getInventory().get(i).getName());
        }
        System.out.print("사용하고 싶은 아이템 이름 입력 : ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        switch(inputNumber) {
        	case 1:
        		character.usePotion();
        		break;
        	default:
        		System.out.println("잘못된 아이템 입력");
        }
    }
}