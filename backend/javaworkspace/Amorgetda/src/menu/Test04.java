package menu;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("게임에 오신 것을 환영합니다!");
        System.out.print("1.칼과 2.활 중 하나를 선택하세요 : ");

        int weaponChoice = scanner.nextInt();
        System.out.println();
        String weapon;

        if (weaponChoice == 1) {
            weapon = "칼";
        } else if (weaponChoice == 2) {
            weapon = "활";
        } else {
            System.out.print("잘못된 선택입니다. 기본 무기인 칼을 선택합니다.\n");
            weapon = "칼";
        }

        System.out.println("당신은 " + weapon + "을(를) 선택했습니다.");

        
        int playerHits = 0; // 플레이어의 히트 카운트 초기
        int goblinHits = 0; // 고블린의 히트 카운트 초기화
        int playerGold = 0;
        int totalWins = 0;

        for (int repairCount = 1; repairCount <= 3; repairCount++) {
            System.out.println("정비 " + repairCount + "번째 시작!\n");
            
            playerHits = 0; 
            goblinHits = 0;

            while (playerHits < 3 && goblinHits < 3) {
                System.out.print("1.공격, 2.반격, 3.회복을 선택하세요 : ");
                int playerAction = scanner.nextInt();
                int goblinAction = random.nextInt(3) + 1;

                if (playerAction == 1 && goblinAction == 3 || playerAction == 2 && goblinAction == 1 || playerAction == 3 && goblinAction == 2) {
                    goblinHits++;
                    System.out.println("당신이 고블린을 공격하여 데미지를 입혔습니다.\n");
                    if (playerAction == 3) {
                        playerHits = playerHits > 0 ? playerHits - 1 : 0;
                        System.out.println("회복을 선택하여 체력을 조금 회복했습니다.\n");
                    }
                } else if (playerAction == goblinAction) {
                    System.out.println("당신과 고블린이 같은 행동을 선택하여 비겼습니다.\n");
                } else {
                    System.out.println("고블린이 당신을 공격하여 데미지를 입혔습니다.\n");
                    playerHits++;
                }

                System.out.println("현재 당신이 받은 공격 횟수: " + playerHits + " / 3 ");
                System.out.println("현재 고블린이 받은 공격 횟수: " + goblinHits + " / 3 \n");
            }

            if (goblinHits >= 3) {
                playerGold += 10; //
                totalWins++;
                System.out.println("고블린을 물리쳤습니다! \n");
                System.out.println("10G를 획득했습니다. 현재 소지금: " + playerGold + "G\n");
            } else {
                System.out.println("패배했습니다. 게임 오버.\n");
                System.out.println("시작 마을로 이동합니다.\n");
                return;
            }
        }

        // 마을 1에서 3번의 전투를 모두 이겼을 때
        if (totalWins == 3) {
            System.out.println("3번의 전투에서 모두 승리했습니다. 마을 2로 이동합니다.\n");

            // 마을 2로 이동
            System.out.println("마을 2에 도착하였습니다. 정비를 시작합니다.");
            // 이후 마을 2에서의 코드 계속
        }

        // 마을 2에서의 코드 계속
        // ...
    }
}