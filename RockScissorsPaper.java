import java.util.Scanner;
import java.util.Random;

public class RockScissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int human = 0;
		int computer = 0;
		int vs = 0;
		int max = 0;
		boolean win = true;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		while (win) {
			do {
				System.out.print("가위(1), 바위(2), 보(3) : ");
				human = sc.nextInt();
			} while (human < 1 || human > 3);
			computer = rd.nextInt(3) + 1;
			if (human == computer) {
				vs = 0;
			} else if (human - computer == 1) {
				vs = 1;
				max++;
			} else if (human - computer == 2) {
				vs = -1;
				win = false;
			} else if (human - computer == -1) {
				vs = -1;
				win = false;
			} else if (human - computer == -2) {
				vs = 1;
				max++;
			}
			System.out.println("당신 : "+human + ", 컴퓨터 : " + computer + ", 연승 : " + max);
			switch (vs) {
			case 1:
				System.out.println("당신이 이겼습니다.");
				break;
			case -1:
				System.out.println("컴퓨터가 이겼습니다.");
				break;
			default:
				System.out.println("비겼습니다.");
			}
		}
		System.out.println("최다 연승 : " + max);
		sc.close();

	}

}