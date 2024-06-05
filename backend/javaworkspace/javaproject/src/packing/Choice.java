package packing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Choice {

    private Character adventurer;
    private Character goblin;
    private List<Item> shopItems;
    private List<Item> fieldItems;

    public Choice(Character adventurer, Character goblin) {
        this.adventurer = adventurer;
        this.goblin = goblin;
        initializeItems();
    }

    private void initializeItems() {
        shopItems = new ArrayList<>();
        shopItems.add(new Item("숏소드", 100));
        shopItems.add(new Item("롱소드", 200));
        shopItems.add(new Item("아이언 아머", 150));
        shopItems.add(new Item("플레이트 아머", 300));

        fieldItems = new ArrayList<>();
        fieldItems.add(new Item("잡초", 1));
        fieldItems.add(new Item("약초", 10));
    }

    public int cm() {
        System.out.println("[== Java world ==]");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. <마을> ");
        System.out.println("2. <평야> ");
        System.out.println("3. <마왕성> ");
        System.out.println("4. 종료하기");
        System.out.print("선택 > ");

        int choice = sc.nextInt();
        return choice;
    }

    public void vm() {
        while (true) {
            System.out.println(" ====== 마을 ====== ");
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 대장간 ");
            System.out.println("2. 성당 ");
            System.out.println("3. 인벤토리 ");
            System.out.println("4. 돌아가기 ");
            System.out.print("선택 > ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    blacksmith();
                    break;
                case 2:
                    church();
                    break;
                case 3:
                    System.out.println("인벤토리 확인");
                    break;
                case 4:
                    System.out.println("돌아가기");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    public void blacksmith() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" ====== 대장간 ====== ");
            System.out.println("1. 구입하기 ");
            System.out.println("2. 판매하기 ");
            System.out.println("3. 돌아가기 ");
            System.out.print("선택 > ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("구입 가능한 아이템 목록:");
                    for (int i = 0; i < shopItems.size(); i++) {
                        System.out.println((i + 1) + ". " + shopItems.get(i));
                    }
                    System.out.print("구입할 아이템 번호를 선택하세요: ");
                    int itemChoice = sc.nextInt();
                    if (itemChoice > 0 && itemChoice <= shopItems.size()) {
                        Item selectedItem = shopItems.get(itemChoice - 1);
                        System.out.println(selectedItem.getName() + "을(를) 구입했습니다.");
                    } else {
                        System.out.println("잘못된 선택입니다.");
                    }
                    break;
                case 2:
                    System.out.println("판매하기 메뉴를 선택했습니다.");
                    break;
                case 3:
                    System.out.println("돌아가기");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    public void church() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" ====== 성당 ====== ");
            System.out.println("1. 회복 (30골드 소비) ");
            System.out.println("2. 구매하기 ");
            System.out.println("3. 돌아가기 ");
            System.out.print("선택 > ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (adventurer.spendGold(30)) {
                        System.out.println("모험가의 체력을 회복합니다.");
                        adventurer.heal();
                    }
                    break;
                case 2:
                	System.out.println("구매할 아이템 목록:");
                    System.out.println("1. " + Item.POTION.getName() + " (가격: " + Item.POTION.getPrice() + "골드)");
                    System.out.print("구매 : ");
                    int itemChoice = sc.nextInt();
                    if (itemChoice == 1) {
                        if (adventurer.spendGold(Item.POTION.getPrice())) {
                            adventurer.addItem(Item.POTION);
                        	System.out.println(Item.POTION.getName() + "을(를) 구매했습니다.");
                        } else {
                            System.out.println("골드가 부족합니다.");
                        }
                    } else {
                        System.out.println("잘못된 선택입니다.");
                    }
                    break;
                case 3:
                    System.out.println("돌아가기");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    public boolean fm() {
        while (true) {
            System.out.println(" ====== 평야 ====== ");
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 전투 ");
            System.out.println("2. 채집 ");
            System.out.println("3. 돌아가기 ");
            System.out.print("선택 > ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("전투를 시작합니다.\n");
                    goblin = new Character("고블린", 20, 10, 5, 5);
                    Battle battle = new Battle(adventurer, goblin, this); // Battle 객체 생성 및 실행
                    battle.start();
                    break;
                case 2:
                    System.out.println("채집을 시작합니다.");
                    System.out.println("채집 가능한 아이템 목록:");
                    for (int i = 0; i < fieldItems.size(); i++) {
                        System.out.println((i + 1) + ". " + fieldItems.get(i));
                    }
                    System.out.print("채집할 아이템 번호를 선택하세요: ");
                    int gatherChoice = sc.nextInt();
                    if (gatherChoice > 0 && gatherChoice <= fieldItems.size()) {
                        Item selectedItem = fieldItems.get(gatherChoice - 1);
                        System.out.println(selectedItem.getName() + "을(를) 채집했습니다.");
                    } else {
                        System.out.println("잘못된 선택입니다.");
                    }
                    break;
                case 3:
                    System.out.println("돌아갑니다.");
                    return true;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    public boolean runChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            choice = cm();
            switch (choice) {
                case 1:
                    System.out.println(" ");
                    vm();
                    break;
                case 2:
                    System.out.println(" ");
                    if (fm()) {
                        continue;
                    }
                    break;
                case 3:
                    System.out.println(" ");
                    return false;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return true;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}