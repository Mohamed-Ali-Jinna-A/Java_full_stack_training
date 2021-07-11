package week_2;

public class Sum_elements_of_an_array {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for (int i : arr) {
			System.out.print(i+"+");
			sum = sum+i;
		}System.out.println("\n="+sum);

	}

}
