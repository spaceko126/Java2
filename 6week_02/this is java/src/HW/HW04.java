package HW;

public class HW04 {
	   public static void main(String[] args) {
	        for (int x = 0; x <= 100; x++) {
	            for (int y = 0; y <= 100; y++) {
	                if (4 * x + 5 * y == 60) {
	                    System.out.println("x = " + x);
	                    System.out.println("y = " + y);
	                    return;
	                }
	            }
	        }
	    }
	}



