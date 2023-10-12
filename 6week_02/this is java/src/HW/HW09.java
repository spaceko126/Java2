package HW;
import java.util.Scanner;
public class HW09 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("처음 숫자를 입력하세요: ");
	        int  v1 = scanner.nextInt();
	        System.out.print("마지막 숫자를 입력하세요: ");
	        int v2 = scanner.nextInt();

	        for (int i = v1; i <= v2; i++) {
	            if (i % 10 != 7) { 
	                continue; 
	            }
	            System.out.println(i);
	        }

	        scanner.close();
	    }
	}

	


