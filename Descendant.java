import java.util.Scanner;

public class Descendant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String father;
		String mother;

		do {
			System.out.print("아빠의 혈액형을 입력하세요 : ");
			father = sc.next();
		} while (!father.equalsIgnoreCase("A") && !father.equalsIgnoreCase("B") && !father.equalsIgnoreCase("O")
				&& !father.equalsIgnoreCase("AB"));

		do {
			System.out.print("수혈 받을 사람의 혈액형을 입력하세요 : ");
			mother = sc.next();
		} while (!mother.equalsIgnoreCase("A") && !mother.equalsIgnoreCase("B") && !mother.equalsIgnoreCase("O")
				&& !mother.equalsIgnoreCase("AB"));
		System.out.print("아빠가 "+ father +"형, 엄마가 "+mother+"형일 때 나올 수 있는 자녀의 혈액형은 ");
		if ((father.equalsIgnoreCase("O") && mother.equalsIgnoreCase("O"))) {
			System.out.print("O");
		} else if ((father.equalsIgnoreCase("A") && mother.equalsIgnoreCase("A"))) {
			System.out.print("A, O");
		} else if ((father.equalsIgnoreCase("B") && mother.equalsIgnoreCase("B"))) {
			System.out.print("B, O");
		} else if ((father.equalsIgnoreCase("A") && mother.equalsIgnoreCase("B"))
				|| (father.equalsIgnoreCase("B") && mother.equalsIgnoreCase("A"))) {
			System.out.print("A, B, AB, O");
		} else if ((father.equalsIgnoreCase("A") && mother.equalsIgnoreCase("O"))
				|| (father.equalsIgnoreCase("O") && mother.equalsIgnoreCase("A"))) {
			System.out.print("A, O");
		} else if ((father.equalsIgnoreCase("B") && mother.equalsIgnoreCase("O"))
				|| (father.equalsIgnoreCase("O") && mother.equalsIgnoreCase("B"))) {
			System.out.print("B, O");
		} else if ((father.equalsIgnoreCase("AB") && mother.equalsIgnoreCase("AB"))) {
			System.out.print("A, B, AB");
		} else if ((father.equalsIgnoreCase("AB") && mother.equalsIgnoreCase("A"))
				|| (father.equalsIgnoreCase("A") && mother.equalsIgnoreCase("AB"))) {
			System.out.print("A, B, AB");
		} else if ((father.equalsIgnoreCase("AB") && mother.equalsIgnoreCase("B"))
				|| (father.equalsIgnoreCase("B") && mother.equalsIgnoreCase("AB"))) {
			System.out.print("A, B, AB");
		} else if ((father.equalsIgnoreCase("AB") && mother.equalsIgnoreCase("O"))
				|| (father.equalsIgnoreCase("O") && mother.equalsIgnoreCase("AB"))) {
			System.out.print("A, B");
		}
		System.out.print(" 입니다");
		sc.close();
	}

}