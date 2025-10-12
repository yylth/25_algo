import java.util.Scanner;

public class Transfusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String in;
		String out;
		boolean able=false;

		do {
			System.out.print("헌혈 할 사람의 혈액형을 입력하세요 : ");
			out = sc.next();
		}  while (!out.equalsIgnoreCase("A") &&!out.equalsIgnoreCase("B") &&!out.equalsIgnoreCase("O") &&!out.equalsIgnoreCase("AB"));

		do {
			System.out.print("수혈 받을 사람의 혈액형을 입력하세요 : ");
			in = sc.next();
		} while (!in.equalsIgnoreCase("A") &&!in.equalsIgnoreCase("B") &&!in.equalsIgnoreCase("O") &&!in.equalsIgnoreCase("AB"));
		
		if (in.equalsIgnoreCase(out)) able=true;
		else if (in.equalsIgnoreCase("AB")||out.equalsIgnoreCase("O")) able=true;
		
		System.out.print(out+"형에서 "+in+"형으로 ");
		
		if (able) System.out.println("수혈 가능합니다.");
		else System.out.println("수혈 불가능합니다.");
		
		sc.close();
	}
}