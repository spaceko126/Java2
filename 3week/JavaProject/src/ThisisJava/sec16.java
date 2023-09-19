package ThisisJava;
import java.util.Scanner;
public class sec16 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("문자열로 정수를 넣으시오");
		String input=scanner.nextLine();
		int parsedInt=Integer.parseInt(input);
		System.out.println("또 다른 정수를 넣으시오");
		int userInputInt=scanner.nextInt();
		System.out.println("문자열정수"+parsedInt);
		System.out.println("사용자 입력으로부터 정수"+userInputInt);
		scanner.close();
		
		
		
	}

}
