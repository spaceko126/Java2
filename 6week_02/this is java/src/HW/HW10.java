package HW;

public class HW10 {
	 public static void main(String[] args) {
	        int v1 = 0;

	        for (int i = 1; i <= 100; i++) {
	            if (i % 5 != 0 || i % 7 != 0) { 
	                continue; 
	            }
	            System.out.println(i);
	            v1++;
	        }

	        System.out.println("5의 배수이자 7의 배수인 정수의 개수: " + v1);
	    }
}