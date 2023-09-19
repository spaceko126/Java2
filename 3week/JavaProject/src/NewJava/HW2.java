package NewJava;

public class HW2 {
	public static void main(String[] args) {
		double v1=100.25;
		double v2=0.05;
		double v3=3.23;
		double r1=v1*(1+v2*v3);
		double r2=v1*Math.pow((1+v2),v3);
		System.out.printf("단리 %.2f %n",r1);
		System.out.printf("단리 %.2f %n",r2);
	}

}
