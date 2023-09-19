package ch02.sec07;

public class OperationExample {
	public static void main(String[] args) {
		byte r1 = 10 + 20;
		System.out.println("result1: " + r1);
		byte v1 = 10;
		byte v2 = 20;
		int r2 = v1 + v2;
		System.out.println("result2: " + r2);
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long r3 = v3 + v4 + v5;
		System.out.println("result3: " + r3);
		char v6 = 'A';
		char v7 = 1;
		int r4 = v6 + v7;
		System.out.println("result4: " + r4);
		System.out.println("result4: " + (char)r4);
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5: " + result5);
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6: " + result6);
		int v10 = 1;
		int v11 = 2;
		double r7 = (double) v10 / v11;
		System.out.println("result7: " + r7);
		

	}

}
