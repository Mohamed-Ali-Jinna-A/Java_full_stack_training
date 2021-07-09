package knightingale;

import java.util.Scanner;

public class Multiply_the_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("The product of two numbers is: " + num1*num2);
	}	

}
