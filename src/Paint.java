import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        final double COVERAGE = 350.0; // sq ft per gallon

        Scanner sc = new Scanner(System.in);

        Double length = readDouble(sc, "Length of the room (ft): ");
        Double width  = readDouble(sc, "Width of the room (ft): ");

        if (length == null || width == null) return;

        if (length <= 0 || width <= 0) {
            System.out.println("Length and width must be positive.");
            return;
        }

        double area = length * width;
        int gallons = (int) Math.ceil(area / COVERAGE);

        System.out.println("You will need to purchase " + gallons +
                " gallons of paint to cover " + area + " square feet.");
    }

    private static Double readDouble(Scanner sc, String msg) {
        System.out.print(msg);
        String s = sc.nextLine().trim();
        try {
            return Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            return null;
        }
    }
}
