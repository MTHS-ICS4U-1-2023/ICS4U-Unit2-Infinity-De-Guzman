/**
 * Vehicle class.
 *
 * <p>This class represents a vehicle with various attributes.
 * {@code null} is returned when no attribute is set.
 *
 * @author Infinity de Guzman
 * @version 1.0
 * @since 2024-05-09
 */
public class Vehicle {
    /**
     * The colour of the vehicle.
     */
    private String colour;

    /**
     * The license plate of the vehicle.
     */
    private String licensePlate;

    /**
     * The number of doors on the vehicle.
     */
    private final int numberOfDoors;

    /**
     * The maximum speed of the vehicle.
     */
    private final int maxSpeed;

    /**
     * The current speed of the vehicle.
     */
    private int speed;

    /**
     * Constructor.
     *
     * @param colour        the colour of the vehicle
     * @param licensePlate  the license plate of the vehicle
     * @param numberOfDoors the number of doors on the vehicle
     * @param maxSpeed      the maximum speed of the vehicle
     */
    public Vehicle(
        String colour,
        String licensePlate,
        int numberOfDoors,
        int maxSpeed
    ) {
        this.colour = colour;
        this.licensePlate = licensePlate;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    /**
     * Gets the colour of the vehicle.
     *
     * @return the colour of the vehicle
     */
    public String getColour() {
        return colour;
    }

    /**
     * Gets the license plate of the vehicle.
     *
     * @return the license plate of the vehicle
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Gets the speed of the vehicle.
     *
     * @return the speed of the vehicle
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the colour of the vehicle.
     *
     * @param colour the new colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Sets the license plate of the vehicle.
     *
     * @param licensePlate the new license plate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * Prints the status of the vehicle.
     */
    public void status() {
        System.out.println(" -> Speed: " + speed);
        System.out.println(" -> Max Speed: " + maxSpeed);
        System.out.println(" -> Number Of Doors: " + numberOfDoors);
        System.out.println(" -> License Plate: " + licensePlate);
        System.out.println(" -> Colour: " + colour);
    }

    /**
     * Accelerates the vehicle.
     *
     * @param accPower the acceleration power
     * @param accTime  the acceleration time
     */
    public void accelerate(int accPower, int accTime) {
        final int acceleration = accPower * accTime;
        if (speed + acceleration <= maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }
    }

    /**
     * Applies brakes to the vehicle.
     *
     * @param brakePower the braking power
     * @param brakeTime  the braking time
     */
    public void brake(int brakePower, int brakeTime) {
        final int deceleration = brakePower * brakeTime;
        if (speed - deceleration >= 0) {
            speed -= deceleration;
        } else {
            speed = 0;
        }
    }
}

