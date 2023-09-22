package NewSemester;

import java.util.Scanner;

public class sec17 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("첫번째 수입력 :");
		int score = scanner.nextInt();
		System.out.println("두번째 수입력 :");
		int score2 = scanner.nextInt();
		System.out.println("무슨 계산식을 사용하나요 :");
		String cal = scanner.next();
		int a1=score+score2;
		int a2=score-score2;
		int a3=score*score2;
		int a4=score/score2;
		if(cal.equals("더하기")) {
		System.out.println("더하기"+a1);
		}
		if(cal.equals("빼기")) {
		System.out.println("빼기"+a2);
		}
		if(cal.equals("곱하기")) {
		System.out.println("곱하기"+a3);
		}
		if(cal.equals("나누기"))
		System.out.println("나누기"+a4);

	}

}
