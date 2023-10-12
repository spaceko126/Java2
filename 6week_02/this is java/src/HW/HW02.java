package HW;

public class HW02 {
	    public static void main(String[] args) {
	        int number = 1;

	        while (true) {
	            if (number % 5 == 0 && number % 7 == 0) {
	                System.out.println("가장 작은 5의 배수이자 7의 배수: " + number);
	                break;
	            }
	            number++;
	        }
	    }
	}



