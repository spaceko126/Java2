package NewSemester;

import java.util.Scanner;

public class sec19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("알고싶은 도형");
		String a = scanner.next();
		System.out.println("넓이 or 둘레");
		String aa = scanner.next();
		System.out.println("반지름이나 밑변");
		int b = scanner.nextInt();
		System.out.println("반지름이나 높이");
		int c = scanner.nextInt();
		double circle1=b*b*3.14;
		double circle2=2*b*3.14;
		double tri1=b*c/2;
		double tri2=b*3;
		double squ1=b*c;
		double squ2=b*4;
		if(a.equals("원")) {
			if(aa.equals("넓이")) {
			System.out.println("원의 넓이"+circle1);
			}
			else {
			System.out.println("원의 둘레"+circle2);
		}
		}
		if(a.equals("삼각형")) {
			if(aa.equals("넓이")) {
				System.out.println("삼각형 넓이"+tri1);			}
		
		else {
		System.out.println("삼각형 둘레"+tri2);
		}
		}
		if(a.equals("사각형")) {
			if(aa.equals("넓이")) {
				System.out.println("사각형 넓이"+squ1);
			}else {
				System.out.println("사각형 둘레"+squ2);
	}

}
}
}