package org.Amorgetda.day06.array.sort;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userChoice, enemyHealth, userAttack, enemyAttack;
        int gold = 0;
        int userDamageTaken = 0;
        int totalDamageTaken = 0;
        int nextVillageCount = 0; // 다음 마을에 도착한 횟수
        boolean weaponUpgraded = false; // 무기 강화 여부

        for (int i = 1; i <= 3; i++) { // 전투 3번 진행
            System.out.println("마을에서 출발합니다. (전투 " + i + "/3)");
            System.out.println("1. 칼");
            System.out.println("2. 지팡이");

            while (true) {
                System.out.print("무기를 선택하세요: ");
                userChoice = scanner.nextInt();
                if (userChoice == 1) {
                    System.out.println("칼을 선택하셨습니다.");
                    break;
                } else if (userChoice == 2) {
                    System.out.println("지팡이를 선택하셨습니다.");
                    break;
                } else {
                    System.out.println("올바른 선택을 해주세요.");
                }
            }

            enemyHealth = 3; // 적의 체력 초기화
            userDamageTaken = 0;

            while (enemyHealth > 0) {
                userAttack = random.nextInt(2); // 사용자의 공격은 0(공격) 또는 1(공격 막기)
                enemyAttack = random.nextInt(2); // 적의 공격은 0(공격) 또는 1(공격 막기)

                if (userAttack == 0 && enemyAttack == 0) {
                    System.out.println("상대방과 나 모두가 공격을 선택했습니다. 비겼습니다!");
                } else if (userAttack == 0 && enemyAttack == 1) {
                    System.out.println("당신은 공격을 선택했지만, 상대방이 공격을 막았습니다.");
                } else if (userAttack == 1 && enemyAttack == 0) {
                    System.out.println("당신은 공격을 막았지만, 상대방이 공격했습니다.");
                    userDamageTaken++;
                    totalDamageTaken++;
                } else {
                    System.out.println("상대방과 나 모두가 공격을 막기를 선택했습니다. 비겼습니다!");
                }

                if (userDamageTaken >= 3) {
                    System.out.println("당신은 상대방의 공격을 3번 받아 마을로 돌아갑니다.");
                    return;
                }
            }

            System.out.println("상대방을 쓰러트렸습니다!");
            gold += 10;
            System.out.println("10G를 획득하였습니다.");

            if (i < 3) {
                System.out.println("마을로 돌아왔습니다. 마을에서 할 일을 선택하세요.");
                System.out.println("1. 무기 강화 (20골드)");
                System.out.println("2. 회복 (15골드)");

                while (true) {
                    System.out.print("선택하세요: ");
                    userChoice = scanner.nextInt();
                    if (userChoice == 1) {
                        if (gold >= 20) {
                            gold -= 20;
                            userDamageTaken = Math.max(0, userDamageTaken - 1);
                            System.out.println("무기를 강화하여 적을 쓰러트리는데 필요한 공격 횟수가 1회 줄었습니다.");
                            weaponUpgraded = true; // 무기가 강화됨
                            break;
                        } else {
                            System.out.println("골드가 부족합니다. 다른 선택을 해주세요.");
                        }
                    } else if (userChoice == 2) {
                        if (gold >= 15) {
                            gold -= 15;
                            totalDamageTaken = Math.max(0, totalDamageTaken - 1);
                            System.out.println("회복하여 누적된 데미지가 1회 줄었습니다.");
                            break;
                        } else {
                            System.out.println("골드가 부족합니다. 다른 선택을 해주세요.");
                        }
                    } else {
                        System.out.println("올바른 선택을 해주세요.");
                    }
                }
            } else {
                nextVillageCount++;
                if (nextVillageCount >= 2 && weaponUpgraded) {
                    System.out.println("다음 마을에 도착하였습니다. 마을에서 마왕을 조우하게 됩니다!");
                    System.out.println("당신은 새로운 마왕이 되어 왕국을 멸망시켰습니다!");
                    // 마왕을 조우하는 코드 작성
                    break;
                } else if (nextVillageCount >= 2 && !weaponUpgraded) {
                    System.out.println("다음 마을에 도착하였습니다. 마을에서 무기를 강화하지 않아 마왕을 만나지 못합니다. 전투에 패배했습니다.");
                    return;
                } else {
                    System.out.println("다음 마을로 이동합니다.");
                }
            }
        }
    }
}


