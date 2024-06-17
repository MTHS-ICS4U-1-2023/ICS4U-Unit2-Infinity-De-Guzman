/*
* This is the standard vehicle class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-06-08
*/

/**
* This is the vehicle class.
*/
public class Vehicle {
    /**
     * Variable.
    */
    private String colour = "";

    /**
     * Variables for the class.
     *
     * @param speed of the vehicle
    */
    private double speed;

    /**
     * Variables for the class.
     *
     * @param maxSpeed of the vehicle
    */
    private double maxSpeed;

    /**
     * Creates the base vehicle.
     *
     * @param color the base colour
     * @param maxSpeed the maximum speed of the vehicle
    */
    public Vehicle(String color, double maxSpeed) {
        this.colour = color;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Gets the colour of the vehicle.
     *
     * @return the current colour
    */
    public String getColour() {
        return this.colour;
    }

    /**
     * Gets the speed of the vehicle.
     *
     * @return the current speed
    */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * Gets the maximum speed of the vehicle.
     *
     * @return the maximum speed
    */
    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Creates a string about the status of the vehicle.
     *
     * @return the string about the vehicle's status
    */
    public String getStatus() {
        final String lineBreak = "\n";
        String status = " -> Speed: " + this.speed + lineBreak;
        status += " -> MaxSpeed: " + this.maxSpeed + lineBreak;
        status += " -> Color: " + this.colour + lineBreak;

        return status;
    }

    /**
     * Sets the colour of the vehicle.
     *
     * @param newColour of the vehicle
    */
    public void setColour(String newColour) {
        this.colour = newColour;
    }

    /**
     * Sets the speed of the vehicle.
     *
     * @param newSpeed of the vehicle
    */
    protected void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * Accelerates the vehicle, which changes the speed.
     *
     * @param accelPower power of the acceleration
     * @param accelTime time of the acceleration
    */
    public void accelerate(double accelPower, double accelTime) {
        this.speed = (accelPower * accelTime) + this.speed;
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * Brakes the vehicle, which changes speed.
     *
     * @param brakePower power of the brake
     * @param brakeTime time of the brake
    */
    public void brake(double brakePower, double brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
