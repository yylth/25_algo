import java.util.Random;
import java.util.Scanner;

public class TwentyOneGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Num = 0;
        int human=0;
        int computer=0;
        boolean Turn = true; // true면 사용자 차례, false면 컴퓨터 차례

        System.out.println("              21 게임 시작!");
        while (Num < 21) {
            if (Turn) {
                human = 0;
                while (human != 1 && human != 2) {
                    System.out.print("              몇 개의 숫자를 말할까요? (1 또는 2 입력): ");
                    human = in.nextInt();
                }
                for (int i = 0; i < human; i++) {
                    Num++;
                    System.out.println(" 사람:\t" + Num);
                    if (Num == 21) {
                        System.out.println("              사람이 21을 말했습니다. 컴퓨터 승!");
                        in.close();
                        return;
                    }
                }
                Turn = false;
            } else {
                Random rand = new Random();
                computer = rand.nextInt(2) + 1;
            	System.out.println();
                for (int i = 0; i < computer; i++) {
                    Num++;
                    System.out.println("컴퓨터:\t" + Num);
                    if (Num == 21) {
                        System.out.println("              컴퓨터가 21을 말했습니다. 사람 승!");
                        in.close();
                        return;
                    }
                }
                Turn = true;
            }
        }
        in.close();
    }
}
