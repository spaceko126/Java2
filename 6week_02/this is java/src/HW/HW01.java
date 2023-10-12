package HW;

public class HW01 {
	public static void main(String[] args) {
		int sum = 0;
		int number = 1;

		while (sum <= 100) {
			sum += number;
			if (sum > 100) {
				break;
	}
			number++;
	}

		System.out.println("1부터 " + number + "까지 더한 합은 " + sum + "입니다.");
	}
		

	}


	