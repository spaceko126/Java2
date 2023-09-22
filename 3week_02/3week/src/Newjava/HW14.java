package Newjava;
import java.util.Scanner;
public class HW14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("인성테스트 80점이상 통과");
		int var1 =scanner.nextInt();
		System.out.println("코딩테스트 80점이상 통과");
		int var2 =scanner.nextInt();
		System.out.println("면접테스트 80점이상 통과");
		int var3 =scanner.nextInt();
		String score;
		if(var1>=80) {
			if(var2>=80) {
			} else{
		}
			System.out.println("합격");
		} else {
		if(var1<80) {
			System.out.println("인성 떨어짐");
			if (var2<80) {
				System.out.println("코딩실력 떨어짐");
				} else{
					System.out.println("면접 못함");
			}

		}
		}

	}

}
