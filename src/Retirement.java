import java.time.Year;
import java.util.Scanner;

public class Retirement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int currentAge = scanner.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retirementAge = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int yearsLeft = retirementAge - currentAge;

        if (yearsLeft > 0) {
            int retirementYear = currentYear + yearsLeft;

            System.out.println("\nYou have " + yearsLeft + " years left until you can retire.");
            System.out.println("It's " + currentYear + ", so you can retire in " + retirementYear + ".");
        } else {
            System.out.println("\nYou are already eligible to retire!");
        }

        scanner.close();
    }
}
