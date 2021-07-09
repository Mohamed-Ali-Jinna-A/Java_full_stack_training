package knightingale;
	import java.util.Scanner;

	public class Print_an_integer {

		public static void main(String[] args) {
		    Scanner reader = new Scanner(System.in); 
				System.out.println("Enter the number: ");
				int num = reader.nextInt();
				reader.close();
				System.out.println("The number is: " + num);
		}

	}

