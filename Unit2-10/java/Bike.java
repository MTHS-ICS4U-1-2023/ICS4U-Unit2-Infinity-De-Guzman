/*
* This program is the standard bike class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-06-25
*/

/**
 * This is the bike class.
*/
public class Bike extends Vehicle {
    /**
     * Variable.
    */
    private double cadence;

    /**
     * Creates the base truck.
     *
     * @param color the base colour
     * @param maxSpeed the maximum speed of the vehicle
    */
    public Bike(String color, double maxSpeed) {
        super(color, maxSpeed);
        this.cadence = 0;
        this.numberOfTires = 2;
    }

    /**
     * Gets the cadence of the bike.
     *
     * @return the current cadence
    */
    public double getCadence() {
        return this.cadence;
    }

    /**
     * Gets the speed of the bike.
     *
     * @return the current speed
    */
    public double getSpeed() {
        return this.cadence * 2;
    }

    /**
     * Creates a string about the status of the vehicle.
     *
     * @return the string about the vehicle's status
    */
    public String getStatus() {
        final String lineBreak = "\n";
        String status = " -> Speed: " + this.getSpeed() + lineBreak;
        status += " -> MaxSpeed: " + this.getMaxSpeed() + lineBreak;
        status += " -> Number of tires: " + this.numberOfTires + lineBreak;
        status += " -> Color: " + this.getColour() + lineBreak;
        status += " -> Cadence: " + this.cadence + lineBreak;

        return status;
    }

    /**
     * Sets the cadence of the bike.
     *
     * @param newCadence of the bike
    */
    public void setCadence(double newCadence) {
        this.cadence = newCadence;
    }

    /**
     * Accelerates the bike, changing cadence.
     *
     * @param appliedNumber biking power
    */
    public void accelerate(double appliedNumber) {
        this.cadence = this.cadence + appliedNumber;
        this.setSpeed(this.getSpeed() + appliedNumber + appliedNumber);
    }

    /**
     * Rings the bike's bell.
    */
    public void ringBell() {
        System.out.println("Ding ding!\n");
    }
}
