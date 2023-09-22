package Newjava;
import java.util.Scanner;
public class HW15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원반지름or정삼각형,정사각형 한변 입력");
		int var1 =scanner.nextInt();
		System.out.println("정삼각형높이 입력");
		int var2 =scanner.nextInt();
		System.out.println("원 삼각형 사각형");
		String var3 =scanner.next();
		System.out.println("넓이 둘레");
		String var4 =scanner.next();
		double r1=3.14*var1*var1;
		double r2=2*var1*3.14;
		double r3=(var1*var2)/2;
		double r4=var1*3;
		double r5=var1*var1;
		double r6=var1*4;
		if(var3.equals("원")) {
			if(var4.equals("넓이")){
			System.out.println("원의넓이"+r1);
			}else
			System.out.println("원의둘레"+r2);
		}
		if(var3.equals("삼각형")) {
			if(var4.equals("넓이")){
				System.out.println("삼각형의넓이"+r3);
				}else
				System.out.println("삼각형의둘레"+r4);
		}
		if(var3.equals("사각형")) {
			if(var4.equals("넓이")){
				System.out.println("사각형의넓이"+r5);
				}else
				System.out.println("사각형의둘레"+r6);
		}
	}

}
