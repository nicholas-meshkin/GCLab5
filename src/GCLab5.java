import java.util.Scanner;

public class GCLab5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInt;
		long total = 1;
		String userChoice = "y";
		do {
			System.out.println("Please enter an integer between 1 and 25, inclusive.");
			 
				userInt = scnr.nextInt();
				if (userInt > 0 && userInt <26) {
				for (int i = 1; i < userInt + 1; i++) {
					total = total * i;
				}
				System.out.println("The factorial of " + userInt + " is " + total + ".");
				total = 1;
				}else {
					System.out.println("Your integer was not between 1 and 9");
				}
			
			System.out.println("Would you like to continue?");
			userChoice = scnr.next();
		} while (userChoice.startsWith("y"));

		System.out.println("Goodbye!");
		scnr.close();

	}

}
