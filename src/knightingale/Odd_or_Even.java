package knightingale;
import java.util.Scanner;

public class Odd_or_Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		if(num % 2 == 0) {
			System.out.println(num + " is an EVEN number...!");
		}else {
			System.out.println(num + " is an ODD number...!");
		}
	}
}
