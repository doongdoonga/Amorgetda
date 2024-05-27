package menu;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("게임에 오신 것을 환영합니다!\n");
		System.out.println("1.칼과 2.활 중 하나를 선택하세요 : \n");

		int weaponChoice = scanner.nextInt();
		String weapon;

		if (weaponChoice == 1) {
			weapon = "칼";
		} else if (weaponChoice == 2) {
			weapon = "활";
		} else {
			System.out.println("잘못된 선택입니다. 기본 무기인 칼을 선택합니다.\n");
			weapon = "칼";
		}

		System.out.println("당신은 " + weapon + "을(를) 선택했습니다.");

		
		int playerGold = 0;
		int totalWins = 0;

		for (int battleCount = 1; battleCount <= 3; battleCount++) {
			System.out.println("고블린과의 전투 " + battleCount + "번째 전투가 시작됩니다!\n");
			System.out.println("전투를 시작합니다.\n");
			
			int playerHits = 0;
			int goblinHits = 0;

			while (playerHits < 3 && goblinHits < 3) {
				System.out.println("1.공격,2.방어,3.회복을 선택하세요 : ");
				int playerAction = scanner.nextInt();
				int goblinAction = random.nextInt(2);
				if (playerAction == 1) {
					if (goblinAction != 1) {
						goblinHits++;
						System.out.println("고블린을 공격하여 데미지를 입혔습니다.\n");
					} else {
						System.out.println("고블린이 방어하여 공격을 막았습니다.\n");
					}
				} else if (playerAction == 2) {
					System.out.println("방어 자세를 취했습니다.\n");
				} else if (playerAction == 3) {					
					System.out.println("회복하여 체력을 조금 회복했습니다.\n");
				} else {
					System.out.println("잘못된 선택입니다. 아무 일도 일어나지 않았습니다.\n");
				}

				
				if (goblinAction == 0) {					
					if (playerAction != 2) { 
						playerHits++;
						System.out.println("고블린이 당신을 공격하여 데미지를 입혔습니다.\n");
					} else {
						System.out.println("당신이 방어하여 고블린의 공격을 막았습니다.\n");
					}
				} else if (goblinAction == 1) {
					System.out.println("고블린이 방어 자세를 취했습니다.\n");
				}

				System.out.println("현재 당신이 받은 공격 횟수: " + playerHits + " / 3 \n");
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

		if (totalWins == 3) {
			System.out.println("3번의 전투에서 모두 승리했습니다. 마을2로 이동합니다.\n");
		}

		scanner.close();
	}
}