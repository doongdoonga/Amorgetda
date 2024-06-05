package javaworld.beta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Choice {

    private Character adventurer;
    private Character goblin;
    private Character wolf;
    private Character zombie;
    private Character demonKing;
    private List<Item> shopItems;
    private List<Item> fieldItems;

    public Choice(Character adventurer, Character goblin, Character demonKing, Character wolf, Character zombie) {
        this.adventurer = adventurer;
        this.goblin = goblin;
        this.wolf = wolf;
        this.zombie = zombie;
        this.demonKing = demonKing;
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
        System.out.println("4. <산림> ");
        System.out.println("5. <폐광> ");
        System.out.println("6. 종료하기");
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
        return exploreArea("평야", new Character("고블린", 20, 10, 5, 5));
    }

    public boolean forest() {
        return exploreArea("산림", new Character("늑대", 30, 20, 10, 10));
    }

    public boolean mine() {
        return exploreArea("폐광", new Character("좀비", 40, 25, 15, 15));
    }

    private boolean exploreArea(String areaName, Character monster) {
        while (true) {
            System.out.println(" ====== " + areaName + " ====== ");
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 전투 ");
            System.out.println("2. 채집 ");
            System.out.println("3. 돌아가기 ");
            System.out.print("선택 > ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("전투를 시작합니다.\n");
                    Battle battle = new Battle(adventurer, monster, this); // Battle 객체 생성 및 실행
                    battle.start();
                    break;
                
                case 2:
                    System.out.print("채집 중");

                    Item gatheredItem = Item.gatherItem();
                    if (gatheredItem != null) {
                        String str = "...";
                        for (int i = 0; i < str.length(); i++) {
                            char c = str.charAt(i);
                            System.out.print(c);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println();
                        System.out.println(gatheredItem);
                    } else {
                        System.out.println("채집 실패하였습니다.");
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
                    if (forest()) {
                        continue;
                    }
                    break;
                case 4:
                    System.out.println(" ");
                    if (mine()) {
                        continue;
                    }
                    break;
                case 5:
                	System.out.println(" ");
                	System.out.println("마왕과의 전투를 시작합니다.\n");
                	Character darkLord = Character.DARK_LORD;
                	Battle battle = new Battle(adventurer, darkLord, this); // Battle 객체 생성 및 실행
                	if (battle.start()) {
                		System.out.println("마왕을 물리쳤습니다! 게임에서 승리했습니다.");
                	} else {
                		System.out.println("마왕에게 패배했습니다. 게임 오버.");
                	}
                	break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return true;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}