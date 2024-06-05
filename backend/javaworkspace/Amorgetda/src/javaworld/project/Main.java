package javaworld.project;

public class Main {

    public static void main(String[] args) {

        Character adventurer = new Character("모험가", 50, 15, 5, 10);

        Character goblin = new Character("고블린", 20, 10, 5, 5);

        Choice select = new Choice(adventurer, goblin);

        while (true) {
            if(select.runChoice())
            	break;
        	
            int c = select.cm();

            switch (c) {
            case 1:
                System.out.println("마을을 선택하였습니다.");
                select.vm(); 
                break;

            case 2:
                System.out.println("평야로 이동");
                select.fm(); 
                break;

            case 3:
            	 System.out.println("마왕성으로 돌격");
                 System.out.println("마왕과의 전투를 시작합니다.\n");
                 Character darkLord = Character.DARK_LORD;
                 Battle battle = new Battle(adventurer, darkLord, select); // Battle 객체 생성 및 실행
                 if (battle.start()) {
                     System.out.println("마왕을 물리쳤습니다! 게임에서 승리했습니다.");
                 } else {
                     System.out.println("마왕에게 패배했습니다. 게임 오버.");
                 }
                 break;

            case 4:
                System.out.println("프로그램을 종료합니다.");
                return;

            default:
                System.out.println("잘못된 선택입니다. 다시 선택하세요");
            }
        }
    }
}