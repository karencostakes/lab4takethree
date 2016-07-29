import java.util.Scanner;

public class lab4takethree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";

		System.out.println("Welcome to the Factorial Calculator!");

		long result = 1;

		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter an integer between 1 and 20");

		
			int input = scan1.nextInt();
			scan1.nextLine();
			
			if (input > 0 && input <=20) {
				
			result = getFactorial(scan1, input);
			
			System.out.println("The factorial of " + input + " is " + result);

			System.out.println("Continue?");
			
			choice = scan1.nextLine();
			}
			
			else 
				System.out.println("Please enter another integer");
			
		}

	}

	public static long getFactorial(Scanner scan1, int input) {

		long result = 1;
				
				for (int i = 1; i <= input; i++) {

					result = i * result;
				}
				input = 0;
		
			
		return result;
	}

}