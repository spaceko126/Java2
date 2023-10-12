package HW;
import java.util.Scanner;
public class HW03 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("메뉴를 선택하세요: 1. 돈까스 2. 파스타 3. 피자 4. 김치찌개 5. 주문 끝");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 1:
	                    break;
	                case 2:
	                    break;
	                case 3:
	                    break;
	                case 4:
	                    break;
	                case 5:
	                    System.out.println("주문을 종료합니다.");
	                    scanner.close();
	                    return;
	               
	            }
	        }
	    }
	}




