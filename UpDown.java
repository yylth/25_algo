import java.util.Scanner;
import java.util.Random;
public class UpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        do {
            Random rand = new Random();
            int answer = rand.nextInt(100) + 1; // 1~100 중 랜덤 정답
            int count = 0;

            System.out.println("=== Up/Down 게임을 시작합니다! (1~100) ===");

            while (true) {
                System.out.print("숫자를 입력하세요: ");
                int guess = sc.nextInt();
                count++;

                if (guess < 1 || guess > 100) {
                    System.out.println("1~100 사이의 숫자를 입력하세요.");
                    continue;
                }

                if (guess == answer) {
                    System.out.printf("정답입니다! 시도 횟수: %d\n", count);
                    break;
                } else if (guess < answer) {
                    System.out.println("Up");
                } else {
                    System.out.println("Down");
                }
            }

            System.out.print("다시 플레이 하시겠습니까? (y/n): ");
        } while (sc.next().equalsIgnoreCase("y"));

        System.out.println("게임이 종료되었습니다!");
        sc.close();
	}

}
