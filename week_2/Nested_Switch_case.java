package week_2;

public class Nested_Switch_case {
	public static void main(String[] args) {
		int tech = 2;
		int course = 2;
		
		switch (tech) {
		case 1:
			System.out.println("python");
			break;
		case 2:
			switch(course) {
			case 1:
				System.out.println("J2EE");
				break;
			case 2:
				System.out.println("java");
			}
		}
	}
}
