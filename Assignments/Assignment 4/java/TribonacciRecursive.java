import java.util.Scanner;

/**
 * The utility class to calculate and print Tribonacci numbers recursively.
 * By:      Infinity de Guzman
 * Version: 1.0
 * Since:   2024-05-30
 */
public final class TribonacciRecursive {

    /**
     * The threshold value for the Tribonacci sequence.
     */
    private static final int THRESHOLD = 3;

    /**
     * Private constructor to prevent instantiation.
     *
     * @throws AssertionError If the class is instantiated.
     */
    private TribonacciRecursive() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    /**
     * Function to get the Tribonacci number at a given index.
     *
     * @param num    The index of the Tribonacci number.
     * @param first  The first Tribonacci number.
     * @param second The second Tribonacci number.
     * @param third  The third Tribonacci number.
     * @return The Tribonacci number at the given index.
     */
    public static int tribonacci(int num, int first, int second, int third) {
        final int result;
        if (num < THRESHOLD) {
            if (num == 0) {
                result = first;
            } else if (num == 1) {
                result = second;
            } else {
                result = third;
            }
        } else {
            result = tribonacci(num - 1, second, third, first + second + third);
        }
        return result;
    }

    /**
     * Function to print the first num Tribonacci numbers.
     *
     * @param num The number of Tribonacci numbers to print.
     */
    public static void printTribonacci(int num) {
        for (int counter = 0; counter < num; counter++) {
            System.out.print(tribonacci(counter, 0, 1, 1) + " ");
        }
        System.out.println();
    }

    /**
     * Gets an integer input from the user.
     *
     * @param scanner    The scanner to read input from.
     * @param promptText The text to prompt the user with.
     * @return The integer input from the user.
     */
    public static int getInput(Scanner scanner, String promptText) {
        int value = -1;
        do {
            System.out.print(promptText);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value < 0) {
                    System.out.println("Please enter a non-negative number.");
                    value = -1;
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        } while (value < 0);
        return value;
    }

    /**
     * The main function to print the Tribonacci numbers.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // Prompting the user for the number of Tribonacci numbers to print
        final int userInput = getInput(scanner, "Enter a number: ");
        printTribonacci(userInput);
    }
}
