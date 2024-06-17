import java.util.Scanner;

/**
 * The main file to prompt user input and interact with the Triangle class.
 * By:      Infinity de Guzman
 * Version: 1.0
 * Since:   2024-05-30
 */
final class Main {
    /**
     * The unit to be used in the output.
     */
    private static final String MILLIMETER = " mm";

    /**
     * A constant string to be used in the output.
     */
    private static final String MIL_PERIOD = " mm.";

    /**
     * The unit to be used in the output.
     */
    private static final String RADIANS = " radians";

    /**
     * A constant string to be used in the output.
     */
    private static final String SOMETHING = "): ";

    /**
     * The number 3.
     */
    private static final int THREE = 3;

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException if instantiation is attempted
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The main function to prompt the user for the sides
     * of the triangle and display the results.
     *
     * @param args No args will be used
     */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // Prompting the user for the sides of the triangle
        System.out.print("Enter side A (in" + MILLIMETER + SOMETHING);
        final double sideA = scanner.nextDouble();
        System.out.print("Enter side B (in" + MILLIMETER + SOMETHING);
        final double sideB = scanner.nextDouble();
        System.out.print("Enter side C (in" + MILLIMETER + SOMETHING);
        final double sideC = scanner.nextDouble();

        // Creating a Triangle object
        final Triangle triangle = new Triangle(sideA, sideB, sideC);

        // Displaying the results
        System.out.println("Created a triangle with sides: "
            + sideA + " mm, " + sideB + " mm, and " + sideC
            + MIL_PERIOD);
        System.out.println("Is the triangle valid? " + triangle.isValid());
        System.out.println("Semi-perimeter: "
            + triangle.semiPerimeter() + MIL_PERIOD);
        System.out.println("Area: " + triangle.area() + " mm².");
        System.out.println("Type: " + triangle.getType());
        System.out.println("Angle 1: " + triangle.angle(1) + RADIANS);
        System.out.println("Angle 2: " + triangle.angle(2) + RADIANS);
        System.out.println("Angle 3: " + triangle.angle(THREE) + RADIANS);
        System.out.println("Height from side A: "
            + triangle.height(sideA) + MIL_PERIOD);
        System.out.println("Height from side B: "
            + triangle.height(sideB) + MIL_PERIOD);
        System.out.println("Height from side C: "
            + triangle.height(sideC) + MIL_PERIOD);
        System.out.println("Circumcircle radius: "
            + triangle.circumcircleRadius() + MIL_PERIOD);
        System.out.println("Incircle radius: "
            + triangle.incircleRadius() + MIL_PERIOD);

        scanner.close();
    }
}
