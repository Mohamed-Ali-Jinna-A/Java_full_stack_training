package knightingale;
import java.util.Scanner;

public class Quotient_and_Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the divident: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the divisor: " );
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("The Quotient is " + num1/num2);
		System.out.println("The Remainder is " + num1%num2);
	}
}

