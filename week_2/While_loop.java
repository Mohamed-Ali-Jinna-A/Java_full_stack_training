package week_2;
import java.util.Scanner;

public class While_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		int initial = 0, sum = 0;
		while(initial <= num ) {
			sum = initial+sum;
			initial++;
		}System.out.println("The sum of values is " + sum);
	}
}
