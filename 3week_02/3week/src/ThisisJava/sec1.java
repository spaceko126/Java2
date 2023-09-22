package ThisisJava;
import java.util.Scanner;
public class sec1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수입력");
		int score =scanner.nextInt();
		if(score>=90) {
			System.out.println("점수가90보다큽니다");
			System.out.println("등급은a입니다");
		}
		if(score<90)
			System.out.println("점수가90보다 작습니다");
			System.out.println("등급은 b입니다");
	}

}
