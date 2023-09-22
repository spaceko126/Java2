package Newjava;
import java.util.Scanner;
public class HW6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수입력");
		int score =scanner.nextInt();
		if(score>=10) {
			System.out.println("점수가10보다큽니다");
		} else {
			System.out.println("점수가10보다 작습니다");
	}
	}
}

