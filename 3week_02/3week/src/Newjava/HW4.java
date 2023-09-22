package Newjava;
import java.util.Scanner;
public class HW4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원금입력");
		int var1 =scanner.nextInt();
		System.out.println("이자율입력");
		int var2 =scanner.nextInt();
		System.out.println("기간입력");
		int var3 =scanner.nextInt();
		System.out.println("기간입력");
		System.out.println("단리복리");
		String var4 =scanner.next();
		int r1=var1*(1+(var2/100)*var3);
		int v1=var1+(var2/100);
		double r2=Math.pow(v1,var3);
		if(var4.equals("단리")) {
			System.out.println(r1);
		}
		if(var4.equals("복리")) {
			System.out.println(r2);
		}
	}

}
