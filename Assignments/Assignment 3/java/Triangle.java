/**
 * Triangle class definition.
 * By:      Infinity de Guzman
 * Version: 1.0
 * Since:   2024-05-30
 */

public final class Triangle {
    /**
     * The number 3.
     */
    private static final int THREE = 3;

    /**
     * The number 4.
     */
    private static final int FOUR = 4;

    /**
    * The sideA property represents the length of side A of the triangle.
    */
    private final double sideA;

    /**
    * The sideB property represents the length of side B of the triangle.
    */
    private final double sideB;

    /**
    * The sideC property represents the length of side C of the triangle.
    */
    private final double sideC;

    /**
    * The Triangle constructor creates a new Triangle object with the given
    * side lengths.
    *
    * @param sideA The length of side A of the triangle.
    *
    * @param sideB The length of side B of the triangle.
    *
    * @param sideC The length of side C of the triangle.
    */
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
    * The perimeter method calculates the perimeter of the triangle.
    *
    * @return The perimeter of the triangle.
    *
    */
    private double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    /**
    * The getSideA method returns the length of side A of the triangle.
    *
    * @return The length of side A of the triangle.
    */
    public double getSideA() {
        return this.sideA;
    }

    /**
    * The getSideB method returns the length of side B of the triangle.
    *
    * @return The length of side B of the triangle.
    */
    public double getSideB() {
        return this.sideB;
    }

    /**
    * The getSideC method returns the length of side C of the triangle.
    *
    * @return The length of side C of the triangle.
    */
    public double getSideC() {
        return this.sideC;
    }

    /**
    * The semiPerimeter method calculates the semi-perimeter of the triangle.
    *
    * @return The semi-perimeter of the triangle.
    */
    public double semiPerimeter() {
        return this.perimeter() / 2;
    }

    /**
    * Public function to check if the triangle is valid.
    * A triangle is valid if the sum of two sides is
    * greater than the third side.
    *
    * @return True if the triangle is valid, false otherwise.
    */
    public boolean isValid() {
        return this.sideA + this.sideB > this.sideC
            && this.sideA + this.sideC > this.sideB
            && this.sideB + this.sideC > this.sideA;
    }

    /**
    * The area method calculates the area of the triangle using Heron's formula.
    *
    * @return The area of the triangle.
    */
    public double area() {
        double area = -1;
        if (this.isValid()) {
            final double semi = this.semiPerimeter();
            area = Math.sqrt(semi * (semi - this.sideA)
                * (semi - this.sideB) * (semi - this.sideC));
        }
        return area;
    }

    /**
     * Gets the type of the triangle.
     *
     * @return the type of the triangle.
     */
    public String getType() {
        final String type;

        if (!this.isValid()) {
            type = "Invalid triangle";
        } else {
            final double aSquared = Math.pow(this.sideA, 2);
            final double bSquared = Math.pow(this.sideB, 2);
            final double cSquared = Math.pow(this.sideC, 2);

            if (this.sideA == this.sideB && this.sideB == this.sideC) {
                type = "Equilateral triangle";
            } else if (aSquared + bSquared == cSquared
                    || aSquared + cSquared == bSquared
                    || bSquared + cSquared == aSquared) {
                type = "Right angle triangle";
            } else if (this.sideA == this.sideB
                    || this.sideA == this.sideC
                    || this.sideB == this.sideC) {
                type = "Isosceles triangle";
            } else {
                type = "Scalene triangle";
            }
        }

        return type;
    }

    /**
     * Public function to calculate
     * an angle given the angle number (1, 2, or 3).
     *
     * @param angleNumber The angle number (1, 2, or 3)
     *
     * @return The angle in radians, or -1 if the triangle is invalid.
     */
    public double angle(int angleNumber) {
        double angle = -1;

        // Check if the triangle is valid
        if (this.isValid()) {
            // Calculate the angle based on the angle number
            switch (angleNumber) {
                case 1:
                    angle = this.calculateAngle(
                        this.sideB, this.sideC, this.sideA);
                    break;
                case 2:
                    angle = this.calculateAngle(
                        this.sideA, this.sideC, this.sideB);
                    break;
                case THREE:
                    angle = this.calculateAngle(
                        this.sideA, this.sideB, this.sideC);
                    break;
                default:
                    angle = -1;
                    break;
            }
        }

        return angle;
    }

    /**
    * Private function to calculate an angle using the cosine rule.
    *
    * @param side1 The length of side 1
    *
    * @param side2 The length of side 2
    *
    * @param oppositeSide The length of the opposite side
    *
    * @return The angle in radians
    */
    private double calculateAngle(double side1,
        double side2, double oppositeSide) {
        return Math.acos((Math.pow(side1, 2) + Math.pow(side2, 2)
            - Math.pow(oppositeSide, 2)) / (2 * side1 * side2));
    }

    /**
     * Public function to calculate
     * the height of the triangle from a given side.
     * The height is calculated using the formula: 2 * area / fromSide
     * If the triangle is invalid, the height will be -1.
     *
     * @param fromSide The side to calculate the height from
     *
     * @return The height of the triangle from the given side
     */
    public double height(double fromSide) {
        final double area = this.area();
        double height = -1;
        if (area != -1) {
            height = (2 * area) / fromSide;
        }
        return height;
    }

    /**
     * Public function to calculate the radius of the circumcircle.
     *
     * @return The radius of the circumcircle
     */
    public double circumcircleRadius() {
        double radius = -1;
        if (this.isValid()) {
            final double area = this.area();
            radius = (this.sideA * this.sideB * this.sideC) / (FOUR * area);
        }
        return radius;
    }

    /**
     * Public function to calculate the radius of the incircle.
     *
     * @return The radius of the incircle
     */
    public double incircleRadius() {
        double radius = -1;
        if (this.isValid()) {
            radius = this.area() / this.semiPerimeter();
        }
        return radius;
    }
}
