package knightingale;
import java.util.Scanner;

public class Largest_of_three_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();
		System.out.print("Enter the third number: ");
		int n3 = sc.nextInt();
		sc.close();
		if(n1 >= n2 && n1 >= n3) {
			System.out.println(n1 + " is the largest number");
		}else if(n2 >= n3) {
			System.out.println(n2 + " is the largest number");
		}else {
			System.out.println(n3 + " is the largest number");
		}
	}
}
