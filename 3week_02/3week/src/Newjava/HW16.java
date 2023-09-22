package Newjava;
import java.util.Scanner;
public class HW16 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("점수 :");
		int score = scanner.nextInt();
		String grade;
	if(score>=90) {
		if(score>=95) {
			grade ="A+";
			System.out.println(grade);
		}
		else {
			grade ="A";
			System.out.println(grade);
		}
	}
	if(score>=80) {
		if(score>=85) {
			grade ="B+";
			System.out.println(grade);
		}
		else {
			grade ="B";
			System.out.println(grade);
		}
	}
	else {
		System.out.println("불합격");
	}
	}

}
