package week_2;
public class PyramidExmapleReverse {

	public static void main(String[] args) {
		int term = 6;
		for(int i = 1; i <= term; i++ ) {
			for(int j = 1; j <= i ; j++) {
				System.out.print(" ");
			}
			for(int k = term; k>= i; k--) {
				System.out.print("* ");
			}System.out.println();
		}
	}
}


