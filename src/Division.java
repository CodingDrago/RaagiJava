import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        double dividend = sc.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = sc.nextDouble();

        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
