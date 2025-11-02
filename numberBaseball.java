import java.util.*;
public class numberBaseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        // 컴퓨터의 숫자 생성 (1~9, 중복 없이 3자리)
        List<Integer> target = new ArrayList<>();
        Random rand = new Random();
        while (target.size() < 3) {
            int n = rand.nextInt(9) + 1;
            if (!target.contains(n)) target.add(n);
        }

        int attempts = 0;
        System.out.println("=== 숫자 야구 게임 시작! ===");
        System.out.println("1~9 사이의 서로 다른 3자리 숫자를 맞혀보세요.");

        while (true) {
            System.out.print("세 자리 수(예: 123): ");
            String input = sc.next();
            if (input.length() != 3 || !input.matches("[1-9]{3}")) {
                System.out.println("입력이 올바르지 않습니다. 1~9 사이 다른 수로 3자리 입력!");
                continue;
            }

            // 입력값 숫자 중복 체크
            char[] chars = input.toCharArray();
            if (chars[0] == chars[1] || chars[0] == chars[2] || chars[1] == chars[2]) {
                System.out.println("서로 다른 숫자 3개를 입력하세요!");
                continue;
            }

            attempts++;
            int strike = 0, ball = 0;

            // 스트라이크/볼 판정
            for (int i = 0; i < 3; i++) {
                int num = chars[i] - '0';
                if (target.get(i) == num) {
                    strike++;
                } else if (target.contains(num)) {
                    ball++;
                }
            }

            if (strike == 3) {
                System.out.printf("정답입니다! %d번 만에 맞추었습니다!\n", attempts);
                break;
            } else {
                System.out.printf("%dS %dB\n", strike, ball);
            }
        }

        sc.close();
	}

}
