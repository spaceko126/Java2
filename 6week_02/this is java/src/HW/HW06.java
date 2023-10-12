package HW;

public class HW06 {
	public static void main(String[] args) {
        for (int i = 2; i <= 8; i += 2) { 
            for (int j = 1; j <= 9; j++) {
                if (i % 2 != 0) {
                    continue; 
                }
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
        }
    }
}
