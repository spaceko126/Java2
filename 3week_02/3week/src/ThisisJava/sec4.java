package ThisisJava;

public class sec4 {
	public static void main(String[] args) {
		int score = 75;
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은C입니다.");
		} else{
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은D입니다.");
		}
		}

}
