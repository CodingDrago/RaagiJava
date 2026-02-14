import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer people = readInt(sc, "How many people? ");
        Integer pizzas = readInt(sc, "How many pizzas do you have? ");
        Integer slicesPerPizza = readInt(sc, "How many slices per pizza? ");

        if (people == null || pizzas == null || slicesPerPizza == null) return;

        if (people <= 0 || pizzas <= 0 || slicesPerPizza <= 0) {
            System.out.println("All values must be positive.");
            return;
        }

        int totalSlices = pizzas * slicesPerPizza;
        int eachGets = totalSlices / people;
        int leftovers = totalSlices % people;

        System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");
        System.out.println("Each person gets " + eachGets + " piece" + (eachGets == 1 ? "" : "s") + " of pizza.");
        System.out.println("There " + (leftovers == 1 ? "is " : "are ") + leftovers +
                " leftover piece" + (leftovers == 1 ? "" : "s") + ".");
    }

    private static Integer readInt(Scanner sc, String msg) {
        System.out.print(msg);
        String s = sc.nextLine().trim();
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            return null;
        }
    }
}
