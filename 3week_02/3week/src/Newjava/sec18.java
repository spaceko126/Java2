package NewSemester;
import java.util.Scanner;
import java.util.Scanner;

public class sec18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("면접점수");
		int a = scanner.nextInt();
		System.out.println("코딩테스트");
		int b = scanner.nextInt();
		System.out.println("인성시험");
		int c = scanner.nextInt();
		if(a >=0) {
			if(a>=90) {
			System.out.println("면접 성공");
			}else {
			System.out.println("면접 실패");
			}
			}
		
		if(b >=0) {
		if(b>=90) {
		System.out.println("코딩 성공");
		}else {
		System.out.println("코딩 실패");
		}
		}
		
		if(c >=0) {
		if(c>=90) {
		System.out.println("인성 시험 성공");
		}else {
		System.out.println("인성 시험 실패");
		}
		}
		}

	}
