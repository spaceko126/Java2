package Thisisjava;

public class java01 {
	public static void main(String[] args) throws Exception{
		 for(char upper='A';upper<='z';upper++) {
			for(char lower='a'; lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break ;
				}
			}
		}
	}

}
