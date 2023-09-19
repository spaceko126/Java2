package ThisisJava;

public class sec12 {
	public static void main(String[] args) {
		int a=3;
		char b='A';
		String c= "Code";
		
		System.out.printf("a=%d %n",a);
		System.out.printf("b=%c %n",b);
		System.out.printf("c=%s %n",c);
		System.out.printf("자리수미지정:%d%n%n",1000);
		System.out.printf("자리수지정:%4d%n%n",1000);
		System.out.printf("자리수('0'사용):%04d%n%n",1000);
		
		int num1=1;
		double num2=12.3456789;
		System.out.printf("num1:%d%n",num1);
		System.out.printf("num2:%f%n",num2);
		System.out.printf("num2:%.1f%n",num2);
		System.out.printf("num2:%.2f%n",num2);
		System.out.printf("num2:%.3f%n",num2);
		System.out.printf("num2:%10.1f%n",num2);
		System.out.printf("num2:%10.3f%n",num2);
	}

}
