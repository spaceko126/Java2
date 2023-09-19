package ch02.sec04;

public class Hw1 {
	public static void main(String[] args) {
		float f = 212;
		double c = (f -32)*5/9;
		System.out.println("화씨 212도 일때 섭씨온도는 "+c);
		
		float r=5;
		double s = 3.14*r*r;
		double v = (4/3)*r*r*r;
		System.out.println("원의 면적"+s);
		System.out.println("원의 부피"+v);
		
		double var1=1500000;
		double var2=0.2;
		double var3=180;
		
		double var4=var1*(1+(var2*var3));
		double var5=var1*((1+var2)*(var3)*(1+var2)*(var3));
		double var6=Math.pow(1+var2, var3);
		System.out.println("단리"+var4);
		System.out.println("복리"+var5);
		System.out.println(var1*var6);
	}

}
