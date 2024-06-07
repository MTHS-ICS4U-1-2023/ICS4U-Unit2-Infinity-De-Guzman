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
     * Function to get valid user input.
     *
     * @param promptText The text to prompt the user.
     * @return The valid user input.
     */
    public static int getInput(String promptText) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print(promptText);
        final int value = scanner.nextInt();
        if (value < 0) {
            System.out.println("Invalid input.");
            System.exit(1);
        }
        return value;
    }

    /**
     * The main function to print the Tribonacci numbers.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Prompting the user for the number of Tribonacci numbers to print
        final int userInput = getInput("Enter a number: ");
        printTribonacci(userInput);
    }
}
