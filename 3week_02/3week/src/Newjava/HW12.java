package Newjava;
import java.util.Scanner;
public class HW12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("면접점수 90점 통과");
		int var1 =scanner.nextInt();
		System.out.println("코딩테스트 90점 통과");
		int var2 =scanner.nextInt();
		System.out.println("인성테스트 90점 통과");
		int var3 =scanner.nextInt();
		if(var1<90) {
			System.out.println("면접 통과실패");
		}
		else if(var2<90) {
			System.out.println("코딩테스트 통과실패 ");
		}
		else if(var3<90) {
			System.out.println("인성테스트 통과실패 ");
		}
		else {
			System.out.println("통과");
		}

		}
		
	}


