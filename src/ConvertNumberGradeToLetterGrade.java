import java.util.Scanner;

/**
 * 
 */

/**
 * @author Harley Quinn 
 * Purpose: This application asks a user for a number grade
 *          and converts that number grade to a letter grade.
 *          (making a change for the purposes of this Git demo
 */
public class ConvertNumberGradeToLetterGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberGrade = 0;
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Enter Number Grade: ");
			numberGrade = scanner.nextInt();

			if (numberGrade >= 88 && numberGrade <= 100) {
				System.out.println("You got an A!");
			} else if (numberGrade >= 80 && numberGrade <= 87) {
				System.out.println("You got a B!");
			} else if (numberGrade >= 67 && numberGrade <= 79) {
				System.out.println("You got a C.");
			} else if (numberGrade >= 60 && numberGrade <= 66) {
				System.out.println("You got a D.");
			} else if (numberGrade >= 0 && numberGrade <= 60) {
				System.out.println("You got an F.");

			}
			// ask user for input to see if they would like to continue
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = scanner.next();
			System.out.println();

		}

		choice = scanner.nextLine();
		System.out.println("Goodbye!");
		scanner.close();

	}

}
