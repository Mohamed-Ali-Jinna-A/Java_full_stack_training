package week_2;

public class Nested_for_loop {

	public static void main(String[] args) {
		for(int i = 10; i < 11; i++ ) {
			for(int j = 1; j <= 10 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
}
