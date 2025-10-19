import java.util.Random;
import java.util.Scanner;

public class twentyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int player1Total = 0, player2Total = 0;
		boolean dice = true;

		System.out.println("=== 21 주사위 게임 ===");
		System.out.println("1 : 왼쪽 사람만 주사위를 굴림, 2 : 둘 다 주사위를 굴림, 3 : 오른쪽 사람만 주사위를 굴림, 0 : 그만 굴리기");
		System.out.println("21을 넘기면 패배\n");

		// 사용자 턴: 동시에 주사위 굴리기
		while (dice) {
			System.out.printf("[플레이어1] %d VS %d [플레이어2]\n", player1Total, player2Total);
			if (player1Total > 21) {
				System.out.println("Player2가 이겼습니다.");
				dice = false;
				break;
			}
			if (player2Total > 21) {
				System.out.println("Player1이 이겼습니다.");
				dice = false;
				break;
			}
			int input = sc.nextInt();
			switch (input) {
			case 1:
				player1Total += rd.nextInt(6) + 1;
				break;
			case 2:
				player1Total += rd.nextInt(6) + 1;
				player2Total += rd.nextInt(6) + 1;
				break;
			case 3:
				player2Total += rd.nextInt(6) + 1;
				break;
			default:
				System.out.printf("[플레이어1] %d VS %d [플레이어2]\n", player1Total, player2Total);
				if (player1Total == player2Total) System.out.println("비겼습니다.");
				else if (player1Total > player2Total) System.out.println("플레이어1이 이겼습니다.");
				else  System.out.println("플레이어2가 이겼습니다..");
				dice = false;
			}

		}
		sc.close();
	}
}