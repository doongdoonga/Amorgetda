package menu;

import java.util.Random;
import java.util.Scanner;

public class JavaWorld_Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("JavaWorld 에 오신 것을 환영합니다!");
        System.out.print("1.소드 2.메이스 중 하나를 선택하세요 : ");

        int weaponChoice = scanner.nextInt();
        System.out.println();
        String weapon;

        if (weaponChoice == 1) {
            weapon = "소드";
        } else if (weaponChoice == 2) {
            weapon = "메이스";
        } else {
            System.out.print("잘못된 선택입니다. 기본 무기인 소드를 선택합니다.\n");
            weapon = "소드";
        }

        System.out.println("당신은 " + weapon + "을(를) 선택했습니다.");

        int playerHits = 0;
        int goblinHits = 0;
        int playerGold = 0;
        int totalWins = 0;
        int weaponStrength = 0; 
        int armorStrength = 0;  
        boolean recoveryEnhanced = false; 
        int playerDurability = 3;
        boolean weaponEnhanced = false; 

        
        for (int village = 1; village <= 3; village++) {
            System.out.println("마을" + village + "에서의 전투가 시작됩니다.\n");

            for (int battleCount = 1; battleCount <= 3; battleCount++) {
                System.out.println("스켈레톤과의 전투 " + battleCount + "번째 전투가 시작됩니다!\n");
                System.out.println("전투를 시작합니다.\n");

                playerHits = 0;
                goblinHits = 0;

                while (playerHits < playerDurability && goblinHits < 3) {
                    System.out.print("1.공격, 2.반격, 3.힐을 선택하세요 : ");
                    int playerAction = scanner.nextInt();
                    int goblinAction = random.nextInt(3) + 1;

                    if (playerAction == 1 && goblinAction == 3 || playerAction == 2 && goblinAction == 1 || playerAction == 3 && goblinAction == 2) {
                        goblinHits += 1 + weaponStrength; 
                        System.out.println("당신이 스켈레톤을 공격하여 데미지를 입혔습니다.\n");
                        if (playerAction == 3) {
                            if (recoveryEnhanced) {
                                playerHits = playerHits > 1 ? playerHits - 2 : 0;
                                System.out.println("힐을 선택하여 체력을 크게 회복했습니다.\n");
                            } else {
                                playerHits = playerHits > 0 ? playerHits - 1 : 0;
                                System.out.println("힐을 선택하여 체력을 조금 회복했습니다.\n");
                            }
                        }
                    } else if (playerAction == goblinAction) {
                        System.out.println("당신과 스켈레톤이 같은 행동을 선택하여 비겼습니다.\n");
                    } else {
                        int damageToPlayer = 1 - armorStrength; 
                        damageToPlayer = Math.max(damageToPlayer, 0); 
                        playerHits += damageToPlayer;
                        System.out.println("스켈레톤이 당신을 공격하여 데미지를 입혔습니다.\n");
                    }

                    System.out.println("현재 당신이 받은 공격 횟수: " + playerHits + " / " + playerDurability);
                    System.out.println("현재 스켈레톤이 받은 공격 횟수: " + goblinHits + " / 3 \n");
                }

                if (goblinHits >= 3) {
                    playerGold += 10;
                    totalWins++;
                    System.out.println("스켈레톤을 물리쳤습니다! \n");
                    System.out.println("10G를 획득했습니다. 현재 소지금: " + playerGold + "G\n");
                } else {
                    System.out.println("패배했습니다. 게임 오버.\n");
                    System.out.println("시작 마을로 이동합니다.\n");
                    return;
                }
            }

            if (totalWins == 3) {
            	totalWins = 0;
            	if(village <= 3) {
	                System.out.println("3번의 전투에서 모두 승리했습니다. 마을" + (village + 1) + "로 이동합니다.\n");
	
	                System.out.println("마을" + (village + 1) + "에 도착하였습니다.");
	                System.out.println("1. 무기강화 (30G)");
	                System.out.println("2. 방어구 강화 (20G)");
	                System.out.println("3. 신성강화 (25G)");
	                System.out.println("4. 다음 여정을 진행한다");
	                System.out.print("원하는 서비스를 선택하세요: ");
	                int serviceChoice = scanner.nextInt();
	
	                if (serviceChoice == 1) {
	                    if (playerGold >= 30) {
	                        playerGold -= 30;
	                        weaponStrength++;
	                        weaponEnhanced = true; 
	                        System.out.println("무기가 강화되었습니다. 현재 소지금: " + playerGold + "G\n");
	                    } else {
	                        System.out.println("소지금이 부족하여 무기강화를 할 수 없습니다.\n");
	                    }
	                } else if (serviceChoice == 2) {
	                    if (playerGold >= 20) {
	                        playerGold -= 20;
	                        playerDurability++; 
	                        System.out.println("방어구가 강화되었습니다. 현재 소지금: " + playerGold + "G\n");
	                    } else {
	                    	   System.out.println("소지금이 부족하여 방어구 강화를 할 수 없습니다.\n");
	                    }
	                } else if (serviceChoice == 3) {
	                    if (playerGold >= 25) {
	                        playerGold -= 25;
	                        recoveryEnhanced = true;
	                        System.out.println("신성이 강화되었습니다. 현재 소지금: " + playerGold + "G\n");
	                    } else {
	                        System.out.println("소지금이 부족하여 신성강화를 할 수 없습니다.\n");
	                    }
	                } else if (serviceChoice == 4) {
	                    System.out.println("다음 여정을 진행합니다. 현재 소지금: " + playerGold + "G\n");
	                } else {
	                    System.out.println("잘못된 선택입니다.");
	                }
            	}
            	
            	if(village == 3) {
            		System.out.println("보스전 시작합니다.");
                    
                    if (!weaponEnhanced) {
                        System.out.println("무기 강화가 되지 않아 마왕과의 전투에 패배했습니다!");
                        return;
                    }
                    
                    int bossHits = 0;
                    while (playerHits < playerDurability && bossHits < 10) {
                        System.out.print("1.공격, 2.반격, 3.힐을 선택하세요 : ");
                        int playerAction = scanner.nextInt();
                        int bossAction = random.nextInt(3) + 1;

                        if (playerAction == 1 && bossAction == 3 || playerAction == 2 && bossAction == 1 || playerAction == 3 && bossAction == 2) {
                            bossHits++;
                            System.out.println("마왕을 공격하여 데미지를 입혔습니다.\n");
                            if (playerAction == 3) {
                                if (recoveryEnhanced) {
                                    playerHits = playerHits > 1 ? playerHits - 2 : 0;
                                    System.out.println("힐을 선택하여 체력을 크게 회복했습니다.\n");
                                } else {
                                    playerHits = playerHits > 0 ? playerHits - 1 : 0;
                                    System.out.println("힐을 선택하여 체력을 조금 회복했습니다.\n");
                                }
                            }
                        } else if (playerAction == bossAction) {
                            System.out.println("당신과 마왕이 같은 행동을 선택하여 비겼습니다.\n");
                        } else {
                            int damageToPlayer = 2 - armorStrength; 
                            damageToPlayer = Math.max(damageToPlayer, 0); 
                            playerHits += damageToPlayer;
                            System.out.println("마왕이 당신을 공격하여 데미지를 입혔습니다.\n");
                            //playerDurability -= 2;
                            }

                        System.out.println("현재 당신이 받은 공격 횟수: " + playerHits + " / " + playerDurability);
                        System.out.println("현재 마왕이 받은 공격 횟수: " + bossHits + " / 10 \n");
                    }

                    if (bossHits >= 10) {
                        System.out.println("마왕을 물리치고 새로운 마왕이 되어 세계를 멸망시켰습니다.ㅇㅅㅇ)b");
                        System.out.println("게임을 종료합니다.\n");
                        return;
                    } else {
                        System.out.println("패배했습니다. 게임 오버.\n");
                        System.out.println("시작 마을로 이동합니다.\n");
                        return;
                    }
            	}
            }
        }
    }
}