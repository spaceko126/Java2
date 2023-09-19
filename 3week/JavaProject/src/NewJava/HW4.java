package NewJava;
import java.util.Scanner;
public class HW4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("x값 입력:");
		String strX=scanner.nextLine();
		int x=Integer.parseInt(strX);
		
		System.out.print("y값 입력:");
		String strY=scanner.nextLine();
		int y=Integer.parseInt(strY);
		
		int result1=x+y;
		System.out.println("x+y="+result1);
		int result2=x-y;
		System.out.println("x-y="+result2);
		int result3=x*y;
		System.out.println("x*y="+result3);
		int result4=x/y;
		System.out.println("x/y="+result4);
	}

}
