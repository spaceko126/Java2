package Newjava;
import java.util.Scanner;
public class HW11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수입력");
		int var1 =scanner.nextInt();
		System.out.println("수입력");
		int var2 =scanner.nextInt();
		System.out.println("덧셈곱셈입력");
		String var3 =scanner.next();
		int r1=var1+var2;
		int r2=var1-var2;
		int r3=var1*var2;
		if(var3.equals("덧셈")) {
			System.out.println(r1);
		}
		else if(var3.equals("뺄셈")) {
			System.out.println(r2);
		}
		else{
			System.out.println(r3);
		}
		
	}
}
