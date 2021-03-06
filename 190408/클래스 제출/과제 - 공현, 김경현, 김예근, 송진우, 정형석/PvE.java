import java.util.Scanner;

public class PvE {
	public static void main(String[] args) {
		Player[] player = new Player[6];
		player[0] = new Player1();
		player[1] = new Player1();
		player[2] = new Player1();
		player[3] = new Player1();
		player[4] = new Player1();
		player[5] = new Player1();

		Enemy[] enemy = new Enemy[6];
		enemy[0] = new Enemy1();
		enemy[1] = new Enemy1();
		enemy[2] = new Enemy1();
		enemy[3] = new Enemy1();
		enemy[4] = new Enemy1();
		enemy[5] = new Enemy1();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\n게임 시작\n\n턴 진행 시 엔터 입력");
		for(int turn = 0; turn < 10; turn++) {
			scanner.nextLine();
			for(int i = 0; i < player.length; i++) {
				if (player[i].status()) {
					int attackPower = player[i].getAttackPower();
					for(int j = 0; j < enemy.length; j++) {
						enemy[j].beUnderAttak(attackPower);
					}
				}
			}
			for(int i = 0; i < enemy.length; i++) {
				if (enemy[i].status()) {
					int attackPower = enemy[i].getAttackPower();
					for(int j = 0; j < player.length; j++) {
						player[j].beUnderAttak(attackPower);
					}
				}
			}
		}
		System.out.println("\n\n결과 출력");
		int playerCount = 0;
		for(int i = 0; i < player.length; i++) {
			if(player[i].status()) {
				playerCount++;
				System.out.println(player[i].name + "은(는) 살아있습니다. hp " + player[i].hp);
			} else {
				System.out.println(player[i].name + "은(는) 죽었습니다.");
			}
		}
		System.out.println("플레이어 생존 수 : " + playerCount + "\n");
		int enemyCount = 0;
		for(int i = 0; i < enemy.length; i++) {
			if(enemy[i].status()) {
				enemyCount++;
				System.out.println(enemy[i].name + "은(는) 살아있습니다. hp " + enemy[i].hp);
			} else {
				System.out.println(enemy[i].name + "은(는) 죽었습니다.");
			}
		}
		System.out.println("에너미 생존 수 : " + enemyCount + "\n");
	}
}
