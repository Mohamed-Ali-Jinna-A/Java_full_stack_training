package week_2;

import java.util.Scanner;

public class Floyd_triangle {

	public static void main(String[] args) {
		int rows, number = 1, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		rows = sc.nextInt();
		sc.close();
		System.out.println("\n_____Floyd's Triangle___\n");
		for(i = 1; i <= rows; i++) {
			for( j = 1; j <= i; j++) {
				System.out.print(number+ " ");
				number++;
			}
			System.out.println();		
		}
		System.out.println();
		for(i = 1; i <= rows; i++) {
			for( j = rows; j >= i; j--) {
				System.out.print(number-1 + " ");
				number--;
			}System.out.println();
		}
		
	}

}
