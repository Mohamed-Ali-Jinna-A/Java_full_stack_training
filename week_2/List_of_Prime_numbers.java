package week_2;

import java.util.Scanner;

public class List_of_Prime_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to search: "); 
		int num = sc.nextInt();
		sc.close();
		int temp = 0;
		for(int i = 1; i <= num; i++) {
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					temp = temp+1;
				}
			}
				if(temp==0) {
					System.out.print(i+", ");
				}
				else {
					temp = 0;
				}
			}
		}
	}
