package week_2;

import java.util.Scanner;

public class Sum_an_array_elements_from_user {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of an array: ");
		for(int num = 0; num < size; num++) {
		   array[num] = sc.nextInt();
		  
		}sc.close();
		int sum = 0;
		for (int num : array) {
			System.out.print(num+"+");
			sum = sum+num;
		}System.out.println("\n="+sum);

	}

}
