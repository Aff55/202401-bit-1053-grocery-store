import java.util.InputMismatchException;
import java.util.Scanner;

public class GroceryStore { // Start of the program.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // While loop for error handling.
            System.out.println("Are you ready to start your day? Please only type 'yes' or 'no' as your reply!");
            // Ask the user to confirm if he wants to start the program or not.
            String uReply = scanner.nextLine();

            if (uReply.equals("yes")) {
                System.out.println("Alright!\n");
                listGroceries();
                break;
            } else if (uReply.equals("no")) {
                System.out.println("Okay! You may come back when you're ready to start your day.");
                break;
            } else {
                System.out.println("Invalid input, try again!");
            }
            // Conditional loops to act according to the input from the user.
        }

        scanner.close();
    }

    static void listGroceries() { // listGroceries function to take input from the user to take account of what
                                  // products he will sell.
        Scanner scanner = new Scanner(System.in);

        while (true) {// While loop for error handling.
            System.out.println("How many kinds of products do you have today to sell?");
            // Ask the user about how many products he will sell. This will be later used to
            // make arrays.
            try {
                int koP = scanner.nextInt();
                // koP stands for Kinds of Product.

                if (koP <= 0) {
                    System.out.println("You cannot sell 0 or less products! Try again!");
                    continue;
                }
                // Convert the input of koP into arrays to make a loop for name, price and the
                // quantity of the product.
                String[] nameProduct = new String[koP];
                double[] priceProduct = new double[koP];
                int[] quantityProduct = new int[koP];

                for (int i = 0; i < koP; i++) {
                    // Conditional loop runs till all of the values are with proper input types are
                    // stored. The loop stops according to the value for koP given is reached.
                    System.out.print("What is the name of grocery #" + (i + 1) + ": ");
                    scanner.nextLine();
                    nameProduct[i] = scanner.nextLine();
                    System.out.print("What is the price for 1 unit of " + nameProduct[i] + ": RM ");
                    priceProduct[i] = scanner.nextDouble();
                    System.out.print("How many units of " + nameProduct[i] + " do you have? ");
                    quantityProduct[i] = scanner.nextInt();
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please try again.");
                scanner.next();
            }
        }

        scanner.close();

    }
}
