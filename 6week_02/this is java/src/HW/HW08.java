package HW;

public class HW08 {
	public static void main(String[] args) {
        for (int i = 1; i <= 73; i++) {
            if (i % 10 != 6) {
                continue;
            }
            System.out.println(i);
        }
    }
}
