package week_2;

import java.util.Scanner;

public class Do_While_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int i = sc.nextInt();
		sc.close();
		do {
			System.out.println(i);
			i++;
		} while(i <= 10);
	}
}
