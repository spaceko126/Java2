package NewJava;
import java.util.Scanner;
public class HW5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("원의 반지름 입력");
		String strX=scanner.nextLine();
		int x=Integer.parseInt(strX);
		double result1=x*2*3.14;
		System.out.println("원의둘레="+result1);
		double result2=x*x*3.14;
		System.out.println("원의넓이="+result2);
		double result3=x*x*3.14;
		System.out.println("원의부피="+result3);
		

	}

}
