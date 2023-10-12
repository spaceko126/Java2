package HW;

public class HW11 {
	   public static void main(String[] args) {
	        int v1 = 0;
	        
	        for (int x = 0; x <= 10; x++) {
	            double result = x * x - 9 * x + 14;

	            if (result != 0) {
	                continue; 
	            }
	            
	            System.out.println("해: x = " + x);
	            v1++;
	        }
	    }
    }

