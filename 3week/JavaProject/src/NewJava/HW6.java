package NewJava;
import java.util.Scanner;
public class HW6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("삼각형 밑변:");
		String strX=scanner.nextLine();
		int x=Integer.parseInt(strX);
		
		System.out.print("삼각형 높이:");
		String strY=scanner.nextLine();
		int y=Integer.parseInt(strY);
		
		System.out.print("사각형 한변:");
		String strZ=scanner.nextLine();
		int z=Integer.parseInt(strY);
		
		int result1=(x*y)/2;
		System.out.println("삼각형 넓이="+result1);
		int result2=z*z;
		System.out.println("사각형 넓이="+result2);
	}

}
