package ch02.sec07;

public class StringConcatEample {
	public static void main(String[] args) {
		int r1=10+2+8;
		System.out.println("r1:"+r1);
		String r2=10+2+"8";
		System.out.println("r2:"+r2);
		String r3=10+"2"+8;
		System.out.println("r3:"+r3);
		String r4="10"+2+8;
		System.out.println("r4:"+r4);
		String r5="10"+(2+8);
		System.out.println("r5:"+r5);
	}

}
