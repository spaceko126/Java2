package NewJava;
import java.util.Scanner;
public class HW7 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("원금:");
		String strX=scanner.nextLine();
		int x=Integer.parseInt(strX);
		
		System.out.print("이자율:");
		String strY=scanner.nextLine();
		int y=Integer.parseInt(strY);
		
		System.out.print("기간:");
		String strZ=scanner.nextLine();
		int z=Integer.parseInt(strY);
		
		int result1=x*(1+y*z);
		System.out.println("단리 이자값="+result1);
		int result2=x*(1+y)^z;
		System.out.println("복리 이자값="+result2);
		
	}

}
