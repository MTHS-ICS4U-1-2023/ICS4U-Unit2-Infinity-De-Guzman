/*
* This program is the standard truck class.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-03-25
*/

/**
 * This is truck the class.
*/
public class Truck extends Vehicle {
    /**
     * Variable.
    */
    private String licensePlateNumber = "";

    /**
     * Variable.
    */
    private final int truckTires = 6;

    /**
     * Creates the base truck.
     *
     * @param color the base colour
     * @param plateNumber the base license plate number
     * @param maxSpeed the maximum speed of the vehicle
    */
    public Truck(
            String color, double maxSpeed, String plateNumber
    ) {
        super(color, maxSpeed);
        this.licensePlateNumber = plateNumber;
        this.numberOfTires = truckTires;
    }

    /**
     * Gets the license plate number of the vehicle.
     *
     * @return the current licensePlateNumber
    */
    public String getLicensePlateNumber() {
        return this.licensePlateNumber;
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
        status += " -> License Plate: " + this.licensePlateNumber + lineBreak;

        return status; 
    }

    /**
     * Provides air the the wheels of the truck, which changes speed.
     *
     * @param airPressure applied to the truck
    */
    public void brake(
            double brakePower, double brakeTime, double airPressure
    ) {
        this.setSpeed(
                this.getSpeed() - (
                    brakePower * brakeTime
                ) - (
                    airPressure * brakeTime
                )
        );
        if (this.getSpeed() < 0) {
            this.setSpeed(0);
        }
    }
}
